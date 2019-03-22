package com.jsdroid.editor.parser;

import android.content.Context;

import com.jsdroid.editor.R;

public class Colors {
    //变量颜色
    static public int variable;
    //修饰符颜色
    static public int modifier;
    //关键字颜色
    static public int keyword;
    //数字颜色
    static public int number;
    //字符串颜色
    static public int string;
    //符号颜色
    static public int symbol;
    //方法名颜色
    static public int method;
    //注释颜色
    static public int comment;
    public static int white = 0xffffffff;

    public static void init(Context context) {
        variable = context.getResources().getColor(R.color.code_variable);
        modifier = context.getResources().getColor(R.color.code_modifier);
        keyword = context.getResources().getColor(R.color.code_keyword);
        number = context.getResources().getColor(R.color.code_number);
        string = context.getResources().getColor(R.color.code_string);
        symbol = context.getResources().getColor(R.color.code_symbol);
        method = context.getResources().getColor(R.color.code_method);
        comment = context.getResources().getColor(R.color.code_comment);


        context.getResources().getColor(R.color.code_variable);
        context.getResources().getColor(R.color.code_variable);
    }

}
