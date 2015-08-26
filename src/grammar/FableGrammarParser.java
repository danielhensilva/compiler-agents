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
		WS=18;
	public static final int
		RULE_knowledge = 0, RULE_question = 1, RULE_scene = 2, RULE_requirement = 3, 
		RULE_association = 4, RULE_description = 5, RULE_answer = 6, RULE_option = 7, 
		RULE_unknown = 8, RULE_string = 9, RULE_ident = 10;
	public static final String[] ruleNames = {
		"knowledge", "question", "scene", "requirement", "association", "description", 
		"answer", "option", "unknown", "string", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'CONHECIMENTO'", "'('", "')'", "','", "'PERGUNTA'", "'CENA'", "'REQUISITO'", 
		"'ASSOCIACAO'", "'DESCRICAO'", "'RESPOSTA'", "'ALTERNATIVA'", "'DESCONHECE'", 
		"'\"'", "'\\'", "'A .. Z'", "'a .. z'", "'0 .. 9'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WS"
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
		enterRule(_localctx, 0, RULE_knowledge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			ident();
			setState(24);
			match(T__1);
			setState(26);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(25);
				description();
				}
			}

			setState(29);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(28);
				requirement();
				}
			}

			setState(31);
			question();
			setState(32);
			match(T__2);
			setState(33);
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
		enterRule(_localctx, 2, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__4);
			setState(36);
			string();
			setState(37);
			match(T__1);
			setState(38);
			answer();
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				option();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(44);
			unknown();
			setState(45);
			match(T__2);
			setState(46);
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

	public static class SceneContext extends ParserRuleContext {
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
		enterRule(_localctx, 4, RULE_scene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__5);
			setState(49);
			match(T__1);
			setState(50);
			description();
			setState(52);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(51);
				association();
				}
			}

			setState(54);
			match(T__2);
			setState(55);
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
		enterRule(_localctx, 6, RULE_requirement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__6);
			setState(58);
			match(T__1);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				ident();
				setState(60);
				match(T__3);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) );
			setState(66);
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
		enterRule(_localctx, 8, RULE_association);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__7);
			setState(69);
			match(T__1);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				ident();
				setState(71);
				match(T__3);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) );
			setState(77);
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
		enterRule(_localctx, 10, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__8);
			setState(80);
			string();
			setState(81);
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
		enterRule(_localctx, 12, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__9);
			setState(84);
			string();
			setState(85);
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
		enterRule(_localctx, 14, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__10);
			setState(88);
			string();
			setState(89);
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
		enterRule(_localctx, 16, RULE_unknown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__11);
			setState(92);
			string();
			setState(93);
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
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__12);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << WS))) != 0)) {
				{
				setState(99);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(96);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__12) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case 2:
					{
					setState(97);
					match(T__13);
					setState(98);
					match(T__12);
					}
					break;
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__12);
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
		enterRule(_localctx, 20, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				{
				setState(106);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(111);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\5\2 \n\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\67"+
		"\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\6\5A\n\5\r\5\16\5B\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\6\6L\n\6\r\6\16\6M\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13f\n\13\f"+
		"\13\16\13i\13\13\3\13\3\13\3\f\7\fn\n\f\f\f\16\fq\13\f\3\f\2\2\r\2\4\6"+
		"\b\n\f\16\20\22\24\26\2\4\3\2\17\17\3\2\21\23p\2\30\3\2\2\2\4%\3\2\2\2"+
		"\6\62\3\2\2\2\b;\3\2\2\2\nF\3\2\2\2\fQ\3\2\2\2\16U\3\2\2\2\20Y\3\2\2\2"+
		"\22]\3\2\2\2\24a\3\2\2\2\26o\3\2\2\2\30\31\7\3\2\2\31\32\5\26\f\2\32\34"+
		"\7\4\2\2\33\35\5\f\7\2\34\33\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36 \5"+
		"\b\5\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\5\4\3\2\"#\7\5\2\2#$\7\6"+
		"\2\2$\3\3\2\2\2%&\7\7\2\2&\'\5\24\13\2\'(\7\4\2\2(*\5\16\b\2)+\5\20\t"+
		"\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\5\22\n\2/\60\7"+
		"\5\2\2\60\61\7\6\2\2\61\5\3\2\2\2\62\63\7\b\2\2\63\64\7\4\2\2\64\66\5"+
		"\f\7\2\65\67\5\n\6\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\5\2\2"+
		"9:\7\6\2\2:\7\3\2\2\2;<\7\t\2\2<@\7\4\2\2=>\5\26\f\2>?\7\6\2\2?A\3\2\2"+
		"\2@=\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\5\2\2E\t\3\2"+
		"\2\2FG\7\n\2\2GK\7\4\2\2HI\5\26\f\2IJ\7\6\2\2JL\3\2\2\2KH\3\2\2\2LM\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\5\2\2P\13\3\2\2\2QR\7\13\2\2"+
		"RS\5\24\13\2ST\7\6\2\2T\r\3\2\2\2UV\7\f\2\2VW\5\24\13\2WX\7\6\2\2X\17"+
		"\3\2\2\2YZ\7\r\2\2Z[\5\24\13\2[\\\7\6\2\2\\\21\3\2\2\2]^\7\16\2\2^_\5"+
		"\24\13\2_`\7\6\2\2`\23\3\2\2\2ag\7\17\2\2bf\n\2\2\2cd\7\20\2\2df\7\17"+
		"\2\2eb\3\2\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2"+
		"\2\2jk\7\17\2\2k\25\3\2\2\2ln\t\3\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2p\27\3\2\2\2qo\3\2\2\2\13\34\37,\66BMego";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}