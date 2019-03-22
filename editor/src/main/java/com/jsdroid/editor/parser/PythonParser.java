package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.python.Python3Lexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class PythonParser extends AbstractParser {
    static String keywords[] = new String[]{
            "def", "return", "raise", "from", "import", "as", "global",
            "nonlocal", "assert", "if", "elif", "else", "while", "for",
            "in", "try", "finally", "with", "except", "lambda", "or",
            "and", "not", "is", "None", "True", "False", "class", "yield",
            "del", "pass", "continue", "break"
    };

    @Override
    protected Lexer getLexer(String text) {
        return new Python3Lexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (in(type, 1, 33)) {
            return Colors.keyword;
        }
        switch (type) {
            case Python3Lexer.NAME:
                return Colors.variable;
            case Python3Lexer.STRING_LITERAL:
                return Colors.string;
            case Python3Lexer.BIN_INTEGER:
            case Python3Lexer.DECIMAL_INTEGER:
            case Python3Lexer.HEX_INTEGER:
            case Python3Lexer.OCT_INTEGER:
            case Python3Lexer.FLOAT_NUMBER:
                return Colors.number;
        }
        return 0;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case Python3Lexer.NAME:
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
