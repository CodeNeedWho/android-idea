// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/groovy\GroovyParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.groovy;

    import java.util.Arrays;
    import java.util.Set;
    import java.util.HashSet;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GroovyParser}.
 */
public interface GroovyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GroovyParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(GroovyParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(GroovyParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#scriptPart}.
	 * @param ctx the parse tree
	 */
	void enterScriptPart(GroovyParser.ScriptPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#scriptPart}.
	 * @param ctx the parse tree
	 */
	void exitScriptPart(GroovyParser.ScriptPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#packageDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPackageDefinition(GroovyParser.PackageDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#packageDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPackageDefinition(GroovyParser.PackageDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(GroovyParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(GroovyParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(GroovyParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(GroovyParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(GroovyParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(GroovyParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(GroovyParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(GroovyParser.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(GroovyParser.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#extendsClause}.
	 * @param ctx the parse tree
	 */
	void enterExtendsClause(GroovyParser.ExtendsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#extendsClause}.
	 * @param ctx the parse tree
	 */
	void exitExtendsClause(GroovyParser.ExtendsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GroovyParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(GroovyParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#declarationRule}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationRule(GroovyParser.DeclarationRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#declarationRule}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationRule(GroovyParser.DeclarationRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#objectInitializer}.
	 * @param ctx the parse tree
	 */
	void enterObjectInitializer(GroovyParser.ObjectInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#objectInitializer}.
	 * @param ctx the parse tree
	 */
	void exitObjectInitializer(GroovyParser.ObjectInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classInitializer}.
	 * @param ctx the parse tree
	 */
	void enterClassInitializer(GroovyParser.ClassInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classInitializer}.
	 * @param ctx the parse tree
	 */
	void exitClassInitializer(GroovyParser.ClassInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(GroovyParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#annotationClause}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationClause(GroovyParser.AnnotationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#annotationClause}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationClause(GroovyParser.AnnotationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#annotationElementPair}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationElementPair(GroovyParser.AnnotationElementPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#annotationElementPair}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationElementPair(GroovyParser.AnnotationElementPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#annotationElement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationElement(GroovyParser.AnnotationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#annotationElement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationElement(GroovyParser.AnnotationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#genericDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterGenericDeclarationList(GroovyParser.GenericDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#genericDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitGenericDeclarationList(GroovyParser.GenericDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#genericsDeclarationElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericsDeclarationElement(GroovyParser.GenericsDeclarationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#genericsDeclarationElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericsDeclarationElement(GroovyParser.GenericsDeclarationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#throwsClause}.
	 * @param ctx the parse tree
	 */
	void enterThrowsClause(GroovyParser.ThrowsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#throwsClause}.
	 * @param ctx the parse tree
	 */
	void exitThrowsClause(GroovyParser.ThrowsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#argumentDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDeclarationList(GroovyParser.ArgumentDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#argumentDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDeclarationList(GroovyParser.ArgumentDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#argumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDeclaration(GroovyParser.ArgumentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#argumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDeclaration(GroovyParser.ArgumentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(GroovyParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeclaration(GroovyParser.SingleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeclaration(GroovyParser.SingleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#tupleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTupleDeclaration(GroovyParser.TupleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#tupleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTupleDeclaration(GroovyParser.TupleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#tupleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTupleVariableDeclaration(GroovyParser.TupleVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#tupleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTupleVariableDeclaration(GroovyParser.TupleVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#newInstanceRule}.
	 * @param ctx the parse tree
	 */
	void enterNewInstanceRule(GroovyParser.NewInstanceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#newInstanceRule}.
	 * @param ctx the parse tree
	 */
	void exitNewInstanceRule(GroovyParser.NewInstanceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#newArrayRule}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayRule(GroovyParser.NewArrayRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#newArrayRule}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayRule(GroovyParser.NewArrayRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(GroovyParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(GroovyParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArrayStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayStatement(GroovyParser.NewArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArrayStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayStatement(GroovyParser.NewArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newInstanceStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNewInstanceStatement(GroovyParser.NewInstanceStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newInstanceStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNewInstanceStatement(GroovyParser.NewInstanceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classicForStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassicForStatement(GroovyParser.ClassicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classicForStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassicForStatement(GroovyParser.ClassicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(GroovyParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(GroovyParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forColonStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForColonStatement(GroovyParser.ForColonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forColonStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForColonStatement(GroovyParser.ForColonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GroovyParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GroovyParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GroovyParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GroovyParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(GroovyParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatchFinallyStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchFinallyStatement(GroovyParser.TryCatchFinallyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatchFinallyStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchFinallyStatement(GroovyParser.TryCatchFinallyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterControlStatement(GroovyParser.ControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code controlStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitControlStatement(GroovyParser.ControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GroovyParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GroovyParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(GroovyParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(GroovyParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(GroovyParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(GroovyParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code synchronizedStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(GroovyParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labeledStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(GroovyParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labeledStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(GroovyParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(GroovyParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link GroovyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(GroovyParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#blockStatementWithCurve}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatementWithCurve(GroovyParser.BlockStatementWithCurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#blockStatementWithCurve}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatementWithCurve(GroovyParser.BlockStatementWithCurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(GroovyParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(GroovyParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(GroovyParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(GroovyParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(GroovyParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(GroovyParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(GroovyParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(GroovyParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(GroovyParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the parse tree
	 */
	void enterPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#pathExpression}.
	 * @param ctx the parse tree
	 */
	void exitPathExpression(GroovyParser.PathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#gstringPathExpression}.
	 * @param ctx the parse tree
	 */
	void enterGstringPathExpression(GroovyParser.GstringPathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#gstringPathExpression}.
	 * @param ctx the parse tree
	 */
	void exitGstringPathExpression(GroovyParser.GstringPathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#closureExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpressionRule(GroovyParser.ClosureExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#closureExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpressionRule(GroovyParser.ClosureExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#gstringExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterGstringExpressionBody(GroovyParser.GstringExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#gstringExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitGstringExpressionBody(GroovyParser.GstringExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the parse tree
	 */
	void enterGstring(GroovyParser.GstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#gstring}.
	 * @param ctx the parse tree
	 */
	void exitGstring(GroovyParser.GstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamArrayExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamArrayExpression(GroovyParser.AnnotationParamArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamArrayExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamArrayExpression(GroovyParser.AnnotationParamArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamClassConstantExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamClassConstantExpression(GroovyParser.AnnotationParamClassConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamClassConstantExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamClassConstantExpression(GroovyParser.AnnotationParamClassConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamPathExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamPathExpression(GroovyParser.AnnotationParamPathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamPathExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamPathExpression(GroovyParser.AnnotationParamPathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamClassExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamClassExpression(GroovyParser.AnnotationParamClassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamClassExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamClassExpression(GroovyParser.AnnotationParamClassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamStringExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamStringExpression(GroovyParser.AnnotationParamStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamStringExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamStringExpression(GroovyParser.AnnotationParamStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamDecimalExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamDecimalExpression(GroovyParser.AnnotationParamDecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamDecimalExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamDecimalExpression(GroovyParser.AnnotationParamDecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamIntegerExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamIntegerExpression(GroovyParser.AnnotationParamIntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamIntegerExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamIntegerExpression(GroovyParser.AnnotationParamIntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamNullExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamNullExpression(GroovyParser.AnnotationParamNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamNullExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamNullExpression(GroovyParser.AnnotationParamNullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamBoolExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamBoolExpression(GroovyParser.AnnotationParamBoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamBoolExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamBoolExpression(GroovyParser.AnnotationParamBoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code annotationParamClosureExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationParamClosureExpression(GroovyParser.AnnotationParamClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code annotationParamClosureExpression}
	 * labeled alternative in {@link GroovyParser#annotationParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationParamClosureExpression(GroovyParser.AnnotationParamClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmdExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpression(GroovyParser.CmdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmdExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpression(GroovyParser.CmdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSpreadExpression(GroovyParser.SpreadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSpreadExpression(GroovyParser.SpreadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(GroovyParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(GroovyParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(GroovyParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(GroovyParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(GroovyParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(GroovyParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constructorCallExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCallExpression(GroovyParser.ConstructorCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constructorCallExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCallExpression(GroovyParser.ConstructorCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(GroovyParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(GroovyParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(GroovyParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(GroovyParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(GroovyParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(GroovyParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(GroovyParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(GroovyParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccessExpression(GroovyParser.FieldAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldAccessExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccessExpression(GroovyParser.FieldAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(GroovyParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(GroovyParser.AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(GroovyParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(GroovyParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpression(GroovyParser.IndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpression(GroovyParser.IndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GroovyParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GroovyParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(GroovyParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(GroovyParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression}
	 * labeled alternative in {@link GroovyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(GroovyParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(GroovyParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(GroovyParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gstringExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterGstringExpression(GroovyParser.GstringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gstringExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitGstringExpression(GroovyParser.GstringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDecimalExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterConstantDecimalExpression(GroovyParser.ConstantDecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDecimalExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitConstantDecimalExpression(GroovyParser.ConstantDecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantIntegerExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterConstantIntegerExpression(GroovyParser.ConstantIntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantIntegerExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitConstantIntegerExpression(GroovyParser.ConstantIntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(GroovyParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(GroovyParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(GroovyParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(GroovyParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(GroovyParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(GroovyParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classConstantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterClassConstantExpression(GroovyParser.ClassConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classConstantExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitClassConstantExpression(GroovyParser.ClassConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code closureExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(GroovyParser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code closureExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(GroovyParser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterListConstructor(GroovyParser.ListConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitListConstructor(GroovyParser.ListConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterMapConstructor(GroovyParser.MapConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapConstructor}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitMapConstructor(GroovyParser.MapConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayExpression(GroovyParser.NewArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newArrayExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayExpression(GroovyParser.NewArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newInstanceExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterNewInstanceExpression(GroovyParser.NewInstanceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newInstanceExpression}
	 * labeled alternative in {@link GroovyParser#atomExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitNewInstanceExpression(GroovyParser.NewInstanceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classConstantRule}.
	 * @param ctx the parse tree
	 */
	void enterClassConstantRule(GroovyParser.ClassConstantRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classConstantRule}.
	 * @param ctx the parse tree
	 */
	void exitClassConstantRule(GroovyParser.ClassConstantRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#argumentListRule}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListRule(GroovyParser.ArgumentListRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#argumentListRule}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListRule(GroovyParser.ArgumentListRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#callExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterCallExpressionRule(GroovyParser.CallExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#callExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitCallExpressionRule(GroovyParser.CallExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#nonKwCallExpressionRule}.
	 * @param ctx the parse tree
	 */
	void enterNonKwCallExpressionRule(GroovyParser.NonKwCallExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#nonKwCallExpressionRule}.
	 * @param ctx the parse tree
	 */
	void exitNonKwCallExpressionRule(GroovyParser.NonKwCallExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#callRule}.
	 * @param ctx the parse tree
	 */
	void enterCallRule(GroovyParser.CallRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#callRule}.
	 * @param ctx the parse tree
	 */
	void exitCallRule(GroovyParser.CallRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassNameExpression(GroovyParser.ClassNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassNameExpression(GroovyParser.ClassNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#genericClassNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterGenericClassNameExpression(GroovyParser.GenericClassNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#genericClassNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitGenericClassNameExpression(GroovyParser.GenericClassNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#genericList}.
	 * @param ctx the parse tree
	 */
	void enterGenericList(GroovyParser.GenericListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#genericList}.
	 * @param ctx the parse tree
	 */
	void exitGenericList(GroovyParser.GenericListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericsConcreteElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericsConcreteElement(GroovyParser.GenericsConcreteElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericsConcreteElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericsConcreteElement(GroovyParser.GenericsConcreteElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericsWildcardElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the parse tree
	 */
	void enterGenericsWildcardElement(GroovyParser.GenericsWildcardElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericsWildcardElement}
	 * labeled alternative in {@link GroovyParser#genericListElement}.
	 * @param ctx the parse tree
	 */
	void exitGenericsWildcardElement(GroovyParser.GenericsWildcardElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(GroovyParser.MapEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(GroovyParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(GroovyParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(GroovyParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(GroovyParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(GroovyParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GroovyParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GroovyParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void enterSelectorName(GroovyParser.SelectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#selectorName}.
	 * @param ctx the parse tree
	 */
	void exitSelectorName(GroovyParser.SelectorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroovyParser#kwSelectorName}.
	 * @param ctx the parse tree
	 */
	void enterKwSelectorName(GroovyParser.KwSelectorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroovyParser#kwSelectorName}.
	 * @param ctx the parse tree
	 */
	void exitKwSelectorName(GroovyParser.KwSelectorNameContext ctx);
}