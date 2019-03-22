package com.jsdroid.editor;

import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchUtil {

    /**
     * 向上搜索
     *
     * @param text
     * @param regex
     */
    public static void searchPrevious(EditText editText, String text, boolean regex) {
        if (regex) {
            int start = editText.getSelectionStart();
            Matcher matcher = null;
            try {
                matcher = Pattern.compile(text).matcher(editText.getText());
            } catch (Exception e) {
                Toast.makeText(editText.getContext(), "正则表达式错误！", Toast.LENGTH_SHORT).show();
                return;
            }
            int lastStart = -1;
            int lastEnd = -1;
            while (matcher.find()) {
                if (matcher.end() < start) {
                    lastStart = matcher.start();
                    lastEnd = matcher.end();
                }

            }
            if (lastStart != -1) {
                //找到
                editText.setSelection(lastStart, lastEnd);
            } else {
                //没找到
                Toast.makeText(editText.getContext(), "未找到！", Toast.LENGTH_SHORT).show();
            }
        } else {
            int pos = editText.getText().subSequence(0, editText.getSelectionStart()).toString().lastIndexOf(text, editText.getSelectionStart());
            if (pos != -1) {
                editText.setSelection(pos, pos + text.length());
            }
        }
    }

    /**
     * 向下搜索
     *
     * @param text
     * @param regex
     */
    public static void searchNext(EditText editText, String text, boolean regex) {
        if (regex) {
            Matcher matcher = null;
            try {
                matcher = Pattern.compile(text).matcher(editText.getText());
            } catch (Exception e) {
                Toast.makeText(editText.getContext(), "正则表达式错误！", Toast.LENGTH_SHORT).show();
                return;
            }
            if (matcher.find(editText.getSelectionEnd())) {
                editText.setSelection(matcher.start(), matcher.end());
            }
        } else {
            int pos = editText.getText().toString().indexOf(text, editText.getSelectionEnd());
            if (pos != -1) {
                editText.setSelection(pos, pos + text.length());
            }
        }
    }

    /**
     * 替换一次
     *
     * @param text
     * @param replace
     * @param regex
     */
    public static void replaceOnce(EditText editText, String text, String replace, boolean regex) {
        searchNext(editText, text, regex);
        int start = editText.getSelectionStart();
        int end = editText.getSelectionEnd();
        if (start != end) {
            editText.getText().replace(start, end, replace);
            Toast.makeText(editText.getContext(), "替换成功！", Toast.LENGTH_SHORT).show();
        }
        editText.setSelection(start);
    }

    /**
     * 替换所有
     *
     * @param text
     * @param replace
     * @param regex
     */
    public static void replaceAll(EditText editText, String text, String replace, boolean regex) {
        if (editText.getText().length() == 0) {
            return;
        }
        //记住光标的位置
        int start = editText.getSelectionStart();
        if (regex) {
            try {
                editText.setText(editText.getText().toString().replaceAll(text, replace));
                Toast.makeText(editText.getContext(), "替换完毕！", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                Toast.makeText(editText.getContext(), "正则表达式错误！", Toast.LENGTH_SHORT).show();
            }
        } else {
            editText.setText(editText.getText().toString().replace(text, replace));
            Toast.makeText(editText.getContext(), "替换完毕！", Toast.LENGTH_SHORT).show();
        }
        if (start < editText.getText().length()) {
            editText.setSelection(start);
        } else {
            editText.setSelection(editText.getText().length());
        }
    }
}
