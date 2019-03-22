/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package com.jsdroid.antlr4.groovy;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GrammarPredicates {
    private static final Set<Integer> KW_SET = new HashSet<Integer>(Arrays.asList(GroovyLangParser.KW_ABSTRACT, GroovyLangParser.KW_AS, GroovyLangParser.KW_ASSERT, GroovyLangParser.KW_BREAK, GroovyLangParser.KW_CASE, GroovyLangParser.KW_CATCH, GroovyLangParser.KW_CLASS, GroovyLangParser.KW_CONST, GroovyLangParser.KW_CONTINUE, GroovyLangParser.KW_DEF, GroovyLangParser.KW_DEFAULT, GroovyLangParser.KW_DO, GroovyLangParser.KW_ELSE, GroovyLangParser.KW_ENUM, GroovyLangParser.KW_EXTENDS, GroovyLangParser.KW_FALSE, GroovyLangParser.KW_FINAL, GroovyLangParser.KW_FINALLY, GroovyLangParser.KW_FOR, GroovyLangParser.KW_GOTO, GroovyLangParser.KW_IF, GroovyLangParser.KW_IMPLEMENTS, GroovyLangParser.KW_IMPORT, GroovyLangParser.KW_IN, GroovyLangParser.KW_INSTANCEOF, GroovyLangParser.KW_INTERFACE, GroovyLangParser.KW_NATIVE, GroovyLangParser.KW_NEW, GroovyLangParser.KW_NULL, GroovyLangParser.KW_PACKAGE, GroovyLangParser.KW_RETURN, GroovyLangParser.KW_STATIC, GroovyLangParser.KW_STRICTFP, GroovyLangParser.KW_SUPER, GroovyLangParser.KW_SWITCH, GroovyLangParser.KW_SYNCHRONIZED, GroovyLangParser.KW_THIS, GroovyLangParser.KW_THREADSAFE, GroovyLangParser.KW_THROW, GroovyLangParser.KW_THROWS, GroovyLangParser.KW_TRANSIENT, GroovyLangParser.KW_TRAIT, GroovyLangParser.KW_TRUE, GroovyLangParser.KW_TRY, GroovyLangParser.KW_VOLATILE, GroovyLangParser.KW_WHILE, GroovyLangParser.BUILT_IN_TYPE, GroovyLangParser.VISIBILITY_MODIFIER));

    public static boolean isInvalidMethodDeclaration(TokenStream tokenStream) {
        int tokenType = tokenStream.LT(1).getType();

        return (tokenType == GroovyLangParser.IDENTIFIER || tokenType == GroovyLangParser.STRING)
                && (tokenStream.LT(2).getType() == GroovyLangParser.LPAREN);

    }

    public static boolean isClassName(TokenStream nameOrPath) {
        return isClassName(nameOrPath, 1);
    }

    public static boolean isClassName(TokenStream nameOrPath, int nextPosition) {
        int index = nextPosition;
        Token token = nameOrPath.LT(index);

        while (nameOrPath.LT(index + 1).getType() == GroovyLangParser.DOT) {
            index += 2;
            token = nameOrPath.LT(index);
        }

        return GroovyLangParser.BUILT_IN_TYPE == token.getType() || token.getType() == GroovyLangParser.KW_CLASS || Character.isUpperCase(token.getText().codePointAt(0));
    }

    public static boolean isKeyword(TokenStream tokenStream, int... excludedKeywords) {
        int tokenType = tokenStream.LT(1).getType();

        for (int kw : excludedKeywords) {
            if (tokenType == kw) {
                return false;
            }
        }

        return KW_SET.contains(tokenType);
    }

    public static boolean isCurrentClassName(TokenStream tokenStream, String currentClassName) {
        return tokenStream.LT(tokenStream.LT(1).getType() == GroovyLangParser.VISIBILITY_MODIFIER ? 2 : 1).getText().equals(currentClassName);
    }

    public static boolean isFollowedByJavaLetterInGString(CharStream cs) {
        int c1 = cs.LA(1);
        String str1 = String.valueOf((char) c1);

        if (str1.matches("[a-zA-Z_{]")) {
            return true;
        }

        if (str1.matches("[^\u0000-\u007F\uD800-\uDBFF]")
                && Character.isJavaIdentifierPart(c1)) {
            return true;
        }

        int c2 = cs.LA(2);
        String str2 = String.valueOf((char) c2);

        if (str1.matches("[\uD800-\uDBFF]")
                && str2.matches("[\uDC00-\uDFFF]")
                && Character.isJavaIdentifierPart(Character.toCodePoint((char) c1, (char) c2))) {

            return true;
        }

        return false;
    }

    /**
     * Check if the method/closure name is followed by LPAREN
     *
     * @param tokenStream
     * @return
     */
    public static boolean isFollowedByLPAREN(TokenStream tokenStream) {
        int index = 1;
        Token token = tokenStream.LT(index);
        int tokenType = token.getType();

        if (tokenType == GroovyLangParser.GSTRING_START) { // gstring
            index = consumeTokenPair(tokenStream, index, GroovyLangParser.GSTRING_START, GroovyLangParser.GSTRING_END);
        } else if (tokenType == GroovyLangParser.LCURVE) { // closure
            index = consumeTokenPair(tokenStream, index, GroovyLangParser.LCURVE, GroovyLangParser.RCURVE);
        } else if (tokenType == GroovyLangParser.LPAREN) { // LPAREN expression RPAREN
            index = consumeTokenPair(tokenStream, index, GroovyLangParser.LPAREN, GroovyLangParser.RPAREN);
        }

        if (-1 == index) { // EOF reached.
            return false;
        }

        // ignore the newlines
        do {
            token = tokenStream.LT(++index);
            tokenType = token.getType();
        } while (tokenType == GroovyLangParser.NL);

        return tokenType == GroovyLangParser.LPAREN;
    }

    private static int consumeTokenPair(TokenStream tokenStream, int index, int beginTokenType, int endTokenType) {
        int tokenCnt = 1;

        Token token;
        int tokenType;

        do {
            token = tokenStream.LT(++index);
            tokenType = token.getType();

            if (tokenType == GroovyLangParser.EOF) {
                return -1;
            } else if (tokenType == beginTokenType) {
                tokenCnt++;
            } else if (tokenType == endTokenType) {
                tokenCnt--;
            }
        } while (tokenCnt != 0);

        return index;
    }

}
