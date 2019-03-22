// Generated from C:/Users/mayn/Downloads/antlr4/app/src/main/java/com/jsdroid/antlr4/go\GoParser.g4 by ANTLR 4.7.2
package com.jsdroid.antlr4.go;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoParserLexer extends Lexer {
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, VAR=64, CONST=65, PACKAGE=66, 
		ID=67, INT=68, LPAREN=69, RPAREN=70, LBRACE=71, RBRACE=72, LSQARE=73, 
		RSQARE=74, SEMICOLON=75, EQUAL=76, WS=77, NEWLINE=78, COMMENT=79;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "VAR", "CONST", 
			"PACKAGE", "ID", "INT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQARE", 
			"RSQARE", "SEMICOLON", "EQUAL", "WS", "NEWLINE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package main'", "'import'", "','", "':='", "'*'", "':'", "'func'", 
			"'go'", "'return'", "'++'", "'--'", "'<-'", "'fmt.Println'", "'.'", "'if'", 
			"'else if'", "'else'", "'for'", "'switch'", "'case'", "'default'", "'make'", 
			"'chan'", "'~'", "'&'", "'/'", "'%'", "'+'", "'-'", "'^'", "'&^'", "'|'", 
			"'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'<<='", "'>>='", 
			"'&='", "'^='", "'|='", "'!'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'||'", "'&&'", "'int'", "'uint'", "'bool'", "'string'", "'float32'", 
			"'float64'", "'rune'", "'byte'", "'complex64'", "'complex128'", "'var'", 
			"'const'", null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "VAR", "CONST", "PACKAGE", "ID", "INT", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LSQARE", "RSQARE", "SEMICOLON", "EQUAL", 
			"WS", "NEWLINE", "COMMENT"
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


	    int lastTokenType = 0;
	    public void emit(Token token) {
	    	super.emit(token);
	    	lastTokenType = token.getType();
	    }


	public GoParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 77:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			if (_input.LA(1) == '\n' || lastTokenType == SEMICOLON || lastTokenType == NEWLINE || lastTokenType == LBRACE ||  lastTokenType == LPAREN || _input.LA(1) == RBRACE || _input.LA(1) == RPAREN) skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u01f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3"+
		",\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3B\3B\3B\3B\3B\3B\3C\3C\6C\u01b8\nC\rC\16C\u01b9\3C\3C\3D\3D\7D\u01c0"+
		"\nD\fD\16D\u01c3\13D\3E\6E\u01c6\nE\rE\16E\u01c7\3F\3F\3G\3G\3H\3H\3I"+
		"\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\6N\u01db\nN\rN\16N\u01dc\3N\3N\3O\5O\u01e2"+
		"\nO\3O\3O\3O\3P\3P\3P\3P\7P\u01eb\nP\fP\16P\u01ee\13P\3P\3P\2\2Q\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\3\2\b\4\2\61"+
		"\61c|\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\2\u01f6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\3\u00a1\3\2\2\2\5\u00ae\3\2\2\2\7\u00b5\3\2\2\2\t\u00b7\3\2\2\2\13"+
		"\u00ba\3\2\2\2\r\u00bc\3\2\2\2\17\u00be\3\2\2\2\21\u00c3\3\2\2\2\23\u00c6"+
		"\3\2\2\2\25\u00cd\3\2\2\2\27\u00d0\3\2\2\2\31\u00d3\3\2\2\2\33\u00d6\3"+
		"\2\2\2\35\u00e2\3\2\2\2\37\u00e4\3\2\2\2!\u00e7\3\2\2\2#\u00ef\3\2\2\2"+
		"%\u00f4\3\2\2\2\'\u00f8\3\2\2\2)\u00ff\3\2\2\2+\u0104\3\2\2\2-\u010c\3"+
		"\2\2\2/\u0111\3\2\2\2\61\u0116\3\2\2\2\63\u0118\3\2\2\2\65\u011a\3\2\2"+
		"\2\67\u011c\3\2\2\29\u011e\3\2\2\2;\u0120\3\2\2\2=\u0122\3\2\2\2?\u0124"+
		"\3\2\2\2A\u0127\3\2\2\2C\u0129\3\2\2\2E\u012c\3\2\2\2G\u012f\3\2\2\2I"+
		"\u0132\3\2\2\2K\u0135\3\2\2\2M\u0138\3\2\2\2O\u013b\3\2\2\2Q\u013e\3\2"+
		"\2\2S\u0142\3\2\2\2U\u0146\3\2\2\2W\u0149\3\2\2\2Y\u014c\3\2\2\2[\u014f"+
		"\3\2\2\2]\u0151\3\2\2\2_\u0153\3\2\2\2a\u0155\3\2\2\2c\u0158\3\2\2\2e"+
		"\u015b\3\2\2\2g\u015e\3\2\2\2i\u0161\3\2\2\2k\u0164\3\2\2\2m\u0167\3\2"+
		"\2\2o\u016b\3\2\2\2q\u0170\3\2\2\2s\u0175\3\2\2\2u\u017c\3\2\2\2w\u0184"+
		"\3\2\2\2y\u018c\3\2\2\2{\u0191\3\2\2\2}\u0196\3\2\2\2\177\u01a0\3\2\2"+
		"\2\u0081\u01ab\3\2\2\2\u0083\u01af\3\2\2\2\u0085\u01b5\3\2\2\2\u0087\u01bd"+
		"\3\2\2\2\u0089\u01c5\3\2\2\2\u008b\u01c9\3\2\2\2\u008d\u01cb\3\2\2\2\u008f"+
		"\u01cd\3\2\2\2\u0091\u01cf\3\2\2\2\u0093\u01d1\3\2\2\2\u0095\u01d3\3\2"+
		"\2\2\u0097\u01d5\3\2\2\2\u0099\u01d7\3\2\2\2\u009b\u01da\3\2\2\2\u009d"+
		"\u01e1\3\2\2\2\u009f\u01e6\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7c\2"+
		"\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7m\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7i\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7o\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\4\3\2\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7r\2\2\u00b1\u00b2\7q\2\2"+
		"\u00b2\u00b3\7t\2\2\u00b3\u00b4\7v\2\2\u00b4\6\3\2\2\2\u00b5\u00b6\7."+
		"\2\2\u00b6\b\3\2\2\2\u00b7\u00b8\7<\2\2\u00b8\u00b9\7?\2\2\u00b9\n\3\2"+
		"\2\2\u00ba\u00bb\7,\2\2\u00bb\f\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd\16\3"+
		"\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7e\2\2\u00c2\20\3\2\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\22\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7p\2\2\u00cc\24\3\2\2\2\u00cd"+
		"\u00ce\7-\2\2\u00ce\u00cf\7-\2\2\u00cf\26\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1"+
		"\u00d2\7/\2\2\u00d2\30\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7/\2\2\u00d5"+
		"\32\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7\60\2\2\u00da\u00db\7R\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7k\2"+
		"\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3\36\3\2\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7h\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9"+
		"\7n\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7\"\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7h\2\2\u00ee\"\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3$\3\2\2\2\u00f4"+
		"\u00f5\7h\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7t\2\2\u00f7&\3\2\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7v\2\2"+
		"\u00fc\u00fd\7e\2\2\u00fd\u00fe\7j\2\2\u00fe(\3\2\2\2\u00ff\u0100\7e\2"+
		"\2\u0100\u0101\7c\2\2\u0101\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103*\3\2"+
		"\2\2\u0104\u0105\7f\2\2\u0105\u0106\7g\2\2\u0106\u0107\7h\2\2\u0107\u0108"+
		"\7c\2\2\u0108\u0109\7w\2\2\u0109\u010a\7n\2\2\u010a\u010b\7v\2\2\u010b"+
		",\3\2\2\2\u010c\u010d\7o\2\2\u010d\u010e\7c\2\2\u010e\u010f\7m\2\2\u010f"+
		"\u0110\7g\2\2\u0110.\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113\7j\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7p\2\2\u0115\60\3\2\2\2\u0116\u0117\7\u0080"+
		"\2\2\u0117\62\3\2\2\2\u0118\u0119\7(\2\2\u0119\64\3\2\2\2\u011a\u011b"+
		"\7\61\2\2\u011b\66\3\2\2\2\u011c\u011d\7\'\2\2\u011d8\3\2\2\2\u011e\u011f"+
		"\7-\2\2\u011f:\3\2\2\2\u0120\u0121\7/\2\2\u0121<\3\2\2\2\u0122\u0123\7"+
		"`\2\2\u0123>\3\2\2\2\u0124\u0125\7(\2\2\u0125\u0126\7`\2\2\u0126@\3\2"+
		"\2\2\u0127\u0128\7~\2\2\u0128B\3\2\2\2\u0129\u012a\7>\2\2\u012a\u012b"+
		"\7>\2\2\u012bD\3\2\2\2\u012c\u012d\7@\2\2\u012d\u012e\7@\2\2\u012eF\3"+
		"\2\2\2\u012f\u0130\7-\2\2\u0130\u0131\7?\2\2\u0131H\3\2\2\2\u0132\u0133"+
		"\7/\2\2\u0133\u0134\7?\2\2\u0134J\3\2\2\2\u0135\u0136\7,\2\2\u0136\u0137"+
		"\7?\2\2\u0137L\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a\7?\2\2\u013aN"+
		"\3\2\2\2\u013b\u013c\7\'\2\2\u013c\u013d\7?\2\2\u013dP\3\2\2\2\u013e\u013f"+
		"\7>\2\2\u013f\u0140\7>\2\2\u0140\u0141\7?\2\2\u0141R\3\2\2\2\u0142\u0143"+
		"\7@\2\2\u0143\u0144\7@\2\2\u0144\u0145\7?\2\2\u0145T\3\2\2\2\u0146\u0147"+
		"\7(\2\2\u0147\u0148\7?\2\2\u0148V\3\2\2\2\u0149\u014a\7`\2\2\u014a\u014b"+
		"\7?\2\2\u014bX\3\2\2\2\u014c\u014d\7~\2\2\u014d\u014e\7?\2\2\u014eZ\3"+
		"\2\2\2\u014f\u0150\7#\2\2\u0150\\\3\2\2\2\u0151\u0152\7>\2\2\u0152^\3"+
		"\2\2\2\u0153\u0154\7@\2\2\u0154`\3\2\2\2\u0155\u0156\7>\2\2\u0156\u0157"+
		"\7?\2\2\u0157b\3\2\2\2\u0158\u0159\7@\2\2\u0159\u015a\7?\2\2\u015ad\3"+
		"\2\2\2\u015b\u015c\7?\2\2\u015c\u015d\7?\2\2\u015df\3\2\2\2\u015e\u015f"+
		"\7#\2\2\u015f\u0160\7?\2\2\u0160h\3\2\2\2\u0161\u0162\7~\2\2\u0162\u0163"+
		"\7~\2\2\u0163j\3\2\2\2\u0164\u0165\7(\2\2\u0165\u0166\7(\2\2\u0166l\3"+
		"\2\2\2\u0167\u0168\7k\2\2\u0168\u0169\7p\2\2\u0169\u016a\7v\2\2\u016a"+
		"n\3\2\2\2\u016b\u016c\7w\2\2\u016c\u016d\7k\2\2\u016d\u016e\7p\2\2\u016e"+
		"\u016f\7v\2\2\u016fp\3\2\2\2\u0170\u0171\7d\2\2\u0171\u0172\7q\2\2\u0172"+
		"\u0173\7q\2\2\u0173\u0174\7n\2\2\u0174r\3\2\2\2\u0175\u0176\7u\2\2\u0176"+
		"\u0177\7v\2\2\u0177\u0178\7t\2\2\u0178\u0179\7k\2\2\u0179\u017a\7p\2\2"+
		"\u017a\u017b\7i\2\2\u017bt\3\2\2\2\u017c\u017d\7h\2\2\u017d\u017e\7n\2"+
		"\2\u017e\u017f\7q\2\2\u017f\u0180\7c\2\2\u0180\u0181\7v\2\2\u0181\u0182"+
		"\7\65\2\2\u0182\u0183\7\64\2\2\u0183v\3\2\2\2\u0184\u0185\7h\2\2\u0185"+
		"\u0186\7n\2\2\u0186\u0187\7q\2\2\u0187\u0188\7c\2\2\u0188\u0189\7v\2\2"+
		"\u0189\u018a\78\2\2\u018a\u018b\7\66\2\2\u018bx\3\2\2\2\u018c\u018d\7"+
		"t\2\2\u018d\u018e\7w\2\2\u018e\u018f\7p\2\2\u018f\u0190\7g\2\2\u0190z"+
		"\3\2\2\2\u0191\u0192\7d\2\2\u0192\u0193\7{\2\2\u0193\u0194\7v\2\2\u0194"+
		"\u0195\7g\2\2\u0195|\3\2\2\2\u0196\u0197\7e\2\2\u0197\u0198\7q\2\2\u0198"+
		"\u0199\7o\2\2\u0199\u019a\7r\2\2\u019a\u019b\7n\2\2\u019b\u019c\7g\2\2"+
		"\u019c\u019d\7z\2\2\u019d\u019e\78\2\2\u019e\u019f\7\66\2\2\u019f~\3\2"+
		"\2\2\u01a0\u01a1\7e\2\2\u01a1\u01a2\7q\2\2\u01a2\u01a3\7o\2\2\u01a3\u01a4"+
		"\7r\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7z\2\2\u01a7"+
		"\u01a8\7\63\2\2\u01a8\u01a9\7\64\2\2\u01a9\u01aa\7:\2\2\u01aa\u0080\3"+
		"\2\2\2\u01ab\u01ac\7x\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7t\2\2\u01ae"+
		"\u0082\3\2\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7p\2"+
		"\2\u01b2\u01b3\7u\2\2\u01b3\u01b4\7v\2\2\u01b4\u0084\3\2\2\2\u01b5\u01b7"+
		"\7$\2\2\u01b6\u01b8\t\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\7$"+
		"\2\2\u01bc\u0086\3\2\2\2\u01bd\u01c1\t\3\2\2\u01be\u01c0\t\4\2\2\u01bf"+
		"\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u0088\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6\t\5\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u008a\3\2\2\2\u01c9\u01ca\7*\2\2\u01ca\u008c\3\2\2\2\u01cb"+
		"\u01cc\7+\2\2\u01cc\u008e\3\2\2\2\u01cd\u01ce\7}\2\2\u01ce\u0090\3\2\2"+
		"\2\u01cf\u01d0\7\177\2\2\u01d0\u0092\3\2\2\2\u01d1\u01d2\7]\2\2\u01d2"+
		"\u0094\3\2\2\2\u01d3\u01d4\7_\2\2\u01d4\u0096\3\2\2\2\u01d5\u01d6\7=\2"+
		"\2\u01d6\u0098\3\2\2\2\u01d7\u01d8\7?\2\2\u01d8\u009a\3\2\2\2\u01d9\u01db"+
		"\t\6\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\bN\2\2\u01df\u009c\3\2"+
		"\2\2\u01e0\u01e2\7\17\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e4\7\f\2\2\u01e4\u01e5\bO\3\2\u01e5\u009e\3\2"+
		"\2\2\u01e6\u01e7\7\61\2\2\u01e7\u01e8\7\61\2\2\u01e8\u01ec\3\2\2\2\u01e9"+
		"\u01eb\n\7\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\bP\2\2\u01f0\u00a0\3\2\2\2\t\2\u01b9\u01c1\u01c7\u01dc\u01e1\u01ec"+
		"\4\b\2\2\3O\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}