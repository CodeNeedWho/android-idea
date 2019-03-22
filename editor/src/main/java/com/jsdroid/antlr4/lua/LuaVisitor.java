// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/lua\Lua.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.lua;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuaParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(LuaParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LuaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LuaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#retstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetstat(LuaParser.RetstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LuaParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(LuaParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LuaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LuaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LuaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(LuaParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(LuaParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(LuaParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(LuaParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorComparison(LuaParser.OperatorComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorStrcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorStrcat(LuaParser.OperatorStrcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAddSub(LuaParser.OperatorAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMulDivMod(LuaParser.OperatorMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorUnary(LuaParser.OperatorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#operatorPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPower(LuaParser.OperatorPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LuaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LuaParser.StringContext ctx);
}