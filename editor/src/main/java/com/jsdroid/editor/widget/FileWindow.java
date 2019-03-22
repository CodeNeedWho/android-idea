package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.jsdroid.editor.R;

public class FileWindow extends PopupWindow {
    Context context;
    View parent;
    View contentView;
    private ImageButton mImgBtnDir;
    private ImageButton mImgBtnAdd;
    private ImageButton mImgBtnDelete;
    private ImageButton mImgBtnCopy;
    private ImageButton mImgBtnPaste;
    private ImageButton mImgBtnSelectAll;
    private ImageButton mImgBtnClose;
    private ListView mListFile;

    public FileWindow(View parent) {
        this.parent = parent;
        this.context = parent.getContext();
        init();
    }

    private void init() {
        setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        initViews();
    }

    private void initViews() {
        contentView = LayoutInflater.from(context).inflate(R.layout.edit_file_view, null);
        setContentView(contentView);
        mImgBtnDir = (ImageButton) contentView.findViewById(R.id.img_btn_dir);
        mImgBtnAdd = (ImageButton) contentView.findViewById(R.id.img_btn_add);
        mImgBtnDelete = (ImageButton) contentView.findViewById(R.id.img_btn_delete);
        mImgBtnCopy = (ImageButton) contentView.findViewById(R.id.img_btn_copy);
        mImgBtnPaste = (ImageButton) contentView.findViewById(R.id.img_btn_paste);
        mImgBtnSelectAll = (ImageButton) contentView.findViewById(R.id.img_btn_select_all);
        mImgBtnClose = (ImageButton) contentView.findViewById(R.id.img_btn_close);
        mListFile = (ListView) contentView.findViewById(R.id.list_file);
    }
}
