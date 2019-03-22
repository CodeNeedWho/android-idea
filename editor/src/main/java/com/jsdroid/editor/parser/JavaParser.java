package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.java.JavaLexer;

import org.antlr.v4.runtime.CodePointBuffer;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.nio.ByteBuffer;

public class JavaParser extends AbstractParser {
    static String keywords[] = new String[]{
            "abstract", "assert", "boolean", "break", "byte", "case",
            "catch", "char", "class", "const", "continue", "default",
            "do", "double", "else", "enum", "extends", "final", "finally",
            "float", "for", "if", "goto", "implements", "import", "instanceof",
            "int", "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
    };


    @Override
    protected Lexer getLexer(String text) {
        byte[] bytes = text.getBytes();
        CodePointCharStream codePointCharStream = CodePointCharStream.fromBuffer(CodePointBuffer.withBytes(ByteBuffer.wrap(bytes)));
        return new JavaLexer(codePointCharStream);
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (type >= 57 && type <= 99) {
            return Colors.symbol;
        }
        if (type == 101 || type == 102) {
            return Colors.symbol;
        }
        if (type >= 1 && type <= 50 || type == 56) {
            return Colors.keyword;
        }

        switch (type) {
            case JavaLexer.COMMENT:
            case JavaLexer.LINE_COMMENT:
                return Colors.comment;
            case JavaLexer.Identifier:
                return Colors.variable;
            case JavaLexer.IntegerLiteral:
                return Colors.number;
            case JavaLexer.StringLiteral:
                return Colors.string;
            case JavaLexer.BooleanLiteral:
                return Colors.keyword;
            case JavaLexer.FloatingPointLiteral:
                return Colors.number;
            case JavaLexer.CharacterLiteral:
                return Colors.string;
        }
        return Colors.white;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()){
            case JavaLexer.Identifier:
                return token.getText();
            case JavaLexer.StringLiteral:
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
