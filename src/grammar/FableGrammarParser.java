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
		Identifier=1, String=2, Open=3, Close=4, FABLE=5, REQUIREMENT=6, REMEMBER=7, 
		UNDERSTAND=8, DESCRIPTION=9, KNOWLEDGE=10, ASSOCIATION=11, NORMALSCENE=12, 
		STARTSCENE=13, ENDSCENE=14, Comment=15, Whitespace=16;
	public static final int
		RULE_requirements = 0, RULE_remember = 1, RULE_understand = 2, RULE_description = 3, 
		RULE_knowledge = 4, RULE_associations = 5, RULE_fable = 6, RULE_scene = 7;
	public static final String[] ruleNames = {
		"requirements", "remember", "understand", "description", "knowledge", 
		"associations", "fable", "scene"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'FABULA'", "'REQUISITO'", "'LEMBRAR'", 
		"'ENTENDER'", "'DESCRICAO'", "'CONHECIMENTO'", "'ASSOCIACAO'", "'CENA'", 
		"'INICIO'", "'FIM'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Identifier", "String", "Open", "Close", "FABLE", "REQUIREMENT", 
		"REMEMBER", "UNDERSTAND", "DESCRIPTION", "KNOWLEDGE", "ASSOCIATION", "NORMALSCENE", 
		"STARTSCENE", "ENDSCENE", "Comment", "Whitespace"
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
	public static class RequirementsContext extends ParserRuleContext {
		public TerminalNode REQUIREMENT() { return getToken(FableGrammarParser.REQUIREMENT, 0); }
		public TerminalNode Open() { return getToken(FableGrammarParser.Open, 0); }
		public TerminalNode Close() { return getToken(FableGrammarParser.Close, 0); }
		public List<TerminalNode> Identifier() { return getTokens(FableGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FableGrammarParser.Identifier, i);
		}
		public RequirementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterRequirements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitRequirements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitRequirements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementsContext requirements() throws RecognitionException {
		RequirementsContext _localctx = new RequirementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_requirements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(REQUIREMENT);
			setState(17);
			match(Open);
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				match(Identifier);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(23);
			match(Close);
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

	public static class RememberContext extends ParserRuleContext {
		public TerminalNode REMEMBER() { return getToken(FableGrammarParser.REMEMBER, 0); }
		public TerminalNode String() { return getToken(FableGrammarParser.String, 0); }
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public RememberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterRemember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitRemember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitRemember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RememberContext remember() throws RecognitionException {
		RememberContext _localctx = new RememberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_remember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(REMEMBER);
			setState(26);
			match(String);
			setState(27);
			match(Identifier);
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

	public static class UnderstandContext extends ParserRuleContext {
		public TerminalNode UNDERSTAND() { return getToken(FableGrammarParser.UNDERSTAND, 0); }
		public TerminalNode String() { return getToken(FableGrammarParser.String, 0); }
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public UnderstandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_understand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterUnderstand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitUnderstand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitUnderstand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnderstandContext understand() throws RecognitionException {
		UnderstandContext _localctx = new UnderstandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_understand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(UNDERSTAND);
			setState(30);
			match(String);
			setState(31);
			match(Identifier);
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

	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(FableGrammarParser.DESCRIPTION, 0); }
		public TerminalNode String() { return getToken(FableGrammarParser.String, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(DESCRIPTION);
			setState(34);
			match(String);
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

	public static class KnowledgeContext extends ParserRuleContext {
		public TerminalNode KNOWLEDGE() { return getToken(FableGrammarParser.KNOWLEDGE, 0); }
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public TerminalNode Open() { return getToken(FableGrammarParser.Open, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode Close() { return getToken(FableGrammarParser.Close, 0); }
		public RequirementsContext requirements() {
			return getRuleContext(RequirementsContext.class,0);
		}
		public List<RememberContext> remember() {
			return getRuleContexts(RememberContext.class);
		}
		public RememberContext remember(int i) {
			return getRuleContext(RememberContext.class,i);
		}
		public List<UnderstandContext> understand() {
			return getRuleContexts(UnderstandContext.class);
		}
		public UnderstandContext understand(int i) {
			return getRuleContext(UnderstandContext.class,i);
		}
		public KnowledgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knowledge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterKnowledge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitKnowledge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitKnowledge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KnowledgeContext knowledge() throws RecognitionException {
		KnowledgeContext _localctx = new KnowledgeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_knowledge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(KNOWLEDGE);
			setState(37);
			match(Identifier);
			setState(38);
			match(Open);
			setState(40);
			_la = _input.LA(1);
			if (_la==REQUIREMENT) {
				{
				setState(39);
				requirements();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REMEMBER || _la==UNDERSTAND) {
				{
				setState(44);
				switch (_input.LA(1)) {
				case REMEMBER:
					{
					setState(42);
					remember();
					}
					break;
				case UNDERSTAND:
					{
					setState(43);
					understand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			description();
			setState(50);
			match(Close);
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

	public static class AssociationsContext extends ParserRuleContext {
		public TerminalNode ASSOCIATION() { return getToken(FableGrammarParser.ASSOCIATION, 0); }
		public TerminalNode Open() { return getToken(FableGrammarParser.Open, 0); }
		public TerminalNode Close() { return getToken(FableGrammarParser.Close, 0); }
		public List<TerminalNode> Identifier() { return getTokens(FableGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(FableGrammarParser.Identifier, i);
		}
		public AssociationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterAssociations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitAssociations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitAssociations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationsContext associations() throws RecognitionException {
		AssociationsContext _localctx = new AssociationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_associations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ASSOCIATION);
			setState(53);
			match(Open);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(Identifier);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(59);
			match(Close);
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

	public static class FableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public TerminalNode Open() { return getToken(FableGrammarParser.Open, 0); }
		public TerminalNode Close() { return getToken(FableGrammarParser.Close, 0); }
		public TerminalNode EOF() { return getToken(FableGrammarParser.EOF, 0); }
		public List<KnowledgeContext> knowledge() {
			return getRuleContexts(KnowledgeContext.class);
		}
		public KnowledgeContext knowledge(int i) {
			return getRuleContext(KnowledgeContext.class,i);
		}
		public List<SceneContext> scene() {
			return getRuleContexts(SceneContext.class);
		}
		public SceneContext scene(int i) {
			return getRuleContext(SceneContext.class,i);
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
		enterRule(_localctx, 12, RULE_fable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FABLE);
			setState(62);
			match(Identifier);
			setState(63);
			match(Open);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(66);
				switch (_input.LA(1)) {
				case KNOWLEDGE:
					{
					setState(64);
					knowledge();
					}
					break;
				case NORMALSCENE:
				case STARTSCENE:
				case ENDSCENE:
					{
					setState(65);
					scene();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KNOWLEDGE) | (1L << NORMALSCENE) | (1L << STARTSCENE) | (1L << ENDSCENE))) != 0) );
			setState(70);
			match(Close);
			setState(71);
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

	public static class SceneContext extends ParserRuleContext {
		public SceneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scene; }
	 
		public SceneContext() { }
		public void copyFrom(SceneContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartSceneContext extends SceneContext {
		public TerminalNode STARTSCENE() { return getToken(FableGrammarParser.STARTSCENE, 0); }
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public TerminalNode Open() { return getToken(FableGrammarParser.Open, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode Close() { return getToken(FableGrammarParser.Close, 0); }
		public AssociationsContext associations() {
			return getRuleContext(AssociationsContext.class,0);
		}
		public StartSceneContext(SceneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterStartScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitStartScene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitStartScene(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndSceneContext extends SceneContext {
		public TerminalNode ENDSCENE() { return getToken(FableGrammarParser.ENDSCENE, 0); }
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public TerminalNode Open() { return getToken(FableGrammarParser.Open, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode Close() { return getToken(FableGrammarParser.Close, 0); }
		public EndSceneContext(SceneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterEndScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitEndScene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitEndScene(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalSceneContext extends SceneContext {
		public TerminalNode NORMALSCENE() { return getToken(FableGrammarParser.NORMALSCENE, 0); }
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public TerminalNode Open() { return getToken(FableGrammarParser.Open, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode Close() { return getToken(FableGrammarParser.Close, 0); }
		public AssociationsContext associations() {
			return getRuleContext(AssociationsContext.class,0);
		}
		public NormalSceneContext(SceneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterNormalScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitNormalScene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitNormalScene(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SceneContext scene() throws RecognitionException {
		SceneContext _localctx = new SceneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scene);
		int _la;
		try {
			setState(97);
			switch (_input.LA(1)) {
			case NORMALSCENE:
				_localctx = new NormalSceneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(NORMALSCENE);
				setState(74);
				match(Identifier);
				setState(75);
				match(Open);
				setState(77);
				_la = _input.LA(1);
				if (_la==ASSOCIATION) {
					{
					setState(76);
					associations();
					}
				}

				setState(79);
				description();
				setState(80);
				match(Close);
				}
				break;
			case STARTSCENE:
				_localctx = new StartSceneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(STARTSCENE);
				setState(83);
				match(Identifier);
				setState(84);
				match(Open);
				setState(86);
				_la = _input.LA(1);
				if (_la==ASSOCIATION) {
					{
					setState(85);
					associations();
					}
				}

				setState(88);
				description();
				setState(89);
				match(Close);
				}
				break;
			case ENDSCENE:
				_localctx = new EndSceneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(ENDSCENE);
				setState(92);
				match(Identifier);
				setState(93);
				match(Open);
				setState(94);
				description();
				setState(95);
				match(Close);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\5\6+\n\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\6\7:\n\7\r\7\16\7;\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\bE\n\b\r"+
		"\b\16\bF\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tP\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tY\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\t\2\2\n\2"+
		"\4\6\b\n\f\16\20\2\2h\2\22\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b#\3\2\2"+
		"\2\n&\3\2\2\2\f\66\3\2\2\2\16?\3\2\2\2\20c\3\2\2\2\22\23\7\b\2\2\23\25"+
		"\7\5\2\2\24\26\7\3\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\31\3\2\2\2\31\32\7\6\2\2\32\3\3\2\2\2\33\34\7\t\2\2\34\35"+
		"\7\4\2\2\35\36\7\3\2\2\36\5\3\2\2\2\37 \7\n\2\2 !\7\4\2\2!\"\7\3\2\2\""+
		"\7\3\2\2\2#$\7\13\2\2$%\7\4\2\2%\t\3\2\2\2&\'\7\f\2\2\'(\7\3\2\2(*\7\5"+
		"\2\2)+\5\2\2\2*)\3\2\2\2*+\3\2\2\2+\60\3\2\2\2,/\5\4\3\2-/\5\6\4\2.,\3"+
		"\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62"+
		"\60\3\2\2\2\63\64\5\b\5\2\64\65\7\6\2\2\65\13\3\2\2\2\66\67\7\r\2\2\67"+
		"9\7\5\2\28:\7\3\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2"+
		"=>\7\6\2\2>\r\3\2\2\2?@\7\7\2\2@A\7\3\2\2AD\7\5\2\2BE\5\n\6\2CE\5\20\t"+
		"\2DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\6\2"+
		"\2IJ\7\2\2\3J\17\3\2\2\2KL\7\16\2\2LM\7\3\2\2MO\7\5\2\2NP\5\f\7\2ON\3"+
		"\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5\b\5\2RS\7\6\2\2Sd\3\2\2\2TU\7\17\2\2UV"+
		"\7\3\2\2VX\7\5\2\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\b\5\2["+
		"\\\7\6\2\2\\d\3\2\2\2]^\7\20\2\2^_\7\3\2\2_`\7\5\2\2`a\5\b\5\2ab\7\6\2"+
		"\2bd\3\2\2\2cK\3\2\2\2cT\3\2\2\2c]\3\2\2\2d\21\3\2\2\2\f\27*.\60;DFOX"+
		"c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}