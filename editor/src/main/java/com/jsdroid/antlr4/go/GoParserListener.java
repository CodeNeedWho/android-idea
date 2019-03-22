// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/go\GoParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.go;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoParserParser}.
 */
public interface GoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoParserParser#srcFile}.
	 * @param ctx the parse tree
	 */
	void enterSrcFile(GoParserParser.SrcFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#srcFile}.
	 * @param ctx the parse tree
	 */
	void exitSrcFile(GoParserParser.SrcFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GoParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GoParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(GoParserParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(GoParserParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#variableDec}.
	 * @param ctx the parse tree
	 */
	void enterVariableDec(GoParserParser.VariableDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#variableDec}.
	 * @param ctx the parse tree
	 */
	void exitVariableDec(GoParserParser.VariableDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#variableInit}.
	 * @param ctx the parse tree
	 */
	void enterVariableInit(GoParserParser.VariableInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#variableInit}.
	 * @param ctx the parse tree
	 */
	void exitVariableInit(GoParserParser.VariableInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(GoParserParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(GoParserParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#functionDec}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDec(GoParserParser.FunctionDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#functionDec}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDec(GoParserParser.FunctionDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(GoParserParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(GoParserParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#funcOut}.
	 * @param ctx the parse tree
	 */
	void enterFuncOut(GoParserParser.FuncOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#funcOut}.
	 * @param ctx the parse tree
	 */
	void exitFuncOut(GoParserParser.FuncOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GoParserParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GoParserParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GoParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GoParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#insideBlockStat}.
	 * @param ctx the parse tree
	 */
	void enterInsideBlockStat(GoParserParser.InsideBlockStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#insideBlockStat}.
	 * @param ctx the parse tree
	 */
	void exitInsideBlockStat(GoParserParser.InsideBlockStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(GoParserParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#typeConversion}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(GoParserParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GoParserParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GoParserParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GoParserParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GoParserParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#switchStat}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStat(GoParserParser.SwitchStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#switchStat}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStat(GoParserParser.SwitchStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(GoParserParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(GoParserParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GoParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GoParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(GoParserParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(GoParserParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GoParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GoParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GoParserParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GoParserParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParserParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(GoParserParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParserParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(GoParserParser.EosContext ctx);
}