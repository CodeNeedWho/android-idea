package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.cpp.cppLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class CppParser extends AbstractParser {
    private static String[] keywords = new String[]{
            "alignas", "alignof", "asm", "auto", "bool", "break",
            "case", "catch", "char", "char16_t", "char32_t", "class",
            "const", "constexpr", "const_cast", "continue", "decltype",
            "default", "delete", "do", "double", "dynamic_cast", "else",
            "enum", "explicit", "export", "extern", "false", "final",
            "float", "for", "friend", "goto", "if", "inline", "int",
            "long", "mutable", "namespace", "new", "noexcept", "nullptr",
            "operator", "override", "private", "protected", "public", "register",
            "reinterpret_cast", "return", "short", "signed", "sizeof",
            "static", "static_assert", "static_cast", "struct", "switch",
            "template", "this", "thread_local", "throw", "true", "try",
            "typedef", "typeid", "typename", "union", "unsigned", "using",
            "virtual", "void", "volatile", "wchar_t", "while"
    };

    @Override
    protected Lexer getLexer(String text) {
        return new cppLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (type >= 77 && type <= 123) {
            return Colors.symbol;
        }
        if (type >= 2 && type <= 76) {
            return Colors.keyword;
        }
        switch (type) {
            case cppLexer.Stringliteral:
                return Colors.string;
            case cppLexer.Decimalliteral:
            case cppLexer.Binaryliteral:
            case cppLexer.Integerliteral:
            case cppLexer.Octalliteral:
            case cppLexer.Characterliteral:
            case cppLexer.Floatingliteral:
                return Colors.number;
            case cppLexer.BlockComment:
            case cppLexer.LineComment:
                return Colors.comment;
            case cppLexer.Identifier:
                return Colors.variable;
        }
        return Colors.white;
    }

    @Override
    protected String getName(Token token) {
        int type = token.getType();
        switch (type) {
            case cppLexer.Stringliteral:
            case cppLexer.Identifier:
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
