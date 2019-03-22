package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.c.CLexer;

import org.antlr.v4.runtime.CodePointBuffer;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.nio.ByteBuffer;

public class CParser extends AbstractParser {
    static final String[] keywords = new String[]{
            "__extension__", "__builtin_va_arg", "__builtin_offsetof",
            "__m128", "__m128d", "__m128i", "__typeof__", "__inline__",
            "__stdcall", "__declspec", "__asm", "__attribute__", "__asm__",
            "__volatile__", "auto", "break", "case", "char", "const",
            "continue", "default", "do", "double", "else", "enum", "extern",
            "float", "for", "goto", "if", "inline", "int", "long",
            "register", "restrict", "return", "short", "signed", "sizeof",
            "static", "struct", "switch", "typedef", "union", "unsigned",
            "void", "volatile", "while", "_Alignas", "_Alignof", "_Atomic",
            "_Bool", "_Complex", "_Generic", "_Imaginary", "_Noreturn",
            "_Static_assert", "_Thread_local"
    };


    @Override
    protected Lexer getLexer(String text) {
        byte[] bytes = text.getBytes();
        CodePointCharStream codePointCharStream = CodePointCharStream.fromBuffer(CodePointBuffer.withBytes(ByteBuffer.wrap(bytes)));
        return new CLexer(codePointCharStream);
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();

        if (type >= 1 && type <= 58) {
            return Colors.keyword;
        }
        if (type >= 59 && type <= 104) {
            return Colors.symbol;
        }
        switch (token.getType()) {
            case CLexer.BlockComment:
            case CLexer.LineComment:
                return Colors.comment;
            case CLexer.StringLiteral:
                return Colors.string;
            case CLexer.Identifier:
                return Colors.variable;

        }

        return Colors.white;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()) {
            case CLexer.Identifier:
                return token.getText();
            case CLexer.StringLiteral:
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
        return null;
    }
}
