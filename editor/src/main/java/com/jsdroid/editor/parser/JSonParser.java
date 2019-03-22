package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.json.JSONLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class JSonParser extends AbstractParser {
    @Override
    protected Lexer getLexer(String text) {
        return new JSONLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        switch (token.getType()) {
            case JSONLexer.STRING:
                return Colors.string;
            case JSONLexer.NUMBER:
                return Colors.number;
        }
        return Colors.keyword;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case JSONLexer.STRING:
                String text = token.getText();
                if (text.length() > 2) {

                    return text.substring(1, text.length() - 1);
                }
        }
        return null;
    }

    @Override
    public String[] getKeyWords() {
        return new String[0];
    }

    @Override
    public Tip[] getTemplates() {
        return new Tip[0];
    }
}
