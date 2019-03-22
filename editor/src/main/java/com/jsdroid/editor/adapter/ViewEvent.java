package com.jsdroid.editor.adapter;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;


public class ViewEvent implements View.OnClickListener, View.OnLongClickListener, CompoundButton.OnCheckedChangeListener, View.OnTouchListener {
    public static final int CLICK = 0b1;
    public static final int LONG_CLICK = 0b10;
    public static final int TOUCH = 0b100;
    public static final int CHECK = 0b1000;
    int type = CLICK | LONG_CLICK | TOUCH | CHECK;

    boolean enable = true;

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }

    public void event(View view) {
        int click = type & 1;
        int longClick = (type >> 1) & 1;
        int touch = (type >> 2) & 1;
        int check = (type >> 3) & 1;
        if (click == 1)
            view.setOnClickListener(this);
        if (longClick == 1)
            view.setOnLongClickListener(this);
        if (touch == 1)
            view.setOnTouchListener(this);
        if (check == 1)
            if (view instanceof CompoundButton) {
                ((CompoundButton) view).setOnCheckedChangeListener(this);
            }
    }
}
