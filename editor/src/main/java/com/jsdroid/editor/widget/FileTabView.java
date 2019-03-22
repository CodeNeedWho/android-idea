package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jsdroid.editor.R;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 编辑器选项卡滚动视图
 */
public class FileTabView extends HorizontalScrollView {

    public static abstract class FileTab {
        public TitleView titleView;
        public File file;

        //默认颜色
        public abstract int getDefaultColor();

        //选择颜色
        public abstract int getSelectColor();

        //默认文字颜色
        public abstract int getDefaultTextColor();

        //选择文字颜色
        public abstract int getSelectTextColor();

        //标签图片
        public abstract int getImage();

        //标签文字
        public abstract String getText();

        //保存
        public abstract void save();

        //选中
        public abstract void onSelected(FileTabView fileTabView);

        //关闭
        public abstract void onClosed(FileTabView fileTabView);

        //设置标题
        public void setTitle(String text) {
            if (titleView != null) {
                if (titleView.title != null) {
                    titleView.title.setText(text);
                }
            }
        }
    }

    public class TitleView {
        public View contentView;
        public ImageView icon;
        public TextView title;
        public ImageButton close;
    }

    FileTab selectFileTab;
    //是否进行位移
    boolean scrollFlag;

    public FileTabView(Context context) {
        super(context);
        init();
    }

    public FileTabView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    LinearLayout contentView;
    List<FileTab> fileTabs = new ArrayList<>();


    private void init() {
        contentView = new LinearLayout(getContext());
        addView(contentView);
        setHorizontalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
    }

    private void addChild(View view) {
        contentView.addView(view);
    }

    private void removeChild(View view) {
        contentView.removeView(view);
    }

    /**
     * 添加标题
     *
     * @param fileTab
     */
    public FileTab addTab(final FileTab fileTab) {
        if (fileTabs.contains(fileTab)) {
            return fileTabs.get(fileTabs.indexOf(fileTab));
        }
        View view = LayoutInflater.from(getContext()).inflate(R.layout.edit_tab_view, null);
        final TitleView titleView = new TitleView();
        titleView.contentView = view;
        titleView.icon = view.findViewById(R.id.img_icon);
        titleView.title = view.findViewById(R.id.tv_title);
        titleView.close = view.findViewById(R.id.img_btn_close);
        titleView.contentView.setBackgroundColor(fileTab.getDefaultColor());
        titleView.title.setTextColor(fileTab.getDefaultTextColor());
        titleView.icon.setImageBitmap(BitmapFactory.decodeResource(getResources(), fileTab.getImage()));
        titleView.title.setText(fileTab.getText());
        titleView.close.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                closeTab(fileTab.file);
            }
        });
        titleView.contentView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                selectTab(fileTab);
            }
        });
        fileTab.titleView = titleView;
        fileTabs.add(fileTab);
        addChild(titleView.contentView);
        return fileTab;
    }

    /**
     * 查找标签
     *
     * @param file
     * @return
     */
    public FileTab findTab(File file) {
        for (FileTab fileTab : fileTabs) {
            if (fileTab.file.equals(file)) {
                return fileTab;
            }
        }
        return null;
    }

    /**
     * 关闭标签
     *
     * @param file
     */
    public void closeTab(File file) {
        FileTab fileTab = findTab(file);
        if (fileTab == null) {
            return;
        }
        FileTab nextSelect = null;
        if (fileTab.equals(selectFileTab)) {
            int pos = fileTabs.indexOf(fileTab);
            if (pos > 0) {
                nextSelect = fileTabs.get(pos - 1);
            }
            if (pos + 1 < fileTabs.size()) {
                nextSelect = fileTabs.get(pos + 1);
            }
        }
        fileTabs.remove(fileTab);
        removeChild(fileTab.titleView.contentView);
        fileTab.onClosed(this);
        //选择上一个
        if (nextSelect != null) {
            selectTab(nextSelect);
        }
    }


    /**
     * 获取选择的标签
     *
     * @return
     */
    public FileTab getSelectFileTab() {
        return selectFileTab;
    }

    /**
     * 获取标签数量
     *
     * @return
     */
    public int getTabCount() {
        return fileTabs.size();
    }

    /**
     * 选择标签
     *
     * @param fileTab
     */
    public void selectTab(FileTab fileTab) {
        if (!fileTabs.contains(fileTab)) {
            return;
        }

        selectFileTab = fileTab;
        Iterator<FileTab> iterator = fileTabs.iterator();
        while (iterator.hasNext()) {
            FileTab next = iterator.next();
            TitleView titleView = next.titleView;
            titleView.title.setTextColor(next.getDefaultTextColor());
            titleView.contentView.setBackgroundColor(next.getDefaultColor());
        }
        TitleView titleView = fileTab.titleView;
        titleView.title.setTextColor(fileTab.getSelectTextColor());
        titleView.contentView.setBackgroundColor(fileTab.getSelectColor());
        scrollFlag = true;
        invalidate();
        fileTab.onSelected(this);
    }

    /**
     * 显示选中的标签
     */
    private void scrollToSelect() {
        if (selectFileTab == null) {
            return;
        }
        Iterator<FileTab> iterator = fileTabs.iterator();
        int offset = 0;
        int width = 0;
        while (iterator.hasNext()) {
            FileTab next = iterator.next();
            TitleView titleView = next.titleView;
            if (next.equals(selectFileTab)) {
                width = titleView.contentView.getWidth();
                break;
            }
            offset += titleView.contentView.getWidth();
        }
        if (offset < getScrollX()) {
            //偏移到显示
            scrollTo(offset, 0);
            return;
        }
        if (offset + width > getScrollX() + getWidth()) {
            //偏移到最后
            scrollTo(offset - getWidth() + width, 0);
        }


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (scrollFlag) {
            scrollToSelect();
            scrollFlag = false;
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        TipsWindow.tabHeight = getMeasuredHeight();
    }

    public void save() {
        for (FileTab fileTab : fileTabs) {
            fileTab.save();
        }
    }

}
