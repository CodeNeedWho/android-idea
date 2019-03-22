package com.jsdroid.editor.parser;

import com.jsdroid.editor.widget.CodeEditText;

import java.util.List;

public interface Parser {
    void parse(int start, int before,
               int count);

    /**
     * 获取变量表
     *
     * @return
     */
    List<String> getNames();

    void setEditText(CodeEditText codeEditText);

    String[] getKeyWords();

    Tip[] getTemplates();

    String format();

}
