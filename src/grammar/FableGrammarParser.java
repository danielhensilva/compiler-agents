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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WS=19;
	public static final int
		RULE_fable = 0, RULE_knowledge = 1, RULE_question = 2, RULE_scene = 3, 
		RULE_requirement = 4, RULE_association = 5, RULE_description = 6, RULE_answer = 7, 
		RULE_option = 8, RULE_unknown = 9, RULE_string = 10, RULE_ident = 11;
	public static final String[] ruleNames = {
		"fable", "knowledge", "question", "scene", "requirement", "association", 
		"description", "answer", "option", "unknown", "string", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FABULA'", "'('", "')'", "'CONHECIMENTO'", "','", "'PERGUNTA'", 
		"'CENA'", "'REQUISITO'", "'ASSOCIACAO'", "'DESCRICAO'", "'RESPOSTA'", 
		"'ALTERNATIVA'", "'DESCONHECE'", "'\"'", "'\\'", "'A .. Z'", "'a .. z'", 
		"'0 .. 9'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WS"
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
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
		enterRule(_localctx, 0, RULE_fable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			ident();
			setState(26);
			match(T__1);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(29);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(27);
					knowledge();
					}
					break;
				case T__6:
					{
					setState(28);
					scene();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==T__6 );
			setState(33);
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

	public static class KnowledgeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
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
		enterRule(_localctx, 2, RULE_knowledge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__3);
			setState(36);
			ident();
			setState(37);
			match(T__1);
			setState(39);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(38);
				description();
				}
			}

			setState(42);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(41);
				requirement();
				}
			}

			setState(44);
			question();
			setState(45);
			match(T__2);
			setState(46);
			match(T__4);
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

	public static class QuestionContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__5);
			setState(49);
			string();
			setState(50);
			match(T__1);
			setState(51);
			answer();
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				option();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(57);
			unknown();
			setState(58);
			match(T__2);
			setState(59);
			match(T__4);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public AssociationContext association() {
			return getRuleContext(AssociationContext.class,0);
		}
		public SceneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterScene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitScene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitScene(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SceneContext scene() throws RecognitionException {
		SceneContext _localctx = new SceneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__6);
			setState(62);
			ident();
			setState(63);
			match(T__1);
			setState(64);
			description();
			setState(66);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(65);
				association();
				}
			}

			setState(68);
			match(T__2);
			setState(69);
			match(T__4);
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

	public static class RequirementContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_requirement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			match(T__1);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				ident();
				setState(74);
				match(T__4);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) );
			setState(80);
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

	public static class AssociationContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public AssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociationContext association() throws RecognitionException {
		AssociationContext _localctx = new AssociationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_association);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__8);
			setState(83);
			match(T__1);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				ident();
				setState(85);
				match(T__4);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) );
			setState(91);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__9);
			setState(94);
			string();
			setState(95);
			match(T__4);
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

	public static class AnswerContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__10);
			setState(98);
			string();
			setState(99);
			match(T__4);
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

	public static class OptionContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__11);
			setState(102);
			string();
			setState(103);
			match(T__4);
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

	public static class UnknownContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unknown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(106);
			string();
			setState(107);
			match(T__4);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__13);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << WS))) != 0)) {
				{
				setState(113);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(110);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__13) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case 2:
					{
					setState(111);
					match(T__14);
					setState(112);
					match(T__13);
					}
					break;
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__13);
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

	public static class IdentContext extends ParserRuleContext {
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				{
				setState(120);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\6\48\n\4\r\4\16\49\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\6\6O\n\6\r\6\16\6P\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\6\7Z\n\7\r\7\16\7[\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\ft\n\f\f\f\16\fw\13"+
		"\f\3\f\3\f\3\r\7\r|\n\r\f\r\16\r\177\13\r\3\r\2\2\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\4\3\2\20\20\3\2\22\24\177\2\32\3\2\2\2\4%\3\2\2\2\6\62"+
		"\3\2\2\2\b?\3\2\2\2\nI\3\2\2\2\fT\3\2\2\2\16_\3\2\2\2\20c\3\2\2\2\22g"+
		"\3\2\2\2\24k\3\2\2\2\26o\3\2\2\2\30}\3\2\2\2\32\33\7\3\2\2\33\34\5\30"+
		"\r\2\34\37\7\4\2\2\35 \5\4\3\2\36 \5\b\5\2\37\35\3\2\2\2\37\36\3\2\2\2"+
		" !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\5\2\2$\3\3\2\2\2%&\7"+
		"\6\2\2&\'\5\30\r\2\')\7\4\2\2(*\5\16\b\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2"+
		"+-\5\n\6\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\5\6\4\2/\60\7\5\2\2\60\61\7"+
		"\7\2\2\61\5\3\2\2\2\62\63\7\b\2\2\63\64\5\26\f\2\64\65\7\4\2\2\65\67\5"+
		"\20\t\2\668\5\22\n\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3"+
		"\2\2\2;<\5\24\13\2<=\7\5\2\2=>\7\7\2\2>\7\3\2\2\2?@\7\t\2\2@A\5\30\r\2"+
		"AB\7\4\2\2BD\5\16\b\2CE\5\f\7\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\5\2"+
		"\2GH\7\7\2\2H\t\3\2\2\2IJ\7\n\2\2JN\7\4\2\2KL\5\30\r\2LM\7\7\2\2MO\3\2"+
		"\2\2NK\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\5\2\2S\13\3"+
		"\2\2\2TU\7\13\2\2UY\7\4\2\2VW\5\30\r\2WX\7\7\2\2XZ\3\2\2\2YV\3\2\2\2Z"+
		"[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\5\2\2^\r\3\2\2\2_`\7\f\2"+
		"\2`a\5\26\f\2ab\7\7\2\2b\17\3\2\2\2cd\7\r\2\2de\5\26\f\2ef\7\7\2\2f\21"+
		"\3\2\2\2gh\7\16\2\2hi\5\26\f\2ij\7\7\2\2j\23\3\2\2\2kl\7\17\2\2lm\5\26"+
		"\f\2mn\7\7\2\2n\25\3\2\2\2ou\7\20\2\2pt\n\2\2\2qr\7\21\2\2rt\7\20\2\2"+
		"sp\3\2\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2"+
		"xy\7\20\2\2y\27\3\2\2\2z|\t\3\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~\31\3\2\2\2\177}\3\2\2\2\r\37!),9DP[su}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}