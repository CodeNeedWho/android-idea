// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/cpp\cpp.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.cpp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cppVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cppParser#translationunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationunit(cppParser.TranslationunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#primaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryexpression(cppParser.PrimaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#idexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdexpression(cppParser.IdexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#unqualifiedid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedid(cppParser.UnqualifiedidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#qualifiedid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedid(cppParser.QualifiedidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestednamespecifier(cppParser.NestednamespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#lambdaexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaexpression(cppParser.LambdaexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaintroducer(cppParser.LambdaintroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#lambdacapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdacapture(cppParser.LambdacaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#capturedefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapturedefault(cppParser.CapturedefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#capturelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapturelist(cppParser.CapturelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(cppParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#simplecapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplecapture(cppParser.SimplecaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(cppParser.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdadeclarator(cppParser.LambdadeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#postfixexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixexpression(cppParser.PostfixexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionlist(cppParser.ExpressionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudodestructorname(cppParser.PseudodestructornameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#unaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpression(cppParser.UnaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#unaryoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryoperator(cppParser.UnaryoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#newexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewexpression(cppParser.NewexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#newplacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewplacement(cppParser.NewplacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#newtypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewtypeid(cppParser.NewtypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#newdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewdeclarator(cppParser.NewdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrnewdeclarator(cppParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#newinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewinitializer(cppParser.NewinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#deleteexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteexpression(cppParser.DeleteexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#noexceptexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoexceptexpression(cppParser.NoexceptexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#castexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastexpression(cppParser.CastexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#pmexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPmexpression(cppParser.PmexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeexpression(cppParser.MultiplicativeexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#additiveexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveexpression(cppParser.AdditiveexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#shiftexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftexpression(cppParser.ShiftexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#relationalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpression(cppParser.RelationalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#equalityexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityexpression(cppParser.EqualityexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#andexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpression(cppParser.AndexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveorexpression(cppParser.ExclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveorexpression(cppParser.InclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#logicalandexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalandexpression(cppParser.LogicalandexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#logicalorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalorexpression(cppParser.LogicalorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#conditionalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalexpression(cppParser.ConditionalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#assignmentexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentexpression(cppParser.AssignmentexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#assignmentoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentoperator(cppParser.AssignmentoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(cppParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#constantexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantexpression(cppParser.ConstantexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(cppParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#labeledstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledstatement(cppParser.LabeledstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#expressionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionstatement(cppParser.ExpressionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#compoundstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundstatement(cppParser.CompoundstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#statementseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementseq(cppParser.StatementseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#selectionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionstatement(cppParser.SelectionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(cppParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#iterationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationstatement(cppParser.IterationstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#forinitstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForinitstatement(cppParser.ForinitstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForrangedeclaration(cppParser.ForrangedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForrangeinitializer(cppParser.ForrangeinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#jumpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpstatement(cppParser.JumpstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declarationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationstatement(cppParser.DeclarationstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(cppParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(cppParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#blockdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockdeclaration(cppParser.BlockdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasdeclaration(cppParser.AliasdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#simpledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpledeclaration(cppParser.SimpledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_assertdeclaration(cppParser.Static_assertdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#emptydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptydeclaration(cppParser.EmptydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributedeclaration(cppParser.AttributedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclspecifier(cppParser.DeclspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declspecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclspecifierseq(cppParser.DeclspecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageclassspecifier(cppParser.StorageclassspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#functionspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionspecifier(cppParser.FunctionspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typedefname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefname(cppParser.TypedefnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypespecifier(cppParser.TypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingtypespecifier(cppParser.TrailingtypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypespecifierseq(cppParser.TypespecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingtypespecifierseq(cppParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletypespecifier(cppParser.SimpletypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(cppParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#decltypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypespecifier(cppParser.DecltypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedtypespecifier(cppParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumname(cppParser.EnumnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumspecifier(cppParser.EnumspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumhead(cppParser.EnumheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueenumdeclaration(cppParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(cppParser.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(cppParser.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumeratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorlist(cppParser.EnumeratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratordefinition(cppParser.EnumeratordefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(cppParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#namespacename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacename(cppParser.NamespacenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#originalnamespacename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalnamespacename(cppParser.OriginalnamespacenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#namespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacedefinition(cppParser.NamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamednamespacedefinition(cppParser.NamednamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalnamespacedefinition(cppParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionnamespacedefinition(cppParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamednamespacedefinition(cppParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#namespacebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacebody(cppParser.NamespacebodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#namespacealias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacealias(cppParser.NamespacealiasContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacealiasdefinition(cppParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(cppParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#usingdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingdeclaration(cppParser.UsingdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#usingdirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingdirective(cppParser.UsingdirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#asmdefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmdefinition(cppParser.AsmdefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#linkagespecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkagespecification(cppParser.LinkagespecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributespecifierseq(cppParser.AttributespecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributespecifier(cppParser.AttributespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(cppParser.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributelist(cppParser.AttributelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(cppParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributetoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributetoken(cppParser.AttributetokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributescopedtoken(cppParser.AttributescopedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributenamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributenamespace(cppParser.AttributenamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeargumentclause(cppParser.AttributeargumentclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtokenseq(cppParser.BalancedtokenseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(cppParser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitdeclaratorlist(cppParser.InitdeclaratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitdeclarator(cppParser.InitdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(cppParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrdeclarator(cppParser.PtrdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrdeclarator(cppParser.NoptrdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersandqualifiers(cppParser.ParametersandqualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#trailingreturntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingreturntype(cppParser.TrailingreturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#ptroperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtroperator(cppParser.PtroperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(cppParser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#cvqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifier(cppParser.CvqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(cppParser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(cppParser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeid(cppParser.TypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractdeclarator(cppParser.AbstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrabstractdeclarator(cppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrabstractdeclarator(cppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractpackdeclarator(cppParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrabstractpackdeclarator(cppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclarationclause(cppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclarationlist(cppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclaration(cppParser.ParameterdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#functiondefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondefinition(cppParser.FunctiondefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(cppParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(cppParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceorequalinitializer(cppParser.BraceorequalinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initializerclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerclause(cppParser.InitializerclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#initializerlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerlist(cppParser.InitializerlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#bracedinitlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedinitlist(cppParser.BracedinitlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassname(cppParser.ClassnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassspecifier(cppParser.ClassspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasshead(cppParser.ClassheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classheadname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassheadname(cppParser.ClassheadnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassvirtspecifier(cppParser.ClassvirtspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasskey(cppParser.ClasskeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#memberspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberspecification(cppParser.MemberspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(cppParser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaratorlist(cppParser.MemberdeclaratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#memberdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclarator(cppParser.MemberdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtspecifierseq(cppParser.VirtspecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#virtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtspecifier(cppParser.VirtspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#purespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurespecifier(cppParser.PurespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#baseclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseclause(cppParser.BaseclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#basespecifierlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasespecifierlist(cppParser.BasespecifierlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#basespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasespecifier(cppParser.BasespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#classordecltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassordecltype(cppParser.ClassordecltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#basetypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasetypespecifier(cppParser.BasetypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#accessspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessspecifier(cppParser.AccessspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionfunctionid(cppParser.ConversionfunctionidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#conversiontypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversiontypeid(cppParser.ConversiontypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversiondeclarator(cppParser.ConversiondeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#ctorinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtorinitializer(cppParser.CtorinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#meminitializerlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerlist(cppParser.MeminitializerlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#meminitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializer(cppParser.MeminitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(cppParser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorfunctionid(cppParser.OperatorfunctionidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#literaloperatorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteraloperatorid(cppParser.LiteraloperatoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#templatedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatedeclaration(cppParser.TemplatedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#templateparameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameterlist(cppParser.TemplateparameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#templateparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameter(cppParser.TemplateparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typeparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeparameter(cppParser.TypeparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#simpletemplateid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletemplateid(cppParser.SimpletemplateidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#templateid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateid(cppParser.TemplateidContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#templatename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatename(cppParser.TemplatenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#templateargumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateargumentlist(cppParser.TemplateargumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#templateargument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateargument(cppParser.TemplateargumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typenamespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypenamespecifier(cppParser.TypenamespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitinstantiation(cppParser.ExplicitinstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#explicitspecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitspecialization(cppParser.ExplicitspecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#tryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryblock(cppParser.TryblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#functiontryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiontryblock(cppParser.FunctiontryblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#handlerseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerseq(cppParser.HandlerseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(cppParser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptiondeclaration(cppParser.ExceptiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#throwexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowexpression(cppParser.ThrowexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#exceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionspecification(cppParser.ExceptionspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicexceptionspecification(cppParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#typeidlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidlist(cppParser.TypeidlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#noexceptspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoexceptspecification(cppParser.NoexceptspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#rightShift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShift(cppParser.RightShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShiftAssign(cppParser.RightShiftAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(cppParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(cppParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#booleanliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanliteral(cppParser.BooleanliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#pointerliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerliteral(cppParser.PointerliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cppParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserdefinedliteral(cppParser.UserdefinedliteralContext ctx);
}