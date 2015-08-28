// Generated from FableGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FableGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Knowledge=4, Scene=5, Remember=6, Understand=7, 
		Associations=8, Requirements=9, Description=10, Identifier=11, String=12, 
		Whitespace=13, BlockComment=14, LineComment=15;
	public static final int
		RULE_fable = 0;
	public static final String[] ruleNames = {
		"fable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FABULA'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Knowledge", "Scene", "Remember", "Understand", 
		"Associations", "Requirements", "Description", "Identifier", "String", 
		"Whitespace", "BlockComment", "LineComment"
	};
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
	public String getGrammarFileName() { return "FableGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FableGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public List<TerminalNode> Knowledge() { return getTokens(FableGrammarParser.Knowledge); }
		public TerminalNode Knowledge(int i) {
			return getToken(FableGrammarParser.Knowledge, i);
		}
		public List<TerminalNode> Scene() { return getTokens(FableGrammarParser.Scene); }
		public TerminalNode Scene(int i) {
			return getToken(FableGrammarParser.Scene, i);
		}
		public FableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterFable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitFable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitFable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FableContext fable() throws RecognitionException {
		FableContext _localctx = new FableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
			setState(3);
			match(Identifier);
			setState(4);
			match(T__1);
			setState(6); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				_la = _input.LA(1);
				if ( !(_la==Knowledge || _la==Scene) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Knowledge || _la==Scene );
			setState(10);
			match(T__2);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\17\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\6\2\t\n\2\r\2\16\2\n\3\2\3\2\3\2\2\2\3\2\2\3\3\2\6\7\16\2"+
		"\4\3\2\2\2\4\5\7\3\2\2\5\6\7\r\2\2\6\b\7\4\2\2\7\t\t\2\2\2\b\7\3\2\2\2"+
		"\t\n\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13\f\3\2\2\2\f\r\7\5\2\2\r\3\3\2"+
		"\2\2\3\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}