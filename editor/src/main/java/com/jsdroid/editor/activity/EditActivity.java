package com.jsdroid.editor.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jsdroid.editor.ContextUtil;
import com.jsdroid.editor.R;
import com.jsdroid.editor.parser.ParserFactory;
import com.jsdroid.editor.widget.CodeEditPane;
import com.jsdroid.editor.widget.CodeEditText;
import com.jsdroid.editor.widget.EditToolView;
import com.jsdroid.editor.widget.FileTabView;
import com.jsdroid.fileview.FileView;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public abstract class EditActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton mImgBtnSave;

    public class EditTab extends FileTabView.FileTab implements TextWatcher {
        CodeEditPane codeEditPane;
        boolean changed;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EditTab editTab = (EditTab) o;
            return file.equals(editTab.file);
        }


        public EditTab(File file) throws Exception {
            if (file.length() > 10_0000) {
                throw new Exception("文件太大！");
            }
            this.file = file;
            codeEditPane = new CodeEditPane(EditActivity.this);
            codeEditPane.setParser(ParserFactory.getParser(file));
            codeEditPane.openFile(file);
            codeEditPane.getCodeEditText().setTextWatcher(this);
        }

        @Override
        public int getDefaultColor() {
            return 0xff444444;
        }

        @Override
        public int getSelectColor() {
            return 0xff333333;
        }

        @Override
        public int getDefaultTextColor() {
            return 0xffffffff;
        }

        @Override
        public int getSelectTextColor() {
            return 0xffffffff;
        }

        @Override
        public int getImage() {
            return R.drawable.ic_file;
        }

        @Override
        public String getText() {
            return file.getName();
        }

        private void show() {
            //打开编辑界面
            codeEditPane.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            mLayoutEditor.removeAllViews();
            mLayoutEditor.addView(codeEditPane);
            codeEditText = codeEditPane.getCodeText();
            //绑定工具栏
            mToolView.setCodeEditText(codeEditText);
            codeEditText.requestFocus();
        }

        @Override
        public void onSelected(FileTabView fileTabView) {
            show();
        }

        @Override
        public void onClosed(FileTabView fileTabView) {
            closeInput(codeEditPane.getCodeText());
            codeEditPane.getCodeText().closeTips();
            mLayoutEditor.removeView(codeEditPane);
            //判断是否需要保存文件
            if (changed) {
                new AlertDialog.Builder(EditActivity.this).setTitle("提示").setMessage("是否保存文件" + file.getName() + "？").setNegativeButton("不保存", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("保存", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        save();
                    }
                }).setCancelable(false).create().show();
            }
            //检测是否没有打开文件
            checkNotOpen();
        }

        @Override
        public void save() {
            if (changed) {
                changed = false;
                setTitle(file.getName());
                try {
                    FileUtils.write(file, codeEditPane.getCodeText().getText().toString(), "utf-8");
                } catch (IOException e) {
                }
            }
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            changed = true;
            setTitle(file.getName() + "*");
        }
    }

    protected DrawerLayout mDrawerLayout;
    protected ImageButton mImgBtnDir;
    /**
     * JsDroid
     */
    protected TextView mTvTitle;
    protected ImageButton mImgBtnPlay;
    protected ImageButton mImgBtnEye;
    protected ImageButton mImgBtnMenu;
    protected FileTabView mFileTab;
    protected LinearLayout mLayoutEditor;
    protected EditToolView mToolView;
    protected CodeEditText codeEditText;
    protected FileView mFileView;

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.img_btn_dir) {
            //打开文件
            if (mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                mDrawerLayout.closeDrawers();
            } else {
                mDrawerLayout.openDrawer(Gravity.LEFT);
            }
        } else if (i == R.id.img_btn_run) {
            run();
        } else if (i == R.id.img_btn_eye) {
            eye();
        } else if (i == R.id.img_btn_menu) {
            showMenu();
        } else if (i == R.id.img_btn_save) {
            mFileTab.save();
            Toast.makeText(this, "已保存！", Toast.LENGTH_SHORT).show();
        }
    }

    protected abstract void run();

    protected abstract void eye();

    protected abstract void openProject();

    protected abstract void showMenu();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置状态栏颜色
        ContextUtil.setActionBarColor(this, 0xff333333);
        setContentView(R.layout.activity_edit);
        initView();
        //对View添加event
        initEvents();

    }

    /**
     * 对View添加event
     */
    private void initEvents() {

        mDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
                //关闭输入法
                try {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(drawerView.getWindowToken()
                            , InputMethodManager.HIDE_NOT_ALWAYS);
                } catch (Exception e) {
                }
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
                checkNotOpen();
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
        mFileView.setFileListener(new FileView.FileListener() {
            @Override
            public void onDelete(final File file) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //删除文件的时候，关闭tab
                        mFileTab.closeTab(file);
                    }
                });

            }

            @Override
            public void onAdd(File file) {

            }

            @Override
            public void onRename(final File oldFile, final File newFile) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //重命名文件的时候，更新tab标题
                        EditTab tab = (EditTab) mFileTab.findTab(oldFile);
                        if (tab != null) {
                            tab.file = newFile;
                            tab.setTitle(newFile.getName() + (tab.changed ? "*" : ""));
                        }
                    }
                });

            }

            @Override
            public void onCut(final File oldFile, final File newFile) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //剪切文件的时候，更新tab标题
                        EditTab tab = (EditTab) mFileTab.findTab(oldFile);
                        if (tab != null) {
                            tab.file = newFile;
                            tab.setTitle(newFile.getName() + (tab.changed ? "*" : ""));
                        }
                    }
                });
            }

            /**
             * 打开文件的时候，关闭列表
             * @param file
             */
            @Override
            public void onOpen(File file) {
                try {
                    openFile(file);
                } catch (Exception e) {
                    Toast.makeText(EditActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                mDrawerLayout.closeDrawers();
            }
        });
    }

    /**
     * 加载View
     */
    private void initView() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mImgBtnDir = (ImageButton) findViewById(R.id.img_btn_dir);
        mImgBtnDir.setOnClickListener(this);
        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mImgBtnPlay = (ImageButton) findViewById(R.id.img_btn_run);
        mImgBtnPlay.setOnClickListener(this);
        mImgBtnEye = (ImageButton) findViewById(R.id.img_btn_eye);
        mImgBtnEye.setOnClickListener(this);
        mImgBtnMenu = (ImageButton) findViewById(R.id.img_btn_menu);
        mImgBtnMenu.setOnClickListener(this);
        mFileTab = (FileTabView) findViewById(R.id.file_tab);
        mLayoutEditor = (LinearLayout) findViewById(R.id.layout_editor);
        mToolView = (EditToolView) findViewById(R.id.tool_view);
        mFileTab.setOnClickListener(this);
        mFileView = (FileView) findViewById(R.id.layout_file);
        mImgBtnSave = (ImageButton) findViewById(R.id.img_btn_save);
        mImgBtnSave.setOnClickListener(this);
    }

    /**
     * 隐藏代码提示
     */
    public void hideTips() {
        if (codeEditText != null) {
            codeEditText.closeTips();
        }
    }


    /**
     * 打开文件，编辑文件
     *
     * @param file
     */
    public void openFile(File file) throws Exception {
        mFileTab.selectTab(mFileTab.addTab(new EditTab(file)));
    }

    /**
     * 拦截事件，隐藏提示
     *
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        hideTips();
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 关闭输入法
     *
     * @param view
     */
    private void closeInput(View view) {
        //关闭输入法
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken()
                , InputMethodManager.HIDE_NOT_ALWAYS);

    }

    /**
     * 退出时候，保存所有文件
     */
    @Override
    protected void onPause() {
        mFileTab.save();
        super.onPause();
    }

    /**
     * 检查是否打开文件，没有打开则显示文件列表
     */
    private void checkNotOpen() {
        if (mFileTab.getTabCount() == 0) {
            mDrawerLayout.openDrawer(Gravity.LEFT);
        }
    }

}
