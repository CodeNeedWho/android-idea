package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.groovy.GroovyLangLexer;
import com.jsdroid.antlr4.groovy.GroovyLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class GroovyParser extends AbstractParser {
    private static String keywords[] = new String[]{
            "class", "interface", "trait", "enum",
            "package", "import", "extends", "implements", "def", "null",
            "true", "false", "new", "super", "this", "in", "for", "if",
            "else", "do", "while", "switch", "case", "default", "continue",
            "break", "return", "try", "catch", "finally", "throw", "throws",
            "assert", "const", "goto","abstract", "static",
            "final", "transient", "native", "volatile", "synchronized",
            "strictfp", "threadsafe", "as", "instanceof"
    };
    @Override
    protected Lexer getLexer(String text) {
        return new GroovyLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (in(type, 17, 51)) {
            return Colors.keyword;
        }
        if (in(type, 104, 105)||in(type, 108, 116)) {
            return Colors.keyword;
        }
        switch (type) {
            case GroovyLexer.DECIMAL:
            case GroovyLangLexer.INTEGER:
                return Colors.number;
            case GroovyLexer.STRING:
                return Colors.string;

        }
        return 0;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case GroovyLangLexer.IDENTIFIER:
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
