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
		RULE_description = 0, RULE_associations = 1, RULE_fable = 2, RULE_scene = 3, 
		RULE_knowledge = 4, RULE_remember = 5, RULE_understand = 6, RULE_requirements = 7;
	public static final String[] ruleNames = {
		"description", "associations", "fable", "scene", "knowledge", "remember", 
		"understand", "requirements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'DESCRICAO'", "'ASSOCIACAO'", "'('", "')'", "'FABULA'", "'CENA'", 
		"'INICIO'", "'FIM'", "'CONHECIMENTO'", "'LEMBRAR'", "'ENTENDER'", "'REQUISITO'"
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
		enterRule(_localctx, 0, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
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
		enterRule(_localctx, 2, RULE_associations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__1);
			setState(20);
			match(T__2);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				match(Identifier);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(26);
			match(T__3);
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
		enterRule(_localctx, 4, RULE_fable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__4);
			setState(29);
			match(Identifier);
			setState(30);
			match(T__2);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(33);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(31);
					knowledge();
					}
					break;
				case T__5:
				case T__6:
				case T__7:
					{
					setState(32);
					scene();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) );
			setState(37);
			match(T__3);
			setState(38);
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
		enterRule(_localctx, 6, RULE_scene);
		int _la;
		try {
			setState(64);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new NormalSceneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__5);
				setState(41);
				match(Identifier);
				setState(42);
				match(T__2);
				setState(44);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(43);
					associations();
					}
				}

				setState(46);
				description();
				setState(47);
				match(T__3);
				}
				break;
			case T__6:
				_localctx = new StartSceneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__6);
				setState(50);
				match(Identifier);
				setState(51);
				match(T__2);
				setState(53);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(52);
					associations();
					}
				}

				setState(55);
				description();
				setState(56);
				match(T__3);
				}
				break;
			case T__7:
				_localctx = new EndSceneContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(T__7);
				setState(59);
				match(Identifier);
				setState(60);
				match(T__2);
				setState(61);
				description();
				setState(62);
				match(T__3);
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
		enterRule(_localctx, 8, RULE_knowledge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__8);
			setState(67);
			match(Identifier);
			setState(68);
			match(T__2);
			setState(70);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(69);
				requirements();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				setState(74);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(72);
					remember();
					}
					break;
				case T__10:
					{
					setState(73);
					understand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			description();
			setState(80);
			match(T__3);
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
		enterRule(_localctx, 10, RULE_remember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__9);
			setState(83);
			match(String);
			setState(84);
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
		enterRule(_localctx, 12, RULE_understand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__10);
			setState(87);
			match(String);
			setState(88);
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
		enterRule(_localctx, 14, RULE_requirements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__11);
			setState(91);
			match(T__2);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				match(Identifier);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(97);
			match(T__3);
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
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\6\3\31\n\3\r\3\16\3\32\3\3\3\3\3\4\3\4\3\4\3\4\3\4\6\4$\n\4\r\4\16"+
		"\4%\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5/\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\58\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6\3\6\5"+
		"\6I\n\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\6\t`\n\t\r\t\16\ta\3\t\3\t\3\t\2\2\n\2\4\6"+
		"\b\n\f\16\20\2\2h\2\22\3\2\2\2\4\25\3\2\2\2\6\36\3\2\2\2\bB\3\2\2\2\n"+
		"D\3\2\2\2\fT\3\2\2\2\16X\3\2\2\2\20\\\3\2\2\2\22\23\7\3\2\2\23\24\7\17"+
		"\2\2\24\3\3\2\2\2\25\26\7\4\2\2\26\30\7\5\2\2\27\31\7\20\2\2\30\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\6"+
		"\2\2\35\5\3\2\2\2\36\37\7\7\2\2\37 \7\20\2\2 #\7\5\2\2!$\5\n\6\2\"$\5"+
		"\b\5\2#!\3\2\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'"+
		"(\7\6\2\2()\7\2\2\3)\7\3\2\2\2*+\7\b\2\2+,\7\20\2\2,.\7\5\2\2-/\5\4\3"+
		"\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\5\2\2\2\61\62\7\6\2\2\62C\3\2"+
		"\2\2\63\64\7\t\2\2\64\65\7\20\2\2\65\67\7\5\2\2\668\5\4\3\2\67\66\3\2"+
		"\2\2\678\3\2\2\289\3\2\2\29:\5\2\2\2:;\7\6\2\2;C\3\2\2\2<=\7\n\2\2=>\7"+
		"\20\2\2>?\7\5\2\2?@\5\2\2\2@A\7\6\2\2AC\3\2\2\2B*\3\2\2\2B\63\3\2\2\2"+
		"B<\3\2\2\2C\t\3\2\2\2DE\7\13\2\2EF\7\20\2\2FH\7\5\2\2GI\5\20\t\2HG\3\2"+
		"\2\2HI\3\2\2\2IN\3\2\2\2JM\5\f\7\2KM\5\16\b\2LJ\3\2\2\2LK\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\2\2\2RS\7\6\2\2S\13"+
		"\3\2\2\2TU\7\f\2\2UV\7\17\2\2VW\7\20\2\2W\r\3\2\2\2XY\7\r\2\2YZ\7\17\2"+
		"\2Z[\7\20\2\2[\17\3\2\2\2\\]\7\16\2\2]_\7\5\2\2^`\7\20\2\2_^\3\2\2\2`"+
		"a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\6\2\2d\21\3\2\2\2\f\32#%."+
		"\67BHLNa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}