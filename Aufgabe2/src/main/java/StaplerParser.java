// Generated from C:/Users/erikm/Documents/Htwg/SPKO/Aufgabe2/src/main/antlr/StaplerParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StaplerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOCH=1, RUNTER=2, LINKS=3, RECHTS=4, KIPPEN=5, VOR=6, ZURUECK=7, VORWAERTS=8, 
		RUECKWAERTS=9, HALT=10, DISTANZ=11, WS=12;
	public static final int
		RULE_program = 0, RULE_befehl = 1, RULE_distanz = 2, RULE_fahren = 3, 
		RULE_heben = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "befehl", "distanz", "fahren", "heben"
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

	@Override
	public String getGrammarFileName() { return "StaplerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StaplerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BefehlContext befehl() {
			return getRuleContext(BefehlContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaplerParserVisitor ) return ((StaplerParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			befehl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BefehlContext extends ParserRuleContext {
		public FahrenContext fahren() {
			return getRuleContext(FahrenContext.class,0);
		}
		public HebenContext heben() {
			return getRuleContext(HebenContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(StaplerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(StaplerParser.WS, i);
		}
		public List<DistanzContext> distanz() {
			return getRuleContexts(DistanzContext.class);
		}
		public DistanzContext distanz(int i) {
			return getRuleContext(DistanzContext.class,i);
		}
		public TerminalNode EOF() { return getToken(StaplerParser.EOF, 0); }
		public BefehlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_befehl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).enterBefehl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).exitBefehl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaplerParserVisitor ) return ((StaplerParserVisitor<? extends T>)visitor).visitBefehl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BefehlContext befehl() throws RecognitionException {
		BefehlContext _localctx = new BefehlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_befehl);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				fahren();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				heben();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				fahren();
				setState(15);
				match(WS);
				setState(16);
				distanz();
				setState(17);
				match(WS);
				setState(18);
				heben();
				setState(19);
				match(WS);
				setState(20);
				distanz();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				heben();
				setState(23);
				match(WS);
				setState(24);
				distanz();
				setState(25);
				match(WS);
				setState(26);
				fahren();
				setState(27);
				match(WS);
				setState(28);
				distanz();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DistanzContext extends ParserRuleContext {
		public TerminalNode DISTANZ() { return getToken(StaplerParser.DISTANZ, 0); }
		public DistanzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distanz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).enterDistanz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).exitDistanz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaplerParserVisitor ) return ((StaplerParserVisitor<? extends T>)visitor).visitDistanz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistanzContext distanz() throws RecognitionException {
		DistanzContext _localctx = new DistanzContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_distanz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(DISTANZ);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FahrenContext extends ParserRuleContext {
		public TerminalNode VORWAERTS() { return getToken(StaplerParser.VORWAERTS, 0); }
		public TerminalNode RUECKWAERTS() { return getToken(StaplerParser.RUECKWAERTS, 0); }
		public TerminalNode HALT() { return getToken(StaplerParser.HALT, 0); }
		public TerminalNode RECHTS() { return getToken(StaplerParser.RECHTS, 0); }
		public TerminalNode LINKS() { return getToken(StaplerParser.LINKS, 0); }
		public FahrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fahren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).enterFahren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).exitFahren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaplerParserVisitor ) return ((StaplerParserVisitor<? extends T>)visitor).visitFahren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FahrenContext fahren() throws RecognitionException {
		FahrenContext _localctx = new FahrenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fahren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1816L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HebenContext extends ParserRuleContext {
		public TerminalNode HOCH() { return getToken(StaplerParser.HOCH, 0); }
		public TerminalNode RUNTER() { return getToken(StaplerParser.RUNTER, 0); }
		public HebenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heben; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).enterHeben(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StaplerParserListener ) ((StaplerParserListener)listener).exitHeben(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StaplerParserVisitor ) return ((StaplerParserVisitor<? extends T>)visitor).visitHeben(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HebenContext heben() throws RecognitionException {
		HebenContext _localctx = new HebenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_heben);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==HOCH || _la==RUNTER) ) {
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
		"\u0004\u0001\f(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0002\u0002\u0000\u0003\u0004"+
		"\b\n\u0001\u0000\u0001\u0002&\u0000\n\u0001\u0000\u0000\u0000\u0002\u001f"+
		"\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006#\u0001\u0000"+
		"\u0000\u0000\b%\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000"+
		"\u000b\u0001\u0001\u0000\u0000\u0000\f \u0003\u0006\u0003\u0000\r \u0003"+
		"\b\u0004\u0000\u000e\u000f\u0003\u0006\u0003\u0000\u000f\u0010\u0005\f"+
		"\u0000\u0000\u0010\u0011\u0003\u0004\u0002\u0000\u0011\u0012\u0005\f\u0000"+
		"\u0000\u0012\u0013\u0003\b\u0004\u0000\u0013\u0014\u0005\f\u0000\u0000"+
		"\u0014\u0015\u0003\u0004\u0002\u0000\u0015 \u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0003\b\u0004\u0000\u0017\u0018\u0005\f\u0000\u0000\u0018\u0019"+
		"\u0003\u0004\u0002\u0000\u0019\u001a\u0005\f\u0000\u0000\u001a\u001b\u0003"+
		"\u0006\u0003\u0000\u001b\u001c\u0005\f\u0000\u0000\u001c\u001d\u0003\u0004"+
		"\u0002\u0000\u001d \u0001\u0000\u0000\u0000\u001e \u0005\u0000\u0000\u0001"+
		"\u001f\f\u0001\u0000\u0000\u0000\u001f\r\u0001\u0000\u0000\u0000\u001f"+
		"\u000e\u0001\u0000\u0000\u0000\u001f\u0016\u0001\u0000\u0000\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u000b\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000"+
		"\u0000$\u0007\u0001\u0000\u0000\u0000%&\u0007\u0001\u0000\u0000&\t\u0001"+
		"\u0000\u0000\u0000\u0001\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}