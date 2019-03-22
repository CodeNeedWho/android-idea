// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/cpp\cpp.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.cpp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cppParser}.
 */
public interface cppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexpression(cppParser.PrimaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexpression(cppParser.PrimaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdexpression(cppParser.IdexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdexpression(cppParser.IdexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedid(cppParser.UnqualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedid(cppParser.UnqualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedid(cppParser.QualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedid(cppParser.QualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestednamespecifier(cppParser.NestednamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestednamespecifier(cppParser.NestednamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaexpression(cppParser.LambdaexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaexpression(cppParser.LambdaexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaintroducer(cppParser.LambdaintroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaintroducer(cppParser.LambdaintroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdacapture(cppParser.LambdacaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdacapture(cppParser.LambdacaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void enterCapturedefault(cppParser.CapturedefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void exitCapturedefault(cppParser.CapturedefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void enterCapturelist(cppParser.CapturelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void exitCapturelist(cppParser.CapturelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(cppParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(cppParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void enterSimplecapture(cppParser.SimplecaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void exitSimplecapture(cppParser.SimplecaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(cppParser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(cppParser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdadeclarator(cppParser.LambdadeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdadeclarator(cppParser.LambdadeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixexpression(cppParser.PostfixexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixexpression(cppParser.PostfixexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(cppParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(cppParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void enterPseudodestructorname(cppParser.PseudodestructornameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void exitPseudodestructorname(cppParser.PseudodestructornameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(cppParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(cppParser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(cppParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(cppParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewexpression(cppParser.NewexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewexpression(cppParser.NewexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void enterNewplacement(cppParser.NewplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void exitNewplacement(cppParser.NewplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void enterNewtypeid(cppParser.NewtypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void exitNewtypeid(cppParser.NewtypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewdeclarator(cppParser.NewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewdeclarator(cppParser.NewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrnewdeclarator(cppParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrnewdeclarator(cppParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewinitializer(cppParser.NewinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewinitializer(cppParser.NewinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteexpression(cppParser.DeleteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteexpression(cppParser.DeleteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptexpression(cppParser.NoexceptexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptexpression(cppParser.NoexceptexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void enterCastexpression(cppParser.CastexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void exitCastexpression(cppParser.CastexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void enterPmexpression(cppParser.PmexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void exitPmexpression(cppParser.PmexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(cppParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(cppParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(cppParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(cppParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(cppParser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(cppParser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(cppParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(cppParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(cppParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(cppParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(cppParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(cppParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(cppParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(cppParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(cppParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(cppParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalandexpression(cppParser.LogicalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalandexpression(cppParser.LogicalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalorexpression(cppParser.LogicalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalorexpression(cppParser.LogicalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalexpression(cppParser.ConditionalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalexpression(cppParser.ConditionalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(cppParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(cppParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(cppParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(cppParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(cppParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(cppParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantexpression(cppParser.ConstantexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantexpression(cppParser.ConstantexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cppParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledstatement(cppParser.LabeledstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledstatement(cppParser.LabeledstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(cppParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(cppParser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundstatement(cppParser.CompoundstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundstatement(cppParser.CompoundstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void enterStatementseq(cppParser.StatementseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void exitStatementseq(cppParser.StatementseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(cppParser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(cppParser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(cppParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(cppParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationstatement(cppParser.IterationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationstatement(cppParser.IterationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForinitstatement(cppParser.ForinitstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForinitstatement(cppParser.ForinitstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForrangedeclaration(cppParser.ForrangedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForrangedeclaration(cppParser.ForrangedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void enterForrangeinitializer(cppParser.ForrangeinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void exitForrangeinitializer(cppParser.ForrangeinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpstatement(cppParser.JumpstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpstatement(cppParser.JumpstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstatement(cppParser.DeclarationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstatement(cppParser.DeclarationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(cppParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(cppParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockdeclaration(cppParser.BlockdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockdeclaration(cppParser.BlockdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasdeclaration(cppParser.AliasdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasdeclaration(cppParser.AliasdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpledeclaration(cppParser.SimpledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpledeclaration(cppParser.SimpledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assertdeclaration(cppParser.Static_assertdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assertdeclaration(cppParser.Static_assertdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptydeclaration(cppParser.EmptydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptydeclaration(cppParser.EmptydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributedeclaration(cppParser.AttributedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributedeclaration(cppParser.AttributedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifier(cppParser.DeclspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifier(cppParser.DeclspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifierseq(cppParser.DeclspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifierseq(cppParser.DeclspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageclassspecifier(cppParser.StorageclassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageclassspecifier(cppParser.StorageclassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionspecifier(cppParser.FunctionspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionspecifier(cppParser.FunctionspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void enterTypedefname(cppParser.TypedefnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void exitTypedefname(cppParser.TypedefnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(cppParser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(cppParser.TypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifier(cppParser.TrailingtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifier(cppParser.TrailingtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifierseq(cppParser.TypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifierseq(cppParser.TypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifierseq(cppParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifierseq(cppParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypespecifier(cppParser.SimpletypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypespecifier(cppParser.SimpletypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(cppParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(cppParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypespecifier(cppParser.DecltypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypespecifier(cppParser.DecltypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedtypespecifier(cppParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedtypespecifier(cppParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumname}.
	 * @param ctx the parse tree
	 */
	void enterEnumname(cppParser.EnumnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumname}.
	 * @param ctx the parse tree
	 */
	void exitEnumname(cppParser.EnumnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumspecifier(cppParser.EnumspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumspecifier(cppParser.EnumspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void enterEnumhead(cppParser.EnumheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void exitEnumhead(cppParser.EnumheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueenumdeclaration(cppParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueenumdeclaration(cppParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(cppParser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(cppParser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(cppParser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(cppParser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorlist(cppParser.EnumeratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorlist(cppParser.EnumeratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratordefinition(cppParser.EnumeratordefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratordefinition(cppParser.EnumeratordefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(cppParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(cppParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void enterNamespacename(cppParser.NamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void exitNamespacename(cppParser.NamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacename(cppParser.OriginalnamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacename(cppParser.OriginalnamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacedefinition(cppParser.NamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacedefinition(cppParser.NamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamednamespacedefinition(cppParser.NamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamednamespacedefinition(cppParser.NamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacedefinition(cppParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacedefinition(cppParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionnamespacedefinition(cppParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionnamespacedefinition(cppParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnnamednamespacedefinition(cppParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnnamednamespacedefinition(cppParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void enterNamespacebody(cppParser.NamespacebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void exitNamespacebody(cppParser.NamespacebodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealias(cppParser.NamespacealiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealias(cppParser.NamespacealiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealiasdefinition(cppParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealiasdefinition(cppParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(cppParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(cppParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingdeclaration(cppParser.UsingdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingdeclaration(cppParser.UsingdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingdirective(cppParser.UsingdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingdirective(cppParser.UsingdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmdefinition(cppParser.AsmdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmdefinition(cppParser.AsmdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkagespecification(cppParser.LinkagespecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkagespecification(cppParser.LinkagespecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifierseq(cppParser.AttributespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifierseq(cppParser.AttributespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifier(cppParser.AttributespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifier(cppParser.AttributespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(cppParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(cppParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(cppParser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(cppParser.AttributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(cppParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(cppParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributetoken(cppParser.AttributetokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributetoken(cppParser.AttributetokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributescopedtoken(cppParser.AttributescopedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributescopedtoken(cppParser.AttributescopedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributenamespace(cppParser.AttributenamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributenamespace(cppParser.AttributenamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeargumentclause(cppParser.AttributeargumentclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeargumentclause(cppParser.AttributeargumentclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtokenseq(cppParser.BalancedtokenseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtokenseq(cppParser.BalancedtokenseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(cppParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(cppParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclaratorlist(cppParser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclaratorlist(cppParser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(cppParser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(cppParser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrdeclarator(cppParser.PtrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrdeclarator(cppParser.PtrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrdeclarator(cppParser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrdeclarator(cppParser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersandqualifiers(cppParser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersandqualifiers(cppParser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void enterTrailingreturntype(cppParser.TrailingreturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void exitTrailingreturntype(cppParser.TrailingreturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void enterPtroperator(cppParser.PtroperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void exitPtroperator(cppParser.PtroperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(cppParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(cppParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifier(cppParser.CvqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifier(cppParser.CvqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(cppParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(cppParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(cppParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(cppParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(cppParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(cppParser.TypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractdeclarator(cppParser.AbstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractdeclarator(cppParser.AbstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrabstractdeclarator(cppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrabstractdeclarator(cppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractdeclarator(cppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractdeclarator(cppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractpackdeclarator(cppParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractpackdeclarator(cppParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractpackdeclarator(cppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractpackdeclarator(cppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationclause(cppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationclause(cppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(cppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(cppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(cppParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(cppParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(cppParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(cppParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(cppParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(cppParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(cppParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(cppParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceorequalinitializer(cppParser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceorequalinitializer(cppParser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerclause(cppParser.InitializerclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerclause(cppParser.InitializerclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void enterInitializerlist(cppParser.InitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void exitInitializerlist(cppParser.InitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void enterBracedinitlist(cppParser.BracedinitlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void exitBracedinitlist(cppParser.BracedinitlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(cppParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(cppParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassspecifier(cppParser.ClassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassspecifier(cppParser.ClassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classhead}.
	 * @param ctx the parse tree
	 */
	void enterClasshead(cppParser.ClassheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classhead}.
	 * @param ctx the parse tree
	 */
	void exitClasshead(cppParser.ClassheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void enterClassheadname(cppParser.ClassheadnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void exitClassheadname(cppParser.ClassheadnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassvirtspecifier(cppParser.ClassvirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassvirtspecifier(cppParser.ClassvirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classkey}.
	 * @param ctx the parse tree
	 */
	void enterClasskey(cppParser.ClasskeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classkey}.
	 * @param ctx the parse tree
	 */
	void exitClasskey(cppParser.ClasskeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberspecification(cppParser.MemberspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberspecification(cppParser.MemberspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(cppParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(cppParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaratorlist(cppParser.MemberdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaratorlist(cppParser.MemberdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclarator(cppParser.MemberdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclarator(cppParser.MemberdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifierseq(cppParser.VirtspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifierseq(cppParser.VirtspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifier(cppParser.VirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifier(cppParser.VirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void enterPurespecifier(cppParser.PurespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void exitPurespecifier(cppParser.PurespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void enterBaseclause(cppParser.BaseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void exitBaseclause(cppParser.BaseclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifierlist(cppParser.BasespecifierlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifierlist(cppParser.BasespecifierlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifier(cppParser.BasespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifier(cppParser.BasespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void enterClassordecltype(cppParser.ClassordecltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void exitClassordecltype(cppParser.ClassordecltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasetypespecifier(cppParser.BasetypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasetypespecifier(cppParser.BasetypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessspecifier(cppParser.AccessspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessspecifier(cppParser.AccessspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterConversionfunctionid(cppParser.ConversionfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitConversionfunctionid(cppParser.ConversionfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void enterConversiontypeid(cppParser.ConversiontypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void exitConversiontypeid(cppParser.ConversiontypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversiondeclarator(cppParser.ConversiondeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversiondeclarator(cppParser.ConversiondeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void enterCtorinitializer(cppParser.CtorinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void exitCtorinitializer(cppParser.CtorinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerlist(cppParser.MeminitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerlist(cppParser.MeminitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializer(cppParser.MeminitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializer(cppParser.MeminitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(cppParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(cppParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterOperatorfunctionid(cppParser.OperatorfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitOperatorfunctionid(cppParser.OperatorfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void enterLiteraloperatorid(cppParser.LiteraloperatoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void exitLiteraloperatorid(cppParser.LiteraloperatoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplatedeclaration(cppParser.TemplatedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplatedeclaration(cppParser.TemplatedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterlist(cppParser.TemplateparameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterlist(cppParser.TemplateparameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameter(cppParser.TemplateparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameter(cppParser.TemplateparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeparameter(cppParser.TypeparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeparameter(cppParser.TypeparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void enterSimpletemplateid(cppParser.SimpletemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void exitSimpletemplateid(cppParser.SimpletemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#templateid}.
	 * @param ctx the parse tree
	 */
	void enterTemplateid(cppParser.TemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#templateid}.
	 * @param ctx the parse tree
	 */
	void exitTemplateid(cppParser.TemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#templatename}.
	 * @param ctx the parse tree
	 */
	void enterTemplatename(cppParser.TemplatenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#templatename}.
	 * @param ctx the parse tree
	 */
	void exitTemplatename(cppParser.TemplatenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargumentlist(cppParser.TemplateargumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargumentlist(cppParser.TemplateargumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargument(cppParser.TemplateargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargument(cppParser.TemplateargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypenamespecifier(cppParser.TypenamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypenamespecifier(cppParser.TypenamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitinstantiation(cppParser.ExplicitinstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitinstantiation(cppParser.ExplicitinstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitspecialization(cppParser.ExplicitspecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitspecialization(cppParser.ExplicitspecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void enterTryblock(cppParser.TryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void exitTryblock(cppParser.TryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctiontryblock(cppParser.FunctiontryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctiontryblock(cppParser.FunctiontryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerseq(cppParser.HandlerseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerseq(cppParser.HandlerseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(cppParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(cppParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptiondeclaration(cppParser.ExceptiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptiondeclaration(cppParser.ExceptiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowexpression(cppParser.ThrowexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowexpression(cppParser.ThrowexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionspecification(cppParser.ExceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionspecification(cppParser.ExceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicexceptionspecification(cppParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicexceptionspecification(cppParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void enterTypeidlist(cppParser.TypeidlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void exitTypeidlist(cppParser.TypeidlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptspecification(cppParser.NoexceptspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptspecification(cppParser.NoexceptspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void enterRightShift(cppParser.RightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void exitRightShift(cppParser.RightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftAssign(cppParser.RightShiftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftAssign(cppParser.RightShiftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(cppParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(cppParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(cppParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(cppParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanliteral(cppParser.BooleanliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanliteral(cppParser.BooleanliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void enterPointerliteral(cppParser.PointerliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void exitPointerliteral(cppParser.PointerliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cppParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void enterUserdefinedliteral(cppParser.UserdefinedliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cppParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void exitUserdefinedliteral(cppParser.UserdefinedliteralContext ctx);
}