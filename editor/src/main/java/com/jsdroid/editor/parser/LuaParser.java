package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.lua.LuaLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class LuaParser extends AbstractParser {
    static String[] keywords = new String[]{"break", "goto", "do", "end", "while",
            "repeat", "until", "if", "then", "elseif", "else", "for", "in", "function", "local", "return", "nil", "false", "true", "or", "and", "not"};

    @Override
    protected Lexer getLexer(String text) {
        return new LuaLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (in(type, 3, 14)) {
            return Colors.keyword;
        }
        if (in(type, 16, 19)) {
            return Colors.keyword;
        }
        if (in(type, 23, 25)) {
            return Colors.keyword;
        }
        if (in(type, 33, 34)) {
            return Colors.keyword;
        }
        if (type == 47) {
            return Colors.keyword;
        }
        switch (type) {
            case LuaLexer.CHARSTRING:
            case LuaLexer.LONGSTRING:
            case LuaLexer.NORMALSTRING:
                return Colors.string;
            case LuaLexer.FLOAT:
            case LuaLexer.INT:
            case LuaLexer.HEX_FLOAT:
            case LuaLexer.HEX:
                return Colors.number;
        }
        return 0;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case LuaLexer.NAME:
                return token.getText();
        }
        return null;
    }

    @Override
    public String[] getKeyWords() {
        return keywords;
    }

    @Override
    public Tip[] getTemplates() {
        return new Tip[0];
    }
}
