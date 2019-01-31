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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OP=8, IDENTIFIER=9, 
		LITERAL=10, WS=11, LINE_COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "OP", "IDENTIFIER", 
			"LITERAL", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'defun'", "')'", "'='", "'-'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OP", "IDENTIFIER", "LITERAL", 
			"WS", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t\62\n\t\3\n\3\n\7\n\66\n\n\f"+
		"\n\16\n9\13\n\3\13\3\13\3\13\7\13>\n\13\f\13\16\13A\13\13\5\13C\n\13\3"+
		"\f\6\fF\n\f\r\f\16\fG\3\f\3\f\3\r\3\r\3\r\3\r\7\rP\n\r\f\r\16\rS\13\r"+
		"\3\r\3\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\3\2\6\5\2,-//\61\61\4\2\62;c|\5\2\13\f\17\17\"\"\3\2\f\f\2"+
		"^\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2"+
		"\2\2\r)\3\2\2\2\17+\3\2\2\2\21\61\3\2\2\2\23\63\3\2\2\2\25B\3\2\2\2\27"+
		"E\3\2\2\2\31K\3\2\2\2\33\34\7*\2\2\34\4\3\2\2\2\35\36\7f\2\2\36\37\7g"+
		"\2\2\37 \7h\2\2 !\7w\2\2!\"\7p\2\2\"\6\3\2\2\2#$\7+\2\2$\b\3\2\2\2%&\7"+
		"?\2\2&\n\3\2\2\2\'(\7/\2\2(\f\3\2\2\2)*\7A\2\2*\16\3\2\2\2+,\7<\2\2,\20"+
		"\3\2\2\2-\62\t\2\2\2./\7?\2\2/\62\7?\2\2\60\62\7>\2\2\61-\3\2\2\2\61."+
		"\3\2\2\2\61\60\3\2\2\2\62\22\3\2\2\2\63\67\4c|\2\64\66\t\3\2\2\65\64\3"+
		"\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\24\3\2\2\29\67\3\2\2\2:"+
		"C\7\62\2\2;?\4\63;\2<>\4\62;\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2B:\3\2\2\2B;\3\2\2\2C\26\3\2\2\2DF\t\4\2\2ED\3\2\2"+
		"\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\f\2\2J\30\3\2\2\2KL\7\61"+
		"\2\2LM\7\61\2\2MQ\3\2\2\2NP\n\5\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3"+
		"\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\f\2\2UV\3\2\2\2VW\b\r\2\2W\32\3\2\2\2\t"+
		"\2\61\67?BGQ\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}