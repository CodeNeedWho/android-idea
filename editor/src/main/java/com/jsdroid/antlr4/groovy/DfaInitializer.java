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

import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;

/**
 *
 * Create the brand-new DFA array for lexer and parser to avoid memory leak
 *
 * @author  <a href="mailto:daniel.sun@groovyhelp.com">Daniel.Sun</a>
 * @date    2016/5/2.
 */
public class DfaInitializer {
    private ATN atn;

    public DfaInitializer(GroovyLangLexer lexer) {
        this.atn = new ATNDeserializer().deserialize(GroovyLangLexer._serializedATN.toCharArray());
    }

    public DfaInitializer(GroovyLangParser parser) {
        this.atn = new ATNDeserializer().deserialize(GroovyLangParser._serializedATN.toCharArray());
    }

    public ATN createATN() {
        return this.atn;
    }

}
