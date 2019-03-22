package com.jsdroid.editor.parser;

import com.jsdroid.antlr4.c.CLexer;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.UnbufferedCharStream;

import java.io.File;
import java.io.StringReader;
import java.util.List;

public class ParserFactory {
    public static Parser getParser(File file) {
        if (file.getName().endsWith(".js")) {
            return new JsParser();
        } else if (file.getName().endsWith(".java")) {
            return new JavaParser();
        } else if (file.getName().endsWith(".c") || file.getName().endsWith(".h")) {
            return new CppParser();
        } else if (file.getName().endsWith(".cpp") || file.getName().endsWith(".hpp")) {
            return new CppParser();
        } else if (file.getName().endsWith(".cs")) {
            return new CSharpParser();
        } else if (file.getName().endsWith(".go")) {
            return new GoParser();
        } else if (file.getName().endsWith(".groovy") || file.getName().endsWith(".gradle")) {
            return new GroovyParser();
        } else if (file.getName().endsWith(".html") || file.getName().endsWith(".htm")) {
            return new HtmlParser();
        } else if (file.getName().endsWith(".json")) {
            return new JSonParser();
        } else if (file.getName().endsWith(".lua")) {
            return new LuaParser();
        } else if (file.getName().endsWith(".py")) {
            return new PythonParser();
        } else if (file.getName().endsWith(".sql")) {
            return new SqlParser();
        } else if (file.getName().endsWith(".xml")) {
            return new XMLParser();
        }
        return null;
    }

    public static void main(String[] args) {
        List<? extends Token> allTokens = new CLexer(new UnbufferedCharStream(new StringReader("/*hello*/\n int main(){\n\n}"))).getAllTokens();
        for (Token allToken : allTokens) {
            System.out.println(allToken.getStartIndex() + "--" + allToken.getType());
        }

    }
}
