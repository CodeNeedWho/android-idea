/*
 * Copyright 2018. who<980008027@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jsdroid.editor.parser;

import com.jsdroid.editor.js.JSBeautifier;
import com.jsdroid.editor.js.JSBeautifierOptions;
import com.jsdroid.editor.js.Token;
import com.jsdroid.editor.js.TokenStream;

import org.antlr.v4.runtime.Lexer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Administrator on 2018/2/12.
 */

public class JsParser extends AbstractParser {
    private static final String[] keywords = new String[]{
            "boolean", "break",
            "case", "catch",
            "continue",
            "default", "delete", "do",
            "else", "eval",
            "false",
            "finally", "for",
            "function", "if",
            "in", "instanceof", "int",
            "new", "null",
            "return", "switch",
            "this", "throw", "throws",
            "true", "try", "typeof", "var",
            "while"
    };
    private static final Tip[] templates = new Tip[]{
            new Tip("while", "while(){}", "while(){} - 模板"),
            new Tip("for", "for(;;){}", "for(){} - 模板"),
            new Tip("if", "if(){}", "if(){} - 模板"),
            new Tip("function", "function (){}", "function(){} - 模板")


    };

    List<String> names;
    Object nameLock = new Object();


    @Override
    protected void onParse(String text, int[] codeColors) {
        ArrayList<String> names = new ArrayList<>();
        try {
            TokenStream ts = new TokenStream(null, codeEditText.getText()
                    .toString(), 0);

            while (continueParse()) {
                try {
                    int token = ts.getToken();
                    if (token == Token.EOF) {
                        break;
                    }
                    int color = Token.getColor(token);
                    if (token == Token.NAME) {
                        String name = text.substring(ts.getTokenBeg(), ts.getTokenEnd());
                        names.add(name);
                    }
                    for (int i = ts.getTokenBeg(); i <= ts.getTokenEnd(); i++) {
                        codeColors[i] = color;
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
        synchronized (nameLock) {
            this.names = names;
        }
    }

    @Override
    protected Lexer getLexer(String text) {
        return null;
    }

    @Override
    protected int getTokenColor(org.antlr.v4.runtime.Token token) {
        return 0;
    }

    @Override
    protected String getName(org.antlr.v4.runtime.Token token) {
        return null;
    }

    @Override
    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        synchronized (nameLock) {
            if (this.names != null) {
                Iterator<String> iterator =
                        this.names.iterator();
                while (iterator.hasNext()) {
                    String name = iterator.next();
                    if (!names.contains(name)) {
                        names.add(name);
                    }
                }
            }
        }
        return names;
    }

    @Override
    public String[] getKeyWords() {
        return keywords;
    }

    @Override
    public Tip[] getTemplates() {
        return templates;
    }

    @Override
    public String format() {
        JSBeautifierOptions opts = new JSBeautifierOptions();
        JSBeautifier jsBeautifier = new JSBeautifier();
        String result = jsBeautifier.js_beautify(getCodeEditText().getText().toString(), opts);
        return result;
    }
}
