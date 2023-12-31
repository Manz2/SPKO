// Generated from C:/Users/User/Documents/SPKO/SPKO/Aufgabe2/src/main/antlr/StaplerLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StaplerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOCH=1, RUNTER=2, LINKS=3, RECHTS=4, KIPPEN=5, VOR=6, ZURUECK=7, VORWAERTS=8, 
		RUECKWAERTS=9, HALT=10, DISTANZ=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HOCH", "RUNTER", "LINKS", "RECHTS", "KIPPEN", "VOR", "ZURUECK", "VORWAERTS", 
			"RUECKWAERTS", "HALT", "DISTANZ", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'up'", "'down'", "'left'", "'right'", "'tilt'", "'toFront'", "'toBack'", 
			"'forward'", "'backward'", "'stop'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HOCH", "RUNTER", "LINKS", "RECHTS", "KIPPEN", "VOR", "ZURUECK", 
			"VORWAERTS", "RUECKWAERTS", "HALT", "DISTANZ", "WS"
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


	public StaplerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StaplerLexer.g4"; }

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
		"\u0004\u0000\f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nX\b\n\u000b"+
		"\n\f\nY\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0001\u0000\u0001\u0001\u000009]\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000"+
		"\u0000\u0003\u001c\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000"+
		"\u0007&\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000\u000b1\u0001"+
		"\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f@\u0001\u0000\u0000"+
		"\u0000\u0011H\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015"+
		"W\u0001\u0000\u0000\u0000\u0017[\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"u\u0000\u0000\u001a\u001b\u0005p\u0000\u0000\u001b\u0002\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005d\u0000\u0000\u001d\u001e\u0005o\u0000\u0000\u001e"+
		"\u001f\u0005w\u0000\u0000\u001f \u0005n\u0000\u0000 \u0004\u0001\u0000"+
		"\u0000\u0000!\"\u0005l\u0000\u0000\"#\u0005e\u0000\u0000#$\u0005f\u0000"+
		"\u0000$%\u0005t\u0000\u0000%\u0006\u0001\u0000\u0000\u0000&\'\u0005r\u0000"+
		"\u0000\'(\u0005i\u0000\u0000()\u0005g\u0000\u0000)*\u0005h\u0000\u0000"+
		"*+\u0005t\u0000\u0000+\b\u0001\u0000\u0000\u0000,-\u0005t\u0000\u0000"+
		"-.\u0005i\u0000\u0000./\u0005l\u0000\u0000/0\u0005t\u0000\u00000\n\u0001"+
		"\u0000\u0000\u000012\u0005t\u0000\u000023\u0005o\u0000\u000034\u0005F"+
		"\u0000\u000045\u0005r\u0000\u000056\u0005o\u0000\u000067\u0005n\u0000"+
		"\u000078\u0005t\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005t\u0000"+
		"\u0000:;\u0005o\u0000\u0000;<\u0005B\u0000\u0000<=\u0005a\u0000\u0000"+
		"=>\u0005c\u0000\u0000>?\u0005k\u0000\u0000?\u000e\u0001\u0000\u0000\u0000"+
		"@A\u0005f\u0000\u0000AB\u0005o\u0000\u0000BC\u0005r\u0000\u0000CD\u0005"+
		"w\u0000\u0000DE\u0005a\u0000\u0000EF\u0005r\u0000\u0000FG\u0005d\u0000"+
		"\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005b\u0000\u0000IJ\u0005a\u0000"+
		"\u0000JK\u0005c\u0000\u0000KL\u0005k\u0000\u0000LM\u0005w\u0000\u0000"+
		"MN\u0005a\u0000\u0000NO\u0005r\u0000\u0000OP\u0005d\u0000\u0000P\u0012"+
		"\u0001\u0000\u0000\u0000QR\u0005s\u0000\u0000RS\u0005t\u0000\u0000ST\u0005"+
		"o\u0000\u0000TU\u0005p\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VX\u0007"+
		"\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0016\u0001\u0000"+
		"\u0000\u0000[\\\u0005 \u0000\u0000\\\u0018\u0001\u0000\u0000\u0000\u0002"+
		"\u0000Y\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}