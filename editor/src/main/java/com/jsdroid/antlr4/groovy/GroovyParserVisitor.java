// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/groovy\GroovyParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.groovy;

    import java.util.Arrays;
    import java.util.Set;
    import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GroovyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GroovyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GroovyParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(GroovyParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#scriptPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptPart(GroovyParser.ScriptPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#packageDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDefinition(GroovyParser.PackageDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(GroovyParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(GroovyParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#implementsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsClause(GroovyParser.ImplementsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#extendsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsClause(GroovyParser.ExtendsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#declarationRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationRule(GroovyParser.DeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#objectInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInitializer(GroovyParser.ObjectInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInitializer(GroovyParser.ClassInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#annotationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationClause(GroovyParser.AnnotationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#annotationElementPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElementPair(GroovyParser.AnnotationElementPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#annotationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationElement(GroovyParser.AnnotationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#genericDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDeclarationList(GroovyParser.GenericDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#genericsDeclarationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsDeclarationElement(GroovyParser.GenericsDeclarationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#throwsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowsClause(GroovyParser.ThrowsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#argumentDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDeclarationList(GroovyParser.ArgumentDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#argumentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDeclaration(GroovyParser.ArgumentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeclaration(GroovyParser.SingleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#tupleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleDeclaration(GroovyParser.TupleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#tupleVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleVariableDeclaration(GroovyParser.TupleVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#newInstanceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInstanceRule(GroovyParser.NewInstanceRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#newArrayRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayRule(GroovyParser.NewArrayRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(GroovyParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArrayStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayStatement(GroovyParser.NewArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newInstanceStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInstanceStatement(GroovyParser.NewInstanceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classicForStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassicForStatement(GroovyParser.ClassicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(GroovyParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forColonStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForColonStatement(GroovyParser.ForColonStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GroovyParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GroovyParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryCatchFinallyStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchFinallyStatement(GroovyParser.TryCatchFinallyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(GroovyParser.ControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GroovyParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(GroovyParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assertStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(GroovyParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labeledStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(GroovyParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(GroovyParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#blockStatementWithCurve}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatementWithCurve(GroovyParser.BlockStatementWithCurveContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(GroovyParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(GroovyParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(GroovyParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(GroovyParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#gstringPathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstringPathExpression(GroovyParser.GstringPathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#closureExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosureExpressionRule(GroovyParser.ClosureExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#gstringExpressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstringExpressionBody(GroovyParser.GstringExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstring(GroovyParser.GstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamArrayExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamArrayExpression(GroovyParser.AnnotationParamArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamClassConstantExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamClassConstantExpression(GroovyParser.AnnotationParamClassConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamPathExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamPathExpression(GroovyParser.AnnotationParamPathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamClassExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamClassExpression(GroovyParser.AnnotationParamClassExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamStringExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamStringExpression(GroovyParser.AnnotationParamStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamDecimalExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamDecimalExpression(GroovyParser.AnnotationParamDecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamIntegerExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamIntegerExpression(GroovyParser.AnnotationParamIntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamNullExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamNullExpression(GroovyParser.AnnotationParamNullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamBoolExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamBoolExpression(GroovyParser.AnnotationParamBoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code annotationParamClosureExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationParamClosureExpression(GroovyParser.AnnotationParamClosureExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmdExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdExpression(GroovyParser.CmdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadExpression(GroovyParser.SpreadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(GroovyParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(GroovyParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(GroovyParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constructorCallExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCallExpression(GroovyParser.ConstructorCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(GroovyParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(GroovyParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(GroovyParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(GroovyParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccessExpression(GroovyParser.FieldAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpression(GroovyParser.AtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(GroovyParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpression(GroovyParser.IndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GroovyParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(GroovyParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(GroovyParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gstringExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGstringExpression(GroovyParser.GstringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDecimalExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDecimalExpression(GroovyParser.ConstantDecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantIntegerExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantIntegerExpression(GroovyParser.ConstantIntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(GroovyParser.NullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(GroovyParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(GroovyParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classConstantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstantExpression(GroovyParser.ClassConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code closureExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosureExpression(GroovyParser.ClosureExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConstructor(GroovyParser.ListConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapConstructor(GroovyParser.MapConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayExpression(GroovyParser.NewArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newInstanceExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInstanceExpression(GroovyParser.NewInstanceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classConstantRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstantRule(GroovyParser.ClassConstantRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#argumentListRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentListRule(GroovyParser.ArgumentListRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#callExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpressionRule(GroovyParser.CallExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#nonKwCallExpressionRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonKwCallExpressionRule(GroovyParser.NonKwCallExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#callRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallRule(GroovyParser.CallRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classNameExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassNameExpression(GroovyParser.ClassNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#genericClassNameExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericClassNameExpression(GroovyParser.GenericClassNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#genericList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericList(GroovyParser.GenericListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericsConcreteElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsConcreteElement(GroovyParser.GenericsConcreteElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericsWildcardElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsWildcardElement(GroovyParser.GenericsWildcardElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(GroovyParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#memberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifier(GroovyParser.MemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GroovyParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#selectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorName(GroovyParser.SelectorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroovyParser#kwSelectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwSelectorName(GroovyParser.KwSelectorNameContext ctx);
}