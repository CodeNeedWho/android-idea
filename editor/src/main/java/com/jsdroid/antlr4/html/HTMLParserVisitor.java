// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/html\HTMLParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.html;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeName(HTMLParser.HtmlAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeValue(HTMLParser.HtmlAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagName(HTMLParser.HtmlTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#xhtmlCDATA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXhtmlCDATA(HTMLParser.XhtmlCDATAContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#dtd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtd(HTMLParser.DtdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml(HTMLParser.XmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptlet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptlet(HTMLParser.ScriptletContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
}