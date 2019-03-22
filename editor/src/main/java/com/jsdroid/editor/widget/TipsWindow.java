package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.jsdroid.editor.DpiUtils;
import com.jsdroid.editor.R;
import com.jsdroid.editor.adapter.DataAdapter;
import com.jsdroid.editor.adapter.DataHandler;
import com.jsdroid.editor.adapter.DataViewHolder;
import com.jsdroid.editor.parser.Parser;
import com.jsdroid.editor.parser.Tip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TipsWindow extends PopupWindow {
    public static int tabHeight = 0;
    public static int toolHeight = 0;

    Context context;
    ListView listView;
    DataAdapter adapter;
    CodeEditText codeEditText;

    public TipsWindow(CodeEditText codeEditText) {
        this.codeEditText = codeEditText;
        this.context = codeEditText.getContext();
        listView = new ListView(context);
        adapter = new DataAdapter(context);
        adapter.addDataHandler(new DataHandler() {
            @Override
            public int getLayoutId() {
                return R.layout.edit_list_item_tip;
            }

            @Override
            public boolean canFillData(Object data) {
                return true;
            }

            @Override
            public void fillData(final int pos, Object data, DataViewHolder vh, DataAdapter dataAdapter) {
                vh.getViewHelper().setText(R.id.text, data.toString());
                vh.getContentView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onClickItem(pos);
                    }
                });
            }
        });
        listView.setAdapter(adapter);
        setContentView(listView);
        setBackgroundDrawable(new ColorDrawable(Color.WHITE));
//        setOutsideTouchable(true);
        setTouchable(true);
    }

    public interface OnItemClickListener {
        void onClickItem(int pos);
    }


    public void onClickItem(int position) {
        Tip tip = getItem(position);
        String inputText = getInputText();
        int pos = codeEditText.getSelectionStart();
        codeEditText.getText().replace(pos - inputText.length(), pos, tip.replaceText.toString());
        dismiss();
    }


    public void setTips(List tips) {
        adapter.setDatas(tips);
        adapter.notifyDataSetChanged();
    }

    public Tip getItem(int x) {
        return (Tip) adapter.getItem(x);
    }

    public int getItemsHeight() {
        return adapter.getCount() * DpiUtils.dip2px(context, 40);
    }

    //显示提示
    public void showTips(Parser parser) {
        updateTips();
        String inputText = getInputText().toLowerCase();
        List<Tip> tips = new ArrayList();
        //parser
        if (parser != null) {
            if (parser.getNames() != null) {
                for (String name : parser.getNames()) {
                    Tip tip = new Tip();
                    tip.inputText = name;
                    tip.replaceText = name;
                    tip.showText = name + " - 变量";
                    tips.add(tip);
                }
            }
            //keywords
            if (parser.getKeyWords() != null) {
                for (String keyword : parser.getKeyWords()) {
                    Tip tip = new Tip();
                    tip.inputText = keyword;
                    tip.replaceText = keyword;
                    tip.showText = keyword + " - 关键字";
                    tips.add(tip);
                }
            }

            //templates
            Tip templates[] = parser.getTemplates();
            if (templates != null) {
                for (int i = 0; i < templates.length; i++) {
                    tips.add(templates[i]);
                }
            }
        }


        if (inputText.length() == 0) {
            dismiss();
            return;
        }
        Iterator<Tip> iterator = tips.iterator();
        while (iterator.hasNext()) {
            Tip next = iterator.next();
            if (!next.inputText.toLowerCase().startsWith(inputText)) {
                iterator.remove();
            }
            if (next.replaceText.equals(inputText)) {
                iterator.remove();
            }

        }
        setTips(tips);
        updateTips();
    }

    //更新提示
    public void updateTips() {
        int selectionStart = codeEditText.getSelectionStart();
        int selectionEnd = codeEditText.getSelectionEnd();
        if (selectionStart != selectionEnd) {
            dismiss();
            return;
        }
        Rect tipRect = getPopupWindowRect(selectionStart);
        if (tipRect == null) {
            return;
        }
        if (!tipRect.equals(lastTipRect)) {
            dismiss();
        }
        lastTipRect = tipRect;
        setWidth(tipRect.width());
        setHeight(tipRect.height());
        showAtLocation(codeEditText, Gravity.LEFT | Gravity.TOP, tipRect.left, tipRect.top);
    }

    Rect lastTipRect;

    public Rect getPopupWindowRect(int offset) {
        Layout layout = codeEditText.getLayout();
        if (layout == null) {
            return null;
        }
        int location[] = new int[2];
        codeEditText.getScrollView().getLocationInWindow(location);
        int x = location[0];
        int y = location[1] - tabHeight;
        int width = codeEditText.getScrollView().getWidth();
        int height = codeEditText.getScrollView().getHeight() + tabHeight + toolHeight;
        Rect rect = new Rect(x, y, x + width, y + height);
        int padding = DpiUtils.dip2px(context, 10);
        int leftOff = codeEditText.getPaddingLeft() - codeEditText.getViewScrollX();
        rect.left += leftOff > padding ? leftOff : padding;
        rect.top += padding;
        rect.right -= padding;
        rect.bottom -= padding;

        int line = layout.getLineForOffset(offset);
        int lineTop = layout.getLineTop(line) - codeEditText.getViewScrollY();
        int lineBottom = layout.getLineTop(line + 1) - codeEditText.getViewScrollY();
        int rheight = height - lineBottom;
        boolean atbottom;
        if (rheight > lineTop) {
            atbottom = true;
            rect.top = lineBottom + y + DpiUtils.dip2px(context, 8) + tabHeight;
        } else {
            atbottom = false;
            rect.bottom = lineTop + y - DpiUtils.dip2px(context, 8) + tabHeight;
        }
        //调节具体的高度
        int realHeight = getItemsHeight();
        if (rect.height() > realHeight) {
            int off = rect.height() - realHeight;
            if (atbottom) {
                rect.bottom -= off;
            } else {
                rect.top += off;
            }

        }
        return rect;
    }

    /**
     * 获取输入的文字，用于提示
     *
     * @return
     */
    public String getInputText() {
        String inputText = "";
        int off = codeEditText.getSelectionStart();
        //英文字符范围：65-90；97-122；数字范围：48-57
        for (int i = off - 1; i >= 0 && i < codeEditText.getText().length(); i--) {
            char c = codeEditText.getText().charAt(i);
            if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c < 0 || c > 127) {
                inputText = c + inputText;
            } else {
                break;
            }
        }
        return inputText;
    }

    @Override
    public void dismiss() {
        super.dismiss();
    }
}
