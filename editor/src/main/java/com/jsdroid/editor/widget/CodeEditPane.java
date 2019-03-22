/*
 * Copyright 2018. who<980008027@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jsdroid.editor.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.jsdroid.editor.parser.Parser;

import java.io.File;
import java.io.IOException;


/**
 * 编辑框滑动容器视图
 */

public class CodeEditPane extends HVScrollView {
    CodeEditText mCodeEditText;
    int mCodeTextMinHeight;
    int mCodeTextMinWidth;

    public CodeEditPane(Context context) {
        super(context);
        init();

    }

    public CodeEditPane(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setVerticalScrollBarEnabled(true);
        //设置背景颜色
        setBackgroundColor(0XFF333333);
        mCodeEditText = new CodeEditText(getContext());
        mCodeEditText.setScrollView(this);
        addView(mCodeEditText);
    }

    public CodeEditText getCodeEditText() {
        return mCodeEditText;
    }

    public void setParser(Parser parser) {
        if (parser != null) {
            mCodeEditText.setParser(parser);
            parser.setEditText(mCodeEditText);
        }
    }

    public void openFile(String file) throws IOException {
        openFile(new File(file));
    }

    public void openFile(File file) throws IOException {
        mCodeEditText.openFile(file);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //计算CodeText宽高
        int codeWidth = getWidth() - getPaddingLeft() - getPaddingRight();
        int codeHeight = getHeight() - getPaddingTop() - getPaddingBottom();
        if (mCodeTextMinHeight != codeHeight || mCodeTextMinWidth != codeWidth) {
            mCodeTextMinWidth = codeWidth;
            mCodeTextMinHeight = codeHeight;
            mCodeEditText.setMinimumWidth(mCodeTextMinWidth);
            mCodeEditText.setMinimumHeight(mCodeTextMinHeight);
        }
        super.onDraw(canvas);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        //滑动的时候，通知CodeText绘制高亮
        mCodeEditText.postInvalidate();
    }

    public CodeEditText getCodeText() {
        return mCodeEditText;
    }

}
