package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.csharp.CSharpLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class CSharpParser extends AbstractParser {
    static String keywords[] = new String[]{
            "abstract",
            "add", "alias", "__arglist", "as", "ascending", "async",
            "await", "base", "bool", "break", "by", "byte", "case",
            "catch", "char", "checked", "class", "const", "continue",
            "decimal", "default", "delegate", "descending", "do", "double",
            "dynamic", "else", "enum", "equals", "event", "explicit",
            "extern", "false", "finally", "fixed", "float", "for", "foreach",
            "from", "get", "goto", "group", "if", "implicit", "in",
            "int", "interface", "internal", "into", "is", "join", "let",
            "lock", "long", "nameof", "namespace", "new", "null", "object",
            "on", "operator", "orderby", "out", "override", "params",
            "partial", "private", "protected", "public", "readonly", "ref",
            "remove", "return", "sbyte", "sealed", "select", "set", "short",
            "sizeof", "stackalloc", "static", "string", "struct", "switch",
            "this", "throw", "true", "try", "typeof", "uint", "ulong",
            "unchecked", "unsafe", "ushort", "using", "var", "virtual",
            "void", "volatile", "when", "where", "while", "yield"
    };

    @Override
    protected Lexer getLexer(String text) {
        return new CSharpLexer(createCharStream(text));
    }

    @Override
    protected int getTokenColor(Token token) {
        int type = token.getType();
        if (type >= 8 && type <= 111) {
            return Colors.keyword;
        }
        if (type >= 122 && type <= 192) {
            return Colors.symbol;
        }
//        if (type >= 178 && type <= 188) {
//            return Colors.keyword;
//        }
        switch (type) {
            case CSharpLexer.IDENTIFIER:
                return Colors.variable;
            case CSharpLexer.INTEGER_LITERAL:
            case CSharpLexer.HEX_INTEGER_LITERAL:
                return Colors.number;
            case CSharpLexer.DELIMITED_COMMENT:
            case CSharpLexer.DELIMITED_DOC_COMMENT:
            case CSharpLexer.SINGLE_LINE_COMMENT:
            case CSharpLexer.SINGLE_LINE_DOC_COMMENT:
                return Colors.comment;
            case CSharpLexer.CHARACTER_LITERAL:
                return Colors.string;
        }

        return Colors.comment;
    }

    @Override
    protected String getName(Token token) {
        switch (token.getType()){
            case CSharpLexer.IDENTIFIER:
                return token.getText();
            case CSharpLexer.CHARACTER_LITERAL:
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
