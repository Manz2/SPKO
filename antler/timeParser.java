// Generated from .\timeParser.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class timeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOUR2400=1, HOUR23=2, SEP=3, MIN=4;
	public static final int
		RULE_time = 0, RULE_tw4 = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"time", "tw4"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HOUR2400", "HOUR23", "SEP", "MIN"
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
	public String getGrammarFileName() { return "timeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public timeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TimeContext extends ParserRuleContext {
		public Tw4Context tw4() {
			return getRuleContext(Tw4Context.class,0);
		}
		public TerminalNode HOUR2400() { return getToken(timeParser.HOUR2400, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timeParserListener ) ((timeParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timeParserListener ) ((timeParserListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_time);
		try {
			setState(6);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HOUR23:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				tw4();
				}
				break;
			case HOUR2400:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				match(HOUR2400);
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

	public static class Tw4Context extends ParserRuleContext {
		public TerminalNode HOUR23() { return getToken(timeParser.HOUR23, 0); }
		public TerminalNode SEP() { return getToken(timeParser.SEP, 0); }
		public TerminalNode MIN() { return getToken(timeParser.MIN, 0); }
		public Tw4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tw4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timeParserListener ) ((timeParserListener)listener).enterTw4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timeParserListener ) ((timeParserListener)listener).exitTw4(this);
		}
	}

	public final Tw4Context tw4() throws RecognitionException {
		Tw4Context _localctx = new Tw4Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_tw4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(HOUR23);
			setState(9);
			match(SEP);
			setState(10);
			match(MIN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\17\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\5\2\t\n\2\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\r\2\b\3\2\2"+
		"\2\4\n\3\2\2\2\6\t\5\4\3\2\7\t\7\3\2\2\b\6\3\2\2\2\b\7\3\2\2\2\t\3\3\2"+
		"\2\2\n\13\7\4\2\2\13\f\7\5\2\2\f\r\7\6\2\2\r\5\3\2\2\2\3\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}