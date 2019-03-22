// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/html\HTMLParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.html;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML_DECLARATION=3, CDATA=4, 
		DTD=5, SCRIPTLET=6, SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, 
		HTML_TEXT=11, TAG_CLOSE=12, TAG_SLASH_CLOSE=13, TAG_SLASH=14, TAG_EQUALS=15, 
		TAG_NAME=16, TAG_WHITESPACE=17, SCRIPT_BODY=18, SCRIPT_SHORT_BODY=19, 
		STYLE_BODY=20, STYLE_SHORT_BODY=21, ATTVALUE_VALUE=22, ATTRIBUTE=23;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlElements = 1, RULE_htmlElement = 2, RULE_htmlContent = 3, 
		RULE_htmlAttribute = 4, RULE_htmlAttributeName = 5, RULE_htmlAttributeValue = 6, 
		RULE_htmlTagName = 7, RULE_htmlChardata = 8, RULE_htmlMisc = 9, RULE_htmlComment = 10, 
		RULE_xhtmlCDATA = 11, RULE_dtd = 12, RULE_xml = 13, RULE_scriptlet = 14, 
		RULE_script = 15, RULE_style = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlElements", "htmlElement", "htmlContent", "htmlAttribute", 
			"htmlAttributeName", "htmlAttributeValue", "htmlTagName", "htmlChardata", 
			"htmlMisc", "htmlComment", "xhtmlCDATA", "dtd", "xml", "scriptlet", "script", 
			"style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			"'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", 
			"CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
			"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletContext> scriptlet() {
			return getRuleContexts(ScriptletContext.class);
		}
		public ScriptletContext scriptlet(int i) {
			return getRuleContext(ScriptletContext.class,i);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(HTMLParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(HTMLParser.SEA_WS, i);
		}
		public XmlContext xml() {
			return getRuleContext(XmlContext.class,0);
		}
		public DtdContext dtd() {
			return getRuleContext(DtdContext.class,0);
		}
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(36);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(34);
						scriptlet();
						}
						break;
					case SEA_WS:
						{
						setState(35);
						match(SEA_WS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML_DECLARATION) {
				{
				setState(41);
				xml();
				}
			}

			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(46);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(44);
						scriptlet();
						}
						break;
					case SEA_WS:
						{
						setState(45);
						match(SEA_WS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(51);
				dtd();
				}
			}

			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(56);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(54);
						scriptlet();
						}
						break;
					case SEA_WS:
						{
						setState(55);
						match(SEA_WS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN))) != 0)) {
				{
				{
				setState(61);
				htmlElements();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SEA_WS))) != 0)) {
				{
				{
				setState(67);
				htmlMisc();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			htmlElement();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					htmlMisc();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<HtmlTagNameContext> htmlTagName() {
			return getRuleContexts(HtmlTagNameContext.class);
		}
		public HtmlTagNameContext htmlTagName(int i) {
			return getRuleContext(HtmlTagNameContext.class,i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public ScriptletContext scriptlet() {
			return getRuleContext(ScriptletContext.class,0);
		}
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(TAG_OPEN);
				setState(81);
				htmlTagName();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(82);
					htmlAttribute();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(TAG_CLOSE);
				setState(89);
				htmlContent();
				setState(90);
				match(TAG_OPEN);
				setState(91);
				match(TAG_SLASH);
				setState(92);
				htmlTagName();
				setState(93);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(TAG_OPEN);
				setState(96);
				htmlTagName();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(97);
					htmlAttribute();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(TAG_OPEN);
				setState(106);
				htmlTagName();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(107);
					htmlAttribute();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				match(TAG_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				scriptlet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				script();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				style();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<XhtmlCDATAContext> xhtmlCDATA() {
			return getRuleContexts(XhtmlCDATAContext.class);
		}
		public XhtmlCDATAContext xhtmlCDATA(int i) {
			return getRuleContext(XhtmlCDATAContext.class,i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(120);
				htmlChardata();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(123);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(124);
						xhtmlCDATA();
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(125);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(128);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeNameContext htmlAttributeName() {
			return getRuleContext(HtmlAttributeNameContext.class,0);
		}
		public TerminalNode TAG_EQUALS() { return getToken(HTMLParser.TAG_EQUALS, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttribute);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				htmlAttributeName();
				setState(137);
				match(TAG_EQUALS);
				setState(138);
				htmlAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				htmlAttributeName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public HtmlAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeNameContext htmlAttributeName() throws RecognitionException {
		HtmlAttributeNameContext _localctx = new HtmlAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(TAG_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ATTVALUE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlTagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(TAG_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HTMLParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlMisc);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(HTMLParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XhtmlCDATAContext extends ParserRuleContext {
		public TerminalNode CDATA() { return getToken(HTMLParser.CDATA, 0); }
		public XhtmlCDATAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xhtmlCDATA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterXhtmlCDATA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitXhtmlCDATA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitXhtmlCDATA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XhtmlCDATAContext xhtmlCDATA() throws RecognitionException {
		XhtmlCDATAContext _localctx = new XhtmlCDATAContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_xhtmlCDATA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(CDATA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtdContext extends ParserRuleContext {
		public TerminalNode DTD() { return getToken(HTMLParser.DTD, 0); }
		public DtdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDtd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDtd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDtd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtdContext dtd() throws RecognitionException {
		DtdContext _localctx = new DtdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dtd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DTD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlContext extends ParserRuleContext {
		public TerminalNode XML_DECLARATION() { return getToken(HTMLParser.XML_DECLARATION, 0); }
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterXml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitXml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitXml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_xml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(XML_DECLARATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptletContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public ScriptletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptlet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScriptlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScriptlet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScriptlet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletContext scriptlet() throws RecognitionException {
		ScriptletContext _localctx = new ScriptletContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scriptlet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(SCRIPTLET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HTMLParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(HTMLParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(HTMLParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SCRIPT_OPEN);
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HTMLParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_BODY() { return getToken(HTMLParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(HTMLParser.STYLE_SHORT_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(STYLE_OPEN);
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\5\2-\n\2\3\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\5\2\67\n\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A"+
		"\n\2\f\2\16\2D\13\2\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4e\n\4\f\4\16\4h\13\4\3\4\3\4\3\4\3\4\3\4\7\4o\n\4\f"+
		"\4\16\4r\13\4\3\4\3\4\3\4\3\4\3\4\5\4y\n\4\3\5\5\5|\n\5\3\5\3\5\3\5\5"+
		"\5\u0081\n\5\3\5\5\5\u0084\n\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\5\13\u009c\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\6\4\2\t\t\r\r\3\2\3\4\3\2\24\25\3\2\26\27\2\u00b6\2(\3\2\2\2"+
		"\4H\3\2\2\2\6x\3\2\2\2\b{\3\2\2\2\n\u008f\3\2\2\2\f\u0091\3\2\2\2\16\u0093"+
		"\3\2\2\2\20\u0095\3\2\2\2\22\u0097\3\2\2\2\24\u009b\3\2\2\2\26\u009d\3"+
		"\2\2\2\30\u009f\3\2\2\2\32\u00a1\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2"+
		"\2\2 \u00a7\3\2\2\2\"\u00aa\3\2\2\2$\'\5\36\20\2%\'\7\t\2\2&$\3\2\2\2"+
		"&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+-\5\34\17"+
		"\2,+\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.\61\5\36\20\2/\61\7\t\2\2\60.\3\2\2"+
		"\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2"+
		"\64\62\3\2\2\2\65\67\5\32\16\2\66\65\3\2\2\2\66\67\3\2\2\2\67<\3\2\2\2"+
		"8;\5\36\20\29;\7\t\2\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2"+
		"\2=B\3\2\2\2><\3\2\2\2?A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2C\3\3\2\2\2DB\3\2\2\2EG\5\24\13\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2IK\3\2\2\2JH\3\2\2\2KO\5\6\4\2LN\5\24\13\2ML\3\2\2\2NQ\3\2\2\2O"+
		"M\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RS\7\f\2\2SW\5\20\t\2TV\5\n\6"+
		"\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\16"+
		"\2\2[\\\5\b\5\2\\]\7\f\2\2]^\7\20\2\2^_\5\20\t\2_`\7\16\2\2`y\3\2\2\2"+
		"ab\7\f\2\2bf\5\20\t\2ce\5\n\6\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gi\3\2\2\2hf\3\2\2\2ij\7\17\2\2jy\3\2\2\2kl\7\f\2\2lp\5\20\t\2mo\5\n"+
		"\6\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\16"+
		"\2\2ty\3\2\2\2uy\5\36\20\2vy\5 \21\2wy\5\"\22\2xR\3\2\2\2xa\3\2\2\2xk"+
		"\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\7\3\2\2\2z|\5\22\n\2{z\3\2\2\2"+
		"{|\3\2\2\2|\u0087\3\2\2\2}\u0081\5\6\4\2~\u0081\5\30\r\2\177\u0081\5\26"+
		"\f\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0083\3\2\2"+
		"\2\u0082\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\t\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b"+
		"\5\f\7\2\u008b\u008c\7\21\2\2\u008c\u008d\5\16\b\2\u008d\u0090\3\2\2\2"+
		"\u008e\u0090\5\f\7\2\u008f\u008a\3\2\2\2\u008f\u008e\3\2\2\2\u0090\13"+
		"\3\2\2\2\u0091\u0092\7\22\2\2\u0092\r\3\2\2\2\u0093\u0094\7\30\2\2\u0094"+
		"\17\3\2\2\2\u0095\u0096\7\22\2\2\u0096\21\3\2\2\2\u0097\u0098\t\2\2\2"+
		"\u0098\23\3\2\2\2\u0099\u009c\5\26\f\2\u009a\u009c\7\t\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\25\3\2\2\2\u009d\u009e\t\3\2\2\u009e"+
		"\27\3\2\2\2\u009f\u00a0\7\6\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7\7\2\2\u00a2"+
		"\33\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\b\2\2\u00a6"+
		"\37\3\2\2\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\t\4\2\2\u00a9!\3\2\2\2\u00aa"+
		"\u00ab\7\13\2\2\u00ab\u00ac\t\5\2\2\u00ac#\3\2\2\2\27&(,\60\62\66:<BH"+
		"OWfpx{\u0080\u0083\u0087\u008f\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}