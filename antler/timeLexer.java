// Generated from .\timeLexer.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class timeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOUR=1, HOUR23=2, MIN=3, HOUR2400=4, SEP=5, WHITE=6, STR=7, TWLF=8, ONLYSTR=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HOUR", "HOUR23", "MIN", "HOUR2400", "SEP", "WHITE", "STR", "TWLF", "ONLYSTR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "':'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HOUR", "HOUR23", "MIN", "HOUR2400", "SEP", "WHITE", "STR", "TWLF", 
			"ONLYSTR"
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


	public timeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "timeLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2"+
		"\27\n\2\3\2\3\2\3\2\5\2\34\n\2\3\3\5\3\37\n\3\3\3\5\3\"\n\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tQ\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\3\2\6\3\2\62;\3\2\62\64\3\2\62\65\3\2\62\67\2g\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\3\33\3\2\2\2\5&\3\2\2\2\7(\3\2\2\2\t+\3\2"+
		"\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23^\3\2\2\2\25"+
		"\27\7\62\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\34\t\2\2\2\31"+
		"\32\7\63\2\2\32\34\t\3\2\2\33\26\3\2\2\2\33\31\3\2\2\2\34\4\3\2\2\2\35"+
		"\37\7\62\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \"\7\63\2\2!\36"+
		"\3\2\2\2! \3\2\2\2\"#\3\2\2\2#\'\t\2\2\2$%\7\64\2\2%\'\t\4\2\2&!\3\2\2"+
		"\2&$\3\2\2\2\'\6\3\2\2\2()\t\5\2\2)*\t\2\2\2*\b\3\2\2\2+,\7\64\2\2,-\7"+
		"\66\2\2-.\7<\2\2./\7\62\2\2/\60\7\62\2\2\60\n\3\2\2\2\61\62\7<\2\2\62"+
		"\f\3\2\2\2\63\64\7\"\2\2\64\16\3\2\2\2\65\66\7c\2\2\66\67\7\60\2\2\67"+
		"8\7o\2\28>\7\60\2\29:\7r\2\2:;\7\60\2\2;<\7o\2\2<>\7\60\2\2=\65\3\2\2"+
		"\2=9\3\2\2\2>\20\3\2\2\2?@\7\63\2\2@A\7\64\2\2AP\3\2\2\2BC\7\"\2\2CD\7"+
		"o\2\2DE\7k\2\2EF\7f\2\2FG\7p\2\2GH\7k\2\2HI\7i\2\2IJ\7j\2\2JQ\7v\2\2K"+
		"L\7\"\2\2LM\7p\2\2MN\7q\2\2NO\7q\2\2OQ\7p\2\2PB\3\2\2\2PK\3\2\2\2Q\22"+
		"\3\2\2\2RS\7P\2\2ST\7q\2\2TU\7q\2\2U_\7p\2\2VW\7O\2\2WX\7k\2\2XY\7f\2"+
		"\2YZ\7p\2\2Z[\7k\2\2[\\\7i\2\2\\]\7j\2\2]_\7v\2\2^R\3\2\2\2^V\3\2\2\2"+
		"_\24\3\2\2\2\13\2\26\33\36!&=P^\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}