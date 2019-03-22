package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.xml.XMLLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class XMLParser extends AbstractParser {
    @Override
    protected Lexer getLexer(String text) {
        return new XMLLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        switch (type) {
            case XMLLexer.Name:
                return Colors.variable;
            case XMLLexer.CDATA:
                return Colors.comment;
            case XMLLexer.STRING:
                return Colors.string;
        }
        return 0;
    }

    @Override
    protected String getName(Token token) {
        int type = token.getType();
        switch (type) {
            case XMLLexer.STRING: {
                String text = token.getText();
                if (text.length() > 2) {
                    return text.substring(1, text.length() - 1);
                }
                break;
            }
            case XMLLexer.Name:
                return token.getText();

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
