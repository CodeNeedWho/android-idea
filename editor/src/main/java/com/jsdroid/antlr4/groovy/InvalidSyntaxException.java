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

import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * An exception indicating invalid syntax in the inputted Groovy source code.
 *
 * @author  <a href="mailto:daniel.sun@groovyhelp.com">Daniel.Sun</a>
 * @date    2016/4/5.
 */
public class InvalidSyntaxException extends RuntimeException {
    public InvalidSyntaxException(String message, ParserRuleContext ctx) {
        super(attachLocation(message, ctx));
    }

    public InvalidSyntaxException(String message, ParserRuleContext ctx, Throwable cause) {
        super(attachLocation(message, ctx), cause);
    }

    private static String attachLocation(String message, ParserRuleContext ctx) {
        return String.format(message + " at line: %s column: %s", ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);
    }
}
