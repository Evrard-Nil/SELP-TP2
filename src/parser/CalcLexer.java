// Generated from D:/Profiles/edaillet/Documents/IMT/Structure_Lang_Prog/TP3/src/parser\Calc.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, UNARY=7, MULTIPLICATIVE=8, 
		ADDITIVE=9, RELATIONAL=10, EQUALITY=11, AND=12, OR=13, BOOLEAN=14, IDENTIFIER=15, 
		INTEGER=16, WS=17, LINE_COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "UNARY", "MULTIPLICATIVE", 
			"ADDITIVE", "RELATIONAL", "EQUALITY", "AND", "OR", "BOOLEAN", "IDENTIFIER", 
			"INTEGER", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'defun'", "')'", "'='", "'?'", "':'", null, null, null, 
			null, null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "UNARY", "MULTIPLICATIVE", 
			"ADDITIVE", "RELATIONAL", "EQUALITY", "AND", "OR", "BOOLEAN", "IDENTIFIER", 
			"INTEGER", "WS", "LINE_COMMENT"
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


	public CalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13C\n\13"+
		"\3\f\3\f\3\f\3\f\5\fI\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17Z\n\17\3\20\3\20\7\20^\n\20\f\20\16\20"+
		"a\13\20\3\21\3\21\3\21\7\21f\n\21\f\21\16\21i\13\21\5\21k\n\21\3\22\6"+
		"\22n\n\22\r\22\16\22o\3\22\3\22\3\23\3\23\3\23\3\23\7\23x\n\23\f\23\16"+
		"\23{\13\23\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\t\4\2##//\4"+
		"\2,,\61\61\4\2--//\4\2>>@@\4\2\62;c|\5\2\13\f\17\17\"\"\3\2\f\f\2\u0088"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3"+
		"\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25B\3\2\2\2"+
		"\27H\3\2\2\2\31J\3\2\2\2\33M\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!j\3\2\2\2"+
		"#m\3\2\2\2%s\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7f\2\2*+\7g\2\2+,\7h\2\2,"+
		"-\7w\2\2-.\7p\2\2.\6\3\2\2\2/\60\7+\2\2\60\b\3\2\2\2\61\62\7?\2\2\62\n"+
		"\3\2\2\2\63\64\7A\2\2\64\f\3\2\2\2\65\66\7<\2\2\66\16\3\2\2\2\678\t\2"+
		"\2\28\20\3\2\2\29:\t\3\2\2:\22\3\2\2\2;<\t\4\2\2<\24\3\2\2\2=C\t\5\2\2"+
		">?\7@\2\2?C\7?\2\2@A\7>\2\2AC\7?\2\2B=\3\2\2\2B>\3\2\2\2B@\3\2\2\2C\26"+
		"\3\2\2\2DE\7?\2\2EI\7?\2\2FG\7#\2\2GI\7?\2\2HD\3\2\2\2HF\3\2\2\2I\30\3"+
		"\2\2\2JK\7(\2\2KL\7(\2\2L\32\3\2\2\2MN\7~\2\2NO\7~\2\2O\34\3\2\2\2PQ\7"+
		"v\2\2QR\7t\2\2RS\7w\2\2SZ\7g\2\2TU\7h\2\2UV\7c\2\2VW\7n\2\2WX\7u\2\2X"+
		"Z\7g\2\2YP\3\2\2\2YT\3\2\2\2Z\36\3\2\2\2[_\4c|\2\\^\t\6\2\2]\\\3\2\2\2"+
		"^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2` \3\2\2\2a_\3\2\2\2bk\7\62\2\2cg\4\63;"+
		"\2df\4\62;\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2"+
		"\2jb\3\2\2\2jc\3\2\2\2k\"\3\2\2\2ln\t\7\2\2ml\3\2\2\2no\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2pq\3\2\2\2qr\b\22\2\2r$\3\2\2\2st\7\61\2\2tu\7\61\2\2uy"+
		"\3\2\2\2vx\n\b\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{"+
		"y\3\2\2\2|}\7\f\2\2}~\3\2\2\2~\177\b\23\2\2\177&\3\2\2\2\13\2BHY_gjoy"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}