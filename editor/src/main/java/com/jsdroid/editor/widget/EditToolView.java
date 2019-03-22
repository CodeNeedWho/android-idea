package com.jsdroid.editor.widget;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jsdroid.editor.R;
import com.jsdroid.editor.SearchUtil;
import com.jsdroid.editor.UndoStack;

public class EditToolView extends LinearLayout implements View.OnClickListener {
    CodeEditText codeEditText;
    private LinearLayout mLayoutSymbolContent;
    private HorizontalScrollView mScrollSymbol;
    private LinearLayout mLayoutSymbol;
    private ImageButton mImgBtnSearch;
    private ImageButton mImgBtnUndo;
    private ImageButton mImgBtnRedo;
    private SelectTouchView mSelectTouchView;
    private ImageButton mImgBtnEdit;
    private ImageButton mImgBtnGoto;
    private ImageButton mImgBtnSymbol;
    private LinearLayout mLayoutTool;
    /**
     * 普通
     */
    private TextView mTvSearchMode;
    /**
     * 搜索内容
     */
    private EditText mEditSearch;
    /**
     * 往前
     */
    private TextView mTvSearchForward;
    /**
     * 往后
     */
    private TextView mTvSearchBackward;
    /**
     * 关闭
     */
    private TextView mTvSearchClose;
    /**
     * 替换内容
     */
    private EditText mEditReplace;
    /**
     * 一次
     */
    private TextView mTvReplaceOnce;
    /**
     * 全部
     */
    private TextView mTvSarchAll;
    private LinearLayout mLayoutSearch;
    /**
     * 关闭
     */
    private TextView mTvGotoClose;
    /**
     * 行数
     */
    private EditText mEditGoto;
    /**
     * 跳转
     */
    private TextView mTvGoto;
    private LinearLayout mLayoutGoto;
    /**
     * 关闭
     */
    private TextView mTvEditClose;
    /**
     * 复制
     */
    private TextView mTvCopy;
    /**
     * 复制行
     */
    private TextView mTvCopyLine;
    /**
     * 复制全部
     */
    private TextView mTvCopyAll;
    /**
     * 关闭
     */
    private TextView mTvFormat;
    /**
     * 复制
     */
    private TextView mTvDeleteLine;
    /**
     * 清空
     */
    private TextView mTvClear;
    /**
     * 粘贴
     */
    private TextView mTvPaste;
    private LinearLayout mLayoutEdit;

    public EditToolView(@NonNull Context context) {
        super(context);
    }


    public EditToolView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private void initView() {
        mLayoutSymbolContent = (LinearLayout) findViewById(R.id.layout_symbol_content);
        mScrollSymbol = (HorizontalScrollView) findViewById(R.id.scroll_symbol);
        mLayoutSymbol = (LinearLayout) findViewById(R.id.layout_symbol);
        mImgBtnSearch = (ImageButton) findViewById(R.id.img_btn_search);
        mImgBtnSearch.setOnClickListener(this);
        mImgBtnUndo = (ImageButton) findViewById(R.id.img_btn_undo);
        mImgBtnUndo.setOnClickListener(this);
        mImgBtnRedo = (ImageButton) findViewById(R.id.img_btn_redo);
        mImgBtnRedo.setOnClickListener(this);
        mSelectTouchView = (SelectTouchView) findViewById(R.id.selectTouchView);
        mImgBtnEdit = (ImageButton) findViewById(R.id.img_btn_edit);
        mImgBtnEdit.setOnClickListener(this);
        mImgBtnGoto = (ImageButton) findViewById(R.id.img_btn_goto);
        mImgBtnGoto.setOnClickListener(this);
        mImgBtnSymbol = (ImageButton) findViewById(R.id.img_btn_symbol);
        mImgBtnSymbol.setOnClickListener(this);
        mLayoutTool = (LinearLayout) findViewById(R.id.layout_tool);
        mTvSearchMode = (TextView) findViewById(R.id.tv_search_mode);
        mTvSearchMode.setOnClickListener(this);
        mEditSearch = (EditText) findViewById(R.id.edit_search);
        mTvSearchForward = (TextView) findViewById(R.id.tv_search_forward);
        mTvSearchForward.setOnClickListener(this);
        mTvSearchBackward = (TextView) findViewById(R.id.tv_search_backward);
        mTvSearchBackward.setOnClickListener(this);
        mTvSearchClose = (TextView) findViewById(R.id.tv_search_close);
        mTvSearchClose.setOnClickListener(this);
        mEditReplace = (EditText) findViewById(R.id.edit_replace);
        mTvReplaceOnce = (TextView) findViewById(R.id.tv_replace_once);
        mTvReplaceOnce.setOnClickListener(this);
        mTvSarchAll = (TextView) findViewById(R.id.tv_replace_all);
        mTvSarchAll.setOnClickListener(this);
        mLayoutSearch = (LinearLayout) findViewById(R.id.layout_search);
        mTvGotoClose = (TextView) findViewById(R.id.tv_goto_close);
        mTvGotoClose.setOnClickListener(this);
        mEditGoto = (EditText) findViewById(R.id.edit_goto);
        mTvGoto = (TextView) findViewById(R.id.tv_goto);
        mTvGoto.setOnClickListener(this);
        mLayoutGoto = (LinearLayout) findViewById(R.id.layout_goto);
        mLayoutEdit = (LinearLayout) findViewById(R.id.layout_edit);
        mTvEditClose = (TextView) findViewById(R.id.tv_edit_close);
        mTvEditClose.setOnClickListener(this);
        mTvCopy = (TextView) findViewById(R.id.tv_copy);
        mTvCopy.setOnClickListener(this);
        mTvCopyLine = (TextView) findViewById(R.id.tv_copy_line);
        mTvCopyLine.setOnClickListener(this);
        mTvCopyAll = (TextView) findViewById(R.id.tv_copy_all);
        mTvCopyAll.setOnClickListener(this);
        mTvFormat = (TextView) findViewById(R.id.tv_format);
        mTvFormat.setOnClickListener(this);
        mTvDeleteLine = (TextView) findViewById(R.id.tv_delete_line);
        mTvDeleteLine.setOnClickListener(this);
        mTvClear = (TextView) findViewById(R.id.tv_clear);
        mTvClear.setOnClickListener(this);
        mTvPaste = (TextView) findViewById(R.id.tv_paste);
        mTvPaste.setOnClickListener(this);
    }

    private void hideTool() {
        mLayoutGoto.setVisibility(GONE);
        mLayoutSearch.setVisibility(GONE);
        mLayoutEdit.setVisibility(GONE);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.img_btn_search) {
            if (mLayoutSearch.isShown()) {
                mLayoutSearch.setVisibility(GONE);
                codeEditText.requestFocus();
            } else {
                hideTool();
                mLayoutSearch.setVisibility(VISIBLE);
                mEditSearch.requestFocus();
            }
        } else if (i == R.id.img_btn_undo) {
            codeEditText.getUndoStack().undo();
        } else if (i == R.id.img_btn_redo) {
            codeEditText.getUndoStack().redo();
        } else if (i == R.id.img_btn_edit) {
            if (mLayoutEdit.isShown()) {
                codeEditText.requestFocus();
                mLayoutEdit.setVisibility(GONE);
            } else {
                hideTool();
                mLayoutEdit.setVisibility(VISIBLE);
            }
        } else if (i == R.id.img_btn_goto) {
            if (mEditGoto.isShown()) {
                codeEditText.requestFocus();
                mLayoutGoto.setVisibility(GONE);
            } else {
                hideTool();
                mLayoutGoto.setVisibility(VISIBLE);
                mEditGoto.requestFocus();
            }

        } else if (i == R.id.img_btn_symbol) {
            if (mLayoutSymbol.isShown()) {

                mLayoutSymbol.setVisibility(GONE);
            } else {
                mLayoutSymbol.setVisibility(VISIBLE);
            }
        } else if (i == R.id.tv_search_mode) {
            if (mTvSearchMode.getText().toString().equals("普通")) {
                mTvSearchMode.setText("正则");
            } else {
                mTvSearchMode.setText("普通");
            }
        } else if (i == R.id.tv_search_forward) {
            if (codeEditText != null) {
                String text = mEditSearch.getText().toString();
                boolean regex = mTvSearchMode.getText().toString().equals("正则");
                SearchUtil.searchNext(codeEditText, text, regex);
            }
        } else if (i == R.id.tv_search_backward) {
            if (codeEditText != null) {
                String text = mEditSearch.getText().toString();
                boolean regex = mTvSearchMode.getText().toString().equals("正则");
                SearchUtil.searchPrevious(codeEditText, text, regex);
            }
        } else if (i == R.id.tv_search_close) {
            codeEditText.requestFocus();
            mLayoutSearch.setVisibility(GONE);
        } else if (i == R.id.tv_replace_once) {
            if (codeEditText != null) {
                String text = mEditSearch.getText().toString();
                boolean regex = mTvSearchMode.getText().toString().equals("正则");
                String replace = mEditReplace.getText().toString();
                SearchUtil.replaceOnce(codeEditText, text, replace, regex);
            }
        } else if (i == R.id.tv_replace_all) {
            if (codeEditText != null) {
                String replace = mEditReplace.getText().toString();
                String text = mEditSearch.getText().toString();
                boolean regex = mTvSearchMode.getText().toString().equals("正则");
                SearchUtil.replaceAll(codeEditText, text, replace, regex);
            }
        } else if (i == R.id.tv_goto_close) {
            codeEditText.requestFocus();
            mLayoutGoto.setVisibility(GONE);
        } else if (i == R.id.tv_goto) {
            String line = mEditGoto.getText().toString();
            int lineNum = Integer.parseInt(line);
            codeEditText.goLine(lineNum);
            mLayoutGoto.setVisibility(GONE);

        } else if (i == R.id.tv_edit_close) {

            mLayoutEdit.setVisibility(GONE);
        } else if (i == R.id.tv_copy) {
            copy();
        } else if (i == R.id.tv_copy_line) {
            copyLine();
        } else if (i == R.id.tv_copy_all) {
            copyAll();
        } else if (i == R.id.tv_format) {
            format();
        } else if (i == R.id.tv_delete_line) {
            deleteLine();
        } else if (i == R.id.tv_clear) {
            clear();
        } else if (i == R.id.tv_paste) {
            paste();
        } else {
        }

    }

    private void paste() {
        //获取剪贴板管理器
        ClipboardManager cm = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
        int count = cm.getPrimaryClip().getItemCount();
        for (int i = 0; i < count; i++) {
            ClipData.Item item = cm.getPrimaryClip().getItemAt(i);
            String text = "" + item.getText();
            int start = codeEditText.getSelectionStart();
            int end = codeEditText.getSelectionEnd();
            codeEditText.getText().replace(start, end, text);
            codeEditText.setSelection(end);
        }
    }

    private void clear() {
        codeEditText.getText().clear();
    }

    private void deleteLine() {
        int start = codeEditText.getSelectLineStart();
        int end = codeEditText.getSelectLineEnd();
        codeEditText.getText().delete(start, end);
    }


    class FormatCursorPos {
        char cursorChar;
        int cursorCharIndexPos;
        //记录是否已经保存光标位置
        boolean save;
        int offset;

        public FormatCursorPos() {
        }

        private int getCursorCharPos(CharSequence text, int startCursorPos) {
            //定位cursor
            int cursorPos = -1;
            if (cursorPos == -1) {
                for (int i = startCursorPos; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (c == '\n' || c == ' ' || c == '\r' || c == '\t') {
                        continue;
                    } else {
                        cursorPos = i;
                        break;
                    }
                }
            }
            if (cursorPos == -1) {
                for (int i = startCursorPos - 1; i < text.length() && i >= 0; i--) {
                    char c = text.charAt(i);
                    if (c == '\n' || c == ' ' || c == '\r' || c == '\t') {
                        continue;
                    } else {
                        cursorPos = i;
                        break;
                    }
                }
            }
            if (cursorPos != -1) {
                offset = cursorPos - startCursorPos;
                cursorChar = text.charAt(cursorPos);
            }

            return cursorPos;
        }

        public void save(CharSequence text, int cursorPos) {
            int cursorCharPos = getCursorCharPos(text, cursorPos);
            if (cursorCharPos != -1) {
                //记录光标字符是第几个
                cursorCharIndexPos = 0;
                for (int i = 0; i < text.length(); i++) {
                    int c = text.charAt(i);
                    if (c == cursorChar) {
                        if (i == cursorCharPos) {
                            break;
                        }
                        cursorCharIndexPos++;
                    }
                }
                save = true;
            }
        }

        public int restore(CharSequence text) {
            if (!save) {
                return -1;
            }
            save = false;
            int pos = 0;
            int cursorPos = -1;
            for (int i = 0; i < text.length(); i++) {
                int c = text.charAt(i);
                if (c == cursorChar) {
                    if (pos == cursorCharIndexPos) {
                        cursorPos = i;
                        break;
                    }
                    pos++;
                }

            }
            if (offset > 0) {
                int tempPos = cursorPos - 1;
                for (int i = 0; i < offset; i++) {
                    if (tempPos >= 0 && tempPos < text.length()) {
                        char c = text.charAt(tempPos);
                        if (c == '\n' || c == ' ' || c == '\r' || c == '\t') {
                            tempPos--;
                            continue;
                        }
                    } else {
                        tempPos--;
                    }
                    break;
                }
                cursorPos = tempPos + 1;
            } else if (offset < 0) {
                int tempPos = cursorPos + 1;
                for (int i = 0; i < -offset; i++) {
                    if (tempPos >= 0 && tempPos < text.length()) {
                        char c = text.charAt(tempPos);
                        if (c == '\n' || c == ' ' || c == '\r' || c == '\t') {
                            tempPos++;
                            continue;
                        }
                    } else {
                        tempPos++;
                    }
                    break;
                }
                cursorPos = tempPos - 1;
            }
            return cursorPos;
        }
    }

    private void format() {
        final String code = codeEditText.getText().toString();
        final AlertDialog dialog = new ProgressDialog.Builder(getContext()).setTitle("提示").setMessage("正在格式化代码...").create();
        dialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //格式化代码
                    String result = codeEditText.getParser().format();
                    result = result.replace("\r", "\n").replaceAll("\n[\n]+", "\n");
                    FormatCursorPos formatCursorPos = new FormatCursorPos();
                    formatCursorPos.save(code, codeEditText.getSelectionEnd());
                    final int cursorPos = formatCursorPos.restore(result);
                    final String codeResult = result;
                    post(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                codeEditText.setText(codeResult);
                                codeEditText.setSelection(cursorPos);
                            } catch (Exception e) {
                            }
                        }
                    });
                } catch (Exception ignore) {

                } finally {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                    post(new Runnable() {
                        @Override
                        public void run() {
                            dialog.dismiss();
                        }
                    });

                }
            }
        }).start();


    }

    private void copyAll() {
        try {
            String copyText = codeEditText.getText().toString();
            if (copyText.trim().length() != 0) {
                //获取剪贴板管理器
                ClipboardManager cm = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                // 创建普通字符型ClipData
                ClipData mClipData = ClipData.newPlainText("Label", copyText);
                // 将ClipData内容放到系统剪贴板里。
                cm.setPrimaryClip(mClipData);
            }
        } catch (Exception e) {
            Toast.makeText(getContext(), "内容过长,复制失败~", Toast.LENGTH_SHORT).show();
        }
    }

    private void copyLine() {
        int start = codeEditText.getSelectLineStart();
        int end = codeEditText.getSelectLineEnd();
        if (start != end) {
            String copyText = codeEditText.getText().subSequence(start, end).toString();
            if (copyText.trim().length() != 0) {
                //获取剪贴板管理器：
                ClipboardManager cm = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                // 创建普通字符型ClipData
                ClipData mClipData = ClipData.newPlainText("Label", copyText);
                // 将ClipData内容放到系统剪贴板里。
                cm.setPrimaryClip(mClipData);
            }
        }
    }

    private void copy() {
        int start = codeEditText.getSelectionStart();
        int end = codeEditText.getSelectionEnd();
        if (start>end){
            int temp = start;
            start = end;
            end = temp;
        }
        if (start != end) {
            String copyText = codeEditText.getText().toString().substring(start,end);
            if (copyText.trim().length() != 0) {
                //获取剪贴板管理器：
                ClipboardManager cm = (ClipboardManager) getContext().getSystemService(Context.CLIPBOARD_SERVICE);
                // 创建普通字符型ClipData
                ClipData mClipData = ClipData.newPlainText("Label", copyText);
                // 将ClipData内容放到系统剪贴板里。
                cm.setPrimaryClip(mClipData);
            }
        }
    }

    public void setCodeEditText(CodeEditText codeEditText) {
        this.codeEditText = codeEditText;
        initView();
        init();
        initEvent();
    }

    private void initTouchView() {
        mSelectTouchView.setCodeEditText(codeEditText);
    }

    private void initEvent() {
        int count = mLayoutSymbolContent.getChildCount();
        for (int i = 0; i < count; i++) {
            final TextView child = (TextView) mLayoutSymbolContent.getChildAt(i);
            child.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    int start = codeEditText.getSelectionStart();
                    int end = codeEditText.getSelectionEnd();
                    codeEditText.getText().replace(start, end, child.getText());
                    int length = child.getText().length();
                    if (length == 4) {
                        codeEditText.setSelection(start + 2);
                    } else if (length == 2 || length == 1) {
                        codeEditText.setSelection(start + 1);
                    } else {
                        codeEditText.setSelection(start + length);
                    }
                }
            });
        }
    }

    /**
     * 改变重做按钮是否可用状态
     */
    private void refreshRedoState() {
        if (codeEditText.getUndoStack().canRedo()) {
            mImgBtnRedo.setEnabled(true);
            mImgBtnRedo.setAlpha(1.0f);
        } else {
            mImgBtnRedo.setEnabled(false);
            mImgBtnRedo.setAlpha(0.3f);
        }
    }

    /**
     * 改变撤销按钮是否可用状态
     */
    private void refreshUndoState() {
        if (codeEditText.getUndoStack().canUndo()) {
            mImgBtnUndo.setEnabled(true);
            mImgBtnUndo.setAlpha(1.0f);
        } else {
            mImgBtnUndo.setEnabled(false);
            mImgBtnUndo.setAlpha(0.3f);
        }
    }

    private void init() {
        initTouchView();
        refreshRedoState();
        refreshUndoState();
        codeEditText.getUndoStack().setOnTextChangedListener(new UndoStack.OnTextChangedListener() {
            @Override
            public void onChanged() {
                refreshRedoState();
                refreshUndoState();
            }
        });
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        TipsWindow.toolHeight = getMeasuredHeight();
    }
}

