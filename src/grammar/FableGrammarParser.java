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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, String=13, Identifier=14, Comment=15, Whitespace=16;
	public static final int
		RULE_associations = 0, RULE_remember = 1, RULE_understand = 2, RULE_requirements = 3, 
		RULE_fable = 4, RULE_scene = 5, RULE_knowledge = 6, RULE_description = 7;
	public static final String[] ruleNames = {
		"associations", "remember", "understand", "requirements", "fable", "scene", 
		"knowledge", "description"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ASSOCIACAO'", "'('", "')'", "'LEMBRAR'", "'ENTENDER'", "'REQUISITO'", 
		"'FABULA'", "'CENA'", "'INICIO'", "'FIM'", "'CONHECIMENTO'", "'DESCRICAO'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "String", "Identifier", "Comment", "Whitespace"
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
	public static class AssociationsContext extends ParserRuleContext {
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
		enterRule(_localctx, 0, RULE_associations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			match(T__1);
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

	public static class RememberContext extends ParserRuleContext {
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
			match(T__3);
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
			match(T__4);
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

	public static class RequirementsContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_requirements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__5);
			setState(34);
			match(T__1);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(Identifier);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(40);
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

	public static class FableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
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
		enterRule(_localctx, 8, RULE_fable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__6);
			setState(43);
			match(Identifier);
			setState(44);
			match(T__1);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(47);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(45);
					knowledge();
					}
					break;
				case T__7:
				case T__8:
				case T__9:
					{
					setState(46);
					scene();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
			setState(51);
			match(T__2);
			setState(52);
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
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
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
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
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
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_scene);
		int _la;
		try {
			setState(78);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new NormalSceneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__7);
				setState(55);
				match(Identifier);
				setState(56);
				match(T__1);
				setState(58);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(57);
					associations();
					}
				}

				setState(60);
				description();
				setState(61);
				match(T__2);
				}
				break;
			case T__8:
				_localctx = new StartSceneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__8);
				setState(64);
				match(Identifier);
				setState(65);
				match(T__1);
				setState(67);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(66);
					associations();
					}
				}

				setState(69);
				description();
				setState(70);
				match(T__2);
				}
				break;
			case T__9:
				_localctx = new EndSceneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__9);
				setState(73);
				match(Identifier);
				setState(74);
				match(T__1);
				setState(75);
				description();
				setState(76);
				match(T__2);
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

	public static class KnowledgeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FableGrammarParser.Identifier, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_knowledge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__10);
			setState(81);
			match(Identifier);
			setState(82);
			match(T__1);
			setState(84);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(83);
				requirements();
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				setState(88);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(86);
					remember();
					}
					break;
				case T__4:
					{
					setState(87);
					understand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			description();
			setState(94);
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

	public static class DescriptionContext extends ParserRuleContext {
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
		enterRule(_localctx, 14, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__11);
			setState(97);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\5\3\5\3\6\3\6\3\6\3\6\3\6\6\6\62\n\6\r\6\16\6\63"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7=\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"F\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\5\b"+
		"W\n\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2"+
		"\n\2\4\6\b\n\f\16\20\2\2h\2\22\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b#\3"+
		"\2\2\2\n,\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20b\3\2\2\2\22\23\7\3\2\2\23"+
		"\25\7\4\2\2\24\26\7\20\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\31\3\2\2\2\31\32\7\5\2\2\32\3\3\2\2\2\33\34\7\6\2\2\34"+
		"\35\7\17\2\2\35\36\7\20\2\2\36\5\3\2\2\2\37 \7\7\2\2 !\7\17\2\2!\"\7\20"+
		"\2\2\"\7\3\2\2\2#$\7\b\2\2$&\7\4\2\2%\'\7\20\2\2&%\3\2\2\2\'(\3\2\2\2"+
		"(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\5\2\2+\t\3\2\2\2,-\7\t\2\2-.\7\20\2"+
		"\2.\61\7\4\2\2/\62\5\16\b\2\60\62\5\f\7\2\61/\3\2\2\2\61\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\5\2\2\66"+
		"\67\7\2\2\3\67\13\3\2\2\289\7\n\2\29:\7\20\2\2:<\7\4\2\2;=\5\2\2\2<;\3"+
		"\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\20\t\2?@\7\5\2\2@Q\3\2\2\2AB\7\13\2\2B"+
		"C\7\20\2\2CE\7\4\2\2DF\5\2\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\5\20\t"+
		"\2HI\7\5\2\2IQ\3\2\2\2JK\7\f\2\2KL\7\20\2\2LM\7\4\2\2MN\5\20\t\2NO\7\5"+
		"\2\2OQ\3\2\2\2P8\3\2\2\2PA\3\2\2\2PJ\3\2\2\2Q\r\3\2\2\2RS\7\r\2\2ST\7"+
		"\20\2\2TV\7\4\2\2UW\5\b\5\2VU\3\2\2\2VW\3\2\2\2W\\\3\2\2\2X[\5\4\3\2Y"+
		"[\5\6\4\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2"+
		"\2^\\\3\2\2\2_`\5\20\t\2`a\7\5\2\2a\17\3\2\2\2bc\7\16\2\2cd\7\17\2\2d"+
		"\21\3\2\2\2\f\27(\61\63<EPVZ\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}