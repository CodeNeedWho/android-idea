// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/lua\Lua.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.lua;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, NAME=50, NORMALSTRING=51, CHARSTRING=52, 
		LONGSTRING=53, INT=54, HEX=55, FLOAT=56, HEX_FLOAT=57, COMMENT=58, LINE_COMMENT=59, 
		WS=60, SHEBANG=61;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_retstat = 3, RULE_label = 4, 
		RULE_funcname = 5, RULE_varlist = 6, RULE_namelist = 7, RULE_explist = 8, 
		RULE_exp = 9, RULE_var = 10, RULE_prefixexp = 11, RULE_functioncall = 12, 
		RULE_varOrExp = 13, RULE_nameAndArgs = 14, RULE_varSuffix = 15, RULE_args = 16, 
		RULE_functiondef = 17, RULE_funcbody = 18, RULE_parlist = 19, RULE_tableconstructor = 20, 
		RULE_fieldlist = 21, RULE_field = 22, RULE_fieldsep = 23, RULE_operatorOr = 24, 
		RULE_operatorAnd = 25, RULE_operatorComparison = 26, RULE_operatorStrcat = 27, 
		RULE_operatorAddSub = 28, RULE_operatorMulDivMod = 29, RULE_operatorUnary = 30, 
		RULE_operatorPower = 31, RULE_number = 32, RULE_string = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "block", "stat", "retstat", "label", "funcname", "varlist", 
			"namelist", "explist", "exp", "var", "prefixexp", "functioncall", "varOrExp", 
			"nameAndArgs", "varSuffix", "args", "functiondef", "funcbody", "parlist", 
			"tableconstructor", "fieldlist", "field", "fieldsep", "operatorOr", "operatorAnd", 
			"operatorComparison", "operatorStrcat", "operatorAddSub", "operatorMulDivMod", 
			"operatorUnary", "operatorPower", "number", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'break'", "'goto'", "'do'", "'end'", "'while'", 
			"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
			"','", "'in'", "'function'", "'local'", "'return'", "'::'", "'.'", "':'", 
			"'nil'", "'false'", "'true'", "'...'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'or'", "'and'", "'<'", "'>'", "'<='", "'>='", "'~='", "'=='", 
			"'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'#'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "NAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", "INT", 
			"HEX", "FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", "WS", "SHEBANG"
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
	public String getGrammarFileName() { return "Lua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LuaParser.EOF, 0); }
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			block();
			setState(69);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__26) | (1L << NAME))) != 0)) {
				{
				{
				setState(71);
				stat();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(77);
				retstat();
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

	public static class StatContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				varlist();
				setState(82);
				match(T__1);
				setState(83);
				explist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(T__3);
				setState(89);
				match(NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(T__4);
				setState(91);
				block();
				setState(92);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				match(T__6);
				setState(95);
				exp(0);
				setState(96);
				match(T__4);
				setState(97);
				block();
				setState(98);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				match(T__7);
				setState(101);
				block();
				setState(102);
				match(T__8);
				setState(103);
				exp(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(105);
				match(T__9);
				setState(106);
				exp(0);
				setState(107);
				match(T__10);
				setState(108);
				block();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(109);
					match(T__11);
					setState(110);
					exp(0);
					setState(111);
					match(T__10);
					setState(112);
					block();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(119);
					match(T__12);
					setState(120);
					block();
					}
				}

				setState(123);
				match(T__5);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(125);
				match(T__13);
				setState(126);
				match(NAME);
				setState(127);
				match(T__1);
				setState(128);
				exp(0);
				setState(129);
				match(T__14);
				setState(130);
				exp(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(131);
					match(T__14);
					setState(132);
					exp(0);
					}
				}

				setState(135);
				match(T__4);
				setState(136);
				block();
				setState(137);
				match(T__5);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(139);
				match(T__13);
				setState(140);
				namelist();
				setState(141);
				match(T__15);
				setState(142);
				explist();
				setState(143);
				match(T__4);
				setState(144);
				block();
				setState(145);
				match(T__5);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(147);
				match(T__16);
				setState(148);
				funcname();
				setState(149);
				funcbody();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(151);
				match(T__17);
				setState(152);
				match(T__16);
				setState(153);
				match(NAME);
				setState(154);
				funcbody();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(155);
				match(T__17);
				setState(156);
				namelist();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(157);
					match(T__1);
					setState(158);
					explist();
					}
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

	public static class RetstatContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterRetstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitRetstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitRetstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__18);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << NAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
				{
				setState(164);
				explist();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(167);
				match(T__0);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__19);
			setState(171);
			match(NAME);
			setState(172);
			match(T__19);
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

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(NAME);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(175);
				match(T__20);
				setState(176);
				match(NAME);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(182);
				match(T__21);
				setState(183);
				match(NAME);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			var();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(187);
				match(T__14);
				setState(188);
				var();
				}
				}
				setState(193);
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

	public static class NamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(LuaParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(LuaParser.NAME, i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNamelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(NAME);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					match(T__14);
					setState(196);
					match(NAME);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			exp(0);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(203);
				match(T__14);
				setState(204);
				exp(0);
				}
				}
				setState(209);
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

	public static class ExpContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorPowerContext operatorPower() {
			return getRuleContext(OperatorPowerContext.class,0);
		}
		public OperatorMulDivModContext operatorMulDivMod() {
			return getRuleContext(OperatorMulDivModContext.class,0);
		}
		public OperatorAddSubContext operatorAddSub() {
			return getRuleContext(OperatorAddSubContext.class,0);
		}
		public OperatorStrcatContext operatorStrcat() {
			return getRuleContext(OperatorStrcatContext.class,0);
		}
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(211);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(212);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(213);
				match(T__24);
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				{
				setState(214);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				{
				setState(215);
				string();
				}
				break;
			case T__25:
				{
				setState(216);
				match(T__25);
				}
				break;
			case T__16:
				{
				setState(217);
				functiondef();
				}
				break;
			case T__26:
			case NAME:
				{
				setState(218);
				prefixexp();
				}
				break;
			case T__30:
				{
				setState(219);
				tableconstructor();
				}
				break;
			case T__42:
			case T__46:
			case T__47:
				{
				setState(220);
				operatorUnary();
				setState(221);
				exp(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(225);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(226);
						operatorPower();
						setState(227);
						exp(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(229);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(230);
						operatorMulDivMod();
						setState(231);
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						operatorAddSub();
						setState(235);
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(237);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(238);
						operatorStrcat();
						setState(239);
						exp(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(241);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(242);
						operatorComparison();
						setState(243);
						exp(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						operatorAnd();
						setState(247);
						exp(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(249);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(250);
						operatorOr();
						setState(251);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(258);
				match(NAME);
				}
				break;
			case T__26:
				{
				setState(259);
				match(T__26);
				setState(260);
				exp(0);
				setState(261);
				match(T__27);
				setState(262);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					varSuffix();
					}
					} 
				}
				setState(271);
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

	public static class PrefixexpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitPrefixexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			varOrExp();
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					nameAndArgs();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			varOrExp();
			setState(281); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(280);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class VarOrExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varOrExp);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__26);
				setState(287);
				exp(0);
				setState(288);
				match(T__27);
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

	public static class NameAndArgsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNameAndArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNameAndArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNameAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(292);
				match(T__21);
				setState(293);
				match(NAME);
				}
			}

			setState(296);
			args();
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

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterVarSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitVarSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__26) | (1L << T__30) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING))) != 0)) {
				{
				{
				setState(298);
				nameAndArgs();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				{
				setState(304);
				match(T__28);
				setState(305);
				exp(0);
				setState(306);
				match(T__29);
				}
				break;
			case T__20:
				{
				setState(308);
				match(T__20);
				setState(309);
				match(NAME);
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

	public static class ArgsContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__26);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__30) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << NAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
					{
					setState(313);
					explist();
					}
				}

				setState(316);
				match(T__27);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				tableconstructor();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				string();
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

	public static class FunctiondefContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFunctiondef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__16);
			setState(322);
			funcbody();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFuncbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__26);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25 || _la==NAME) {
				{
				setState(325);
				parlist();
				}
			}

			setState(328);
			match(T__27);
			setState(329);
			block();
			setState(330);
			match(T__5);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitParlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parlist);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				namelist();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(333);
					match(T__14);
					setState(334);
					match(T__25);
					}
				}

				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(T__25);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterTableconstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitTableconstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitTableconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__30);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__30) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << NAME) | (1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING) | (1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) {
				{
				setState(341);
				fieldlist();
				}
			}

			setState(344);
			match(T__31);
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

	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFieldlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			field();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					fieldsep();
					setState(348);
					field();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__14) {
				{
				setState(355);
				fieldsep();
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

	public static class FieldContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NAME() { return getToken(LuaParser.NAME, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_field);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__28);
				setState(359);
				exp(0);
				setState(360);
				match(T__29);
				setState(361);
				match(T__1);
				setState(362);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(NAME);
				setState(365);
				match(T__1);
				setState(366);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				exp(0);
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterFieldsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitFieldsep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__14) ) {
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

	public static class OperatorOrContext extends ParserRuleContext {
		public OperatorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOrContext operatorOr() throws RecognitionException {
		OperatorOrContext _localctx = new OperatorOrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__32);
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

	public static class OperatorAndContext extends ParserRuleContext {
		public OperatorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAndContext operatorAnd() throws RecognitionException {
		OperatorAndContext _localctx = new OperatorAndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__33);
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

	public static class OperatorComparisonContext extends ParserRuleContext {
		public OperatorComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorComparisonContext operatorComparison() throws RecognitionException {
		OperatorComparisonContext _localctx = new OperatorComparisonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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

	public static class OperatorStrcatContext extends ParserRuleContext {
		public OperatorStrcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorStrcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorStrcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorStrcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorStrcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorStrcatContext operatorStrcat() throws RecognitionException {
		OperatorStrcatContext _localctx = new OperatorStrcatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__40);
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

	public static class OperatorAddSubContext extends ParserRuleContext {
		public OperatorAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAddSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAddSubContext operatorAddSub() throws RecognitionException {
		OperatorAddSubContext _localctx = new OperatorAddSubContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
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

	public static class OperatorMulDivModContext extends ParserRuleContext {
		public OperatorMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorMulDivModContext operatorMulDivMod() throws RecognitionException {
		OperatorMulDivModContext _localctx = new OperatorMulDivModContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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

	public static class OperatorUnaryContext extends ParserRuleContext {
		public OperatorUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorUnaryContext operatorUnary() throws RecognitionException {
		OperatorUnaryContext _localctx = new OperatorUnaryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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

	public static class OperatorPowerContext extends ParserRuleContext {
		public OperatorPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterOperatorPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitOperatorPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitOperatorPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorPowerContext operatorPower() throws RecognitionException {
		OperatorPowerContext _localctx = new OperatorPowerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__48);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LuaParser.INT, 0); }
		public TerminalNode HEX() { return getToken(LuaParser.HEX, 0); }
		public TerminalNode FLOAT() { return getToken(LuaParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(LuaParser.HEX_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << HEX) | (1L << FLOAT) | (1L << HEX_FLOAT))) != 0)) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(LuaParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(LuaParser.CHARSTRING, 0); }
		public TerminalNode LONGSTRING() { return getToken(LuaParser.LONGSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaListener ) ((LuaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LuaVisitor ) return ((LuaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORMALSTRING) | (1L << CHARSTRING) | (1L << LONGSTRING))) != 0)) ) {
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
		case 9:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\5\3Q\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"u\n\4\f\4\16\4x\13\4\3\4\3\4\5\4|\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0088\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a2\n\4\5\4\u00a4"+
		"\n\4\3\5\3\5\5\5\u00a8\n\5\3\5\5\5\u00ab\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\7\3\7\5\7\u00bb\n\7\3\b\3\b\3\b"+
		"\7\b\u00c0\n\b\f\b\16\b\u00c3\13\b\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t"+
		"\u00cb\13\t\3\n\3\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e2\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0100\n\13\f\13\16\13\u0103\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010b"+
		"\n\f\3\f\7\f\u010e\n\f\f\f\16\f\u0111\13\f\3\r\3\r\7\r\u0115\n\r\f\r\16"+
		"\r\u0118\13\r\3\16\3\16\6\16\u011c\n\16\r\16\16\16\u011d\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0125\n\17\3\20\3\20\5\20\u0129\n\20\3\20\3\20\3\21\7"+
		"\21\u012e\n\21\f\21\16\21\u0131\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0139\n\21\3\22\3\22\5\22\u013d\n\22\3\22\3\22\3\22\5\22\u0142\n\22"+
		"\3\23\3\23\3\23\3\24\3\24\5\24\u0149\n\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u0152\n\25\3\25\5\25\u0155\n\25\3\26\3\26\5\26\u0159\n\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\7\27\u0161\n\27\f\27\16\27\u0164\13\27\3"+
		"\27\5\27\u0167\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0173\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\2\3\24$\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\t\4\2\3\3\21\21\3"+
		"\2%*\3\2,-\3\2.\60\4\2--\61\62\3\28;\3\2\65\67\2\u01a6\2F\3\2\2\2\4L\3"+
		"\2\2\2\6\u00a3\3\2\2\2\b\u00a5\3\2\2\2\n\u00ac\3\2\2\2\f\u00b0\3\2\2\2"+
		"\16\u00bc\3\2\2\2\20\u00c4\3\2\2\2\22\u00cc\3\2\2\2\24\u00e1\3\2\2\2\26"+
		"\u010a\3\2\2\2\30\u0112\3\2\2\2\32\u0119\3\2\2\2\34\u0124\3\2\2\2\36\u0128"+
		"\3\2\2\2 \u012f\3\2\2\2\"\u0141\3\2\2\2$\u0143\3\2\2\2&\u0146\3\2\2\2"+
		"(\u0154\3\2\2\2*\u0156\3\2\2\2,\u015c\3\2\2\2.\u0172\3\2\2\2\60\u0174"+
		"\3\2\2\2\62\u0176\3\2\2\2\64\u0178\3\2\2\2\66\u017a\3\2\2\28\u017c\3\2"+
		"\2\2:\u017e\3\2\2\2<\u0180\3\2\2\2>\u0182\3\2\2\2@\u0184\3\2\2\2B\u0186"+
		"\3\2\2\2D\u0188\3\2\2\2FG\5\4\3\2GH\7\2\2\3H\3\3\2\2\2IK\5\6\4\2JI\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OQ\5\b\5\2PO\3\2"+
		"\2\2PQ\3\2\2\2Q\5\3\2\2\2R\u00a4\7\3\2\2ST\5\16\b\2TU\7\4\2\2UV\5\22\n"+
		"\2V\u00a4\3\2\2\2W\u00a4\5\32\16\2X\u00a4\5\n\6\2Y\u00a4\7\5\2\2Z[\7\6"+
		"\2\2[\u00a4\7\64\2\2\\]\7\7\2\2]^\5\4\3\2^_\7\b\2\2_\u00a4\3\2\2\2`a\7"+
		"\t\2\2ab\5\24\13\2bc\7\7\2\2cd\5\4\3\2de\7\b\2\2e\u00a4\3\2\2\2fg\7\n"+
		"\2\2gh\5\4\3\2hi\7\13\2\2ij\5\24\13\2j\u00a4\3\2\2\2kl\7\f\2\2lm\5\24"+
		"\13\2mn\7\r\2\2nv\5\4\3\2op\7\16\2\2pq\5\24\13\2qr\7\r\2\2rs\5\4\3\2s"+
		"u\3\2\2\2to\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xv\3\2\2\2"+
		"yz\7\17\2\2z|\5\4\3\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\b\2\2~\u00a4\3"+
		"\2\2\2\177\u0080\7\20\2\2\u0080\u0081\7\64\2\2\u0081\u0082\7\4\2\2\u0082"+
		"\u0083\5\24\13\2\u0083\u0084\7\21\2\2\u0084\u0087\5\24\13\2\u0085\u0086"+
		"\7\21\2\2\u0086\u0088\5\24\13\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u008a\7\7\2\2\u008a\u008b\5\4\3\2\u008b\u008c"+
		"\7\b\2\2\u008c\u00a4\3\2\2\2\u008d\u008e\7\20\2\2\u008e\u008f\5\20\t\2"+
		"\u008f\u0090\7\22\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\7\2\2\u0092\u0093"+
		"\5\4\3\2\u0093\u0094\7\b\2\2\u0094\u00a4\3\2\2\2\u0095\u0096\7\23\2\2"+
		"\u0096\u0097\5\f\7\2\u0097\u0098\5&\24\2\u0098\u00a4\3\2\2\2\u0099\u009a"+
		"\7\24\2\2\u009a\u009b\7\23\2\2\u009b\u009c\7\64\2\2\u009c\u00a4\5&\24"+
		"\2\u009d\u009e\7\24\2\2\u009e\u00a1\5\20\t\2\u009f\u00a0\7\4\2\2\u00a0"+
		"\u00a2\5\22\n\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3"+
		"\2\2\2\u00a3R\3\2\2\2\u00a3S\3\2\2\2\u00a3W\3\2\2\2\u00a3X\3\2\2\2\u00a3"+
		"Y\3\2\2\2\u00a3Z\3\2\2\2\u00a3\\\3\2\2\2\u00a3`\3\2\2\2\u00a3f\3\2\2\2"+
		"\u00a3k\3\2\2\2\u00a3\177\3\2\2\2\u00a3\u008d\3\2\2\2\u00a3\u0095\3\2"+
		"\2\2\u00a3\u0099\3\2\2\2\u00a3\u009d\3\2\2\2\u00a4\7\3\2\2\2\u00a5\u00a7"+
		"\7\25\2\2\u00a6\u00a8\5\22\n\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00aa\3\2\2\2\u00a9\u00ab\7\3\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\t\3\2\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae\7\64\2\2\u00ae"+
		"\u00af\7\26\2\2\u00af\13\3\2\2\2\u00b0\u00b5\7\64\2\2\u00b1\u00b2\7\27"+
		"\2\2\u00b2\u00b4\7\64\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7\30\2\2\u00b9\u00bb\7\64\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\r\3\2\2\2\u00bc\u00c1\5\26\f\2\u00bd\u00be\7\21\2"+
		"\2\u00be\u00c0\5\26\f\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c9\7\64\2\2\u00c5\u00c6\7\21\2\2\u00c6\u00c8\7\64\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\21\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\5\24\13\2\u00cd"+
		"\u00ce\7\21\2\2\u00ce\u00d0\5\24\13\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\23\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\b\13\1\2\u00d5\u00e2\7\31\2\2\u00d6\u00e2\7"+
		"\32\2\2\u00d7\u00e2\7\33\2\2\u00d8\u00e2\5B\"\2\u00d9\u00e2\5D#\2\u00da"+
		"\u00e2\7\34\2\2\u00db\u00e2\5$\23\2\u00dc\u00e2\5\30\r\2\u00dd\u00e2\5"+
		"*\26\2\u00de\u00df\5> \2\u00df\u00e0\5\24\13\t\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00d4\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00d8\3\2"+
		"\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u0101\3\2"+
		"\2\2\u00e3\u00e4\f\n\2\2\u00e4\u00e5\5@!\2\u00e5\u00e6\5\24\13\n\u00e6"+
		"\u0100\3\2\2\2\u00e7\u00e8\f\b\2\2\u00e8\u00e9\5<\37\2\u00e9\u00ea\5\24"+
		"\13\t\u00ea\u0100\3\2\2\2\u00eb\u00ec\f\7\2\2\u00ec\u00ed\5:\36\2\u00ed"+
		"\u00ee\5\24\13\b\u00ee\u0100\3\2\2\2\u00ef\u00f0\f\6\2\2\u00f0\u00f1\5"+
		"8\35\2\u00f1\u00f2\5\24\13\6\u00f2\u0100\3\2\2\2\u00f3\u00f4\f\5\2\2\u00f4"+
		"\u00f5\5\66\34\2\u00f5\u00f6\5\24\13\6\u00f6\u0100\3\2\2\2\u00f7\u00f8"+
		"\f\4\2\2\u00f8\u00f9\5\64\33\2\u00f9\u00fa\5\24\13\5\u00fa\u0100\3\2\2"+
		"\2\u00fb\u00fc\f\3\2\2\u00fc\u00fd\5\62\32\2\u00fd\u00fe\5\24\13\4\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00e3\3\2\2\2\u00ff\u00e7\3\2\2\2\u00ff\u00eb\3\2"+
		"\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f3\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff"+
		"\u00fb\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\25\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u010b\7\64\2\2\u0105\u0106"+
		"\7\35\2\2\u0106\u0107\5\24\13\2\u0107\u0108\7\36\2\2\u0108\u0109\5 \21"+
		"\2\u0109\u010b\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010b\u010f"+
		"\3\2\2\2\u010c\u010e\5 \21\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\27\3\2\2\2\u0111\u010f\3\2\2"+
		"\2\u0112\u0116\5\34\17\2\u0113\u0115\5\36\20\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\31\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011b\5\34\17\2\u011a\u011c\5\36\20\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\33\3\2\2\2\u011f\u0125\5\26\f\2\u0120\u0121\7\35\2\2\u0121"+
		"\u0122\5\24\13\2\u0122\u0123\7\36\2\2\u0123\u0125\3\2\2\2\u0124\u011f"+
		"\3\2\2\2\u0124\u0120\3\2\2\2\u0125\35\3\2\2\2\u0126\u0127\7\30\2\2\u0127"+
		"\u0129\7\64\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u012b\5\"\22\2\u012b\37\3\2\2\2\u012c\u012e\5\36\20\2\u012d"+
		"\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0138\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\37\2\2\u0133"+
		"\u0134\5\24\13\2\u0134\u0135\7 \2\2\u0135\u0139\3\2\2\2\u0136\u0137\7"+
		"\27\2\2\u0137\u0139\7\64\2\2\u0138\u0132\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"!\3\2\2\2\u013a\u013c\7\35\2\2\u013b\u013d\5\22\n\2\u013c\u013b\3\2\2"+
		"\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0142\7\36\2\2\u013f"+
		"\u0142\5*\26\2\u0140\u0142\5D#\2\u0141\u013a\3\2\2\2\u0141\u013f\3\2\2"+
		"\2\u0141\u0140\3\2\2\2\u0142#\3\2\2\2\u0143\u0144\7\23\2\2\u0144\u0145"+
		"\5&\24\2\u0145%\3\2\2\2\u0146\u0148\7\35\2\2\u0147\u0149\5(\25\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7\36"+
		"\2\2\u014b\u014c\5\4\3\2\u014c\u014d\7\b\2\2\u014d\'\3\2\2\2\u014e\u0151"+
		"\5\20\t\2\u014f\u0150\7\21\2\2\u0150\u0152\7\34\2\2\u0151\u014f\3\2\2"+
		"\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0155\7\34\2\2\u0154"+
		"\u014e\3\2\2\2\u0154\u0153\3\2\2\2\u0155)\3\2\2\2\u0156\u0158\7!\2\2\u0157"+
		"\u0159\5,\27\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\7\"\2\2\u015b+\3\2\2\2\u015c\u0162\5.\30\2\u015d\u015e"+
		"\5\60\31\2\u015e\u015f\5.\30\2\u015f\u0161\3\2\2\2\u0160\u015d\3\2\2\2"+
		"\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\5\60\31\2\u0166\u0165\3\2\2\2"+
		"\u0166\u0167\3\2\2\2\u0167-\3\2\2\2\u0168\u0169\7\37\2\2\u0169\u016a\5"+
		"\24\13\2\u016a\u016b\7 \2\2\u016b\u016c\7\4\2\2\u016c\u016d\5\24\13\2"+
		"\u016d\u0173\3\2\2\2\u016e\u016f\7\64\2\2\u016f\u0170\7\4\2\2\u0170\u0173"+
		"\5\24\13\2\u0171\u0173\5\24\13\2\u0172\u0168\3\2\2\2\u0172\u016e\3\2\2"+
		"\2\u0172\u0171\3\2\2\2\u0173/\3\2\2\2\u0174\u0175\t\2\2\2\u0175\61\3\2"+
		"\2\2\u0176\u0177\7#\2\2\u0177\63\3\2\2\2\u0178\u0179\7$\2\2\u0179\65\3"+
		"\2\2\2\u017a\u017b\t\3\2\2\u017b\67\3\2\2\2\u017c\u017d\7+\2\2\u017d9"+
		"\3\2\2\2\u017e\u017f\t\4\2\2\u017f;\3\2\2\2\u0180\u0181\t\5\2\2\u0181"+
		"=\3\2\2\2\u0182\u0183\t\6\2\2\u0183?\3\2\2\2\u0184\u0185\7\63\2\2\u0185"+
		"A\3\2\2\2\u0186\u0187\t\7\2\2\u0187C\3\2\2\2\u0188\u0189\t\b\2\2\u0189"+
		"E\3\2\2\2$LPv{\u0087\u00a1\u00a3\u00a7\u00aa\u00b5\u00ba\u00c1\u00c9\u00d1"+
		"\u00e1\u00ff\u0101\u010a\u010f\u0116\u011d\u0124\u0128\u012f\u0138\u013c"+
		"\u0141\u0148\u0151\u0154\u0158\u0162\u0166\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}