// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/groovy\GroovyParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.groovy;

    import java.util.Arrays;
    import java.util.Set;
    import java.util.HashSet;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroovyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SHEBANG_COMMENT=1, WS=2, LPAREN=3, RPAREN=4, LBRACK=5, RBRACK=6, LCURVE=7, 
		RCURVE=8, STRING=9, GSTRING_START=10, GSTRING_END=11, GSTRING_PART=12, 
		GSTRING_PATH_PART=13, ROLLBACK_ONE=14, DECIMAL=15, INTEGER=16, KW_CLASS=17, 
		KW_INTERFACE=18, KW_TRAIT=19, KW_ENUM=20, KW_PACKAGE=21, KW_IMPORT=22, 
		KW_EXTENDS=23, KW_IMPLEMENTS=24, KW_DEF=25, KW_NULL=26, KW_TRUE=27, KW_FALSE=28, 
		KW_NEW=29, KW_SUPER=30, KW_THIS=31, KW_IN=32, KW_FOR=33, KW_IF=34, KW_ELSE=35, 
		KW_DO=36, KW_WHILE=37, KW_SWITCH=38, KW_CASE=39, KW_DEFAULT=40, KW_CONTINUE=41, 
		KW_BREAK=42, KW_RETURN=43, KW_TRY=44, KW_CATCH=45, KW_FINALLY=46, KW_THROW=47, 
		KW_THROWS=48, KW_ASSERT=49, KW_CONST=50, KW_GOTO=51, RUSHIFT_ASSIGN=52, 
		RSHIFT_ASSIGN=53, LSHIFT_ASSIGN=54, SPACESHIP=55, ELVIS=56, SAFE_DOT=57, 
		STAR_DOT=58, ATTR_DOT=59, MEMBER_POINTER=60, LTE=61, GTE=62, CLOSURE_ARG_SEPARATOR=63, 
		DECREMENT=64, INCREMENT=65, POWER=66, LSHIFT=67, RANGE=68, ORANGE=69, 
		EQUAL=70, UNEQUAL=71, MATCH=72, FIND=73, AND=74, OR=75, PLUS_ASSIGN=76, 
		MINUS_ASSIGN=77, MULT_ASSIGN=78, DIV_ASSIGN=79, MOD_ASSIGN=80, BAND_ASSIGN=81, 
		XOR_ASSIGN=82, BOR_ASSIGN=83, SEMICOLON=84, DOT=85, COMMA=86, AT=87, ASSIGN=88, 
		LT=89, GT=90, COLON=91, BOR=92, NOT=93, BNOT=94, MULT=95, DIV=96, MOD=97, 
		PLUS=98, MINUS=99, BAND=100, XOR=101, QUESTION=102, ELLIPSIS=103, KW_AS=104, 
		KW_INSTANCEOF=105, BUILT_IN_TYPE=106, VISIBILITY_MODIFIER=107, KW_ABSTRACT=108, 
		KW_STATIC=109, KW_FINAL=110, KW_TRANSIENT=111, KW_NATIVE=112, KW_VOLATILE=113, 
		KW_SYNCHRONIZED=114, KW_STRICTFP=115, KW_THREADSAFE=116, IGNORE_NEWLINE=117, 
		NL=118, IDENTIFIER=119;
	public static final int
		RULE_compilationUnit = 0, RULE_scriptPart = 1, RULE_packageDefinition = 2, 
		RULE_importStatement = 3, RULE_classDeclaration = 4, RULE_classMember = 5, 
		RULE_enumConstant = 6, RULE_classBody = 7, RULE_implementsClause = 8, 
		RULE_extendsClause = 9, RULE_methodDeclaration = 10, RULE_fieldDeclaration = 11, 
		RULE_declarationRule = 12, RULE_objectInitializer = 13, RULE_classInitializer = 14, 
		RULE_typeDeclaration = 15, RULE_annotationClause = 16, RULE_annotationElementPair = 17, 
		RULE_annotationElement = 18, RULE_genericDeclarationList = 19, RULE_genericsDeclarationElement = 20, 
		RULE_throwsClause = 21, RULE_argumentDeclarationList = 22, RULE_argumentDeclaration = 23, 
		RULE_blockStatement = 24, RULE_singleDeclaration = 25, RULE_tupleDeclaration = 26, 
		RULE_tupleVariableDeclaration = 27, RULE_newInstanceRule = 28, RULE_newArrayRule = 29, 
		RULE_statement = 30, RULE_blockStatementWithCurve = 31, RULE_statementBlock = 32, 
		RULE_tryBlock = 33, RULE_catchBlock = 34, RULE_finallyBlock = 35, RULE_caseStatement = 36, 
		RULE_pathExpression = 37, RULE_gstringPathExpression = 38, RULE_closureExpressionRule = 39, 
		RULE_gstringExpressionBody = 40, RULE_gstring = 41, RULE_annotationParameter = 42, 
		RULE_expression = 43, RULE_atomExpressionRule = 44, RULE_classConstantRule = 45, 
		RULE_argumentListRule = 46, RULE_callExpressionRule = 47, RULE_nonKwCallExpressionRule = 48, 
		RULE_callRule = 49, RULE_classNameExpression = 50, RULE_genericClassNameExpression = 51, 
		RULE_genericList = 52, RULE_genericListElement = 53, RULE_mapEntry = 54, 
		RULE_classModifier = 55, RULE_memberModifier = 56, RULE_argumentList = 57, 
		RULE_argument = 58, RULE_selectorName = 59, RULE_kwSelectorName = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "scriptPart", "packageDefinition", "importStatement", 
			"classDeclaration", "classMember", "enumConstant", "classBody", "implementsClause", 
			"extendsClause", "methodDeclaration", "fieldDeclaration", "declarationRule", 
			"objectInitializer", "classInitializer", "typeDeclaration", "annotationClause", 
			"annotationElementPair", "annotationElement", "genericDeclarationList", 
			"genericsDeclarationElement", "throwsClause", "argumentDeclarationList", 
			"argumentDeclaration", "blockStatement", "singleDeclaration", "tupleDeclaration", 
			"tupleVariableDeclaration", "newInstanceRule", "newArrayRule", "statement", 
			"blockStatementWithCurve", "statementBlock", "tryBlock", "catchBlock", 
			"finallyBlock", "caseStatement", "pathExpression", "gstringPathExpression", 
			"closureExpressionRule", "gstringExpressionBody", "gstring", "annotationParameter", 
			"expression", "atomExpressionRule", "classConstantRule", "argumentListRule", 
			"callExpressionRule", "nonKwCallExpressionRule", "callRule", "classNameExpression", 
			"genericClassNameExpression", "genericList", "genericListElement", "mapEntry", 
			"classModifier", "memberModifier", "argumentList", "argument", "selectorName", 
			"kwSelectorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'\"'", 
			"'$'", null, null, null, null, "'class'", "'interface'", "'trait'", "'enum'", 
			"'package'", "'import'", "'extends'", "'implements'", "'def'", "'null'", 
			"'true'", "'false'", "'new'", "'super'", "'this'", "'in'", "'for'", "'if'", 
			"'else'", "'do'", "'while'", "'switch'", "'case'", "'default'", "'continue'", 
			"'break'", "'return'", "'try'", "'catch'", "'finally'", "'throw'", "'throws'", 
			"'assert'", "'const'", "'goto'", "'>>>='", "'>>='", "'<<='", "'<=>'", 
			"'?:'", "'?.'", "'*.'", "'.@'", "'.&'", "'<='", "'>='", "'->'", "'--'", 
			"'++'", "'**'", "'<<'", "'..'", "'..<'", "'=='", "'!='", "'==~'", "'=~'", 
			"'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", 
			"'|='", "';'", "'.'", "','", "'@'", "'='", "'<'", "'>'", "':'", "'|'", 
			"'!'", "'~'", "'*'", "'/'", "'%'", "'+'", "'-'", "'&'", "'^'", "'?'", 
			"'...'", "'as'", "'instanceof'", null, null, "'abstract'", "'static'", 
			"'final'", "'transient'", "'native'", "'volatile'", "'synchronized'", 
			"'strictfp'", "'threadsafe'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SHEBANG_COMMENT", "WS", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"LCURVE", "RCURVE", "STRING", "GSTRING_START", "GSTRING_END", "GSTRING_PART", 
			"GSTRING_PATH_PART", "ROLLBACK_ONE", "DECIMAL", "INTEGER", "KW_CLASS", 
			"KW_INTERFACE", "KW_TRAIT", "KW_ENUM", "KW_PACKAGE", "KW_IMPORT", "KW_EXTENDS", 
			"KW_IMPLEMENTS", "KW_DEF", "KW_NULL", "KW_TRUE", "KW_FALSE", "KW_NEW", 
			"KW_SUPER", "KW_THIS", "KW_IN", "KW_FOR", "KW_IF", "KW_ELSE", "KW_DO", 
			"KW_WHILE", "KW_SWITCH", "KW_CASE", "KW_DEFAULT", "KW_CONTINUE", "KW_BREAK", 
			"KW_RETURN", "KW_TRY", "KW_CATCH", "KW_FINALLY", "KW_THROW", "KW_THROWS", 
			"KW_ASSERT", "KW_CONST", "KW_GOTO", "RUSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"LSHIFT_ASSIGN", "SPACESHIP", "ELVIS", "SAFE_DOT", "STAR_DOT", "ATTR_DOT", 
			"MEMBER_POINTER", "LTE", "GTE", "CLOSURE_ARG_SEPARATOR", "DECREMENT", 
			"INCREMENT", "POWER", "LSHIFT", "RANGE", "ORANGE", "EQUAL", "UNEQUAL", 
			"MATCH", "FIND", "AND", "OR", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "BAND_ASSIGN", "XOR_ASSIGN", "BOR_ASSIGN", 
			"SEMICOLON", "DOT", "COMMA", "AT", "ASSIGN", "LT", "GT", "COLON", "BOR", 
			"NOT", "BNOT", "MULT", "DIV", "MOD", "PLUS", "MINUS", "BAND", "XOR", 
			"QUESTION", "ELLIPSIS", "KW_AS", "KW_INSTANCEOF", "BUILT_IN_TYPE", "VISIBILITY_MODIFIER", 
			"KW_ABSTRACT", "KW_STATIC", "KW_FINAL", "KW_TRANSIENT", "KW_NATIVE", 
			"KW_VOLATILE", "KW_SYNCHRONIZED", "KW_STRICTFP", "KW_THREADSAFE", "IGNORE_NEWLINE", 
			"NL", "IDENTIFIER"
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
	public String getGrammarFileName() { return "GroovyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    private boolean ellipsisEnabled = false;

	    private boolean isEllipsisEnabled() {
	        return ellipsisEnabled;
	    }
	    private void enableEllipsis() {
	        ellipsisEnabled = true;
	    }
	    private void disableEllipsis() {
	        ellipsisEnabled = false;
	    }

	    private static String createErrorMessageForStrictCheck(Set<String> s, String keyword) {
	        if (VISIBILITY_MODIFIER_SET.contains(keyword)) {
	            StringBuilder sb = new StringBuilder();
	            for (String m : s) {
	                if (VISIBILITY_MODIFIER_SET.contains(m)) {
	                    sb.append(m + ", ");
	                }
	            }

	            return sb.append(keyword) + " are not allowed to duplicate or define in the same time.";
	        } else {
	            return "duplicated " + keyword + " is not allowed.";
	        }
	    }

	    private static final Set<String> VISIBILITY_MODIFIER_SET = new HashSet<String>(Arrays.asList("public", "protected", "private"));
	    private static final String VISIBILITY_MODIFIER_STR = "VISIBILITY_MODIFIER";
	    private static void collectModifier(Set<String> s, String modifier) {
	        s.add(modifier);
	    }
	    private static boolean checkModifierDuplication(Set<String> s, String modifier) {
	        if (VISIBILITY_MODIFIER_SET.contains(modifier)) {
	            modifier = VISIBILITY_MODIFIER_STR;

	            for (String m : s) {
	                m = VISIBILITY_MODIFIER_SET.contains(m) ? VISIBILITY_MODIFIER_STR : m;

	                if (m.equals(modifier)) {
	                    return true;
	                }
	            }

	            return false;
	        } else {
	            return s.contains(modifier);
	        }
	    }


	public GroovyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GroovyParser.EOF, 0); }
		public TerminalNode SHEBANG_COMMENT() { return getToken(GroovyParser.SHEBANG_COMMENT, 0); }
		public PackageDefinitionContext packageDefinition() {
			return getRuleContext(PackageDefinitionContext.class,0);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<ScriptPartContext> scriptPart() {
			return getRuleContexts(ScriptPartContext.class);
		}
		public ScriptPartContext scriptPart(int i) {
			return getRuleContext(ScriptPartContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GroovyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GroovyParser.SEMICOLON, i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(122);
				match(SHEBANG_COMMENT);
				}
				break;
			}
			{
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(NL);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(131);
				packageDefinition();
				}
				break;
			}
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					_la = _input.LA(1);
					if ( !(_la==SEMICOLON || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(140);
						importStatement();
						setState(141);
						_la = _input.LA(1);
						if ( !(_la==SEMICOLON || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(143);
						classDeclaration();
						}
						break;
					case 3:
						{
						setState(144);
						scriptPart();
						setState(145);
						_la = _input.LA(1);
						if ( !(_la==SEMICOLON || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 4:
						{
						setState(147);
						_la = _input.LA(1);
						if ( !(_la==SEMICOLON || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !(_la==SEMICOLON || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(159);
				scriptPart();
				}
				break;
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON || _la==NL) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==SEMICOLON || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(EOF);
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

	public static class ScriptPartContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ScriptPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterScriptPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitScriptPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitScriptPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptPartContext scriptPart() throws RecognitionException {
		ScriptPartContext _localctx = new ScriptPartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptPart);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				if (!( !GrammarPredicates.isInvalidMethodDeclaration(_input) )) throw new FailedPredicateException(this, " !GrammarPredicates.isInvalidMethodDeclaration(_input) ");
				setState(171);
				methodDeclaration(null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				statement();
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

	public static class PackageDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_PACKAGE() { return getToken(GroovyParser.KW_PACKAGE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GroovyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GroovyParser.IDENTIFIER, i);
		}
		public List<AnnotationClauseContext> annotationClause() {
			return getRuleContexts(AnnotationClauseContext.class);
		}
		public AnnotationClauseContext annotationClause(int i) {
			return getRuleContext(AnnotationClauseContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public PackageDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPackageDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPackageDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPackageDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDefinitionContext packageDefinition() throws RecognitionException {
		PackageDefinitionContext _localctx = new PackageDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(175);
				annotationClause();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || _la==NL) {
					{
					setState(178);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NL:
						{
						setState(176);
						match(NL);
						}
						break;
					case AT:
						{
						setState(177);
						annotationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185);
			match(KW_PACKAGE);
			{
			setState(186);
			match(IDENTIFIER);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					match(DOT);
					setState(188);
					match(IDENTIFIER);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode KW_IMPORT() { return getToken(GroovyParser.KW_IMPORT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GroovyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GroovyParser.IDENTIFIER, i);
		}
		public List<AnnotationClauseContext> annotationClause() {
			return getRuleContexts(AnnotationClauseContext.class);
		}
		public AnnotationClauseContext annotationClause(int i) {
			return getRuleContext(AnnotationClauseContext.class,i);
		}
		public TerminalNode KW_STATIC() { return getToken(GroovyParser.KW_STATIC, 0); }
		public TerminalNode KW_AS() { return getToken(GroovyParser.KW_AS, 0); }
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public TerminalNode MULT() { return getToken(GroovyParser.MULT, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(194);
				annotationClause();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || _la==NL) {
					{
					setState(197);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NL:
						{
						setState(195);
						match(NL);
						}
						break;
					case AT:
						{
						setState(196);
						annotationClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(204);
			match(KW_IMPORT);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STATIC) {
				{
				setState(205);
				match(KW_STATIC);
				}
			}

			{
			setState(208);
			match(IDENTIFIER);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					match(DOT);
					setState(210);
					match(IDENTIFIER);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(216);
				match(DOT);
				setState(217);
				match(MULT);
				}
			}

			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(220);
				match(KW_AS);
				setState(221);
				match(IDENTIFIER);
				}
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Set<String> modifierSet = new HashSet<String>();
		public boolean isEnum = false;
		public boolean isInterface = false;
		public String className = null;
		public ClassModifierContext classModifier;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public TerminalNode KW_INTERFACE() { return getToken(GroovyParser.KW_INTERFACE, 0); }
		public TerminalNode KW_CLASS() { return getToken(GroovyParser.KW_CLASS, 0); }
		public TerminalNode KW_TRAIT() { return getToken(GroovyParser.KW_TRAIT, 0); }
		public TerminalNode KW_ENUM() { return getToken(GroovyParser.KW_ENUM, 0); }
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<AnnotationClauseContext> annotationClause() {
			return getRuleContexts(AnnotationClauseContext.class);
		}
		public AnnotationClauseContext annotationClause(int i) {
			return getRuleContext(AnnotationClauseContext.class,i);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public GenericDeclarationListContext genericDeclarationList() {
			return getRuleContext(GenericDeclarationListContext.class,0);
		}
		public ExtendsClauseContext extendsClause() {
			return getRuleContext(ExtendsClauseContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AT:
					{
					setState(224);
					annotationClause();
					}
					break;
				case VISIBILITY_MODIFIER:
				case KW_ABSTRACT:
				case KW_STATIC:
				case KW_FINAL:
				case KW_STRICTFP:
					{
					setState(225);
					((ClassDeclarationContext)_localctx).classModifier = classModifier();
					setState(226);
					if (!(!checkModifierDuplication(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null)))) throw new FailedPredicateException(this, "!checkModifierDuplication($modifierSet, $classModifier.text)", createErrorMessageForStrictCheck(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null)));
					collectModifier(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(237);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NL:
							{
							setState(231);
							match(NL);
							}
							break;
						case AT:
							{
							setState(232);
							annotationClause();
							}
							break;
						case VISIBILITY_MODIFIER:
						case KW_ABSTRACT:
						case KW_STATIC:
						case KW_FINAL:
						case KW_STRICTFP:
							{
							setState(233);
							((ClassDeclarationContext)_localctx).classModifier = classModifier();
							setState(234);
							if (!(!checkModifierDuplication(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null)))) throw new FailedPredicateException(this, "!checkModifierDuplication($modifierSet, $classModifier.text)", createErrorMessageForStrictCheck(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null)));
							collectModifier(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null));
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			}
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				setState(244);
				match(AT);
				setState(245);
				match(KW_INTERFACE);
				}
				break;
			case KW_CLASS:
				{
				setState(246);
				match(KW_CLASS);
				}
				break;
			case KW_INTERFACE:
				{
				setState(247);
				match(KW_INTERFACE);
				((ClassDeclarationContext)_localctx).isInterface = true;
				}
				break;
			case KW_TRAIT:
				{
				setState(249);
				match(KW_TRAIT);
				}
				break;
			case KW_ENUM:
				{
				setState(250);
				match(KW_ENUM);
				((ClassDeclarationContext)_localctx).isEnum = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
			((ClassDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 ((ClassDeclarationContext)_localctx).className =  (((ClassDeclarationContext)_localctx).IDENTIFIER!=null?((ClassDeclarationContext)_localctx).IDENTIFIER.getText():null); 
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(256);
				if (!(!_localctx.isEnum)) throw new FailedPredicateException(this, "!$isEnum");
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(257);
					genericDeclarationList();
					}
				}

				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						match(NL);
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_EXTENDS) {
					{
					setState(266);
					extendsClause(_localctx.isInterface);
					}
				}

				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						match(NL);
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IMPLEMENTS) {
				{
				setState(278);
				implementsClause();
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(281);
				match(NL);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			classBody(_localctx.isEnum, _localctx.className);
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

	public static class ClassMemberContext extends ParserRuleContext {
		public String className;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ObjectInitializerContext objectInitializer() {
			return getRuleContext(ObjectInitializerContext.class,0);
		}
		public ClassInitializerContext classInitializer() {
			return getRuleContext(ClassInitializerContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassMemberContext(ParserRuleContext parent, int invokingState, String className) {
			super(parent, invokingState);
			this.className = className;
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember(String className) throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState(), className);
		enterRule(_localctx, 10, RULE_classMember);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				methodDeclaration(_localctx.className);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				objectInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				classInitializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				classDeclaration();
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IDENTIFIER);
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(297);
				match(LPAREN);
				setState(298);
				argumentList();
				setState(299);
				match(RPAREN);
				}
				break;
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

	public static class ClassBodyContext extends ParserRuleContext {
		public boolean isEnum;
		public String className;
		public TerminalNode LCURVE() { return getToken(GroovyParser.LCURVE, 0); }
		public TerminalNode RCURVE() { return getToken(GroovyParser.RCURVE, 0); }
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GroovyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GroovyParser.SEMICOLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClassBodyContext(ParserRuleContext parent, int invokingState, boolean isEnum, String className) {
			super(parent, invokingState);
			this.isEnum = isEnum;
			this.className = className;
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody(boolean isEnum,String className) throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState(), isEnum, className);
		enterRule(_localctx, 14, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(LCURVE);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					match(NL);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(310);
				if (!(_localctx.isEnum)) throw new FailedPredicateException(this, "$isEnum");
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(311);
						enumConstant();
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(312);
							match(NL);
							}
							}
							setState(317);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(318);
						match(COMMA);
						setState(322);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(319);
							match(NL);
							}
							}
							setState(324);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(330);
				enumConstant();
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(331);
						match(NL);
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(337);
					match(COMMA);
					}
					break;
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(343);
						classMember(_localctx.className);
						setState(344);
						_la = _input.LA(1);
						if ( !(_la==SEMICOLON || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(346);
						match(NL);
						}
						break;
					case 3:
						{
						setState(347);
						match(SEMICOLON);
						}
						break;
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(353);
				classMember(_localctx.className);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON || _la==NL) {
					{
					{
					setState(354);
					_la = _input.LA(1);
					if ( !(_la==SEMICOLON || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(362);
			match(RCURVE);
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

	public static class ImplementsClauseContext extends ParserRuleContext {
		public TerminalNode KW_IMPLEMENTS() { return getToken(GroovyParser.KW_IMPLEMENTS, 0); }
		public List<GenericClassNameExpressionContext> genericClassNameExpression() {
			return getRuleContexts(GenericClassNameExpressionContext.class);
		}
		public GenericClassNameExpressionContext genericClassNameExpression(int i) {
			return getRuleContext(GenericClassNameExpressionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterImplementsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitImplementsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_implementsClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(KW_IMPLEMENTS);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(365);
					match(NL);
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(371);
			genericClassNameExpression();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						match(NL);
						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(379);
				genericClassNameExpression();
				}
				}
				setState(384);
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

	public static class ExtendsClauseContext extends ParserRuleContext {
		public boolean isInterface;
		public TerminalNode KW_EXTENDS() { return getToken(GroovyParser.KW_EXTENDS, 0); }
		public List<GenericClassNameExpressionContext> genericClassNameExpression() {
			return getRuleContexts(GenericClassNameExpressionContext.class);
		}
		public GenericClassNameExpressionContext genericClassNameExpression(int i) {
			return getRuleContext(GenericClassNameExpressionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ExtendsClauseContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExtendsClauseContext(ParserRuleContext parent, int invokingState, boolean isInterface) {
			super(parent, invokingState);
			this.isInterface = isInterface;
		}
		@Override public int getRuleIndex() { return RULE_extendsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExtendsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExtendsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExtendsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsClauseContext extendsClause(boolean isInterface) throws RecognitionException {
		ExtendsClauseContext _localctx = new ExtendsClauseContext(_ctx, getState(), isInterface);
		enterRule(_localctx, 18, RULE_extendsClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(KW_EXTENDS);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(386);
					match(NL);
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(392);
			genericClassNameExpression();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393);
				match(COMMA);
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(394);
						match(NL);
						}
						} 
					}
					setState(399);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(400);
				if (!(_localctx.isInterface)) throw new FailedPredicateException(this, "$isInterface", "Only interface allows multi-inheritance");
				setState(401);
				genericClassNameExpression();
				}
				}
				setState(406);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public String classNameParam;
		public Set<String> modifierAndDefSet = new HashSet<String>();
		public String className = null;
		public MemberModifierContext memberModifier;
		public Token KW_DEF;
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ArgumentDeclarationListContext argumentDeclarationList() {
			return getRuleContext(ArgumentDeclarationListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ThrowsClauseContext throwsClause() {
			return getRuleContext(ThrowsClauseContext.class,0);
		}
		public TerminalNode KW_DEFAULT() { return getToken(GroovyParser.KW_DEFAULT, 0); }
		public AnnotationParameterContext annotationParameter() {
			return getRuleContext(AnnotationParameterContext.class,0);
		}
		public BlockStatementWithCurveContext blockStatementWithCurve() {
			return getRuleContext(BlockStatementWithCurveContext.class,0);
		}
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public List<AnnotationClauseContext> annotationClause() {
			return getRuleContexts(AnnotationClauseContext.class);
		}
		public AnnotationClauseContext annotationClause(int i) {
			return getRuleContext(AnnotationClauseContext.class,i);
		}
		public List<TerminalNode> KW_DEF() { return getTokens(GroovyParser.KW_DEF); }
		public TerminalNode KW_DEF(int i) {
			return getToken(GroovyParser.KW_DEF, i);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public GenericDeclarationListContext genericDeclarationList() {
			return getRuleContext(GenericDeclarationListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState, String classNameParam) {
			super(parent, invokingState);
			this.classNameParam = classNameParam;
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration(String classNameParam) throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState(), classNameParam);
		enterRule(_localctx, 20, RULE_methodDeclaration);

		    ((MethodDeclarationContext)_localctx).className =  _localctx.classNameParam;

		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VISIBILITY_MODIFIER:
				case KW_ABSTRACT:
				case KW_STATIC:
				case KW_FINAL:
				case KW_TRANSIENT:
				case KW_NATIVE:
				case KW_VOLATILE:
				case KW_SYNCHRONIZED:
					{
					setState(407);
					((MethodDeclarationContext)_localctx).memberModifier = memberModifier();
					setState(408);
					if (!(!checkModifierDuplication(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null)))) throw new FailedPredicateException(this, "!checkModifierDuplication($modifierAndDefSet, $memberModifier.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null)));
					collectModifier(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null));
					}
					break;
				case AT:
					{
					setState(411);
					annotationClause();
					}
					break;
				case KW_DEF:
					{
					setState(412);
					((MethodDeclarationContext)_localctx).KW_DEF = match(KW_DEF);
					setState(413);
					if (!(!_localctx.modifierAndDefSet.contains((((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null)))) throw new FailedPredicateException(this, "!$modifierAndDefSet.contains($KW_DEF.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null)));
					_localctx.modifierAndDefSet.add((((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(426);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VISIBILITY_MODIFIER:
						case KW_ABSTRACT:
						case KW_STATIC:
						case KW_FINAL:
						case KW_TRANSIENT:
						case KW_NATIVE:
						case KW_VOLATILE:
						case KW_SYNCHRONIZED:
							{
							setState(417);
							((MethodDeclarationContext)_localctx).memberModifier = memberModifier();
							setState(418);
							if (!(!checkModifierDuplication(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null)))) throw new FailedPredicateException(this, "!checkModifierDuplication($modifierAndDefSet, $memberModifier.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null)));
							collectModifier(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null));
							}
							break;
						case AT:
							{
							setState(421);
							annotationClause();
							}
							break;
						case KW_DEF:
							{
							setState(422);
							((MethodDeclarationContext)_localctx).KW_DEF = match(KW_DEF);
							setState(423);
							if (!(!_localctx.modifierAndDefSet.contains((((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null)))) throw new FailedPredicateException(this, "!$modifierAndDefSet.contains($KW_DEF.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null)));
							_localctx.modifierAndDefSet.add((((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null));
							}
							break;
						case NL:
							{
							setState(425);
							match(NL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(430);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					{
					setState(431);
					genericDeclarationList();
					setState(432);
					genericClassNameExpression();
					}
					}
					break;
				case 2:
					{
					setState(434);
					typeDeclaration();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(437);
				genericClassNameExpression();
				}
				break;
			}
			setState(440);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(441);
			match(LPAREN);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					match(NL);
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(448);
			argumentDeclarationList();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(449);
				match(NL);
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(RPAREN);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_THROWS) {
				{
				setState(456);
				throwsClause();
				}
			}

			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DEFAULT:
				{
				setState(459);
				match(KW_DEFAULT);
				setState(460);
				annotationParameter();
				}
				break;
			case LCURVE:
				{
				setState(461);
				blockStatementWithCurve();
				}
				break;
			case EOF:
			case RCURVE:
			case SEMICOLON:
			case NL:
				break;
			default:
				break;
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public Set<String> modifierAndDefSet = new HashSet<String>();
		public MemberModifierContext memberModifier;
		public Token KW_DEF;
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public List<AnnotationClauseContext> annotationClause() {
			return getRuleContexts(AnnotationClauseContext.class);
		}
		public AnnotationClauseContext annotationClause(int i) {
			return getRuleContext(AnnotationClauseContext.class,i);
		}
		public List<TerminalNode> KW_DEF() { return getTokens(GroovyParser.KW_DEF); }
		public TerminalNode KW_DEF(int i) {
			return getToken(GroovyParser.KW_DEF, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fieldDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VISIBILITY_MODIFIER:
				case KW_ABSTRACT:
				case KW_STATIC:
				case KW_FINAL:
				case KW_TRANSIENT:
				case KW_NATIVE:
				case KW_VOLATILE:
				case KW_SYNCHRONIZED:
					{
					setState(464);
					((FieldDeclarationContext)_localctx).memberModifier = memberModifier();
					setState(465);
					if (!(!checkModifierDuplication(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null)))) throw new FailedPredicateException(this, "!checkModifierDuplication($modifierAndDefSet, $memberModifier.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null)));
					collectModifier(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null));
					}
					break;
				case AT:
					{
					setState(468);
					annotationClause();
					}
					break;
				case KW_DEF:
					{
					setState(469);
					((FieldDeclarationContext)_localctx).KW_DEF = match(KW_DEF);
					setState(470);
					if (!(!_localctx.modifierAndDefSet.contains((((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null)))) throw new FailedPredicateException(this, "!$modifierAndDefSet.contains($KW_DEF.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null)));
					_localctx.modifierAndDefSet.add((((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(483);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case VISIBILITY_MODIFIER:
						case KW_ABSTRACT:
						case KW_STATIC:
						case KW_FINAL:
						case KW_TRANSIENT:
						case KW_NATIVE:
						case KW_VOLATILE:
						case KW_SYNCHRONIZED:
							{
							setState(474);
							((FieldDeclarationContext)_localctx).memberModifier = memberModifier();
							setState(475);
							if (!(!checkModifierDuplication(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null)))) throw new FailedPredicateException(this, "!checkModifierDuplication($modifierAndDefSet, $memberModifier.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null)));
							collectModifier(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null));
							}
							break;
						case AT:
							{
							setState(478);
							annotationClause();
							}
							break;
						case KW_DEF:
							{
							setState(479);
							((FieldDeclarationContext)_localctx).KW_DEF = match(KW_DEF);
							setState(480);
							if (!(!_localctx.modifierAndDefSet.contains((((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null)))) throw new FailedPredicateException(this, "!$modifierAndDefSet.contains($KW_DEF.text)", createErrorMessageForStrictCheck(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null)));
							_localctx.modifierAndDefSet.add((((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null));
							}
							break;
						case NL:
							{
							setState(482);
							match(NL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(488);
					genericClassNameExpression();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(491);
				genericClassNameExpression();
				}
				break;
			}
			setState(494);
			singleDeclaration();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(496);
					match(NL);
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
				singleDeclaration();
				}
				}
				setState(507);
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

	public static class DeclarationRuleContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TerminalNode KW_DEF() { return getToken(GroovyParser.KW_DEF, 0); }
		public TupleDeclarationContext tupleDeclaration() {
			return getRuleContext(TupleDeclarationContext.class,0);
		}
		public List<AnnotationClauseContext> annotationClause() {
			return getRuleContexts(AnnotationClauseContext.class);
		}
		public AnnotationClauseContext annotationClause(int i) {
			return getRuleContext(AnnotationClauseContext.class,i);
		}
		public TerminalNode KW_FINAL() { return getToken(GroovyParser.KW_FINAL, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public DeclarationRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDeclarationRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDeclarationRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDeclarationRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationRuleContext declarationRule() throws RecognitionException {
		DeclarationRuleContext _localctx = new DeclarationRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(508);
				fieldDeclaration();
				}
				break;
			case 2:
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(509);
					annotationClause();
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(510);
						match(NL);
						}
						}
						setState(515);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FINAL) {
					{
					setState(521);
					match(KW_FINAL);
					}
				}

				setState(524);
				match(KW_DEF);
				setState(525);
				tupleDeclaration();
				}
				break;
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

	public static class ObjectInitializerContext extends ParserRuleContext {
		public BlockStatementWithCurveContext blockStatementWithCurve() {
			return getRuleContext(BlockStatementWithCurveContext.class,0);
		}
		public ObjectInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterObjectInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitObjectInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitObjectInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInitializerContext objectInitializer() throws RecognitionException {
		ObjectInitializerContext _localctx = new ObjectInitializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objectInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			blockStatementWithCurve();
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

	public static class ClassInitializerContext extends ParserRuleContext {
		public TerminalNode KW_STATIC() { return getToken(GroovyParser.KW_STATIC, 0); }
		public BlockStatementWithCurveContext blockStatementWithCurve() {
			return getRuleContext(BlockStatementWithCurveContext.class,0);
		}
		public ClassInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInitializerContext classInitializer() throws RecognitionException {
		ClassInitializerContext _localctx = new ClassInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(KW_STATIC);
			setState(531);
			blockStatementWithCurve();
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public TerminalNode KW_DEF() { return getToken(GroovyParser.KW_DEF, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(533);
				genericClassNameExpression();
				}
				break;
			case 2:
				{
				setState(534);
				match(KW_DEF);
				}
				break;
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

	public static class AnnotationClauseContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(GroovyParser.AT, 0); }
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public AnnotationElementContext annotationElement() {
			return getRuleContext(AnnotationElementContext.class,0);
		}
		public List<AnnotationElementPairContext> annotationElementPair() {
			return getRuleContexts(AnnotationElementPairContext.class);
		}
		public AnnotationElementPairContext annotationElementPair(int i) {
			return getRuleContext(AnnotationElementPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public AnnotationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationClauseContext annotationClause() throws RecognitionException {
		AnnotationClauseContext _localctx = new AnnotationClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_annotationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(AT);
			setState(538);
			genericClassNameExpression();
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(539);
				match(LPAREN);
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					{
					setState(540);
					annotationElementPair();
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(541);
						match(COMMA);
						setState(542);
						annotationElementPair();
						}
						}
						setState(547);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 2:
					{
					setState(548);
					annotationElement();
					}
					break;
				}
				setState(551);
				match(RPAREN);
				}
				break;
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

	public static class AnnotationElementPairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public AnnotationElementContext annotationElement() {
			return getRuleContext(AnnotationElementContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public AnnotationElementPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationElementPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationElementPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationElementPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationElementPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationElementPairContext annotationElementPair() throws RecognitionException {
		AnnotationElementPairContext _localctx = new AnnotationElementPairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_annotationElementPair);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(IDENTIFIER);
			setState(555);
			match(ASSIGN);
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(NL);
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(562);
			annotationElement();
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

	public static class AnnotationElementContext extends ParserRuleContext {
		public AnnotationParameterContext annotationParameter() {
			return getRuleContext(AnnotationParameterContext.class,0);
		}
		public AnnotationClauseContext annotationClause() {
			return getRuleContext(AnnotationClauseContext.class,0);
		}
		public AnnotationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationElementContext annotationElement() throws RecognitionException {
		AnnotationElementContext _localctx = new AnnotationElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_annotationElement);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				annotationParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				annotationClause();
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

	public static class GenericDeclarationListContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<GenericsDeclarationElementContext> genericsDeclarationElement() {
			return getRuleContexts(GenericsDeclarationElementContext.class);
		}
		public GenericsDeclarationElementContext genericsDeclarationElement(int i) {
			return getRuleContext(GenericsDeclarationElementContext.class,i);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public GenericDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGenericDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGenericDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGenericDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDeclarationListContext genericDeclarationList() throws RecognitionException {
		GenericDeclarationListContext _localctx = new GenericDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_genericDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(LT);
			setState(569);
			genericsDeclarationElement();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(570);
				match(COMMA);
				setState(571);
				genericsDeclarationElement();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			match(GT);
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

	public static class GenericsDeclarationElementContext extends ParserRuleContext {
		public List<GenericClassNameExpressionContext> genericClassNameExpression() {
			return getRuleContexts(GenericClassNameExpressionContext.class);
		}
		public GenericClassNameExpressionContext genericClassNameExpression(int i) {
			return getRuleContext(GenericClassNameExpressionContext.class,i);
		}
		public TerminalNode KW_EXTENDS() { return getToken(GroovyParser.KW_EXTENDS, 0); }
		public List<TerminalNode> BAND() { return getTokens(GroovyParser.BAND); }
		public TerminalNode BAND(int i) {
			return getToken(GroovyParser.BAND, i);
		}
		public GenericsDeclarationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsDeclarationElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGenericsDeclarationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGenericsDeclarationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGenericsDeclarationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsDeclarationElementContext genericsDeclarationElement() throws RecognitionException {
		GenericsDeclarationElementContext _localctx = new GenericsDeclarationElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_genericsDeclarationElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			genericClassNameExpression();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTENDS) {
				{
				setState(580);
				match(KW_EXTENDS);
				setState(581);
				genericClassNameExpression();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BAND) {
					{
					{
					setState(582);
					match(BAND);
					setState(583);
					genericClassNameExpression();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ThrowsClauseContext extends ParserRuleContext {
		public TerminalNode KW_THROWS() { return getToken(GroovyParser.KW_THROWS, 0); }
		public List<ClassNameExpressionContext> classNameExpression() {
			return getRuleContexts(ClassNameExpressionContext.class);
		}
		public ClassNameExpressionContext classNameExpression(int i) {
			return getRuleContext(ClassNameExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ThrowsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThrowsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThrowsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThrowsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowsClauseContext throwsClause() throws RecognitionException {
		ThrowsClauseContext _localctx = new ThrowsClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_throwsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(KW_THROWS);
			setState(592);
			classNameExpression();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				classNameExpression();
				}
				}
				setState(599);
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

	public static class ArgumentDeclarationListContext extends ParserRuleContext {
		public List<ArgumentDeclarationContext> argumentDeclaration() {
			return getRuleContexts(ArgumentDeclarationContext.class);
		}
		public ArgumentDeclarationContext argumentDeclaration(int i) {
			return getRuleContext(ArgumentDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ArgumentDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDeclarationListContext argumentDeclarationList() throws RecognitionException {
		ArgumentDeclarationListContext _localctx = new ArgumentDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argumentDeclarationList);
		try {
			int _alt;
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(600);
						argumentDeclaration();
						setState(601);
						match(COMMA);
						setState(605);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(602);
								match(NL);
								}
								} 
							}
							setState(607);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
						}
						}
						} 
					}
					setState(612);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				 enableEllipsis(); 
				setState(614);
				argumentDeclaration();
				 disableEllipsis(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public List<AnnotationClauseContext> annotationClause() {
			return getRuleContexts(AnnotationClauseContext.class);
		}
		public AnnotationClauseContext annotationClause(int i) {
			return getRuleContext(AnnotationClauseContext.class,i);
		}
		public TerminalNode KW_FINAL() { return getToken(GroovyParser.KW_FINAL, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ArgumentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentDeclarationContext argumentDeclaration() throws RecognitionException {
		ArgumentDeclarationContext _localctx = new ArgumentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(620);
					annotationClause();
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(626);
				match(KW_FINAL);
				}
				break;
			}
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(629);
				typeDeclaration();
				}
				break;
			}
			setState(632);
			match(IDENTIFIER);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(633);
				match(ASSIGN);
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						match(NL);
						}
						} 
					}
					setState(639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				setState(640);
				expression(0);
				}
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

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GroovyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GroovyParser.SEMICOLON, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(643);
						_la = _input.LA(1);
						if ( !(_la==SEMICOLON || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(646); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						statement();
						setState(650); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(649);
								_la = _input.LA(1);
								if ( !(_la==SEMICOLON || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(652); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
						} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
						}
						} 
					}
					setState(658);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(659);
					statement();
					}
					break;
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON || _la==NL) {
					{
					{
					setState(662);
					_la = _input.LA(1);
					if ( !(_la==SEMICOLON || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				statement();
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(670); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(669);
								_la = _input.LA(1);
								if ( !(_la==SEMICOLON || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(672); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
						} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
						setState(674);
						statement();
						}
						} 
					}
					setState(679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON || _la==NL) {
					{
					{
					setState(680);
					_la = _input.LA(1);
					if ( !(_la==SEMICOLON || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SingleDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSingleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSingleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(IDENTIFIER);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(689);
				match(ASSIGN);
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(690);
						match(NL);
						}
						} 
					}
					setState(695);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(696);
				expression(0);
				}
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

	public static class TupleDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public List<TupleVariableDeclarationContext> tupleVariableDeclaration() {
			return getRuleContexts(TupleVariableDeclarationContext.class);
		}
		public TupleVariableDeclarationContext tupleVariableDeclaration(int i) {
			return getRuleContext(TupleVariableDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public TupleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTupleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTupleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTupleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleDeclarationContext tupleDeclaration() throws RecognitionException {
		TupleDeclarationContext _localctx = new TupleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tupleDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(LPAREN);
			setState(700);
			tupleVariableDeclaration();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(701);
				match(COMMA);
				setState(702);
				tupleVariableDeclaration();
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(708);
			match(RPAREN);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(709);
				match(ASSIGN);
				setState(713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(710);
						match(NL);
						}
						} 
					}
					setState(715);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				setState(716);
				expression(0);
				}
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

	public static class TupleVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public TupleVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTupleVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTupleVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTupleVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleVariableDeclarationContext tupleVariableDeclaration() throws RecognitionException {
		TupleVariableDeclarationContext _localctx = new TupleVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tupleVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(719);
				genericClassNameExpression();
				}
				break;
			}
			setState(722);
			match(IDENTIFIER);
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

	public static class NewInstanceRuleContext extends ParserRuleContext {
		public TerminalNode KW_NEW() { return getToken(GroovyParser.KW_NEW, 0); }
		public ClassNameExpressionContext classNameExpression() {
			return getRuleContext(ClassNameExpressionContext.class,0);
		}
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public NewInstanceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInstanceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewInstanceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewInstanceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewInstanceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInstanceRuleContext newInstanceRule() throws RecognitionException {
		NewInstanceRuleContext _localctx = new NewInstanceRuleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_newInstanceRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(KW_NEW);
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(725);
				classNameExpression();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(726);
					match(LT);
					setState(727);
					match(GT);
					}
				}

				}
				break;
			case 2:
				{
				setState(730);
				genericClassNameExpression();
				}
				break;
			}
			{
			setState(733);
			match(LPAREN);
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(734);
					match(NL);
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(740);
				argumentList();
				}
				break;
			}
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(743);
				match(NL);
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
			match(RPAREN);
			}
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(751);
				classBody(false, null);
				}
				break;
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

	public static class NewArrayRuleContext extends ParserRuleContext {
		public TerminalNode KW_NEW() { return getToken(GroovyParser.KW_NEW, 0); }
		public ClassNameExpressionContext classNameExpression() {
			return getRuleContext(ClassNameExpressionContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(GroovyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(GroovyParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(GroovyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(GroovyParser.RBRACK, i);
		}
		public NewArrayRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArrayRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewArrayRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewArrayRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewArrayRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewArrayRuleContext newArrayRule() throws RecognitionException {
		NewArrayRuleContext _localctx = new NewArrayRuleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_newArrayRule);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(KW_NEW);
			setState(755);
			classNameExpression();
			setState(760); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(756);
					match(LBRACK);
					setState(757);
					expression(0);
					setState(758);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(762); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewArrayStatementContext extends StatementContext {
		public NewArrayRuleContext newArrayRule() {
			return getRuleContext(NewArrayRuleContext.class,0);
		}
		public NewArrayStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewArrayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewArrayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewArrayStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStatementContext extends StatementContext {
		public TerminalNode KW_THROW() { return getToken(GroovyParser.KW_THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForColonStatementContext extends StatementContext {
		public TerminalNode KW_FOR() { return getToken(GroovyParser.KW_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ForColonStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public TerminalNode KW_IF() { return getToken(GroovyParser.KW_IF, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public TerminalNode KW_ELSE() { return getToken(GroovyParser.KW_ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode KW_RETURN() { return getToken(GroovyParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends StatementContext {
		public TerminalNode KW_SWITCH() { return getToken(GroovyParser.KW_SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public TerminalNode LCURVE() { return getToken(GroovyParser.LCURVE, 0); }
		public TerminalNode RCURVE() { return getToken(GroovyParser.RCURVE, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public TerminalNode KW_DEFAULT() { return getToken(GroovyParser.KW_DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GroovyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GroovyParser.SEMICOLON, i);
		}
		public SwitchStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SynchronizedStatementContext extends StatementContext {
		public TerminalNode KW_SYNCHRONIZED() { return getToken(GroovyParser.KW_SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public SynchronizedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationStatementContext extends StatementContext {
		public DeclarationRuleContext declarationRule() {
			return getRuleContext(DeclarationRuleContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode KW_WHILE() { return getToken(GroovyParser.KW_WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ControlStatementContext extends StatementContext {
		public TerminalNode KW_CONTINUE() { return getToken(GroovyParser.KW_CONTINUE, 0); }
		public TerminalNode KW_BREAK() { return getToken(GroovyParser.KW_BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public ControlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewInstanceStatementContext extends StatementContext {
		public NewInstanceRuleContext newInstanceRule() {
			return getRuleContext(NewInstanceRuleContext.class,0);
		}
		public NewInstanceStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewInstanceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewInstanceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewInstanceStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertStatementContext extends StatementContext {
		public TerminalNode KW_ASSERT() { return getToken(GroovyParser.KW_ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(GroovyParser.COMMA, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public AssertStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryCatchFinallyStatementContext extends StatementContext {
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public TryCatchFinallyStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTryCatchFinallyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTryCatchFinallyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTryCatchFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabeledStatementContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public LabeledStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassicForStatementContext extends StatementContext {
		public TerminalNode KW_FOR() { return getToken(GroovyParser.KW_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GroovyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GroovyParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public DeclarationRuleContext declarationRule() {
			return getRuleContext(DeclarationRuleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ClassicForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassicForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassicForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInStatementContext extends StatementContext {
		public TerminalNode KW_FOR() { return getToken(GroovyParser.KW_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode KW_IN() { return getToken(GroovyParser.KW_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ForInStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				declarationRule();
				}
				break;
			case 2:
				_localctx = new NewArrayStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				newArrayRule();
				}
				break;
			case 3:
				_localctx = new NewInstanceStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				newInstanceRule();
				}
				break;
			case 4:
				_localctx = new ClassicForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				match(KW_FOR);
				setState(768);
				match(LPAREN);
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(769);
					declarationRule();
					}
					break;
				case 2:
					{
					setState(770);
					expression(0);
					}
					break;
				}
				setState(773);
				match(SEMICOLON);
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(774);
					expression(0);
					}
					break;
				}
				setState(777);
				match(SEMICOLON);
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(778);
					expression(0);
					}
					break;
				}
				setState(781);
				match(RPAREN);
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(782);
						match(NL);
						}
						} 
					}
					setState(787);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(788);
				statementBlock();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(789);
				match(KW_FOR);
				setState(790);
				match(LPAREN);
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(791);
					typeDeclaration();
					}
					break;
				}
				setState(794);
				match(IDENTIFIER);
				setState(795);
				match(KW_IN);
				setState(796);
				expression(0);
				setState(797);
				match(RPAREN);
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(798);
						match(NL);
						}
						} 
					}
					setState(803);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				setState(804);
				statementBlock();
				}
				break;
			case 6:
				_localctx = new ForColonStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
				match(KW_FOR);
				setState(807);
				match(LPAREN);
				setState(808);
				typeDeclaration();
				setState(809);
				match(IDENTIFIER);
				setState(810);
				match(COLON);
				setState(811);
				expression(0);
				setState(812);
				match(RPAREN);
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(813);
						match(NL);
						}
						} 
					}
					setState(818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				setState(819);
				statementBlock();
				}
				break;
			case 7:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(821);
				match(KW_IF);
				setState(822);
				match(LPAREN);
				setState(823);
				expression(0);
				setState(824);
				match(RPAREN);
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(825);
						match(NL);
						}
						} 
					}
					setState(830);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(831);
				statementBlock();
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(832);
						match(NL);
						}
						} 
					}
					setState(837);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(838);
					match(KW_ELSE);
					setState(842);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(839);
							match(NL);
							}
							} 
						}
						setState(844);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
					}
					setState(845);
					statementBlock();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(848);
				match(KW_WHILE);
				setState(849);
				match(LPAREN);
				setState(850);
				expression(0);
				setState(851);
				match(RPAREN);
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(852);
						match(NL);
						}
						} 
					}
					setState(857);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				}
				setState(858);
				statementBlock();
				}
				break;
			case 9:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(860);
				match(KW_SWITCH);
				setState(861);
				match(LPAREN);
				setState(862);
				expression(0);
				setState(863);
				match(RPAREN);
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(864);
					match(NL);
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(870);
				match(LCURVE);
				{
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_CASE || _la==NL) {
					{
					setState(873);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_CASE:
						{
						setState(871);
						caseStatement();
						}
						break;
					case NL:
						{
						setState(872);
						match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DEFAULT) {
					{
					setState(878);
					match(KW_DEFAULT);
					setState(879);
					match(COLON);
					setState(885); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(885);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
							case 1:
								{
								setState(880);
								statement();
								setState(881);
								_la = _input.LA(1);
								if ( !(_la==SEMICOLON || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								break;
							case 2:
								{
								setState(883);
								match(SEMICOLON);
								}
								break;
							case 3:
								{
								setState(884);
								match(NL);
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(887); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				setState(891);
				match(RCURVE);
				}
				break;
			case 10:
				_localctx = new TryCatchFinallyStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(893);
				tryBlock();
				setState(903);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CATCH:
					{
					{
					setState(895); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(894);
						catchBlock();
						}
						}
						setState(897); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==KW_CATCH );
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_FINALLY) {
						{
						setState(899);
						finallyBlock();
						}
					}

					}
					}
					break;
				case KW_FINALLY:
					{
					setState(902);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 11:
				_localctx = new ControlStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(905);
				_la = _input.LA(1);
				if ( !(_la==KW_CONTINUE || _la==KW_BREAK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(906);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(909);
				match(KW_RETURN);
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(910);
					expression(0);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(913);
				match(KW_THROW);
				setState(914);
				expression(0);
				}
				break;
			case 14:
				_localctx = new AssertStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(915);
				match(KW_ASSERT);
				setState(916);
				expression(0);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==COLON) {
					{
					setState(917);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==COLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(918);
							match(NL);
							}
							} 
						}
						setState(923);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
					}
					setState(924);
					expression(0);
					}
				}

				}
				break;
			case 15:
				_localctx = new SynchronizedStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(927);
				match(KW_SYNCHRONIZED);
				setState(928);
				match(LPAREN);
				setState(929);
				expression(0);
				setState(930);
				match(RPAREN);
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(931);
						match(NL);
						}
						} 
					}
					setState(936);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				setState(937);
				statementBlock();
				}
				break;
			case 16:
				_localctx = new LabeledStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(939);
				match(IDENTIFIER);
				setState(940);
				match(COLON);
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(941);
						match(NL);
						}
						} 
					}
					setState(946);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				}
				setState(947);
				statementBlock();
				}
				break;
			case 17:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(948);
				expression(0);
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

	public static class BlockStatementWithCurveContext extends ParserRuleContext {
		public TerminalNode LCURVE() { return getToken(GroovyParser.LCURVE, 0); }
		public TerminalNode RCURVE() { return getToken(GroovyParser.RCURVE, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public BlockStatementWithCurveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatementWithCurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBlockStatementWithCurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBlockStatementWithCurve(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBlockStatementWithCurve(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementWithCurveContext blockStatementWithCurve() throws RecognitionException {
		BlockStatementWithCurveContext _localctx = new BlockStatementWithCurveContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_blockStatementWithCurve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(LCURVE);
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(952);
				blockStatement();
				}
				break;
			}
			setState(955);
			match(RCURVE);
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

	public static class StatementBlockContext extends ParserRuleContext {
		public BlockStatementWithCurveContext blockStatementWithCurve() {
			return getRuleContext(BlockStatementWithCurveContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statementBlock);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(957);
				blockStatementWithCurve();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(958);
				statement();
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

	public static class TryBlockContext extends ParserRuleContext {
		public TerminalNode KW_TRY() { return getToken(GroovyParser.KW_TRY, 0); }
		public BlockStatementWithCurveContext blockStatementWithCurve() {
			return getRuleContext(BlockStatementWithCurveContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(KW_TRY);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(962);
				match(NL);
				}
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(968);
			blockStatementWithCurve();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(969);
				match(NL);
				}
				}
				setState(974);
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

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode KW_CATCH() { return getToken(GroovyParser.KW_CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public BlockStatementWithCurveContext blockStatementWithCurve() {
			return getRuleContext(BlockStatementWithCurveContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<ClassNameExpressionContext> classNameExpression() {
			return getRuleContexts(ClassNameExpressionContext.class);
		}
		public ClassNameExpressionContext classNameExpression(int i) {
			return getRuleContext(ClassNameExpressionContext.class,i);
		}
		public List<TerminalNode> BOR() { return getTokens(GroovyParser.BOR); }
		public TerminalNode BOR(int i) {
			return getToken(GroovyParser.BOR, i);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_catchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(KW_CATCH);
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(976);
				match(NL);
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
			match(LPAREN);
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				{
				setState(983);
				classNameExpression();
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOR) {
					{
					{
					setState(984);
					match(BOR);
					setState(985);
					classNameExpression();
					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(991);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				setState(993);
				match(IDENTIFIER);
				}
				break;
			}
			setState(996);
			match(RPAREN);
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(997);
				match(NL);
				}
				}
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1003);
			blockStatementWithCurve();
			setState(1007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1004);
					match(NL);
					}
					} 
				}
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode KW_FINALLY() { return getToken(GroovyParser.KW_FINALLY, 0); }
		public BlockStatementWithCurveContext blockStatementWithCurve() {
			return getRuleContext(BlockStatementWithCurveContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(KW_FINALLY);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1011);
				match(NL);
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
			blockStatementWithCurve();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode KW_CASE() { return getToken(GroovyParser.KW_CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GroovyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GroovyParser.SEMICOLON, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1019);
			match(KW_CASE);
			setState(1020);
			expression(0);
			setState(1021);
			match(COLON);
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1027);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
					case 1:
						{
						setState(1022);
						statement();
						setState(1023);
						_la = _input.LA(1);
						if ( !(_la==SEMICOLON || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(1025);
						match(SEMICOLON);
						}
						break;
					case 3:
						{
						setState(1026);
						match(NL);
						}
						break;
					}
					} 
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
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

	public static class PathExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(GroovyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GroovyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GroovyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GroovyParser.DOT, i);
		}
		public PathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExpressionContext pathExpression() throws RecognitionException {
		PathExpressionContext _localctx = new PathExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_pathExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1032);
					match(IDENTIFIER);
					setState(1033);
					match(DOT);
					}
					} 
				}
				setState(1038);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1039);
			match(IDENTIFIER);
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

	public static class GstringPathExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public List<TerminalNode> GSTRING_PATH_PART() { return getTokens(GroovyParser.GSTRING_PATH_PART); }
		public TerminalNode GSTRING_PATH_PART(int i) {
			return getToken(GroovyParser.GSTRING_PATH_PART, i);
		}
		public GstringPathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringPathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringPathExpressionContext gstringPathExpression() throws RecognitionException {
		GstringPathExpressionContext _localctx = new GstringPathExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_gstringPathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(IDENTIFIER);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GSTRING_PATH_PART) {
				{
				{
				setState(1042);
				match(GSTRING_PATH_PART);
				}
				}
				setState(1047);
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

	public static class ClosureExpressionRuleContext extends ParserRuleContext {
		public TerminalNode LCURVE() { return getToken(GroovyParser.LCURVE, 0); }
		public TerminalNode RCURVE() { return getToken(GroovyParser.RCURVE, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ArgumentDeclarationListContext argumentDeclarationList() {
			return getRuleContext(ArgumentDeclarationListContext.class,0);
		}
		public TerminalNode CLOSURE_ARG_SEPARATOR() { return getToken(GroovyParser.CLOSURE_ARG_SEPARATOR, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ClosureExpressionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureExpressionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClosureExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClosureExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClosureExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureExpressionRuleContext closureExpressionRule() throws RecognitionException {
		ClosureExpressionRuleContext _localctx = new ClosureExpressionRuleContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_closureExpressionRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(LCURVE);
			setState(1052);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1049);
					match(NL);
					}
					} 
				}
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1055);
				argumentDeclarationList();
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1056);
					match(NL);
					}
					}
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1062);
				match(CLOSURE_ARG_SEPARATOR);
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1063);
						match(NL);
						}
						} 
					}
					setState(1068);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				}
				}
				break;
			}
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1071);
				blockStatement();
				}
				break;
			}
			setState(1074);
			match(RCURVE);
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

	public static class GstringExpressionBodyContext extends ParserRuleContext {
		public GstringPathExpressionContext gstringPathExpression() {
			return getRuleContext(GstringPathExpressionContext.class,0);
		}
		public TerminalNode LCURVE() { return getToken(GroovyParser.LCURVE, 0); }
		public TerminalNode RCURVE() { return getToken(GroovyParser.RCURVE, 0); }
		public ClosureExpressionRuleContext closureExpressionRule() {
			return getRuleContext(ClosureExpressionRuleContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GstringExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstringExpressionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringExpressionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringExpressionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringExpressionBodyContext gstringExpressionBody() throws RecognitionException {
		GstringExpressionBodyContext _localctx = new GstringExpressionBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_gstringExpressionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1076);
				gstringPathExpression();
				}
				break;
			case 2:
				{
				setState(1077);
				match(LCURVE);
				setState(1079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1078);
					expression(0);
					}
					break;
				}
				setState(1081);
				match(RCURVE);
				}
				break;
			case 3:
				{
				setState(1082);
				closureExpressionRule();
				}
				break;
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

	public static class GstringContext extends ParserRuleContext {
		public TerminalNode GSTRING_START() { return getToken(GroovyParser.GSTRING_START, 0); }
		public List<GstringExpressionBodyContext> gstringExpressionBody() {
			return getRuleContexts(GstringExpressionBodyContext.class);
		}
		public GstringExpressionBodyContext gstringExpressionBody(int i) {
			return getRuleContext(GstringExpressionBodyContext.class,i);
		}
		public TerminalNode GSTRING_END() { return getToken(GroovyParser.GSTRING_END, 0); }
		public List<TerminalNode> GSTRING_PART() { return getTokens(GroovyParser.GSTRING_PART); }
		public TerminalNode GSTRING_PART(int i) {
			return getToken(GroovyParser.GSTRING_PART, i);
		}
		public GstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GstringContext gstring() throws RecognitionException {
		GstringContext _localctx = new GstringContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_gstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(GSTRING_START);
			setState(1086);
			gstringExpressionBody();
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GSTRING_PART) {
				{
				{
				setState(1087);
				match(GSTRING_PART);
				setState(1088);
				gstringExpressionBody();
				}
				}
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1094);
			match(GSTRING_END);
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

	public static class AnnotationParameterContext extends ParserRuleContext {
		public AnnotationParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationParameter; }
	 
		public AnnotationParameterContext() { }
		public void copyFrom(AnnotationParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnnotationParamClassConstantExpressionContext extends AnnotationParameterContext {
		public ClassConstantRuleContext classConstantRule() {
			return getRuleContext(ClassConstantRuleContext.class,0);
		}
		public AnnotationParamClassConstantExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamClassConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamClassConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamClassConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamStringExpressionContext extends AnnotationParameterContext {
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public AnnotationParamStringExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamNullExpressionContext extends AnnotationParameterContext {
		public TerminalNode KW_NULL() { return getToken(GroovyParser.KW_NULL, 0); }
		public AnnotationParamNullExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamArrayExpressionContext extends AnnotationParameterContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public List<AnnotationParameterContext> annotationParameter() {
			return getRuleContexts(AnnotationParameterContext.class);
		}
		public AnnotationParameterContext annotationParameter(int i) {
			return getRuleContext(AnnotationParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public AnnotationParamArrayExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamBoolExpressionContext extends AnnotationParameterContext {
		public TerminalNode KW_TRUE() { return getToken(GroovyParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(GroovyParser.KW_FALSE, 0); }
		public AnnotationParamBoolExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamIntegerExpressionContext extends AnnotationParameterContext {
		public TerminalNode INTEGER() { return getToken(GroovyParser.INTEGER, 0); }
		public AnnotationParamIntegerExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamClosureExpressionContext extends AnnotationParameterContext {
		public ClosureExpressionRuleContext closureExpressionRule() {
			return getRuleContext(ClosureExpressionRuleContext.class,0);
		}
		public AnnotationParamClosureExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamClosureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamClosureExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamPathExpressionContext extends AnnotationParameterContext {
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public AnnotationParamPathExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamDecimalExpressionContext extends AnnotationParameterContext {
		public TerminalNode DECIMAL() { return getToken(GroovyParser.DECIMAL, 0); }
		public AnnotationParamDecimalExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnnotationParamClassExpressionContext extends AnnotationParameterContext {
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public AnnotationParamClassExpressionContext(AnnotationParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAnnotationParamClassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAnnotationParamClassExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAnnotationParamClassExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationParameterContext annotationParameter() throws RecognitionException {
		AnnotationParameterContext _localctx = new AnnotationParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_annotationParameter);
		int _la;
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				_localctx = new AnnotationParamArrayExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				match(LBRACK);
				setState(1105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1097);
					annotationParameter();
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1098);
						match(COMMA);
						setState(1099);
						annotationParameter();
						}
						}
						setState(1104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1107);
				match(RBRACK);
				}
				break;
			case 2:
				_localctx = new AnnotationParamClassConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
				classConstantRule();
				}
				break;
			case 3:
				_localctx = new AnnotationParamPathExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1109);
				pathExpression();
				}
				break;
			case 4:
				_localctx = new AnnotationParamClassExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1110);
				genericClassNameExpression();
				}
				break;
			case 5:
				_localctx = new AnnotationParamStringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1111);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new AnnotationParamDecimalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1112);
				match(DECIMAL);
				}
				break;
			case 7:
				_localctx = new AnnotationParamIntegerExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1113);
				match(INTEGER);
				}
				break;
			case 8:
				_localctx = new AnnotationParamNullExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1114);
				match(KW_NULL);
				}
				break;
			case 9:
				_localctx = new AnnotationParamBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1115);
				_la = _input.LA(1);
				if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 10:
				_localctx = new AnnotationParamClosureExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1116);
				closureExpressionRule();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmdExpressionContext extends ExpressionContext {
		public NonKwCallExpressionRuleContext n;
		public Token op;
		public CallExpressionRuleContext c;
		public List<NonKwCallExpressionRuleContext> nonKwCallExpressionRule() {
			return getRuleContexts(NonKwCallExpressionRuleContext.class);
		}
		public NonKwCallExpressionRuleContext nonKwCallExpressionRule(int i) {
			return getRuleContext(NonKwCallExpressionRuleContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallExpressionRuleContext callExpressionRule() {
			return getRuleContext(CallExpressionRuleContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public TerminalNode SAFE_DOT() { return getToken(GroovyParser.SAFE_DOT, 0); }
		public TerminalNode STAR_DOT() { return getToken(GroovyParser.STAR_DOT, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public GenericDeclarationListContext genericDeclarationList() {
			return getRuleContext(GenericDeclarationListContext.class,0);
		}
		public CmdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCmdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCmdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCmdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpreadExpressionContext extends ExpressionContext {
		public TerminalNode MULT() { return getToken(GroovyParser.MULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpreadExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSpreadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSpreadExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSpreadExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GroovyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GroovyParser.IDENTIFIER, i);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(GroovyParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public TerminalNode PLUS_ASSIGN() { return getToken(GroovyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(GroovyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(GroovyParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GroovyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GroovyParser.MOD_ASSIGN, 0); }
		public TerminalNode BAND_ASSIGN() { return getToken(GroovyParser.BAND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GroovyParser.XOR_ASSIGN, 0); }
		public TerminalNode BOR_ASSIGN() { return getToken(GroovyParser.BOR_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(GroovyParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(GroovyParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode RUSHIFT_ASSIGN() { return getToken(GroovyParser.RUSHIFT_ASSIGN, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperExpressionContext extends ExpressionContext {
		public TerminalNode KW_SUPER() { return getToken(GroovyParser.KW_SUPER, 0); }
		public SuperExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSuperExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSuperExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSuperExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstructorCallExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public TerminalNode KW_THIS() { return getToken(GroovyParser.KW_THIS, 0); }
		public TerminalNode KW_SUPER() { return getToken(GroovyParser.KW_SUPER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ConstructorCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConstructorCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConstructorCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConstructorCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(GroovyParser.POWER, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public TerminalNode MULT() { return getToken(GroovyParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GroovyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(GroovyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(GroovyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GroovyParser.MINUS, 0); }
		public TerminalNode RANGE() { return getToken(GroovyParser.RANGE, 0); }
		public TerminalNode ORANGE() { return getToken(GroovyParser.ORANGE, 0); }
		public TerminalNode LSHIFT() { return getToken(GroovyParser.LSHIFT, 0); }
		public List<TerminalNode> GT() { return getTokens(GroovyParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(GroovyParser.GT, i);
		}
		public TerminalNode KW_IN() { return getToken(GroovyParser.KW_IN, 0); }
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public TerminalNode LTE() { return getToken(GroovyParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(GroovyParser.GTE, 0); }
		public TerminalNode EQUAL() { return getToken(GroovyParser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(GroovyParser.UNEQUAL, 0); }
		public TerminalNode SPACESHIP() { return getToken(GroovyParser.SPACESHIP, 0); }
		public TerminalNode FIND() { return getToken(GroovyParser.FIND, 0); }
		public TerminalNode MATCH() { return getToken(GroovyParser.MATCH, 0); }
		public TerminalNode BAND() { return getToken(GroovyParser.BAND, 0); }
		public TerminalNode XOR() { return getToken(GroovyParser.XOR, 0); }
		public TerminalNode BOR() { return getToken(GroovyParser.BOR, 0); }
		public TerminalNode AND() { return getToken(GroovyParser.AND, 0); }
		public TerminalNode OR() { return getToken(GroovyParser.OR, 0); }
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(GroovyParser.KW_AS, 0); }
		public TerminalNode KW_INSTANCEOF() { return getToken(GroovyParser.KW_INSTANCEOF, 0); }
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public CallRuleContext callRule() {
			return getRuleContext(CallRuleContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(GroovyParser.DECREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(GroovyParser.INCREMENT, 0); }
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessExpressionContext extends ExpressionContext {
		public ExpressionContext e;
		public Token op;
		public ExpressionContext mne;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public TerminalNode SAFE_DOT() { return getToken(GroovyParser.SAFE_DOT, 0); }
		public TerminalNode STAR_DOT() { return getToken(GroovyParser.STAR_DOT, 0); }
		public TerminalNode ATTR_DOT() { return getToken(GroovyParser.ATTR_DOT, 0); }
		public TerminalNode MEMBER_POINTER() { return getToken(GroovyParser.MEMBER_POINTER, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public FieldAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterFieldAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitFieldAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitFieldAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpressionContext extends ExpressionContext {
		public AtomExpressionRuleContext atomExpressionRule() {
			return getRuleContext(AtomExpressionRuleContext.class,0);
		}
		public AtomExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitAtomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode KW_THIS() { return getToken(GroovyParser.KW_THIS, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(GroovyParser.NOT, 0); }
		public TerminalNode BNOT() { return getToken(GroovyParser.BNOT, 0); }
		public TerminalNode PLUS() { return getToken(GroovyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GroovyParser.MINUS, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public TerminalNode ELVIS() { return getToken(GroovyParser.ELVIS, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(GroovyParser.DECREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(GroovyParser.INCREMENT, 0); }
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				_localctx = new AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1120);
				atomExpressionRule();
				}
				break;
			case 2:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1121);
				match(KW_THIS);
				}
				break;
			case 3:
				{
				_localctx = new SuperExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1122);
				match(KW_SUPER);
				}
				break;
			case 4:
				{
				_localctx = new ConstructorCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1123);
				_la = _input.LA(1);
				if ( !(_la==KW_SUPER || _la==KW_THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1124);
				match(LPAREN);
				setState(1126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1125);
					argumentList();
					}
					break;
				}
				setState(1128);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new SpreadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1129);
				match(MULT);
				setState(1130);
				expression(29);
				}
				break;
			case 6:
				{
				_localctx = new CmdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1131);
				((CmdExpressionContext)_localctx).n = nonKwCallExpressionRule();
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1132);
						nonKwCallExpressionRule();
						}
						} 
					}
					setState(1137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1138);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(1139);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(1140);
					gstring();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new CallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1143);
				callRule();
				}
				break;
			case 8:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1144);
				match(LPAREN);
				setState(1145);
				genericClassNameExpression();
				setState(1146);
				match(RPAREN);
				setState(1147);
				expression(23);
				}
				break;
			case 9:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1149);
				match(LPAREN);
				setState(1150);
				expression(0);
				setState(1151);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1153);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==BNOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1154);
				expression(21);
				}
				break;
			case 11:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1155);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1156);
				expression(19);
				}
				break;
			case 12:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1157);
				_la = _input.LA(1);
				if ( !(_la==DECREMENT || _la==INCREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1158);
				expression(18);
				}
				break;
			case 13:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1159);
				match(LPAREN);
				setState(1160);
				match(IDENTIFIER);
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1161);
					match(COMMA);
					setState(1162);
					match(IDENTIFIER);
					}
					}
					setState(1167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1168);
				match(RPAREN);
				setState(1169);
				match(ASSIGN);
				setState(1173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1170);
						match(NL);
						}
						} 
					}
					setState(1175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				setState(1176);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1179);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1180);
						match(POWER);
						setState(1184);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1181);
								match(NL);
								}
								} 
							}
							setState(1186);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
						}
						setState(1187);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1188);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1189);
						_la = _input.LA(1);
						if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (MULT - 95)) | (1L << (DIV - 95)) | (1L << (MOD - 95)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1193);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1190);
								match(NL);
								}
								} 
							}
							setState(1195);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
						}
						setState(1196);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1197);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1198);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1202);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1199);
								match(NL);
								}
								} 
							}
							setState(1204);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
						}
						setState(1205);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1206);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1207);
						_la = _input.LA(1);
						if ( !(_la==RANGE || _la==ORANGE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1211);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1208);
								match(NL);
								}
								} 
							}
							setState(1213);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
						}
						setState(1214);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1215);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1222);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1216);
							match(LSHIFT);
							}
							break;
						case 2:
							{
							setState(1217);
							match(GT);
							setState(1218);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1219);
							match(GT);
							setState(1220);
							match(GT);
							setState(1221);
							match(GT);
							}
							break;
						}
						setState(1227);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1224);
								match(NL);
								}
								} 
							}
							setState(1229);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
						}
						setState(1230);
						expression(15);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1231);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1232);
						match(KW_IN);
						setState(1236);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1233);
								match(NL);
								}
								} 
							}
							setState(1238);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
						}
						setState(1239);
						expression(14);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1240);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1241);
						_la = _input.LA(1);
						if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LTE - 61)) | (1L << (GTE - 61)) | (1L << (LT - 61)) | (1L << (GT - 61)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1245);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1242);
								match(NL);
								}
								} 
							}
							setState(1247);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
						}
						setState(1248);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1249);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1250);
						_la = _input.LA(1);
						if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (SPACESHIP - 55)) | (1L << (EQUAL - 55)) | (1L << (UNEQUAL - 55)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1254);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1251);
								match(NL);
								}
								} 
							}
							setState(1256);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
						}
						setState(1257);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1258);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1259);
						_la = _input.LA(1);
						if ( !(_la==MATCH || _la==FIND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1263);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1260);
								match(NL);
								}
								} 
							}
							setState(1265);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
						}
						setState(1266);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1267);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1268);
						match(BAND);
						setState(1272);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1269);
								match(NL);
								}
								} 
							}
							setState(1274);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
						}
						setState(1275);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1276);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1277);
						match(XOR);
						setState(1281);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1278);
								match(NL);
								}
								} 
							}
							setState(1283);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
						}
						setState(1284);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1285);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1286);
						match(BOR);
						setState(1290);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1287);
								match(NL);
								}
								} 
							}
							setState(1292);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
						}
						setState(1293);
						expression(7);
						}
						break;
					case 13:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1294);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1295);
							match(NL);
							}
							}
							setState(1300);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1301);
						match(AND);
						setState(1305);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1302);
								match(NL);
								}
								} 
							}
							setState(1307);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
						}
						setState(1308);
						expression(6);
						}
						break;
					case 14:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1309);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1313);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1310);
							match(NL);
							}
							}
							setState(1315);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1316);
						match(OR);
						setState(1320);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1317);
								match(NL);
								}
								} 
							}
							setState(1322);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
						}
						setState(1323);
						expression(5);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1324);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1328);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1325);
							match(NL);
							}
							}
							setState(1330);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1348);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case QUESTION:
							{
							setState(1331);
							match(QUESTION);
							setState(1335);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
							while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1332);
									match(NL);
									}
									} 
								}
								setState(1337);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
							}
							setState(1338);
							expression(0);
							setState(1342);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NL) {
								{
								{
								setState(1339);
								match(NL);
								}
								}
								setState(1344);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1345);
							match(COLON);
							}
							break;
						case ELVIS:
							{
							setState(1347);
							match(ELVIS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1353);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1350);
								match(NL);
								}
								} 
							}
							setState(1355);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
						}
						setState(1356);
						expression(3);
						}
						break;
					case 16:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1357);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1358);
						_la = _input.LA(1);
						if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (RUSHIFT_ASSIGN - 52)) | (1L << (RSHIFT_ASSIGN - 52)) | (1L << (LSHIFT_ASSIGN - 52)) | (1L << (PLUS_ASSIGN - 52)) | (1L << (MINUS_ASSIGN - 52)) | (1L << (MULT_ASSIGN - 52)) | (1L << (DIV_ASSIGN - 52)) | (1L << (MOD_ASSIGN - 52)) | (1L << (BAND_ASSIGN - 52)) | (1L << (XOR_ASSIGN - 52)) | (1L << (BOR_ASSIGN - 52)) | (1L << (ASSIGN - 52)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1362);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1359);
								match(NL);
								}
								} 
							}
							setState(1364);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
						}
						setState(1365);
						expression(2);
						}
						break;
					case 17:
						{
						_localctx = new FieldAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((FieldAccessExpressionContext)_localctx).e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1366);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1370);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1367);
							match(NL);
							}
							}
							setState(1372);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1373);
						((FieldAccessExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (SAFE_DOT - 57)) | (1L << (STAR_DOT - 57)) | (1L << (ATTR_DOT - 57)) | (1L << (MEMBER_POINTER - 57)) | (1L << (DOT - 57)))) != 0)) ) {
							((FieldAccessExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1381);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case KW_CLASS:
						case KW_INTERFACE:
						case KW_TRAIT:
						case KW_ENUM:
						case KW_PACKAGE:
						case KW_IMPORT:
						case KW_EXTENDS:
						case KW_IMPLEMENTS:
						case KW_DEF:
						case KW_NULL:
						case KW_TRUE:
						case KW_FALSE:
						case KW_NEW:
						case KW_SUPER:
						case KW_THIS:
						case KW_IN:
						case KW_FOR:
						case KW_IF:
						case KW_ELSE:
						case KW_DO:
						case KW_WHILE:
						case KW_SWITCH:
						case KW_CASE:
						case KW_DEFAULT:
						case KW_CONTINUE:
						case KW_BREAK:
						case KW_RETURN:
						case KW_TRY:
						case KW_CATCH:
						case KW_FINALLY:
						case KW_THROW:
						case KW_THROWS:
						case KW_ASSERT:
						case KW_CONST:
						case KW_GOTO:
						case KW_AS:
						case KW_INSTANCEOF:
						case BUILT_IN_TYPE:
						case VISIBILITY_MODIFIER:
						case KW_ABSTRACT:
						case KW_STATIC:
						case KW_FINAL:
						case KW_TRANSIENT:
						case KW_NATIVE:
						case KW_VOLATILE:
						case KW_SYNCHRONIZED:
						case KW_STRICTFP:
						case KW_THREADSAFE:
						case IDENTIFIER:
							{
							setState(1374);
							selectorName();
							}
							break;
						case STRING:
							{
							setState(1375);
							match(STRING);
							}
							break;
						case GSTRING_START:
							{
							setState(1376);
							gstring();
							}
							break;
						case LPAREN:
							{
							setState(1377);
							match(LPAREN);
							setState(1378);
							((FieldAccessExpressionContext)_localctx).mne = expression(0);
							setState(1379);
							match(RPAREN);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 18:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1383);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1384);
						_la = _input.LA(1);
						if ( !(_la==DECREMENT || _la==INCREMENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 19:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1385);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1386);
						match(LBRACK);
						setState(1395);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1387);
							expression(0);
							setState(1392);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(1388);
								match(COMMA);
								setState(1389);
								expression(0);
								}
								}
								setState(1394);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						}
						setState(1397);
						match(RBRACK);
						}
						break;
					case 20:
						{
						_localctx = new CmdExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1398);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1402);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1399);
							match(NL);
							}
							}
							setState(1404);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1405);
						((CmdExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (SAFE_DOT - 57)) | (1L << (STAR_DOT - 57)) | (1L << (DOT - 57)))) != 0)) ) {
							((CmdExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1409);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1406);
								match(NL);
								}
								} 
							}
							setState(1411);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
						}
						setState(1413);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
						case 1:
							{
							setState(1412);
							genericDeclarationList();
							}
							break;
						}
						setState(1415);
						((CmdExpressionContext)_localctx).c = callExpressionRule();
						setState(1419);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1416);
								nonKwCallExpressionRule();
								}
								} 
							}
							setState(1421);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
						}
						setState(1425);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
						case 1:
							{
							setState(1422);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1423);
							match(STRING);
							}
							break;
						case 3:
							{
							setState(1424);
							gstring();
							}
							break;
						}
						}
						break;
					case 21:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1427);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1428);
						_la = _input.LA(1);
						if ( !(_la==KW_AS || _la==KW_INSTANCEOF) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1432);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1429);
								match(NL);
								}
								} 
							}
							setState(1434);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
						}
						setState(1435);
						genericClassNameExpression();
						}
						break;
					}
					} 
				}
				setState(1440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomExpressionRuleContext extends ParserRuleContext {
		public AtomExpressionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpressionRule; }
	 
		public AtomExpressionRuleContext() { }
		public void copyFrom(AtomExpressionRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GstringExpressionContext extends AtomExpressionRuleContext {
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public GstringExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGstringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGstringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGstringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListConstructorContext extends AtomExpressionRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public ListConstructorContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterListConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitListConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitListConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExpressionContext extends AtomExpressionRuleContext {
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public ConstantExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends AtomExpressionRuleContext {
		public TerminalNode KW_TRUE() { return getToken(GroovyParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(GroovyParser.KW_FALSE, 0); }
		public BoolExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDecimalExpressionContext extends AtomExpressionRuleContext {
		public TerminalNode DECIMAL() { return getToken(GroovyParser.DECIMAL, 0); }
		public ConstantDecimalExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConstantDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConstantDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConstantDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewInstanceExpressionContext extends AtomExpressionRuleContext {
		public NewInstanceRuleContext newInstanceRule() {
			return getRuleContext(NewInstanceRuleContext.class,0);
		}
		public NewInstanceExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewInstanceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewInstanceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewInstanceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends AtomExpressionRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public VariableExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassConstantExpressionContext extends AtomExpressionRuleContext {
		public ClassConstantRuleContext classConstantRule() {
			return getRuleContext(ClassConstantRuleContext.class,0);
		}
		public ClassConstantExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends AtomExpressionRuleContext {
		public TerminalNode KW_NULL() { return getToken(GroovyParser.KW_NULL, 0); }
		public NullExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosureExpressionContext extends AtomExpressionRuleContext {
		public ClosureExpressionRuleContext closureExpressionRule() {
			return getRuleContext(ClosureExpressionRuleContext.class,0);
		}
		public ClosureExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClosureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClosureExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapConstructorContext extends AtomExpressionRuleContext {
		public TerminalNode LBRACK() { return getToken(GroovyParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(GroovyParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public MapConstructorContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewArrayExpressionContext extends AtomExpressionRuleContext {
		public NewArrayRuleContext newArrayRule() {
			return getRuleContext(NewArrayRuleContext.class,0);
		}
		public NewArrayExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNewArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNewArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNewArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantIntegerExpressionContext extends AtomExpressionRuleContext {
		public TerminalNode INTEGER() { return getToken(GroovyParser.INTEGER, 0); }
		public ConstantIntegerExpressionContext(AtomExpressionRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterConstantIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitConstantIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitConstantIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpressionRuleContext atomExpressionRule() throws RecognitionException {
		AtomExpressionRuleContext _localctx = new AtomExpressionRuleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_atomExpressionRule);
		int _la;
		try {
			int _alt;
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				_localctx = new ConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1441);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new GstringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				gstring();
				}
				break;
			case 3:
				_localctx = new ConstantDecimalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1443);
				match(DECIMAL);
				}
				break;
			case 4:
				_localctx = new ConstantIntegerExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1444);
				match(INTEGER);
				}
				break;
			case 5:
				_localctx = new NullExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1445);
				match(KW_NULL);
				}
				break;
			case 6:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1446);
				_la = _input.LA(1);
				if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1447);
				match(IDENTIFIER);
				}
				break;
			case 8:
				_localctx = new ClassConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1448);
				classConstantRule();
				}
				break;
			case 9:
				_localctx = new ClosureExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1449);
				closureExpressionRule();
				}
				break;
			case 10:
				_localctx = new ListConstructorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1450);
				match(LBRACK);
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1451);
						match(NL);
						}
						} 
					}
					setState(1456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1457);
					expression(0);
					setState(1480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1461);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NL) {
								{
								{
								setState(1458);
								match(NL);
								}
								}
								setState(1463);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1464);
							match(COMMA);
							setState(1468);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
							while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1465);
									match(NL);
									}
									} 
								}
								setState(1470);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
							}
							setState(1471);
							expression(0);
							setState(1475);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
							while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1472);
									match(NL);
									}
									} 
								}
								setState(1477);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
							}
							}
							} 
						}
						setState(1482);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
					}
					setState(1484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1483);
						match(COMMA);
						}
					}

					}
					break;
				}
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1488);
					match(NL);
					}
					}
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1494);
				match(RBRACK);
				}
				break;
			case 11:
				_localctx = new MapConstructorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1495);
				match(LBRACK);
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1496);
					match(NL);
					}
					}
					setState(1501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1538);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLON:
					{
					setState(1502);
					match(COLON);
					setState(1506);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1503);
							match(NL);
							}
							} 
						}
						setState(1508);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
					}
					}
					break;
				case LPAREN:
				case STRING:
				case GSTRING_START:
				case DECIMAL:
				case INTEGER:
				case KW_CLASS:
				case KW_INTERFACE:
				case KW_TRAIT:
				case KW_ENUM:
				case KW_PACKAGE:
				case KW_IMPORT:
				case KW_EXTENDS:
				case KW_IMPLEMENTS:
				case KW_DEF:
				case KW_NULL:
				case KW_TRUE:
				case KW_FALSE:
				case KW_NEW:
				case KW_SUPER:
				case KW_THIS:
				case KW_IN:
				case KW_FOR:
				case KW_IF:
				case KW_ELSE:
				case KW_DO:
				case KW_WHILE:
				case KW_SWITCH:
				case KW_CASE:
				case KW_DEFAULT:
				case KW_CONTINUE:
				case KW_BREAK:
				case KW_RETURN:
				case KW_TRY:
				case KW_CATCH:
				case KW_FINALLY:
				case KW_THROW:
				case KW_THROWS:
				case KW_ASSERT:
				case KW_CONST:
				case KW_GOTO:
				case MULT:
				case KW_AS:
				case KW_INSTANCEOF:
				case BUILT_IN_TYPE:
				case VISIBILITY_MODIFIER:
				case KW_ABSTRACT:
				case KW_STATIC:
				case KW_FINAL:
				case KW_TRANSIENT:
				case KW_NATIVE:
				case KW_VOLATILE:
				case KW_SYNCHRONIZED:
				case KW_STRICTFP:
				case KW_THREADSAFE:
				case IDENTIFIER:
					{
					{
					setState(1509);
					mapEntry();
					setState(1532);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1513);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NL) {
								{
								{
								setState(1510);
								match(NL);
								}
								}
								setState(1515);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1516);
							match(COMMA);
							setState(1520);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==NL) {
								{
								{
								setState(1517);
								match(NL);
								}
								}
								setState(1522);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1523);
							mapEntry();
							setState(1527);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
							while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(1524);
									match(NL);
									}
									} 
								}
								setState(1529);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
							}
							}
							} 
						}
						setState(1534);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
					}
					}
					setState(1536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1535);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1540);
					match(NL);
					}
					}
					setState(1545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1546);
				match(RBRACK);
				}
				break;
			case 12:
				_localctx = new NewArrayExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1547);
				newArrayRule();
				}
				break;
			case 13:
				_localctx = new NewInstanceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1548);
				newInstanceRule();
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

	public static class ClassConstantRuleContext extends ParserRuleContext {
		public ClassNameExpressionContext classNameExpression() {
			return getRuleContext(ClassNameExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(GroovyParser.DOT, 0); }
		public TerminalNode KW_CLASS() { return getToken(GroovyParser.KW_CLASS, 0); }
		public ClassConstantRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstantRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassConstantRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassConstantRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassConstantRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstantRuleContext classConstantRule() throws RecognitionException {
		ClassConstantRuleContext _localctx = new ClassConstantRuleContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classConstantRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			classNameExpression();
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1552);
				match(DOT);
				setState(1553);
				match(KW_CLASS);
				}
				break;
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

	public static class ArgumentListRuleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<ClosureExpressionRuleContext> closureExpressionRule() {
			return getRuleContexts(ClosureExpressionRuleContext.class);
		}
		public ClosureExpressionRuleContext closureExpressionRule(int i) {
			return getRuleContext(ClosureExpressionRuleContext.class,i);
		}
		public ArgumentListRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentListRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentListRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentListRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentListRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListRuleContext argumentListRule() throws RecognitionException {
		ArgumentListRuleContext _localctx = new ArgumentListRuleContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_argumentListRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(LPAREN);
			setState(1560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1557);
					match(NL);
					}
					} 
				}
				setState(1562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1563);
				argumentList();
				}
				break;
			}
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1566);
				match(NL);
				}
				}
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1572);
			match(RPAREN);
			setState(1576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1573);
					closureExpressionRule();
					}
					} 
				}
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
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

	public static class CallExpressionRuleContext extends ParserRuleContext {
		public ExpressionContext mne;
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ArgumentListRuleContext> argumentListRule() {
			return getRuleContexts(ArgumentListRuleContext.class);
		}
		public ArgumentListRuleContext argumentListRule(int i) {
			return getRuleContext(ArgumentListRuleContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallExpressionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpressionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCallExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCallExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCallExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionRuleContext callExpressionRule() throws RecognitionException {
		CallExpressionRuleContext _localctx = new CallExpressionRuleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_callExpressionRule);
		try {
			int _alt;
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1586);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CLASS:
				case KW_INTERFACE:
				case KW_TRAIT:
				case KW_ENUM:
				case KW_PACKAGE:
				case KW_IMPORT:
				case KW_EXTENDS:
				case KW_IMPLEMENTS:
				case KW_DEF:
				case KW_NULL:
				case KW_TRUE:
				case KW_FALSE:
				case KW_NEW:
				case KW_SUPER:
				case KW_THIS:
				case KW_IN:
				case KW_FOR:
				case KW_IF:
				case KW_ELSE:
				case KW_DO:
				case KW_WHILE:
				case KW_SWITCH:
				case KW_CASE:
				case KW_DEFAULT:
				case KW_CONTINUE:
				case KW_BREAK:
				case KW_RETURN:
				case KW_TRY:
				case KW_CATCH:
				case KW_FINALLY:
				case KW_THROW:
				case KW_THROWS:
				case KW_ASSERT:
				case KW_CONST:
				case KW_GOTO:
				case KW_AS:
				case KW_INSTANCEOF:
				case BUILT_IN_TYPE:
				case VISIBILITY_MODIFIER:
				case KW_ABSTRACT:
				case KW_STATIC:
				case KW_FINAL:
				case KW_TRANSIENT:
				case KW_NATIVE:
				case KW_VOLATILE:
				case KW_SYNCHRONIZED:
				case KW_STRICTFP:
				case KW_THREADSAFE:
				case IDENTIFIER:
					{
					setState(1579);
					selectorName();
					}
					break;
				case STRING:
					{
					setState(1580);
					match(STRING);
					}
					break;
				case GSTRING_START:
					{
					setState(1581);
					gstring();
					}
					break;
				case LPAREN:
					{
					setState(1582);
					match(LPAREN);
					setState(1583);
					((CallExpressionRuleContext)_localctx).mne = expression(0);
					setState(1584);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1589); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1588);
						argumentListRule();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1591); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				if (!( !GrammarPredicates.isFollowedByLPAREN(_input) )) throw new FailedPredicateException(this, " !GrammarPredicates.isFollowedByLPAREN(_input) ");
				setState(1601);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CLASS:
				case KW_INTERFACE:
				case KW_TRAIT:
				case KW_ENUM:
				case KW_PACKAGE:
				case KW_IMPORT:
				case KW_EXTENDS:
				case KW_IMPLEMENTS:
				case KW_DEF:
				case KW_NULL:
				case KW_TRUE:
				case KW_FALSE:
				case KW_NEW:
				case KW_SUPER:
				case KW_THIS:
				case KW_IN:
				case KW_FOR:
				case KW_IF:
				case KW_ELSE:
				case KW_DO:
				case KW_WHILE:
				case KW_SWITCH:
				case KW_CASE:
				case KW_DEFAULT:
				case KW_CONTINUE:
				case KW_BREAK:
				case KW_RETURN:
				case KW_TRY:
				case KW_CATCH:
				case KW_FINALLY:
				case KW_THROW:
				case KW_THROWS:
				case KW_ASSERT:
				case KW_CONST:
				case KW_GOTO:
				case KW_AS:
				case KW_INSTANCEOF:
				case BUILT_IN_TYPE:
				case VISIBILITY_MODIFIER:
				case KW_ABSTRACT:
				case KW_STATIC:
				case KW_FINAL:
				case KW_TRANSIENT:
				case KW_NATIVE:
				case KW_VOLATILE:
				case KW_SYNCHRONIZED:
				case KW_STRICTFP:
				case KW_THREADSAFE:
				case IDENTIFIER:
					{
					setState(1594);
					selectorName();
					}
					break;
				case STRING:
					{
					setState(1595);
					match(STRING);
					}
					break;
				case GSTRING_START:
					{
					setState(1596);
					gstring();
					}
					break;
				case LPAREN:
					{
					setState(1597);
					match(LPAREN);
					setState(1598);
					((CallExpressionRuleContext)_localctx).mne = expression(0);
					setState(1599);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1603);
				argumentList();
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

	public static class NonKwCallExpressionRuleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public List<ArgumentListRuleContext> argumentListRule() {
			return getRuleContexts(ArgumentListRuleContext.class);
		}
		public ArgumentListRuleContext argumentListRule(int i) {
			return getRuleContext(ArgumentListRuleContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public NonKwCallExpressionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonKwCallExpressionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterNonKwCallExpressionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitNonKwCallExpressionRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitNonKwCallExpressionRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonKwCallExpressionRuleContext nonKwCallExpressionRule() throws RecognitionException {
		NonKwCallExpressionRuleContext _localctx = new NonKwCallExpressionRuleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nonKwCallExpressionRule);
		try {
			int _alt;
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(1606);
					match(IDENTIFIER);
					}
					break;
				case STRING:
					{
					setState(1607);
					match(STRING);
					}
					break;
				case GSTRING_START:
					{
					setState(1608);
					gstring();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1612); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1611);
						argumentListRule();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1614); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1616);
				if (!( !GrammarPredicates.isFollowedByLPAREN(_input) )) throw new FailedPredicateException(this, " !GrammarPredicates.isFollowedByLPAREN(_input) ");
				setState(1620);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(1617);
					match(IDENTIFIER);
					}
					break;
				case STRING:
					{
					setState(1618);
					match(STRING);
					}
					break;
				case GSTRING_START:
					{
					setState(1619);
					gstring();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1622);
				argumentList();
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

	public static class CallRuleContext extends ParserRuleContext {
		public AtomExpressionRuleContext a;
		public ClosureExpressionRuleContext c;
		public ExpressionContext mne;
		public AtomExpressionRuleContext atomExpressionRule() {
			return getRuleContext(AtomExpressionRuleContext.class,0);
		}
		public List<ArgumentListRuleContext> argumentListRule() {
			return getRuleContexts(ArgumentListRuleContext.class);
		}
		public ArgumentListRuleContext argumentListRule(int i) {
			return getRuleContext(ArgumentListRuleContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClosureExpressionRuleContext closureExpressionRule() {
			return getRuleContext(ClosureExpressionRuleContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterCallRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitCallRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitCallRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallRuleContext callRule() throws RecognitionException {
		CallRuleContext _localctx = new CallRuleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_callRule);
		try {
			int _alt;
			setState(1644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				((CallRuleContext)_localctx).a = atomExpressionRule();
				setState(1627); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1626);
						argumentListRule();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1629); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1631);
				if (!( !GrammarPredicates.isFollowedByLPAREN(_input) )) throw new FailedPredicateException(this, " !GrammarPredicates.isFollowedByLPAREN(_input) ");
				{
				setState(1632);
				((CallRuleContext)_localctx).c = closureExpressionRule();
				}
				setState(1633);
				argumentList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1635);
				if (!( !GrammarPredicates.isClassName(_input, 2)     )) throw new FailedPredicateException(this, " !GrammarPredicates.isClassName(_input, 2)     ");
				setState(1636);
				match(LPAREN);
				setState(1637);
				((CallRuleContext)_localctx).mne = expression(0);
				setState(1638);
				match(RPAREN);
				setState(1640); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1639);
						argumentListRule();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1642); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class ClassNameExpressionContext extends ParserRuleContext {
		public TerminalNode BUILT_IN_TYPE() { return getToken(GroovyParser.BUILT_IN_TYPE, 0); }
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public ClassNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameExpressionContext classNameExpression() throws RecognitionException {
		ClassNameExpressionContext _localctx = new ClassNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classNameExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			if (!( GrammarPredicates.isClassName(_input) )) throw new FailedPredicateException(this, " GrammarPredicates.isClassName(_input) ");
			setState(1649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUILT_IN_TYPE:
				{
				setState(1647);
				match(BUILT_IN_TYPE);
				}
				break;
			case IDENTIFIER:
				{
				setState(1648);
				pathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericClassNameExpressionContext extends ParserRuleContext {
		public ClassNameExpressionContext classNameExpression() {
			return getRuleContext(ClassNameExpressionContext.class,0);
		}
		public GenericListContext genericList() {
			return getRuleContext(GenericListContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(GroovyParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(GroovyParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(GroovyParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(GroovyParser.RBRACK, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(GroovyParser.ELLIPSIS, 0); }
		public GenericClassNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericClassNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGenericClassNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGenericClassNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGenericClassNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericClassNameExpressionContext genericClassNameExpression() throws RecognitionException {
		GenericClassNameExpressionContext _localctx = new GenericClassNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_genericClassNameExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			classNameExpression();
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(1652);
				genericList();
				}
				break;
			}
			setState(1659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1655);
					match(LBRACK);
					setState(1656);
					match(RBRACK);
					}
					} 
				}
				setState(1661);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			setState(1664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1662);
				match(ELLIPSIS);
				setState(1663);
				if (!( isEllipsisEnabled() )) throw new FailedPredicateException(this, " isEllipsisEnabled() ",  "The var-arg only be allowed to appear as the last parameter" );
				}
				break;
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

	public static class GenericListContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(GroovyParser.LT, 0); }
		public List<GenericListElementContext> genericListElement() {
			return getRuleContexts(GenericListElementContext.class);
		}
		public GenericListElementContext genericListElement(int i) {
			return getRuleContext(GenericListElementContext.class,i);
		}
		public TerminalNode GT() { return getToken(GroovyParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public GenericListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGenericList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGenericList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGenericList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericListContext genericList() throws RecognitionException {
		GenericListContext _localctx = new GenericListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_genericList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(LT);
			setState(1667);
			genericListElement();
			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1668);
				match(COMMA);
				setState(1669);
				genericListElement();
				}
				}
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1675);
			match(GT);
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

	public static class GenericListElementContext extends ParserRuleContext {
		public GenericListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericListElement; }
	 
		public GenericListElementContext() { }
		public void copyFrom(GenericListElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenericsWildcardElementContext extends GenericListElementContext {
		public TerminalNode QUESTION() { return getToken(GroovyParser.QUESTION, 0); }
		public TerminalNode KW_EXTENDS() { return getToken(GroovyParser.KW_EXTENDS, 0); }
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public TerminalNode KW_SUPER() { return getToken(GroovyParser.KW_SUPER, 0); }
		public GenericsWildcardElementContext(GenericListElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGenericsWildcardElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGenericsWildcardElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGenericsWildcardElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericsConcreteElementContext extends GenericListElementContext {
		public GenericClassNameExpressionContext genericClassNameExpression() {
			return getRuleContext(GenericClassNameExpressionContext.class,0);
		}
		public GenericsConcreteElementContext(GenericListElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterGenericsConcreteElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitGenericsConcreteElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitGenericsConcreteElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericListElementContext genericListElement() throws RecognitionException {
		GenericListElementContext _localctx = new GenericListElementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_genericListElement);
		try {
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new GenericsConcreteElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				genericClassNameExpression();
				}
				break;
			case 2:
				_localctx = new GenericsWildcardElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				match(QUESTION);
				setState(1683);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_EXTENDS:
					{
					setState(1679);
					match(KW_EXTENDS);
					setState(1680);
					genericClassNameExpression();
					}
					break;
				case KW_SUPER:
					{
					setState(1681);
					match(KW_SUPER);
					setState(1682);
					genericClassNameExpression();
					}
					break;
				case COMMA:
				case GT:
					break;
				default:
					break;
				}
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

	public static class MapEntryContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GroovyParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(GroovyParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GstringContext gstring() {
			return getRuleContext(GstringContext.class,0);
		}
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GroovyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GroovyParser.RPAREN, 0); }
		public TerminalNode MULT() { return getToken(GroovyParser.MULT, 0); }
		public TerminalNode DECIMAL() { return getToken(GroovyParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(GroovyParser.INTEGER, 0); }
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMapEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMapEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mapEntry);
		try {
			setState(1713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				match(STRING);
				setState(1688);
				match(COLON);
				setState(1689);
				expression(0);
				}
				break;
			case GSTRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(1690);
				gstring();
				setState(1691);
				match(COLON);
				setState(1692);
				expression(0);
				}
				break;
			case KW_CLASS:
			case KW_INTERFACE:
			case KW_TRAIT:
			case KW_ENUM:
			case KW_PACKAGE:
			case KW_IMPORT:
			case KW_EXTENDS:
			case KW_IMPLEMENTS:
			case KW_DEF:
			case KW_NULL:
			case KW_TRUE:
			case KW_FALSE:
			case KW_NEW:
			case KW_SUPER:
			case KW_THIS:
			case KW_IN:
			case KW_FOR:
			case KW_IF:
			case KW_ELSE:
			case KW_DO:
			case KW_WHILE:
			case KW_SWITCH:
			case KW_CASE:
			case KW_DEFAULT:
			case KW_CONTINUE:
			case KW_BREAK:
			case KW_RETURN:
			case KW_TRY:
			case KW_CATCH:
			case KW_FINALLY:
			case KW_THROW:
			case KW_THROWS:
			case KW_ASSERT:
			case KW_CONST:
			case KW_GOTO:
			case KW_AS:
			case KW_INSTANCEOF:
			case BUILT_IN_TYPE:
			case VISIBILITY_MODIFIER:
			case KW_ABSTRACT:
			case KW_STATIC:
			case KW_FINAL:
			case KW_TRANSIENT:
			case KW_NATIVE:
			case KW_VOLATILE:
			case KW_SYNCHRONIZED:
			case KW_STRICTFP:
			case KW_THREADSAFE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1694);
				selectorName();
				setState(1695);
				match(COLON);
				setState(1696);
				expression(0);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1698);
				match(LPAREN);
				setState(1699);
				expression(0);
				setState(1700);
				match(RPAREN);
				setState(1701);
				match(COLON);
				setState(1702);
				expression(0);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1704);
				match(MULT);
				setState(1705);
				match(COLON);
				setState(1706);
				expression(0);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1707);
				match(DECIMAL);
				setState(1708);
				match(COLON);
				setState(1709);
				expression(0);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1710);
				match(INTEGER);
				setState(1711);
				match(COLON);
				setState(1712);
				expression(0);
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

	public static class ClassModifierContext extends ParserRuleContext {
		public TerminalNode VISIBILITY_MODIFIER() { return getToken(GroovyParser.VISIBILITY_MODIFIER, 0); }
		public TerminalNode KW_STATIC() { return getToken(GroovyParser.KW_STATIC, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(GroovyParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_FINAL() { return getToken(GroovyParser.KW_FINAL, 0); }
		public TerminalNode KW_STRICTFP() { return getToken(GroovyParser.KW_STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_classModifier);
		int _la;
		try {
			setState(1719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VISIBILITY_MODIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1715);
				match(VISIBILITY_MODIFIER);
				}
				break;
			case KW_STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1716);
				match(KW_STATIC);
				}
				break;
			case KW_ABSTRACT:
			case KW_FINAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1717);
				_la = _input.LA(1);
				if ( !(_la==KW_ABSTRACT || _la==KW_FINAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KW_STRICTFP:
				enterOuterAlt(_localctx, 4);
				{
				setState(1718);
				match(KW_STRICTFP);
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

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode VISIBILITY_MODIFIER() { return getToken(GroovyParser.VISIBILITY_MODIFIER, 0); }
		public TerminalNode KW_STATIC() { return getToken(GroovyParser.KW_STATIC, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(GroovyParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_FINAL() { return getToken(GroovyParser.KW_FINAL, 0); }
		public TerminalNode KW_NATIVE() { return getToken(GroovyParser.KW_NATIVE, 0); }
		public TerminalNode KW_SYNCHRONIZED() { return getToken(GroovyParser.KW_SYNCHRONIZED, 0); }
		public TerminalNode KW_TRANSIENT() { return getToken(GroovyParser.KW_TRANSIENT, 0); }
		public TerminalNode KW_VOLATILE() { return getToken(GroovyParser.KW_VOLATILE, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_memberModifier);
		int _la;
		try {
			setState(1728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VISIBILITY_MODIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1721);
				match(VISIBILITY_MODIFIER);
				}
				break;
			case KW_STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1722);
				match(KW_STATIC);
				}
				break;
			case KW_ABSTRACT:
			case KW_FINAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1723);
				_la = _input.LA(1);
				if ( !(_la==KW_ABSTRACT || _la==KW_FINAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KW_NATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1724);
				match(KW_NATIVE);
				}
				break;
			case KW_SYNCHRONIZED:
				enterOuterAlt(_localctx, 5);
				{
				setState(1725);
				match(KW_SYNCHRONIZED);
				}
				break;
			case KW_TRANSIENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1726);
				match(KW_TRANSIENT);
				}
				break;
			case KW_VOLATILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1727);
				match(KW_VOLATILE);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<ClosureExpressionRuleContext> closureExpressionRule() {
			return getRuleContexts(ClosureExpressionRuleContext.class);
		}
		public ClosureExpressionRuleContext closureExpressionRule(int i) {
			return getRuleContext(ClosureExpressionRuleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GroovyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GroovyParser.COMMA, i);
		}
		public List<TerminalNode> NL() { return getTokens(GroovyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GroovyParser.NL, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1731); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1730);
						closureExpressionRule();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1733); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(1735);
				argument();
				setState(1752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1739);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1736);
							match(NL);
							}
							}
							setState(1741);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1742);
						match(COMMA);
						setState(1746);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1743);
								match(NL);
								}
								} 
							}
							setState(1748);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
						}
						setState(1749);
						argument();
						}
						} 
					}
					setState(1754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
				}
				}
				break;
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

	public static class ArgumentContext extends ParserRuleContext {
		public MapEntryContext mapEntry() {
			return getRuleContext(MapEntryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_argument);
		try {
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1757);
				mapEntry();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1758);
				expression(0);
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

	public static class SelectorNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GroovyParser.IDENTIFIER, 0); }
		public KwSelectorNameContext kwSelectorName() {
			return getRuleContext(KwSelectorNameContext.class,0);
		}
		public SelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterSelectorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitSelectorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitSelectorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorNameContext selectorName() throws RecognitionException {
		SelectorNameContext _localctx = new SelectorNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_selectorName);
		try {
			setState(1763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1761);
				match(IDENTIFIER);
				}
				break;
			case KW_CLASS:
			case KW_INTERFACE:
			case KW_TRAIT:
			case KW_ENUM:
			case KW_PACKAGE:
			case KW_IMPORT:
			case KW_EXTENDS:
			case KW_IMPLEMENTS:
			case KW_DEF:
			case KW_NULL:
			case KW_TRUE:
			case KW_FALSE:
			case KW_NEW:
			case KW_SUPER:
			case KW_THIS:
			case KW_IN:
			case KW_FOR:
			case KW_IF:
			case KW_ELSE:
			case KW_DO:
			case KW_WHILE:
			case KW_SWITCH:
			case KW_CASE:
			case KW_DEFAULT:
			case KW_CONTINUE:
			case KW_BREAK:
			case KW_RETURN:
			case KW_TRY:
			case KW_CATCH:
			case KW_FINALLY:
			case KW_THROW:
			case KW_THROWS:
			case KW_ASSERT:
			case KW_CONST:
			case KW_GOTO:
			case KW_AS:
			case KW_INSTANCEOF:
			case BUILT_IN_TYPE:
			case VISIBILITY_MODIFIER:
			case KW_ABSTRACT:
			case KW_STATIC:
			case KW_FINAL:
			case KW_TRANSIENT:
			case KW_NATIVE:
			case KW_VOLATILE:
			case KW_SYNCHRONIZED:
			case KW_STRICTFP:
			case KW_THREADSAFE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				kwSelectorName();
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

	public static class KwSelectorNameContext extends ParserRuleContext {
		public TerminalNode KW_ABSTRACT() { return getToken(GroovyParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_AS() { return getToken(GroovyParser.KW_AS, 0); }
		public TerminalNode KW_ASSERT() { return getToken(GroovyParser.KW_ASSERT, 0); }
		public TerminalNode KW_BREAK() { return getToken(GroovyParser.KW_BREAK, 0); }
		public TerminalNode KW_CASE() { return getToken(GroovyParser.KW_CASE, 0); }
		public TerminalNode KW_CATCH() { return getToken(GroovyParser.KW_CATCH, 0); }
		public TerminalNode KW_CLASS() { return getToken(GroovyParser.KW_CLASS, 0); }
		public TerminalNode KW_CONST() { return getToken(GroovyParser.KW_CONST, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(GroovyParser.KW_CONTINUE, 0); }
		public TerminalNode KW_DEF() { return getToken(GroovyParser.KW_DEF, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(GroovyParser.KW_DEFAULT, 0); }
		public TerminalNode KW_DO() { return getToken(GroovyParser.KW_DO, 0); }
		public TerminalNode KW_ELSE() { return getToken(GroovyParser.KW_ELSE, 0); }
		public TerminalNode KW_ENUM() { return getToken(GroovyParser.KW_ENUM, 0); }
		public TerminalNode KW_EXTENDS() { return getToken(GroovyParser.KW_EXTENDS, 0); }
		public TerminalNode KW_FALSE() { return getToken(GroovyParser.KW_FALSE, 0); }
		public TerminalNode KW_FINAL() { return getToken(GroovyParser.KW_FINAL, 0); }
		public TerminalNode KW_FINALLY() { return getToken(GroovyParser.KW_FINALLY, 0); }
		public TerminalNode KW_FOR() { return getToken(GroovyParser.KW_FOR, 0); }
		public TerminalNode KW_GOTO() { return getToken(GroovyParser.KW_GOTO, 0); }
		public TerminalNode KW_IF() { return getToken(GroovyParser.KW_IF, 0); }
		public TerminalNode KW_IMPLEMENTS() { return getToken(GroovyParser.KW_IMPLEMENTS, 0); }
		public TerminalNode KW_IMPORT() { return getToken(GroovyParser.KW_IMPORT, 0); }
		public TerminalNode KW_IN() { return getToken(GroovyParser.KW_IN, 0); }
		public TerminalNode KW_INSTANCEOF() { return getToken(GroovyParser.KW_INSTANCEOF, 0); }
		public TerminalNode KW_INTERFACE() { return getToken(GroovyParser.KW_INTERFACE, 0); }
		public TerminalNode KW_NATIVE() { return getToken(GroovyParser.KW_NATIVE, 0); }
		public TerminalNode KW_NEW() { return getToken(GroovyParser.KW_NEW, 0); }
		public TerminalNode KW_NULL() { return getToken(GroovyParser.KW_NULL, 0); }
		public TerminalNode KW_PACKAGE() { return getToken(GroovyParser.KW_PACKAGE, 0); }
		public TerminalNode KW_RETURN() { return getToken(GroovyParser.KW_RETURN, 0); }
		public TerminalNode KW_STATIC() { return getToken(GroovyParser.KW_STATIC, 0); }
		public TerminalNode KW_STRICTFP() { return getToken(GroovyParser.KW_STRICTFP, 0); }
		public TerminalNode KW_SUPER() { return getToken(GroovyParser.KW_SUPER, 0); }
		public TerminalNode KW_SWITCH() { return getToken(GroovyParser.KW_SWITCH, 0); }
		public TerminalNode KW_SYNCHRONIZED() { return getToken(GroovyParser.KW_SYNCHRONIZED, 0); }
		public TerminalNode KW_THIS() { return getToken(GroovyParser.KW_THIS, 0); }
		public TerminalNode KW_THREADSAFE() { return getToken(GroovyParser.KW_THREADSAFE, 0); }
		public TerminalNode KW_THROW() { return getToken(GroovyParser.KW_THROW, 0); }
		public TerminalNode KW_THROWS() { return getToken(GroovyParser.KW_THROWS, 0); }
		public TerminalNode KW_TRANSIENT() { return getToken(GroovyParser.KW_TRANSIENT, 0); }
		public TerminalNode KW_TRAIT() { return getToken(GroovyParser.KW_TRAIT, 0); }
		public TerminalNode KW_TRUE() { return getToken(GroovyParser.KW_TRUE, 0); }
		public TerminalNode KW_TRY() { return getToken(GroovyParser.KW_TRY, 0); }
		public TerminalNode KW_VOLATILE() { return getToken(GroovyParser.KW_VOLATILE, 0); }
		public TerminalNode KW_WHILE() { return getToken(GroovyParser.KW_WHILE, 0); }
		public TerminalNode BUILT_IN_TYPE() { return getToken(GroovyParser.BUILT_IN_TYPE, 0); }
		public TerminalNode VISIBILITY_MODIFIER() { return getToken(GroovyParser.VISIBILITY_MODIFIER, 0); }
		public KwSelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwSelectorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).enterKwSelectorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroovyParserListener ) ((GroovyParserListener)listener).exitKwSelectorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GroovyParserVisitor ) return ((GroovyParserVisitor<? extends T>)visitor).visitKwSelectorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwSelectorNameContext kwSelectorName() throws RecognitionException {
		KwSelectorNameContext _localctx = new KwSelectorNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_kwSelectorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CLASS) | (1L << KW_INTERFACE) | (1L << KW_TRAIT) | (1L << KW_ENUM) | (1L << KW_PACKAGE) | (1L << KW_IMPORT) | (1L << KW_EXTENDS) | (1L << KW_IMPLEMENTS) | (1L << KW_DEF) | (1L << KW_NULL) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_NEW) | (1L << KW_SUPER) | (1L << KW_THIS) | (1L << KW_IN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_ELSE) | (1L << KW_DO) | (1L << KW_WHILE) | (1L << KW_SWITCH) | (1L << KW_CASE) | (1L << KW_DEFAULT) | (1L << KW_CONTINUE) | (1L << KW_BREAK) | (1L << KW_RETURN) | (1L << KW_TRY) | (1L << KW_CATCH) | (1L << KW_FINALLY) | (1L << KW_THROW) | (1L << KW_THROWS) | (1L << KW_ASSERT) | (1L << KW_CONST) | (1L << KW_GOTO))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (KW_AS - 104)) | (1L << (KW_INSTANCEOF - 104)) | (1L << (BUILT_IN_TYPE - 104)) | (1L << (VISIBILITY_MODIFIER - 104)) | (1L << (KW_ABSTRACT - 104)) | (1L << (KW_STATIC - 104)) | (1L << (KW_FINAL - 104)) | (1L << (KW_TRANSIENT - 104)) | (1L << (KW_NATIVE - 104)) | (1L << (KW_VOLATILE - 104)) | (1L << (KW_SYNCHRONIZED - 104)) | (1L << (KW_STRICTFP - 104)) | (1L << (KW_THREADSAFE - 104)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return scriptPart_sempred((ScriptPartContext)_localctx, predIndex);
		case 4:
			return classDeclaration_sempred((ClassDeclarationContext)_localctx, predIndex);
		case 7:
			return classBody_sempred((ClassBodyContext)_localctx, predIndex);
		case 9:
			return extendsClause_sempred((ExtendsClauseContext)_localctx, predIndex);
		case 10:
			return methodDeclaration_sempred((MethodDeclarationContext)_localctx, predIndex);
		case 11:
			return fieldDeclaration_sempred((FieldDeclarationContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 47:
			return callExpressionRule_sempred((CallExpressionRuleContext)_localctx, predIndex);
		case 48:
			return nonKwCallExpressionRule_sempred((NonKwCallExpressionRuleContext)_localctx, predIndex);
		case 49:
			return callRule_sempred((CallRuleContext)_localctx, predIndex);
		case 50:
			return classNameExpression_sempred((ClassNameExpressionContext)_localctx, predIndex);
		case 51:
			return genericClassNameExpression_sempred((GenericClassNameExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean scriptPart_sempred(ScriptPartContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  !GrammarPredicates.isInvalidMethodDeclaration(_input) ;
		}
		return true;
	}
	private boolean classDeclaration_sempred(ClassDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !checkModifierDuplication(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null));
		case 2:
			return !checkModifierDuplication(_localctx.modifierSet, (((ClassDeclarationContext)_localctx).classModifier!=null?_input.getText(((ClassDeclarationContext)_localctx).classModifier.start,((ClassDeclarationContext)_localctx).classModifier.stop):null));
		case 3:
			return !_localctx.isEnum;
		}
		return true;
	}
	private boolean classBody_sempred(ClassBodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return _localctx.isEnum;
		}
		return true;
	}
	private boolean extendsClause_sempred(ExtendsClauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return _localctx.isInterface;
		}
		return true;
	}
	private boolean methodDeclaration_sempred(MethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return !checkModifierDuplication(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null));
		case 7:
			return !_localctx.modifierAndDefSet.contains((((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null));
		case 8:
			return !checkModifierDuplication(_localctx.modifierAndDefSet, (((MethodDeclarationContext)_localctx).memberModifier!=null?_input.getText(((MethodDeclarationContext)_localctx).memberModifier.start,((MethodDeclarationContext)_localctx).memberModifier.stop):null));
		case 9:
			return !_localctx.modifierAndDefSet.contains((((MethodDeclarationContext)_localctx).KW_DEF!=null?((MethodDeclarationContext)_localctx).KW_DEF.getText():null));
		}
		return true;
	}
	private boolean fieldDeclaration_sempred(FieldDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return !checkModifierDuplication(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null));
		case 11:
			return !_localctx.modifierAndDefSet.contains((((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null));
		case 12:
			return !checkModifierDuplication(_localctx.modifierAndDefSet, (((FieldDeclarationContext)_localctx).memberModifier!=null?_input.getText(((FieldDeclarationContext)_localctx).memberModifier.start,((FieldDeclarationContext)_localctx).memberModifier.stop):null));
		case 13:
			return !_localctx.modifierAndDefSet.contains((((FieldDeclarationContext)_localctx).KW_DEF!=null?((FieldDeclarationContext)_localctx).KW_DEF.getText():null));
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 17);
		case 16:
			return precpred(_ctx, 16);
		case 17:
			return precpred(_ctx, 15);
		case 18:
			return precpred(_ctx, 14);
		case 19:
			return precpred(_ctx, 13);
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 10);
		case 22:
			return precpred(_ctx, 9);
		case 23:
			return precpred(_ctx, 8);
		case 24:
			return precpred(_ctx, 7);
		case 25:
			return precpred(_ctx, 6);
		case 26:
			return precpred(_ctx, 5);
		case 27:
			return precpred(_ctx, 4);
		case 28:
			return precpred(_ctx, 3);
		case 29:
			return precpred(_ctx, 2);
		case 30:
			return precpred(_ctx, 30);
		case 31:
			return precpred(_ctx, 28);
		case 32:
			return precpred(_ctx, 27);
		case 33:
			return precpred(_ctx, 26);
		case 34:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean callExpressionRule_sempred(CallExpressionRuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return  !GrammarPredicates.isFollowedByLPAREN(_input) ;
		}
		return true;
	}
	private boolean nonKwCallExpressionRule_sempred(NonKwCallExpressionRuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return  !GrammarPredicates.isFollowedByLPAREN(_input) ;
		}
		return true;
	}
	private boolean callRule_sempred(CallRuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return  !GrammarPredicates.isFollowedByLPAREN(_input) ;
		case 38:
			return  !GrammarPredicates.isClassName(_input, 2)     ;
		}
		return true;
	}
	private boolean classNameExpression_sempred(ClassNameExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return  GrammarPredicates.isClassName(_input) ;
		}
		return true;
	}
	private boolean genericClassNameExpression_sempred(GenericClassNameExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return  isEllipsisEnabled() ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u06ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\5\2~\n\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2\5\2\u0087"+
		"\n\2\3\2\7\2\u008a\n\2\f\2\16\2\u008d\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\u0097\n\2\f\2\16\2\u009a\13\2\3\2\7\2\u009d\n\2\f\2\16\2\u00a0"+
		"\13\2\3\2\5\2\u00a3\n\2\3\2\7\2\u00a6\n\2\f\2\16\2\u00a9\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\u00b0\n\3\3\4\3\4\3\4\7\4\u00b5\n\4\f\4\16\4\u00b8\13"+
		"\4\5\4\u00ba\n\4\3\4\3\4\3\4\3\4\7\4\u00c0\n\4\f\4\16\4\u00c3\13\4\3\5"+
		"\3\5\3\5\7\5\u00c8\n\5\f\5\16\5\u00cb\13\5\5\5\u00cd\n\5\3\5\3\5\5\5\u00d1"+
		"\n\5\3\5\3\5\3\5\7\5\u00d6\n\5\f\5\16\5\u00d9\13\5\3\5\3\5\5\5\u00dd\n"+
		"\5\3\5\3\5\5\5\u00e1\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00e8\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u00f0\n\6\f\6\16\6\u00f3\13\6\5\6\u00f5\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ff\n\6\3\6\3\6\3\6\3\6\5\6\u0105\n\6\3\6"+
		"\7\6\u0108\n\6\f\6\16\6\u010b\13\6\3\6\5\6\u010e\n\6\3\6\7\6\u0111\n\6"+
		"\f\6\16\6\u0114\13\6\3\6\5\6\u0117\n\6\3\6\5\6\u011a\n\6\3\6\7\6\u011d"+
		"\n\6\f\6\16\6\u0120\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0129\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0130\n\b\3\t\3\t\7\t\u0134\n\t\f\t\16\t\u0137\13"+
		"\t\3\t\3\t\3\t\7\t\u013c\n\t\f\t\16\t\u013f\13\t\3\t\3\t\7\t\u0143\n\t"+
		"\f\t\16\t\u0146\13\t\7\t\u0148\n\t\f\t\16\t\u014b\13\t\3\t\3\t\7\t\u014f"+
		"\n\t\f\t\16\t\u0152\13\t\3\t\5\t\u0155\n\t\3\t\5\t\u0158\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u015f\n\t\f\t\16\t\u0162\13\t\3\t\3\t\7\t\u0166\n\t\f\t"+
		"\16\t\u0169\13\t\5\t\u016b\n\t\3\t\3\t\3\n\3\n\7\n\u0171\n\n\f\n\16\n"+
		"\u0174\13\n\3\n\3\n\3\n\7\n\u0179\n\n\f\n\16\n\u017c\13\n\3\n\7\n\u017f"+
		"\n\n\f\n\16\n\u0182\13\n\3\13\3\13\7\13\u0186\n\13\f\13\16\13\u0189\13"+
		"\13\3\13\3\13\3\13\7\13\u018e\n\13\f\13\16\13\u0191\13\13\3\13\3\13\7"+
		"\13\u0195\n\13\f\13\16\13\u0198\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u01a2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u01ad\n\f\f\f\16"+
		"\f\u01b0\13\f\3\f\3\f\3\f\3\f\5\f\u01b6\n\f\3\f\5\f\u01b9\n\f\3\f\3\f"+
		"\3\f\7\f\u01be\n\f\f\f\16\f\u01c1\13\f\3\f\3\f\7\f\u01c5\n\f\f\f\16\f"+
		"\u01c8\13\f\3\f\3\f\5\f\u01cc\n\f\3\f\3\f\3\f\5\f\u01d1\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u01db\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u01e6\n\r\f\r\16\r\u01e9\13\r\3\r\5\r\u01ec\n\r\3\r\5\r\u01ef\n"+
		"\r\3\r\3\r\3\r\7\r\u01f4\n\r\f\r\16\r\u01f7\13\r\3\r\7\r\u01fa\n\r\f\r"+
		"\16\r\u01fd\13\r\3\16\3\16\3\16\7\16\u0202\n\16\f\16\16\16\u0205\13\16"+
		"\7\16\u0207\n\16\f\16\16\16\u020a\13\16\3\16\5\16\u020d\n\16\3\16\3\16"+
		"\5\16\u0211\n\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u021a\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u0222\n\22\f\22\16\22\u0225\13\22\3"+
		"\22\5\22\u0228\n\22\3\22\5\22\u022b\n\22\3\23\3\23\3\23\7\23\u0230\n\23"+
		"\f\23\16\23\u0233\13\23\3\23\3\23\3\24\3\24\5\24\u0239\n\24\3\25\3\25"+
		"\3\25\3\25\7\25\u023f\n\25\f\25\16\25\u0242\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u024b\n\26\f\26\16\26\u024e\13\26\5\26\u0250\n\26"+
		"\3\27\3\27\3\27\3\27\7\27\u0256\n\27\f\27\16\27\u0259\13\27\3\30\3\30"+
		"\3\30\7\30\u025e\n\30\f\30\16\30\u0261\13\30\7\30\u0263\n\30\f\30\16\30"+
		"\u0266\13\30\3\30\3\30\3\30\3\30\3\30\5\30\u026d\n\30\3\31\7\31\u0270"+
		"\n\31\f\31\16\31\u0273\13\31\3\31\5\31\u0276\n\31\3\31\5\31\u0279\n\31"+
		"\3\31\3\31\3\31\7\31\u027e\n\31\f\31\16\31\u0281\13\31\3\31\5\31\u0284"+
		"\n\31\3\32\6\32\u0287\n\32\r\32\16\32\u0288\3\32\3\32\6\32\u028d\n\32"+
		"\r\32\16\32\u028e\7\32\u0291\n\32\f\32\16\32\u0294\13\32\3\32\5\32\u0297"+
		"\n\32\3\32\7\32\u029a\n\32\f\32\16\32\u029d\13\32\3\32\3\32\6\32\u02a1"+
		"\n\32\r\32\16\32\u02a2\3\32\7\32\u02a6\n\32\f\32\16\32\u02a9\13\32\3\32"+
		"\7\32\u02ac\n\32\f\32\16\32\u02af\13\32\5\32\u02b1\n\32\3\33\3\33\3\33"+
		"\7\33\u02b6\n\33\f\33\16\33\u02b9\13\33\3\33\5\33\u02bc\n\33\3\34\3\34"+
		"\3\34\3\34\7\34\u02c2\n\34\f\34\16\34\u02c5\13\34\3\34\3\34\3\34\7\34"+
		"\u02ca\n\34\f\34\16\34\u02cd\13\34\3\34\5\34\u02d0\n\34\3\35\5\35\u02d3"+
		"\n\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u02db\n\36\3\36\5\36\u02de\n"+
		"\36\3\36\3\36\7\36\u02e2\n\36\f\36\16\36\u02e5\13\36\3\36\5\36\u02e8\n"+
		"\36\3\36\7\36\u02eb\n\36\f\36\16\36\u02ee\13\36\3\36\3\36\3\36\5\36\u02f3"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u02fb\n\37\r\37\16\37\u02fc\3"+
		" \3 \3 \3 \3 \3 \3 \5 \u0306\n \3 \3 \5 \u030a\n \3 \3 \5 \u030e\n \3"+
		" \3 \7 \u0312\n \f \16 \u0315\13 \3 \3 \3 \3 \5 \u031b\n \3 \3 \3 \3 "+
		"\3 \7 \u0322\n \f \16 \u0325\13 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0331"+
		"\n \f \16 \u0334\13 \3 \3 \3 \3 \3 \3 \3 \7 \u033d\n \f \16 \u0340\13"+
		" \3 \3 \7 \u0344\n \f \16 \u0347\13 \3 \3 \7 \u034b\n \f \16 \u034e\13"+
		" \3 \5 \u0351\n \3 \3 \3 \3 \3 \7 \u0358\n \f \16 \u035b\13 \3 \3 \3 "+
		"\3 \3 \3 \3 \7 \u0364\n \f \16 \u0367\13 \3 \3 \3 \7 \u036c\n \f \16 "+
		"\u036f\13 \3 \3 \3 \3 \3 \3 \3 \6 \u0378\n \r \16 \u0379\5 \u037c\n \3"+
		" \3 \3 \3 \6 \u0382\n \r \16 \u0383\3 \5 \u0387\n \3 \5 \u038a\n \3 \3"+
		" \5 \u038e\n \3 \3 \5 \u0392\n \3 \3 \3 \3 \3 \3 \7 \u039a\n \f \16 \u039d"+
		"\13 \3 \5 \u03a0\n \3 \3 \3 \3 \3 \7 \u03a7\n \f \16 \u03aa\13 \3 \3 "+
		"\3 \3 \3 \7 \u03b1\n \f \16 \u03b4\13 \3 \3 \5 \u03b8\n \3!\3!\5!\u03bc"+
		"\n!\3!\3!\3\"\3\"\5\"\u03c2\n\"\3#\3#\7#\u03c6\n#\f#\16#\u03c9\13#\3#"+
		"\3#\7#\u03cd\n#\f#\16#\u03d0\13#\3$\3$\7$\u03d4\n$\f$\16$\u03d7\13$\3"+
		"$\3$\3$\3$\7$\u03dd\n$\f$\16$\u03e0\13$\3$\3$\3$\5$\u03e5\n$\3$\3$\7$"+
		"\u03e9\n$\f$\16$\u03ec\13$\3$\3$\7$\u03f0\n$\f$\16$\u03f3\13$\3%\3%\7"+
		"%\u03f7\n%\f%\16%\u03fa\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0406\n&"+
		"\f&\16&\u0409\13&\3\'\3\'\7\'\u040d\n\'\f\'\16\'\u0410\13\'\3\'\3\'\3"+
		"(\3(\7(\u0416\n(\f(\16(\u0419\13(\3)\3)\7)\u041d\n)\f)\16)\u0420\13)\3"+
		")\3)\7)\u0424\n)\f)\16)\u0427\13)\3)\3)\7)\u042b\n)\f)\16)\u042e\13)\5"+
		")\u0430\n)\3)\5)\u0433\n)\3)\3)\3*\3*\3*\5*\u043a\n*\3*\3*\5*\u043e\n"+
		"*\3+\3+\3+\3+\7+\u0444\n+\f+\16+\u0447\13+\3+\3+\3,\3,\3,\3,\7,\u044f"+
		"\n,\f,\16,\u0452\13,\5,\u0454\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0460"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\5-\u0469\n-\3-\3-\3-\3-\3-\7-\u0470\n-\f-\16"+
		"-\u0473\13-\3-\3-\3-\5-\u0478\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\7-\u048e\n-\f-\16-\u0491\13-\3-\3-\3-\7-\u0496"+
		"\n-\f-\16-\u0499\13-\3-\5-\u049c\n-\3-\3-\3-\7-\u04a1\n-\f-\16-\u04a4"+
		"\13-\3-\3-\3-\3-\7-\u04aa\n-\f-\16-\u04ad\13-\3-\3-\3-\3-\7-\u04b3\n-"+
		"\f-\16-\u04b6\13-\3-\3-\3-\3-\7-\u04bc\n-\f-\16-\u04bf\13-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u04c9\n-\3-\7-\u04cc\n-\f-\16-\u04cf\13-\3-\3-\3-\3-"+
		"\7-\u04d5\n-\f-\16-\u04d8\13-\3-\3-\3-\3-\7-\u04de\n-\f-\16-\u04e1\13"+
		"-\3-\3-\3-\3-\7-\u04e7\n-\f-\16-\u04ea\13-\3-\3-\3-\3-\7-\u04f0\n-\f-"+
		"\16-\u04f3\13-\3-\3-\3-\3-\7-\u04f9\n-\f-\16-\u04fc\13-\3-\3-\3-\3-\7"+
		"-\u0502\n-\f-\16-\u0505\13-\3-\3-\3-\3-\7-\u050b\n-\f-\16-\u050e\13-\3"+
		"-\3-\3-\7-\u0513\n-\f-\16-\u0516\13-\3-\3-\7-\u051a\n-\f-\16-\u051d\13"+
		"-\3-\3-\3-\7-\u0522\n-\f-\16-\u0525\13-\3-\3-\7-\u0529\n-\f-\16-\u052c"+
		"\13-\3-\3-\3-\7-\u0531\n-\f-\16-\u0534\13-\3-\3-\7-\u0538\n-\f-\16-\u053b"+
		"\13-\3-\3-\7-\u053f\n-\f-\16-\u0542\13-\3-\3-\3-\5-\u0547\n-\3-\7-\u054a"+
		"\n-\f-\16-\u054d\13-\3-\3-\3-\3-\7-\u0553\n-\f-\16-\u0556\13-\3-\3-\3"+
		"-\7-\u055b\n-\f-\16-\u055e\13-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0568\n-\3-"+
		"\3-\3-\3-\3-\3-\3-\7-\u0571\n-\f-\16-\u0574\13-\5-\u0576\n-\3-\3-\3-\7"+
		"-\u057b\n-\f-\16-\u057e\13-\3-\3-\7-\u0582\n-\f-\16-\u0585\13-\3-\5-\u0588"+
		"\n-\3-\3-\7-\u058c\n-\f-\16-\u058f\13-\3-\3-\3-\5-\u0594\n-\3-\3-\3-\7"+
		"-\u0599\n-\f-\16-\u059c\13-\3-\7-\u059f\n-\f-\16-\u05a2\13-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\7.\u05af\n.\f.\16.\u05b2\13.\3.\3.\7.\u05b6\n."+
		"\f.\16.\u05b9\13.\3.\3.\7.\u05bd\n.\f.\16.\u05c0\13.\3.\3.\7.\u05c4\n"+
		".\f.\16.\u05c7\13.\7.\u05c9\n.\f.\16.\u05cc\13.\3.\5.\u05cf\n.\5.\u05d1"+
		"\n.\3.\7.\u05d4\n.\f.\16.\u05d7\13.\3.\3.\3.\7.\u05dc\n.\f.\16.\u05df"+
		"\13.\3.\3.\7.\u05e3\n.\f.\16.\u05e6\13.\3.\3.\7.\u05ea\n.\f.\16.\u05ed"+
		"\13.\3.\3.\7.\u05f1\n.\f.\16.\u05f4\13.\3.\3.\7.\u05f8\n.\f.\16.\u05fb"+
		"\13.\7.\u05fd\n.\f.\16.\u0600\13.\3.\5.\u0603\n.\5.\u0605\n.\3.\7.\u0608"+
		"\n.\f.\16.\u060b\13.\3.\3.\3.\5.\u0610\n.\3/\3/\3/\5/\u0615\n/\3\60\3"+
		"\60\7\60\u0619\n\60\f\60\16\60\u061c\13\60\3\60\5\60\u061f\n\60\3\60\7"+
		"\60\u0622\n\60\f\60\16\60\u0625\13\60\3\60\3\60\7\60\u0629\n\60\f\60\16"+
		"\60\u062c\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0635\n\61\3\61"+
		"\6\61\u0638\n\61\r\61\16\61\u0639\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u0644\n\61\3\61\5\61\u0647\n\61\3\62\3\62\3\62\5\62\u064c\n\62"+
		"\3\62\6\62\u064f\n\62\r\62\16\62\u0650\3\62\3\62\3\62\3\62\5\62\u0657"+
		"\n\62\3\62\5\62\u065a\n\62\3\63\3\63\6\63\u065e\n\63\r\63\16\63\u065f"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\6\63\u066b\n\63\r\63\16"+
		"\63\u066c\5\63\u066f\n\63\3\64\3\64\3\64\5\64\u0674\n\64\3\65\3\65\5\65"+
		"\u0678\n\65\3\65\3\65\7\65\u067c\n\65\f\65\16\65\u067f\13\65\3\65\3\65"+
		"\5\65\u0683\n\65\3\66\3\66\3\66\3\66\7\66\u0689\n\66\f\66\16\66\u068c"+
		"\13\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0696\n\67\5\67\u0698"+
		"\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\58\u06b4\n8\39\39\39\39\59\u06ba\n9\3:\3:\3:\3:\3:\3:\3"+
		":\5:\u06c3\n:\3;\6;\u06c6\n;\r;\16;\u06c7\3;\3;\7;\u06cc\n;\f;\16;\u06cf"+
		"\13;\3;\3;\7;\u06d3\n;\f;\16;\u06d6\13;\3;\7;\u06d9\n;\f;\16;\u06dc\13"+
		";\5;\u06de\n;\3<\3<\5<\u06e2\n<\3=\3=\5=\u06e6\n=\3>\3>\3>\2\3X?\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz\2\26\4\2VVxx\4\2\13\13yy\3\2+,\4\2XX]]\3\2\35\36"+
		"\3\2 !\3\2_`\3\2de\3\2BC\3\2ac\3\2FG\4\2?@[\\\4\299HI\3\2JK\5\2\668NU"+
		"ZZ\4\2;>WW\4\2;<WW\3\2jk\4\2nnpp\4\2\23\65jv\2\u0820\2}\3\2\2\2\4\u00af"+
		"\3\2\2\2\6\u00b9\3\2\2\2\b\u00cc\3\2\2\2\n\u00f4\3\2\2\2\f\u0128\3\2\2"+
		"\2\16\u012a\3\2\2\2\20\u0131\3\2\2\2\22\u016e\3\2\2\2\24\u0183\3\2\2\2"+
		"\26\u01b8\3\2\2\2\30\u01ee\3\2\2\2\32\u0210\3\2\2\2\34\u0212\3\2\2\2\36"+
		"\u0214\3\2\2\2 \u0219\3\2\2\2\"\u021b\3\2\2\2$\u022c\3\2\2\2&\u0238\3"+
		"\2\2\2(\u023a\3\2\2\2*\u0245\3\2\2\2,\u0251\3\2\2\2.\u026c\3\2\2\2\60"+
		"\u0271\3\2\2\2\62\u02b0\3\2\2\2\64\u02b2\3\2\2\2\66\u02bd\3\2\2\28\u02d2"+
		"\3\2\2\2:\u02d6\3\2\2\2<\u02f4\3\2\2\2>\u03b7\3\2\2\2@\u03b9\3\2\2\2B"+
		"\u03c1\3\2\2\2D\u03c3\3\2\2\2F\u03d1\3\2\2\2H\u03f4\3\2\2\2J\u03fd\3\2"+
		"\2\2L\u040e\3\2\2\2N\u0413\3\2\2\2P\u041a\3\2\2\2R\u043d\3\2\2\2T\u043f"+
		"\3\2\2\2V\u045f\3\2\2\2X\u049b\3\2\2\2Z\u060f\3\2\2\2\\\u0611\3\2\2\2"+
		"^\u0616\3\2\2\2`\u0646\3\2\2\2b\u0659\3\2\2\2d\u066e\3\2\2\2f\u0670\3"+
		"\2\2\2h\u0675\3\2\2\2j\u0684\3\2\2\2l\u0697\3\2\2\2n\u06b3\3\2\2\2p\u06b9"+
		"\3\2\2\2r\u06c2\3\2\2\2t\u06dd\3\2\2\2v\u06e1\3\2\2\2x\u06e5\3\2\2\2z"+
		"\u06e7\3\2\2\2|~\7\3\2\2}|\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177\u0081"+
		"\7x\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\5\6"+
		"\4\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088"+
		"\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u0098\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\5\b\5\2\u008f\u0090\t\2\2\2\u0090\u0097\3\2\2\2\u0091\u0097\5\n"+
		"\6\2\u0092\u0093\5\4\3\2\u0093\u0094\t\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0097\t\2\2\2\u0096\u008e\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\t\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\5\4"+
		"\3\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4"+
		"\u00a6\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\2\2\3\u00ab\3\3\2\2\2\u00ac\u00ad\6\3\2\2\u00ad\u00b0\5\26\f"+
		"\2\u00ae\u00b0\5> \2\u00af\u00ac\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\5\3"+
		"\2\2\2\u00b1\u00b6\5\"\22\2\u00b2\u00b5\7x\2\2\u00b3\u00b5\5\"\22\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\27"+
		"\2\2\u00bc\u00c1\7y\2\2\u00bd\u00be\7W\2\2\u00be\u00c0\7y\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\7\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5\"\22\2\u00c5\u00c8\7x\2\2"+
		"\u00c6\u00c8\5\"\22\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\7\30\2\2\u00cf\u00d1\7o\2\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d7\7y\2\2\u00d3\u00d4\7W\2"+
		"\2\u00d4\u00d6\7y\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7W\2\2\u00db\u00dd\7a\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2"+
		"\2\u00dd\u00e0\3\2\2\2\u00de\u00df\7j\2\2\u00df\u00e1\7y\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\t\3\2\2\2\u00e2\u00e8\5\"\22\2\u00e3"+
		"\u00e4\5p9\2\u00e4\u00e5\6\6\3\3\u00e5\u00e6\b\6\1\2\u00e6\u00e8\3\2\2"+
		"\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\u00f1\3\2\2\2\u00e9\u00f0"+
		"\7x\2\2\u00ea\u00f0\5\"\22\2\u00eb\u00ec\5p9\2\u00ec\u00ed\6\6\4\3\u00ed"+
		"\u00ee\b\6\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2"+
		"\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00e7\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00fe\3\2\2\2\u00f6\u00f7\7Y\2\2\u00f7"+
		"\u00ff\7\24\2\2\u00f8\u00ff\7\23\2\2\u00f9\u00fa\7\24\2\2\u00fa\u00ff"+
		"\b\6\1\2\u00fb\u00ff\7\25\2\2\u00fc\u00fd\7\26\2\2\u00fd\u00ff\b\6\1\2"+
		"\u00fe\u00f6\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fb"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7y\2\2\u0101"+
		"\u0116\b\6\1\2\u0102\u0104\6\6\5\3\u0103\u0105\5(\25\2\u0104\u0103\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2\2\2\u0106\u0108\7x\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\5\24\13\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0112\3\2\2\2\u010f\u0111\7x"+
		"\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0117\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u0102\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u011a\5\22\n\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\3"+
		"\2\2\2\u011b\u011d\7x\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\5\20\t\2\u0122\13\3\2\2\2\u0123\u0129\5\26\f\2\u0124"+
		"\u0129\5\30\r\2\u0125\u0129\5\34\17\2\u0126\u0129\5\36\20\2\u0127\u0129"+
		"\5\n\6\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\r\3\2\2\2\u012a\u012f\7y\2\2"+
		"\u012b\u012c\7\5\2\2\u012c\u012d\5t;\2\u012d\u012e\7\6\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130\17\3\2\2\2\u0131"+
		"\u0135\7\t\2\2\u0132\u0134\7x\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0157\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0149\6\t\6\3\u0139\u013d\5\16\b\2\u013a\u013c\7"+
		"x\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\7X"+
		"\2\2\u0141\u0143\7x\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0139\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0150\5\16"+
		"\b\2\u014d\u014f\7x\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0155\7X\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0138\3\2\2\2\u0157\u0156\3\2"+
		"\2\2\u0158\u0160\3\2\2\2\u0159\u015a\5\f\7\2\u015a\u015b\t\2\2\2\u015b"+
		"\u015f\3\2\2\2\u015c\u015f\7x\2\2\u015d\u015f\7V\2\2\u015e\u0159\3\2\2"+
		"\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u016a\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0167\5\f\7\2\u0164\u0166\t\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\7\n\2\2\u016d\21\3\2\2\2\u016e\u0172\7\32\2\2\u016f\u0171"+
		"\7x\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0180\5h"+
		"\65\2\u0176\u017a\7X\2\2\u0177\u0179\7x\2\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u017f\5h\65\2\u017e\u0176\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\23\3\2\2"+
		"\2\u0182\u0180\3\2\2\2\u0183\u0187\7\31\2\2\u0184\u0186\7x\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u0196\5h\65\2\u018b\u018f\7X"+
		"\2\2\u018c\u018e\7x\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0193\6\13\7\3\u0193\u0195\5h\65\2\u0194\u018b\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\25\3\2\2"+
		"\2\u0198\u0196\3\2\2\2\u0199\u019a\5r:\2\u019a\u019b\6\f\b\3\u019b\u019c"+
		"\b\f\1\2\u019c\u01a2\3\2\2\2\u019d\u01a2\5\"\22\2\u019e\u019f\7\33\2\2"+
		"\u019f\u01a0\6\f\t\3\u01a0\u01a2\b\f\1\2\u01a1\u0199\3\2\2\2\u01a1\u019d"+
		"\3\2\2\2\u01a1\u019e\3\2\2\2\u01a2\u01ae\3\2\2\2\u01a3\u01a4\5r:\2\u01a4"+
		"\u01a5\6\f\n\3\u01a5\u01a6\b\f\1\2\u01a6\u01ad\3\2\2\2\u01a7\u01ad\5\""+
		"\22\2\u01a8\u01a9\7\33\2\2\u01a9\u01aa\6\f\13\3\u01aa\u01ad\b\f\1\2\u01ab"+
		"\u01ad\7x\2\2\u01ac\u01a3\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8\3\2"+
		"\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b5\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\5("+
		"\25\2\u01b2\u01b3\5h\65\2\u01b3\u01b6\3\2\2\2\u01b4\u01b6\5 \21\2\u01b5"+
		"\u01b1\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2"+
		"\2\2\u01b7\u01b9\5h\65\2\u01b8\u01a1\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\t\3\2\2\u01bb\u01bf\7\5"+
		"\2\2\u01bc\u01be\7x\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c6\5.\30\2\u01c3\u01c5\7x\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cb\7\6\2\2\u01ca\u01cc\5,\27\2\u01cb"+
		"\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01ce\7*"+
		"\2\2\u01ce\u01d1\5V,\2\u01cf\u01d1\5@!\2\u01d0\u01cd\3\2\2\2\u01d0\u01cf"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\27\3\2\2\2\u01d2\u01d3\5r:\2\u01d3"+
		"\u01d4\6\r\f\3\u01d4\u01d5\b\r\1\2\u01d5\u01db\3\2\2\2\u01d6\u01db\5\""+
		"\22\2\u01d7\u01d8\7\33\2\2\u01d8\u01d9\6\r\r\3\u01d9\u01db\b\r\1\2\u01da"+
		"\u01d2\3\2\2\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01db\u01e7\3\2"+
		"\2\2\u01dc\u01dd\5r:\2\u01dd\u01de\6\r\16\3\u01de\u01df\b\r\1\2\u01df"+
		"\u01e6\3\2\2\2\u01e0\u01e6\5\"\22\2\u01e1\u01e2\7\33\2\2\u01e2\u01e3\6"+
		"\r\17\3\u01e3\u01e6\b\r\1\2\u01e4\u01e6\7x\2\2\u01e5\u01dc\3\2\2\2\u01e5"+
		"\u01e0\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01ec\5h\65\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ef\5h\65\2\u01ee\u01da\3\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01fb\5\64\33\2\u01f1\u01f5\7"+
		"X\2\2\u01f2\u01f4\7x\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01fa\5\64\33\2\u01f9\u01f1\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\31\3\2\2\2\u01fd\u01fb\3\2\2"+
		"\2\u01fe\u0211\5\30\r\2\u01ff\u0203\5\"\22\2\u0200\u0202\7x\2\2\u0201"+
		"\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u01ff\3\2\2\2\u0207"+
		"\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020c\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020b\u020d\7p\2\2\u020c\u020b\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\7\33\2\2\u020f\u0211\5"+
		"\66\34\2\u0210\u01fe\3\2\2\2\u0210\u0208\3\2\2\2\u0211\33\3\2\2\2\u0212"+
		"\u0213\5@!\2\u0213\35\3\2\2\2\u0214\u0215\7o\2\2\u0215\u0216\5@!\2\u0216"+
		"\37\3\2\2\2\u0217\u021a\5h\65\2\u0218\u021a\7\33\2\2\u0219\u0217\3\2\2"+
		"\2\u0219\u0218\3\2\2\2\u021a!\3\2\2\2\u021b\u021c\7Y\2\2\u021c\u022a\5"+
		"h\65\2\u021d\u0227\7\5\2\2\u021e\u0223\5$\23\2\u021f\u0220\7X\2\2\u0220"+
		"\u0222\5$\23\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0228\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0228\5&\24\2\u0227\u021e\3\2\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229\u022b\7\6\2\2\u022a\u021d\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b#\3\2\2\2\u022c\u022d\7y\2\2\u022d\u0231\7Z\2\2\u022e"+
		"\u0230\7x\2\2\u022f\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0231\3\2\2\2\u0234"+
		"\u0235\5&\24\2\u0235%\3\2\2\2\u0236\u0239\5V,\2\u0237\u0239\5\"\22\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239\'\3\2\2\2\u023a\u023b\7[\2\2"+
		"\u023b\u0240\5*\26\2\u023c\u023d\7X\2\2\u023d\u023f\5*\26\2\u023e\u023c"+
		"\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\7\\\2\2\u0244)\3\2\2\2"+
		"\u0245\u024f\5h\65\2\u0246\u0247\7\31\2\2\u0247\u024c\5h\65\2\u0248\u0249"+
		"\7f\2\2\u0249\u024b\5h\65\2\u024a\u0248\3\2\2\2\u024b\u024e\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2"+
		"\2\2\u024f\u0246\3\2\2\2\u024f\u0250\3\2\2\2\u0250+\3\2\2\2\u0251\u0252"+
		"\7\62\2\2\u0252\u0257\5f\64\2\u0253\u0254\7X\2\2\u0254\u0256\5f\64\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258-\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\5\60\31\2\u025b\u025f"+
		"\7X\2\2\u025c\u025e\7x\2\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2"+
		"\2\2\u0262\u025a\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\b\30"+
		"\1\2\u0268\u0269\5\60\31\2\u0269\u026a\b\30\1\2\u026a\u026d\3\2\2\2\u026b"+
		"\u026d\3\2\2\2\u026c\u0264\3\2\2\2\u026c\u026b\3\2\2\2\u026d/\3\2\2\2"+
		"\u026e\u0270\5\"\22\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f"+
		"\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0274"+
		"\u0276\7p\2\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2"+
		"\2\2\u0277\u0279\5 \21\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u0283\7y\2\2\u027b\u027f\7Z\2\2\u027c\u027e\7x\2"+
		"\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0284\5X-\2\u0283"+
		"\u027b\3\2\2\2\u0283\u0284\3\2\2\2\u0284\61\3\2\2\2\u0285\u0287\t\2\2"+
		"\2\u0286\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289\u0292\3\2\2\2\u028a\u028c\5> \2\u028b\u028d\t\2\2\2\u028c"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u0291\3\2\2\2\u0290\u028a\3\2\2\2\u0291\u0294\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0295\u0297\5> \2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029b"+
		"\3\2\2\2\u0298\u029a\t\2\2\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02b1\3\2\2\2\u029d\u029b\3\2"+
		"\2\2\u029e\u02a7\5> \2\u029f\u02a1\t\2\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a2"+
		"\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a6\5> \2\u02a5\u02a0\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2"+
		"\2\u02a7\u02a8\3\2\2\2\u02a8\u02ad\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac"+
		"\t\2\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u0286\3\2"+
		"\2\2\u02b0\u029e\3\2\2\2\u02b1\63\3\2\2\2\u02b2\u02bb\7y\2\2\u02b3\u02b7"+
		"\7Z\2\2\u02b4\u02b6\7x\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9\u02b7\3\2"+
		"\2\2\u02ba\u02bc\5X-\2\u02bb\u02b3\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\65"+
		"\3\2\2\2\u02bd\u02be\7\5\2\2\u02be\u02c3\58\35\2\u02bf\u02c0\7X\2\2\u02c0"+
		"\u02c2\58\35\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2"+
		"\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6"+
		"\u02cf\7\6\2\2\u02c7\u02cb\7Z\2\2\u02c8\u02ca\7x\2\2\u02c9\u02c8\3\2\2"+
		"\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce"+
		"\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02d0\5X-\2\u02cf\u02c7\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\67\3\2\2\2\u02d1\u02d3\5h\65\2\u02d2\u02d1\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\7y\2\2\u02d59\3"+
		"\2\2\2\u02d6\u02dd\7\37\2\2\u02d7\u02da\5f\64\2\u02d8\u02d9\7[\2\2\u02d9"+
		"\u02db\7\\\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02de\3\2"+
		"\2\2\u02dc\u02de\5h\65\2\u02dd\u02d7\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e3\7\5\2\2\u02e0\u02e2\7x\2\2\u02e1\u02e0\3\2"+
		"\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e8\5t;\2\u02e7\u02e6\3\2\2"+
		"\2\u02e7\u02e8\3\2\2\2\u02e8\u02ec\3\2\2\2\u02e9\u02eb\7x\2\2\u02ea\u02e9"+
		"\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\u02ef\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f0\7\6\2\2\u02f0\u02f2\3\2"+
		"\2\2\u02f1\u02f3\5\20\t\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		";\3\2\2\2\u02f4\u02f5\7\37\2\2\u02f5\u02fa\5f\64\2\u02f6\u02f7\7\7\2\2"+
		"\u02f7\u02f8\5X-\2\u02f8\u02f9\7\b\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f6"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"=\3\2\2\2\u02fe\u03b8\5\32\16\2\u02ff\u03b8\5<\37\2\u0300\u03b8\5:\36"+
		"\2\u0301\u0302\7#\2\2\u0302\u0305\7\5\2\2\u0303\u0306\5\32\16\2\u0304"+
		"\u0306\5X-\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2"+
		"\2\u0306\u0307\3\2\2\2\u0307\u0309\7V\2\2\u0308\u030a\5X-\2\u0309\u0308"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\7V\2\2\u030c"+
		"\u030e\5X-\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2"+
		"\2\u030f\u0313\7\6\2\2\u0310\u0312\7x\2\2\u0311\u0310\3\2\2\2\u0312\u0315"+
		"\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0316\u03b8\5B\"\2\u0317\u0318\7#\2\2\u0318\u031a\7\5\2"+
		"\2\u0319\u031b\5 \21\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c"+
		"\3\2\2\2\u031c\u031d\7y\2\2\u031d\u031e\7\"\2\2\u031e\u031f\5X-\2\u031f"+
		"\u0323\7\6\2\2\u0320\u0322\7x\2\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0326\u0327\5B\"\2\u0327\u03b8\3\2\2\2\u0328\u0329\7#\2"+
		"\2\u0329\u032a\7\5\2\2\u032a\u032b\5 \21\2\u032b\u032c\7y\2\2\u032c\u032d"+
		"\7]\2\2\u032d\u032e\5X-\2\u032e\u0332\7\6\2\2\u032f\u0331\7x\2\2\u0330"+
		"\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336\5B\"\2\u0336"+
		"\u03b8\3\2\2\2\u0337\u0338\7$\2\2\u0338\u0339\7\5\2\2\u0339\u033a\5X-"+
		"\2\u033a\u033e\7\6\2\2\u033b\u033d\7x\2\2\u033c\u033b\3\2\2\2\u033d\u0340"+
		"\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0341\u0345\5B\"\2\u0342\u0344\7x\2\2\u0343\u0342\3\2\2"+
		"\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0350"+
		"\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u034c\7%\2\2\u0349\u034b\7x\2\2\u034a"+
		"\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2"+
		"\2\2\u034d\u034f\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0351\5B\"\2\u0350"+
		"\u0348\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u03b8\3\2\2\2\u0352\u0353\7\'"+
		"\2\2\u0353\u0354\7\5\2\2\u0354\u0355\5X-\2\u0355\u0359\7\6\2\2\u0356\u0358"+
		"\7x\2\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035d\5B"+
		"\"\2\u035d\u03b8\3\2\2\2\u035e\u035f\7(\2\2\u035f\u0360\7\5\2\2\u0360"+
		"\u0361\5X-\2\u0361\u0365\7\6\2\2\u0362\u0364\7x\2\2\u0363\u0362\3\2\2"+
		"\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368"+
		"\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u036d\7\t\2\2\u0369\u036c\5J&\2\u036a"+
		"\u036c\7x\2\2\u036b\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c\u036f\3\2"+
		"\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u037b\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370\u0371\7*\2\2\u0371\u0377\7]\2\2\u0372\u0373\5> \2"+
		"\u0373\u0374\t\2\2\2\u0374\u0378\3\2\2\2\u0375\u0378\7V\2\2\u0376\u0378"+
		"\7x\2\2\u0377\u0372\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3\2"+
		"\2\2\u037b\u0370\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\u037e\7\n\2\2\u037e\u03b8\3\2\2\2\u037f\u0389\5D#\2\u0380\u0382\5F$\2"+
		"\u0381\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384"+
		"\3\2\2\2\u0384\u0386\3\2\2\2\u0385\u0387\5H%\2\u0386\u0385\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u038a\5H%\2\u0389\u0381\3\2\2"+
		"\2\u0389\u0388\3\2\2\2\u038a\u03b8\3\2\2\2\u038b\u038d\t\4\2\2\u038c\u038e"+
		"\7y\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u03b8\3\2\2\2\u038f"+
		"\u0391\7-\2\2\u0390\u0392\5X-\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2"+
		"\2\u0392\u03b8\3\2\2\2\u0393\u0394\7\61\2\2\u0394\u03b8\5X-\2\u0395\u0396"+
		"\7\63\2\2\u0396\u039f\5X-\2\u0397\u039b\t\5\2\2\u0398\u039a\7x\2\2\u0399"+
		"\u0398\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2"+
		"\2\2\u039c\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a0\5X-\2\u039f\u0397"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03b8\3\2\2\2\u03a1\u03a2\7t\2\2\u03a2"+
		"\u03a3\7\5\2\2\u03a3\u03a4\5X-\2\u03a4\u03a8\7\6\2\2\u03a5\u03a7\7x\2"+
		"\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9"+
		"\3\2\2\2\u03a9\u03ab\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab\u03ac\5B\"\2\u03ac"+
		"\u03b8\3\2\2\2\u03ad\u03ae\7y\2\2\u03ae\u03b2\7]\2\2\u03af\u03b1\7x\2"+
		"\2\u03b0\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3"+
		"\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\5B\"\2\u03b6"+
		"\u03b8\5X-\2\u03b7\u02fe\3\2\2\2\u03b7\u02ff\3\2\2\2\u03b7\u0300\3\2\2"+
		"\2\u03b7\u0301\3\2\2\2\u03b7\u0317\3\2\2\2\u03b7\u0328\3\2\2\2\u03b7\u0337"+
		"\3\2\2\2\u03b7\u0352\3\2\2\2\u03b7\u035e\3\2\2\2\u03b7\u037f\3\2\2\2\u03b7"+
		"\u038b\3\2\2\2\u03b7\u038f\3\2\2\2\u03b7\u0393\3\2\2\2\u03b7\u0395\3\2"+
		"\2\2\u03b7\u03a1\3\2\2\2\u03b7\u03ad\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8"+
		"?\3\2\2\2\u03b9\u03bb\7\t\2\2\u03ba\u03bc\5\62\32\2\u03bb\u03ba\3\2\2"+
		"\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\7\n\2\2\u03beA"+
		"\3\2\2\2\u03bf\u03c2\5@!\2\u03c0\u03c2\5> \2\u03c1\u03bf\3\2\2\2\u03c1"+
		"\u03c0\3\2\2\2\u03c2C\3\2\2\2\u03c3\u03c7\7.\2\2\u03c4\u03c6\7x\2\2\u03c5"+
		"\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2"+
		"\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03ce\5@!\2\u03cb\u03cd"+
		"\7x\2\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cfE\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d5\7/\2\2\u03d2"+
		"\u03d4\7x\2\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2"+
		"\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8"+
		"\u03e4\7\5\2\2\u03d9\u03de\5f\64\2\u03da\u03db\7^\2\2\u03db\u03dd\5f\64"+
		"\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\7y\2\2\u03e2"+
		"\u03e5\3\2\2\2\u03e3\u03e5\7y\2\2\u03e4\u03d9\3\2\2\2\u03e4\u03e3\3\2"+
		"\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03ea\7\6\2\2\u03e7\u03e9\7x\2\2\u03e8"+
		"\u03e7\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03f1\5@!\2\u03ee\u03f0"+
		"\7x\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2G\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f8\7\60\2\2"+
		"\u03f5\u03f7\7x\2\2\u03f6\u03f5\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb"+
		"\u03fc\5@!\2\u03fcI\3\2\2\2\u03fd\u03fe\7)\2\2\u03fe\u03ff\5X-\2\u03ff"+
		"\u0407\7]\2\2\u0400\u0401\5> \2\u0401\u0402\t\2\2\2\u0402\u0406\3\2\2"+
		"\2\u0403\u0406\7V\2\2\u0404\u0406\7x\2\2\u0405\u0400\3\2\2\2\u0405\u0403"+
		"\3\2\2\2\u0405\u0404\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407"+
		"\u0408\3\2\2\2\u0408K\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040b\7y\2\2\u040b"+
		"\u040d\7W\2\2\u040c\u040a\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2"+
		"\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u040e\3\2\2\2\u0411"+
		"\u0412\7y\2\2\u0412M\3\2\2\2\u0413\u0417\7y\2\2\u0414\u0416\7\17\2\2\u0415"+
		"\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2"+
		"\2\2\u0418O\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041e\7\t\2\2\u041b\u041d"+
		"\7x\2\2\u041c\u041b\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u042f\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0425\5."+
		"\30\2\u0422\u0424\7x\2\2\u0423\u0422\3\2\2\2\u0424\u0427\3\2\2\2\u0425"+
		"\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0425\3\2"+
		"\2\2\u0428\u042c\7A\2\2\u0429\u042b\7x\2\2\u042a\u0429\3\2\2\2\u042b\u042e"+
		"\3\2\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0430\3\2\2\2\u042e"+
		"\u042c\3\2\2\2\u042f\u0421\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2"+
		"\2\2\u0431\u0433\5\62\32\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u0435\7\n\2\2\u0435Q\3\2\2\2\u0436\u043e\5N(\2\u0437"+
		"\u0439\7\t\2\2\u0438\u043a\5X-\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2"+
		"\2\u043a\u043b\3\2\2\2\u043b\u043e\7\n\2\2\u043c\u043e\5P)\2\u043d\u0436"+
		"\3\2\2\2\u043d\u0437\3\2\2\2\u043d\u043c\3\2\2\2\u043eS\3\2\2\2\u043f"+
		"\u0440\7\f\2\2\u0440\u0445\5R*\2\u0441\u0442\7\16\2\2\u0442\u0444\5R*"+
		"\2\u0443\u0441\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446"+
		"\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449\7\r\2\2\u0449"+
		"U\3\2\2\2\u044a\u0453\7\7\2\2\u044b\u0450\5V,\2\u044c\u044d\7X\2\2\u044d"+
		"\u044f\5V,\2\u044e\u044c\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2"+
		"\2\u0450\u0451\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u044b"+
		"\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0460\7\b\2\2\u0456"+
		"\u0460\5\\/\2\u0457\u0460\5L\'\2\u0458\u0460\5h\65\2\u0459\u0460\7\13"+
		"\2\2\u045a\u0460\7\21\2\2\u045b\u0460\7\22\2\2\u045c\u0460\7\34\2\2\u045d"+
		"\u0460\t\6\2\2\u045e\u0460\5P)\2\u045f\u044a\3\2\2\2\u045f\u0456\3\2\2"+
		"\2\u045f\u0457\3\2\2\2\u045f\u0458\3\2\2\2\u045f\u0459\3\2\2\2\u045f\u045a"+
		"\3\2\2\2\u045f\u045b\3\2\2\2\u045f\u045c\3\2\2\2\u045f\u045d\3\2\2\2\u045f"+
		"\u045e\3\2\2\2\u0460W\3\2\2\2\u0461\u0462\b-\1\2\u0462\u049c\5Z.\2\u0463"+
		"\u049c\7!\2\2\u0464\u049c\7 \2\2\u0465\u0466\t\7\2\2\u0466\u0468\7\5\2"+
		"\2\u0467\u0469\5t;\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a"+
		"\3\2\2\2\u046a\u049c\7\6\2\2\u046b\u046c\7a\2\2\u046c\u049c\5X-\37\u046d"+
		"\u0471\5b\62\2\u046e\u0470\5b\62\2\u046f\u046e\3\2\2\2\u0470\u0473\3\2"+
		"\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0477\3\2\2\2\u0473"+
		"\u0471\3\2\2\2\u0474\u0478\7y\2\2\u0475\u0478\7\13\2\2\u0476\u0478\5T"+
		"+\2\u0477\u0474\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0476\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478\u049c\3\2\2\2\u0479\u049c\5d\63\2\u047a\u047b\7\5"+
		"\2\2\u047b\u047c\5h\65\2\u047c\u047d\7\6\2\2\u047d\u047e\5X-\31\u047e"+
		"\u049c\3\2\2\2\u047f\u0480\7\5\2\2\u0480\u0481\5X-\2\u0481\u0482\7\6\2"+
		"\2\u0482\u049c\3\2\2\2\u0483\u0484\t\b\2\2\u0484\u049c\5X-\27\u0485\u0486"+
		"\t\t\2\2\u0486\u049c\5X-\25\u0487\u0488\t\n\2\2\u0488\u049c\5X-\24\u0489"+
		"\u048a\7\5\2\2\u048a\u048f\7y\2\2\u048b\u048c\7X\2\2\u048c\u048e\7y\2"+
		"\2\u048d\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490"+
		"\3\2\2\2\u0490\u0492\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u0493\7\6\2\2\u0493"+
		"\u0497\7Z\2\2\u0494\u0496\7x\2\2\u0495\u0494\3\2\2\2\u0496\u0499\3\2\2"+
		"\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\3\2\2\2\u0499\u0497"+
		"\3\2\2\2\u049a\u049c\5X-\3\u049b\u0461\3\2\2\2\u049b\u0463\3\2\2\2\u049b"+
		"\u0464\3\2\2\2\u049b\u0465\3\2\2\2\u049b\u046b\3\2\2\2\u049b\u046d\3\2"+
		"\2\2\u049b\u0479\3\2\2\2\u049b\u047a\3\2\2\2\u049b\u047f\3\2\2\2\u049b"+
		"\u0483\3\2\2\2\u049b\u0485\3\2\2\2\u049b\u0487\3\2\2\2\u049b\u0489\3\2"+
		"\2\2\u049c\u05a0\3\2\2\2\u049d\u049e\f\26\2\2\u049e\u04a2\7D\2\2\u049f"+
		"\u04a1\7x\2\2\u04a0\u049f\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2"+
		"\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5"+
		"\u059f\5X-\27\u04a6\u04a7\f\23\2\2\u04a7\u04ab\t\13\2\2\u04a8\u04aa\7"+
		"x\2\2\u04a9\u04a8\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab"+
		"\u04ac\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae\u059f\5X"+
		"-\24\u04af\u04b0\f\22\2\2\u04b0\u04b4\t\t\2\2\u04b1\u04b3\7x\2\2\u04b2"+
		"\u04b1\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2"+
		"\2\2\u04b5\u04b7\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u059f\5X-\23\u04b8"+
		"\u04b9\f\21\2\2\u04b9\u04bd\t\f\2\2\u04ba\u04bc\7x\2\2\u04bb\u04ba\3\2"+
		"\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04c0\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u059f\5X-\22\u04c1\u04c8\f\20"+
		"\2\2\u04c2\u04c9\7E\2\2\u04c3\u04c4\7\\\2\2\u04c4\u04c9\7\\\2\2\u04c5"+
		"\u04c6\7\\\2\2\u04c6\u04c7\7\\\2\2\u04c7\u04c9\7\\\2\2\u04c8\u04c2\3\2"+
		"\2\2\u04c8\u04c3\3\2\2\2\u04c8\u04c5\3\2\2\2\u04c9\u04cd\3\2\2\2\u04ca"+
		"\u04cc\7x\2\2\u04cb\u04ca\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2"+
		"\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u059f\5X-\21\u04d1\u04d2\f\17\2\2\u04d2\u04d6\7\"\2\2\u04d3\u04d5\7x"+
		"\2\2\u04d4\u04d3\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6"+
		"\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9\u059f\5X"+
		"-\20\u04da\u04db\f\r\2\2\u04db\u04df\t\r\2\2\u04dc\u04de\7x\2\2\u04dd"+
		"\u04dc\3\2\2\2\u04de\u04e1\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2"+
		"\2\2\u04e0\u04e2\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u059f\5X-\16\u04e3"+
		"\u04e4\f\f\2\2\u04e4\u04e8\t\16\2\2\u04e5\u04e7\7x\2\2\u04e6\u04e5\3\2"+
		"\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04eb\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u059f\5X-\r\u04ec\u04ed\f\13"+
		"\2\2\u04ed\u04f1\t\17\2\2\u04ee\u04f0\7x\2\2\u04ef\u04ee\3\2\2\2\u04f0"+
		"\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2"+
		"\2\2\u04f3\u04f1\3\2\2\2\u04f4\u059f\5X-\f\u04f5\u04f6\f\n\2\2\u04f6\u04fa"+
		"\7f\2\2\u04f7\u04f9\7x\2\2\u04f8\u04f7\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fa\3\2"+
		"\2\2\u04fd\u059f\5X-\13\u04fe\u04ff\f\t\2\2\u04ff\u0503\7g\2\2\u0500\u0502"+
		"\7x\2\2\u0501\u0500\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503"+
		"\u0504\3\2\2\2\u0504\u0506\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u059f\5X"+
		"-\n\u0507\u0508\f\b\2\2\u0508\u050c\7^\2\2\u0509\u050b\7x\2\2\u050a\u0509"+
		"\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050f\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u059f\5X-\t\u0510\u0514\f\7\2"+
		"\2\u0511\u0513\7x\2\2\u0512\u0511\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512"+
		"\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u0514\3\2\2\2\u0517"+
		"\u051b\7L\2\2\u0518\u051a\7x\2\2\u0519\u0518\3\2\2\2\u051a\u051d\3\2\2"+
		"\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051b"+
		"\3\2\2\2\u051e\u059f\5X-\b\u051f\u0523\f\6\2\2\u0520\u0522\7x\2\2\u0521"+
		"\u0520\3\2\2\2\u0522\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2"+
		"\2\2\u0524\u0526\3\2\2\2\u0525\u0523\3\2\2\2\u0526\u052a\7M\2\2\u0527"+
		"\u0529\7x\2\2\u0528\u0527\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u0528\3\2"+
		"\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u052a\3\2\2\2\u052d"+
		"\u059f\5X-\7\u052e\u0532\f\5\2\2\u052f\u0531\7x\2\2\u0530\u052f\3\2\2"+
		"\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0546"+
		"\3\2\2\2\u0534\u0532\3\2\2\2\u0535\u0539\7h\2\2\u0536\u0538\7x\2\2\u0537"+
		"\u0536\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2"+
		"\2\2\u053a\u053c\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u0540\5X-\2\u053d\u053f"+
		"\7x\2\2\u053e\u053d\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0544\7]"+
		"\2\2\u0544\u0547\3\2\2\2\u0545\u0547\7:\2\2\u0546\u0535\3\2\2\2\u0546"+
		"\u0545\3\2\2\2\u0547\u054b\3\2\2\2\u0548\u054a\7x\2\2\u0549\u0548\3\2"+
		"\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c"+
		"\u054e\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u059f\5X-\5\u054f\u0550\f\4\2"+
		"\2\u0550\u0554\t\20\2\2\u0551\u0553\7x\2\2\u0552\u0551\3\2\2\2\u0553\u0556"+
		"\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0557\u059f\5X-\4\u0558\u055c\f \2\2\u0559\u055b\7x\2\2"+
		"\u055a\u0559\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0567\t\21\2\2"+
		"\u0560\u0568\5x=\2\u0561\u0568\7\13\2\2\u0562\u0568\5T+\2\u0563\u0564"+
		"\7\5\2\2\u0564\u0565\5X-\2\u0565\u0566\7\6\2\2\u0566\u0568\3\2\2\2\u0567"+
		"\u0560\3\2\2\2\u0567\u0561\3\2\2\2\u0567\u0562\3\2\2\2\u0567\u0563\3\2"+
		"\2\2\u0568\u059f\3\2\2\2\u0569\u056a\f\36\2\2\u056a\u059f\t\n\2\2\u056b"+
		"\u056c\f\35\2\2\u056c\u0575\7\7\2\2\u056d\u0572\5X-\2\u056e\u056f\7X\2"+
		"\2\u056f\u0571\5X-\2\u0570\u056e\3\2\2\2\u0571\u0574\3\2\2\2\u0572\u0570"+
		"\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0575"+
		"\u056d\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u059f\7\b"+
		"\2\2\u0578\u057c\f\34\2\2\u0579\u057b\7x\2\2\u057a\u0579\3\2\2\2\u057b"+
		"\u057e\3\2\2\2\u057c\u057a\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2"+
		"\2\2\u057e\u057c\3\2\2\2\u057f\u0583\t\22\2\2\u0580\u0582\7x\2\2\u0581"+
		"\u0580\3\2\2\2\u0582\u0585\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2"+
		"\2\2\u0584\u0587\3\2\2\2\u0585\u0583\3\2\2\2\u0586\u0588\5(\25\2\u0587"+
		"\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058d\5`"+
		"\61\2\u058a\u058c\5b\62\2\u058b\u058a\3\2\2\2\u058c\u058f\3\2\2\2\u058d"+
		"\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0593\3\2\2\2\u058f\u058d\3\2"+
		"\2\2\u0590\u0594\7y\2\2\u0591\u0594\7\13\2\2\u0592\u0594\5T+\2\u0593\u0590"+
		"\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u059f\3\2\2\2\u0595\u0596\f\16\2\2\u0596\u059a\t\23\2\2\u0597\u0599\7"+
		"x\2\2\u0598\u0597\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a"+
		"\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u059f\5h"+
		"\65\2\u059e\u049d\3\2\2\2\u059e\u04a6\3\2\2\2\u059e\u04af\3\2\2\2\u059e"+
		"\u04b8\3\2\2\2\u059e\u04c1\3\2\2\2\u059e\u04d1\3\2\2\2\u059e\u04da\3\2"+
		"\2\2\u059e\u04e3\3\2\2\2\u059e\u04ec\3\2\2\2\u059e\u04f5\3\2\2\2\u059e"+
		"\u04fe\3\2\2\2\u059e\u0507\3\2\2\2\u059e\u0510\3\2\2\2\u059e\u051f\3\2"+
		"\2\2\u059e\u052e\3\2\2\2\u059e\u054f\3\2\2\2\u059e\u0558\3\2\2\2\u059e"+
		"\u0569\3\2\2\2\u059e\u056b\3\2\2\2\u059e\u0578\3\2\2\2\u059e\u0595\3\2"+
		"\2\2\u059f\u05a2\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"Y\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a3\u0610\7\13\2\2\u05a4\u0610\5T+\2\u05a5"+
		"\u0610\7\21\2\2\u05a6\u0610\7\22\2\2\u05a7\u0610\7\34\2\2\u05a8\u0610"+
		"\t\6\2\2\u05a9\u0610\7y\2\2\u05aa\u0610\5\\/\2\u05ab\u0610\5P)\2\u05ac"+
		"\u05b0\7\7\2\2\u05ad\u05af\7x\2\2\u05ae\u05ad\3\2\2\2\u05af\u05b2\3\2"+
		"\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05d0\3\2\2\2\u05b2"+
		"\u05b0\3\2\2\2\u05b3\u05ca\5X-\2\u05b4\u05b6\7x\2\2\u05b5\u05b4\3\2\2"+
		"\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05ba"+
		"\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba\u05be\7X\2\2\u05bb\u05bd\7x\2\2\u05bc"+
		"\u05bb\3\2\2\2\u05bd\u05c0\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2"+
		"\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c5\5X-\2\u05c2\u05c4"+
		"\7x\2\2\u05c3\u05c2\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5"+
		"\u05c6\3\2\2\2\u05c6\u05c9\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8\u05b7\3\2"+
		"\2\2\u05c9\u05cc\3\2\2\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb"+
		"\u05ce\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cd\u05cf\7X\2\2\u05ce\u05cd\3\2"+
		"\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05b3\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u05d5\3\2\2\2\u05d2\u05d4\7x\2\2\u05d3\u05d2\3\2"+
		"\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6"+
		"\u05d8\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8\u0610\7\b\2\2\u05d9\u05dd\7\7"+
		"\2\2\u05da\u05dc\7x\2\2\u05db\u05da\3\2\2\2\u05dc\u05df\3\2\2\2\u05dd"+
		"\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u0604\3\2\2\2\u05df\u05dd\3\2"+
		"\2\2\u05e0\u05e4\7]\2\2\u05e1\u05e3\7x\2\2\u05e2\u05e1\3\2\2\2\u05e3\u05e6"+
		"\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u0605\3\2\2\2\u05e6"+
		"\u05e4\3\2\2\2\u05e7\u05fe\5n8\2\u05e8\u05ea\7x\2\2\u05e9\u05e8\3\2\2"+
		"\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee"+
		"\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05f2\7X\2\2\u05ef\u05f1\7x\2\2\u05f0"+
		"\u05ef\3\2\2\2\u05f1\u05f4\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2"+
		"\2\2\u05f3\u05f5\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5\u05f9\5n8\2\u05f6\u05f8"+
		"\7x\2\2\u05f7\u05f6\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc\u05eb\3\2"+
		"\2\2\u05fd\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0602\3\2\2\2\u0600\u05fe\3\2\2\2\u0601\u0603\7X\2\2\u0602\u0601\3\2"+
		"\2\2\u0602\u0603\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u05e0\3\2\2\2\u0604"+
		"\u05e7\3\2\2\2\u0605\u0609\3\2\2\2\u0606\u0608\7x\2\2\u0607\u0606\3\2"+
		"\2\2\u0608\u060b\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a"+
		"\u060c\3\2\2\2\u060b\u0609\3\2\2\2\u060c\u0610\7\b\2\2\u060d\u0610\5<"+
		"\37\2\u060e\u0610\5:\36\2\u060f\u05a3\3\2\2\2\u060f\u05a4\3\2\2\2\u060f"+
		"\u05a5\3\2\2\2\u060f\u05a6\3\2\2\2\u060f\u05a7\3\2\2\2\u060f\u05a8\3\2"+
		"\2\2\u060f\u05a9\3\2\2\2\u060f\u05aa\3\2\2\2\u060f\u05ab\3\2\2\2\u060f"+
		"\u05ac\3\2\2\2\u060f\u05d9\3\2\2\2\u060f\u060d\3\2\2\2\u060f\u060e\3\2"+
		"\2\2\u0610[\3\2\2\2\u0611\u0614\5f\64\2\u0612\u0613\7W\2\2\u0613\u0615"+
		"\7\23\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615]\3\2\2\2\u0616"+
		"\u061a\7\5\2\2\u0617\u0619\7x\2\2\u0618\u0617\3\2\2\2\u0619\u061c\3\2"+
		"\2\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061e\3\2\2\2\u061c"+
		"\u061a\3\2\2\2\u061d\u061f\5t;\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2"+
		"\2\u061f\u0623\3\2\2\2\u0620\u0622\7x\2\2\u0621\u0620\3\2\2\2\u0622\u0625"+
		"\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0626\3\2\2\2\u0625"+
		"\u0623\3\2\2\2\u0626\u062a\7\6\2\2\u0627\u0629\5P)\2\u0628\u0627\3\2\2"+
		"\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b_"+
		"\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u0635\5x=\2\u062e\u0635\7\13\2\2\u062f"+
		"\u0635\5T+\2\u0630\u0631\7\5\2\2\u0631\u0632\5X-\2\u0632\u0633\7\6\2\2"+
		"\u0633\u0635\3\2\2\2\u0634\u062d\3\2\2\2\u0634\u062e\3\2\2\2\u0634\u062f"+
		"\3\2\2\2\u0634\u0630\3\2\2\2\u0635\u0637\3\2\2\2\u0636\u0638\5^\60\2\u0637"+
		"\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u0637\3\2\2\2\u0639\u063a\3\2"+
		"\2\2\u063a\u0647\3\2\2\2\u063b\u0643\6\61%\2\u063c\u0644\5x=\2\u063d\u0644"+
		"\7\13\2\2\u063e\u0644\5T+\2\u063f\u0640\7\5\2\2\u0640\u0641\5X-\2\u0641"+
		"\u0642\7\6\2\2\u0642\u0644\3\2\2\2\u0643\u063c\3\2\2\2\u0643\u063d\3\2"+
		"\2\2\u0643\u063e\3\2\2\2\u0643\u063f\3\2\2\2\u0644\u0645\3\2\2\2\u0645"+
		"\u0647\5t;\2\u0646\u0634\3\2\2\2\u0646\u063b\3\2\2\2\u0647a\3\2\2\2\u0648"+
		"\u064c\7y\2\2\u0649\u064c\7\13\2\2\u064a\u064c\5T+\2\u064b\u0648\3\2\2"+
		"\2\u064b\u0649\3\2\2\2\u064b\u064a\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u064f"+
		"\5^\60\2\u064e\u064d\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u064e\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u065a\3\2\2\2\u0652\u0656\6\62&\2\u0653\u0657\7y"+
		"\2\2\u0654\u0657\7\13\2\2\u0655\u0657\5T+\2\u0656\u0653\3\2\2\2\u0656"+
		"\u0654\3\2\2\2\u0656\u0655\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a\5t"+
		";\2\u0659\u064b\3\2\2\2\u0659\u0652\3\2\2\2\u065ac\3\2\2\2\u065b\u065d"+
		"\5Z.\2\u065c\u065e\5^\60\2\u065d\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f"+
		"\u065d\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u066f\3\2\2\2\u0661\u0662\6\63"+
		"\'\2\u0662\u0663\5P)\2\u0663\u0664\5t;\2\u0664\u066f\3\2\2\2\u0665\u0666"+
		"\6\63(\2\u0666\u0667\7\5\2\2\u0667\u0668\5X-\2\u0668\u066a\7\6\2\2\u0669"+
		"\u066b\5^\60\2\u066a\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066a\3\2"+
		"\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2\2\2\u066e\u065b\3\2\2\2\u066e"+
		"\u0661\3\2\2\2\u066e\u0665\3\2\2\2\u066fe\3\2\2\2\u0670\u0673\6\64)\2"+
		"\u0671\u0674\7l\2\2\u0672\u0674\5L\'\2\u0673\u0671\3\2\2\2\u0673\u0672"+
		"\3\2\2\2\u0674g\3\2\2\2\u0675\u0677\5f\64\2\u0676\u0678\5j\66\2\u0677"+
		"\u0676\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u067d\3\2\2\2\u0679\u067a\7\7"+
		"\2\2\u067a\u067c\7\b\2\2\u067b\u0679\3\2\2\2\u067c\u067f\3\2\2\2\u067d"+
		"\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0682\3\2\2\2\u067f\u067d\3\2"+
		"\2\2\u0680\u0681\7i\2\2\u0681\u0683\6\65*\2\u0682\u0680\3\2\2\2\u0682"+
		"\u0683\3\2\2\2\u0683i\3\2\2\2\u0684\u0685\7[\2\2\u0685\u068a\5l\67\2\u0686"+
		"\u0687\7X\2\2\u0687\u0689\5l\67\2\u0688\u0686\3\2\2\2\u0689\u068c\3\2"+
		"\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\3\2\2\2\u068c"+
		"\u068a\3\2\2\2\u068d\u068e\7\\\2\2\u068ek\3\2\2\2\u068f\u0698\5h\65\2"+
		"\u0690\u0695\7h\2\2\u0691\u0692\7\31\2\2\u0692\u0696\5h\65\2\u0693\u0694"+
		"\7 \2\2\u0694\u0696\5h\65\2\u0695\u0691\3\2\2\2\u0695\u0693\3\2\2\2\u0695"+
		"\u0696\3\2\2\2\u0696\u0698\3\2\2\2\u0697\u068f\3\2\2\2\u0697\u0690\3\2"+
		"\2\2\u0698m\3\2\2\2\u0699\u069a\7\13\2\2\u069a\u069b\7]\2\2\u069b\u06b4"+
		"\5X-\2\u069c\u069d\5T+\2\u069d\u069e\7]\2\2\u069e\u069f\5X-\2\u069f\u06b4"+
		"\3\2\2\2\u06a0\u06a1\5x=\2\u06a1\u06a2\7]\2\2\u06a2\u06a3\5X-\2\u06a3"+
		"\u06b4\3\2\2\2\u06a4\u06a5\7\5\2\2\u06a5\u06a6\5X-\2\u06a6\u06a7\7\6\2"+
		"\2\u06a7\u06a8\7]\2\2\u06a8\u06a9\5X-\2\u06a9\u06b4\3\2\2\2\u06aa\u06ab"+
		"\7a\2\2\u06ab\u06ac\7]\2\2\u06ac\u06b4\5X-\2\u06ad\u06ae\7\21\2\2\u06ae"+
		"\u06af\7]\2\2\u06af\u06b4\5X-\2\u06b0\u06b1\7\22\2\2\u06b1\u06b2\7]\2"+
		"\2\u06b2\u06b4\5X-\2\u06b3\u0699\3\2\2\2\u06b3\u069c\3\2\2\2\u06b3\u06a0"+
		"\3\2\2\2\u06b3\u06a4\3\2\2\2\u06b3\u06aa\3\2\2\2\u06b3\u06ad\3\2\2\2\u06b3"+
		"\u06b0\3\2\2\2\u06b4o\3\2\2\2\u06b5\u06ba\7m\2\2\u06b6\u06ba\7o\2\2\u06b7"+
		"\u06ba\t\24\2\2\u06b8\u06ba\7u\2\2\u06b9\u06b5\3\2\2\2\u06b9\u06b6\3\2"+
		"\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06b8\3\2\2\2\u06baq\3\2\2\2\u06bb\u06c3"+
		"\7m\2\2\u06bc\u06c3\7o\2\2\u06bd\u06c3\t\24\2\2\u06be\u06c3\7r\2\2\u06bf"+
		"\u06c3\7t\2\2\u06c0\u06c3\7q\2\2\u06c1\u06c3\7s\2\2\u06c2\u06bb\3\2\2"+
		"\2\u06c2\u06bc\3\2\2\2\u06c2\u06bd\3\2\2\2\u06c2\u06be\3\2\2\2\u06c2\u06bf"+
		"\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c1\3\2\2\2\u06c3s\3\2\2\2\u06c4"+
		"\u06c6\5P)\2\u06c5\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c5\3\2\2"+
		"\2\u06c7\u06c8\3\2\2\2\u06c8\u06de\3\2\2\2\u06c9\u06da\5v<\2\u06ca\u06cc"+
		"\7x\2\2\u06cb\u06ca\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06cd"+
		"\u06ce\3\2\2\2\u06ce\u06d0\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u06d4\7X"+
		"\2\2\u06d1\u06d3\7x\2\2\u06d2\u06d1\3\2\2\2\u06d3\u06d6\3\2\2\2\u06d4"+
		"\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d7\3\2\2\2\u06d6\u06d4\3\2"+
		"\2\2\u06d7\u06d9\5v<\2\u06d8\u06cd\3\2\2\2\u06d9\u06dc\3\2\2\2\u06da\u06d8"+
		"\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06de\3\2\2\2\u06dc\u06da\3\2\2\2\u06dd"+
		"\u06c5\3\2\2\2\u06dd\u06c9\3\2\2\2\u06deu\3\2\2\2\u06df\u06e2\5n8\2\u06e0"+
		"\u06e2\5X-\2\u06e1\u06df\3\2\2\2\u06e1\u06e0\3\2\2\2\u06e2w\3\2\2\2\u06e3"+
		"\u06e6\7y\2\2\u06e4\u06e6\5z>\2\u06e5\u06e3\3\2\2\2\u06e5\u06e4\3\2\2"+
		"\2\u06e6y\3\2\2\2\u06e7\u06e8\t\25\2\2\u06e8{\3\2\2\2\u0103}\u0082\u0086"+
		"\u008b\u0096\u0098\u009e\u00a2\u00a7\u00af\u00b4\u00b6\u00b9\u00c1\u00c7"+
		"\u00c9\u00cc\u00d0\u00d7\u00dc\u00e0\u00e7\u00ef\u00f1\u00f4\u00fe\u0104"+
		"\u0109\u010d\u0112\u0116\u0119\u011e\u0128\u012f\u0135\u013d\u0144\u0149"+
		"\u0150\u0154\u0157\u015e\u0160\u0167\u016a\u0172\u017a\u0180\u0187\u018f"+
		"\u0196\u01a1\u01ac\u01ae\u01b5\u01b8\u01bf\u01c6\u01cb\u01d0\u01da\u01e5"+
		"\u01e7\u01eb\u01ee\u01f5\u01fb\u0203\u0208\u020c\u0210\u0219\u0223\u0227"+
		"\u022a\u0231\u0238\u0240\u024c\u024f\u0257\u025f\u0264\u026c\u0271\u0275"+
		"\u0278\u027f\u0283\u0288\u028e\u0292\u0296\u029b\u02a2\u02a7\u02ad\u02b0"+
		"\u02b7\u02bb\u02c3\u02cb\u02cf\u02d2\u02da\u02dd\u02e3\u02e7\u02ec\u02f2"+
		"\u02fc\u0305\u0309\u030d\u0313\u031a\u0323\u0332\u033e\u0345\u034c\u0350"+
		"\u0359\u0365\u036b\u036d\u0377\u0379\u037b\u0383\u0386\u0389\u038d\u0391"+
		"\u039b\u039f\u03a8\u03b2\u03b7\u03bb\u03c1\u03c7\u03ce\u03d5\u03de\u03e4"+
		"\u03ea\u03f1\u03f8\u0405\u0407\u040e\u0417\u041e\u0425\u042c\u042f\u0432"+
		"\u0439\u043d\u0445\u0450\u0453\u045f\u0468\u0471\u0477\u048f\u0497\u049b"+
		"\u04a2\u04ab\u04b4\u04bd\u04c8\u04cd\u04d6\u04df\u04e8\u04f1\u04fa\u0503"+
		"\u050c\u0514\u051b\u0523\u052a\u0532\u0539\u0540\u0546\u054b\u0554\u055c"+
		"\u0567\u0572\u0575\u057c\u0583\u0587\u058d\u0593\u059a\u059e\u05a0\u05b0"+
		"\u05b7\u05be\u05c5\u05ca\u05ce\u05d0\u05d5\u05dd\u05e4\u05eb\u05f2\u05f9"+
		"\u05fe\u0602\u0604\u0609\u060f\u0614\u061a\u061e\u0623\u062a\u0634\u0639"+
		"\u0643\u0646\u064b\u0650\u0656\u0659\u065f\u066c\u066e\u0673\u0677\u067d"+
		"\u0682\u068a\u0695\u0697\u06b3\u06b9\u06c2\u06c7\u06cd\u06d4\u06da\u06dd"+
		"\u06e1\u06e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}