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
import android.text.Layout;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class KeyDownEditText extends ColorsEditText {

    public KeyDownEditText(Context context) {
        super(context);
    }

    public KeyDownEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 记录用户操作的键盘，避免一次按键，多次输入
     */
    private int defaultDeviceId = -1000;

    private boolean delete() {
        Layout layout = getLayout();
        if (layout == null) {
            return true;
        }
        int start = getSelectionStart();
        if (start < getText().length()) {
            if (getText().charAt(start) == '}') {
                return false;
            }
        }
        int spaceCount = 0;
        boolean needDeleteSpace = false;
        for (int i = start - 1; i >= 0 && i < getText().length(); i--) {
            char c = getText().charAt(i);
            if (c == ' ') {
                spaceCount++;
            } else {
                if (needDeleteSpace) {
                    getText().replace(i + 1, i + 1 + spaceCount, "");
                    if (c == '\n') {
                        //添加缩进
                        String spaces = getSpaces(i);
                        getText().insert(i + 1, spaces);
                    }
                    return true;
                }
                if (c == '\n') {
                    needDeleteSpace = true;
                    spaceCount++;
                    continue;
                }
                break;

            }
        }
        return false;
    }

    private String getSpaces(int start) {
        String space = "";
        Layout layout = getLayout();
        for (int i = start - 1; i >= 0 && i < getText().length(); i--) {
            char c = getText().charAt(i);
            if (c != ' ' && c != '\n' && c != '\r') {
                int line = layout.getLineForOffset(i);
                int startPos = layout.getLineStart(line);
                if (c == '{') {
                    space += "    ";
                }
                for (int j = startPos; j < i; j++) {
                    c = getText().charAt(j);
                    if (c == ' ') {
                        space += " ";
                    } else {
                        break;
                    }
                }
                break;

            }

        }
        return space;
    }

    private boolean enter() {
        Layout layout = getLayout();
        if (layout == null) {
            return true;
        }
        int start = getSelectionStart();
        int end = getSelectionEnd();
        if (start == end) {
            String space = getSpaces(start);
            getText().insert(start, "\n" + space);
            if (start > 0) {
                char c = getText().charAt(start - 1);
                if (c == '{' || c == '[' || c == '(') {
                    start = getSelectionStart();
                    if (start < getText().length() && getText().charAt(start) == '}') {
                        if (space.length() >= 4) {
                            getText().insert(start, "\n" + space.substring(4));
                        }
                    }
                    setSelection(start);
                }
            }

        }
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        int deviceId = event.getDeviceId();
        if (defaultDeviceId == -1000) {
            defaultDeviceId = deviceId;
        } else {
            if (defaultDeviceId == -1) {
                if (deviceId != defaultDeviceId) {
                    defaultDeviceId = deviceId;
                    return true;
                }
            }
        }

        if (deviceId != defaultDeviceId) {
            return true;
        }
        defaultDeviceId = deviceId;
//        Log.e("test", "onKeyDown: "+deviceId);
        if (keyCode == KeyEvent.KEYCODE_TAB) {
            int start = getSelectionStart();
            int end = getSelectionEnd();
            if (start == end) {
                getText().insert(start, "    ");
            }
            return true;
        }
        if (keyCode == KeyEvent.KEYCODE_DEL) {
            //删除
            if (delete()) {
                return true;
            }
        }
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            if (enter()) {
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }


}
