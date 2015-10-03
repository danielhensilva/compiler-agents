// Generated from FableGrammar.g4 by ANTLR 4.5.1
package gramatica;
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
		T__9=10, T__10=11, T__11=12, String=13, Identificador=14, Comentario=15, 
		EspacoEmBranco=16;
	public static final int
		RULE_associacoes = 0, RULE_lembranca = 1, RULE_entendimento = 2, RULE_requisitos = 3, 
		RULE_fabula = 4, RULE_cena = 5, RULE_conhecimento = 6, RULE_descricao = 7;
	public static final String[] ruleNames = {
		"associacoes", "lembranca", "entendimento", "requisitos", "fabula", "cena", 
		"conhecimento", "descricao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ASSOCIACAO'", "'('", "')'", "'LEMBRAR'", "'ENTENDER'", "'REQUISITO'", 
		"'FABULA'", "'CENA'", "'INICIO'", "'FIM'", "'CONHECIMENTO'", "'DESCRICAO'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "String", "Identificador", "Comentario", "EspacoEmBranco"
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
	public static class AssociacoesContext extends ParserRuleContext {
		public List<TerminalNode> Identificador() { return getTokens(FableGrammarParser.Identificador); }
		public TerminalNode Identificador(int i) {
			return getToken(FableGrammarParser.Identificador, i);
		}
		public AssociacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterAssociacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitAssociacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitAssociacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociacoesContext associacoes() throws RecognitionException {
		AssociacoesContext _localctx = new AssociacoesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_associacoes);
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
				match(Identificador);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identificador );
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

	public static class LembrancaContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(FableGrammarParser.String, 0); }
		public TerminalNode Identificador() { return getToken(FableGrammarParser.Identificador, 0); }
		public LembrancaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lembranca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterLembranca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitLembranca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitLembranca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LembrancaContext lembranca() throws RecognitionException {
		LembrancaContext _localctx = new LembrancaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lembranca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__3);
			setState(26);
			match(String);
			setState(27);
			match(Identificador);
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

	public static class EntendimentoContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(FableGrammarParser.String, 0); }
		public TerminalNode Identificador() { return getToken(FableGrammarParser.Identificador, 0); }
		public EntendimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entendimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterEntendimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitEntendimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitEntendimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntendimentoContext entendimento() throws RecognitionException {
		EntendimentoContext _localctx = new EntendimentoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entendimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__4);
			setState(30);
			match(String);
			setState(31);
			match(Identificador);
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

	public static class RequisitosContext extends ParserRuleContext {
		public List<TerminalNode> Identificador() { return getTokens(FableGrammarParser.Identificador); }
		public TerminalNode Identificador(int i) {
			return getToken(FableGrammarParser.Identificador, i);
		}
		public RequisitosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requisitos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterRequisitos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitRequisitos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitRequisitos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequisitosContext requisitos() throws RecognitionException {
		RequisitosContext _localctx = new RequisitosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_requisitos);
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
				match(Identificador);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identificador );
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

	public static class FabulaContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(FableGrammarParser.Identificador, 0); }
		public TerminalNode EOF() { return getToken(FableGrammarParser.EOF, 0); }
		public List<ConhecimentoContext> conhecimento() {
			return getRuleContexts(ConhecimentoContext.class);
		}
		public ConhecimentoContext conhecimento(int i) {
			return getRuleContext(ConhecimentoContext.class,i);
		}
		public List<CenaContext> cena() {
			return getRuleContexts(CenaContext.class);
		}
		public CenaContext cena(int i) {
			return getRuleContext(CenaContext.class,i);
		}
		public FabulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fabula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterFabula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitFabula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitFabula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FabulaContext fabula() throws RecognitionException {
		FabulaContext _localctx = new FabulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fabula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__6);
			setState(43);
			match(Identificador);
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
					conhecimento();
					}
					break;
				case T__7:
				case T__8:
				case T__9:
					{
					setState(46);
					cena();
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

	public static class CenaContext extends ParserRuleContext {
		public CenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cena; }
	 
		public CenaContext() { }
		public void copyFrom(CenaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CenaInicialContext extends CenaContext {
		public TerminalNode Identificador() { return getToken(FableGrammarParser.Identificador, 0); }
		public AssociacoesContext associacoes() {
			return getRuleContext(AssociacoesContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public CenaInicialContext(CenaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterCenaInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitCenaInicial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitCenaInicial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CenaFinalContext extends CenaContext {
		public TerminalNode Identificador() { return getToken(FableGrammarParser.Identificador, 0); }
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public CenaFinalContext(CenaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterCenaFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitCenaFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitCenaFinal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CenaIntermediariaContext extends CenaContext {
		public TerminalNode Identificador() { return getToken(FableGrammarParser.Identificador, 0); }
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public AssociacoesContext associacoes() {
			return getRuleContext(AssociacoesContext.class,0);
		}
		public CenaIntermediariaContext(CenaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterCenaIntermediaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitCenaIntermediaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitCenaIntermediaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenaContext cena() throws RecognitionException {
		CenaContext _localctx = new CenaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cena);
		int _la;
		try {
			setState(76);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new CenaIntermediariaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__7);
				setState(55);
				match(Identificador);
				setState(56);
				match(T__1);
				setState(58);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(57);
					associacoes();
					}
				}

				setState(60);
				descricao();
				setState(61);
				match(T__2);
				}
				break;
			case T__8:
				_localctx = new CenaInicialContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__8);
				setState(64);
				match(Identificador);
				setState(65);
				match(T__1);
				setState(66);
				associacoes();
				setState(67);
				descricao();
				setState(68);
				match(T__2);
				}
				break;
			case T__9:
				_localctx = new CenaFinalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(T__9);
				setState(71);
				match(Identificador);
				setState(72);
				match(T__1);
				setState(73);
				descricao();
				setState(74);
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

	public static class ConhecimentoContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(FableGrammarParser.Identificador, 0); }
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public RequisitosContext requisitos() {
			return getRuleContext(RequisitosContext.class,0);
		}
		public List<LembrancaContext> lembranca() {
			return getRuleContexts(LembrancaContext.class);
		}
		public LembrancaContext lembranca(int i) {
			return getRuleContext(LembrancaContext.class,i);
		}
		public List<EntendimentoContext> entendimento() {
			return getRuleContexts(EntendimentoContext.class);
		}
		public EntendimentoContext entendimento(int i) {
			return getRuleContext(EntendimentoContext.class,i);
		}
		public ConhecimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conhecimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterConhecimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitConhecimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitConhecimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConhecimentoContext conhecimento() throws RecognitionException {
		ConhecimentoContext _localctx = new ConhecimentoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conhecimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__10);
			setState(79);
			match(Identificador);
			setState(80);
			match(T__1);
			setState(82);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(81);
				requisitos();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				setState(86);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(84);
					lembranca();
					}
					break;
				case T__4:
					{
					setState(85);
					entendimento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			descricao();
			setState(92);
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

	public static class DescricaoContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(FableGrammarParser.String, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FableGrammarListener ) ((FableGrammarListener)listener).exitDescricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FableGrammarVisitor ) return ((FableGrammarVisitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__11);
			setState(95);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\5\3\5\3\6\3\6\3\6\3\6\3\6\6\6\62\n\6\r\6\16\6\63"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7=\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\5\bU\n\b\3\b"+
		"\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2\n\2\4\6"+
		"\b\n\f\16\20\2\2e\2\22\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b#\3\2\2\2\n"+
		",\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20`\3\2\2\2\22\23\7\3\2\2\23\25\7\4\2"+
		"\2\24\26\7\20\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\31\3\2\2\2\31\32\7\5\2\2\32\3\3\2\2\2\33\34\7\6\2\2\34\35\7\17"+
		"\2\2\35\36\7\20\2\2\36\5\3\2\2\2\37 \7\7\2\2 !\7\17\2\2!\"\7\20\2\2\""+
		"\7\3\2\2\2#$\7\b\2\2$&\7\4\2\2%\'\7\20\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2"+
		"\2\2()\3\2\2\2)*\3\2\2\2*+\7\5\2\2+\t\3\2\2\2,-\7\t\2\2-.\7\20\2\2.\61"+
		"\7\4\2\2/\62\5\16\b\2\60\62\5\f\7\2\61/\3\2\2\2\61\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\5\2\2\66\67\7"+
		"\2\2\3\67\13\3\2\2\289\7\n\2\29:\7\20\2\2:<\7\4\2\2;=\5\2\2\2<;\3\2\2"+
		"\2<=\3\2\2\2=>\3\2\2\2>?\5\20\t\2?@\7\5\2\2@O\3\2\2\2AB\7\13\2\2BC\7\20"+
		"\2\2CD\7\4\2\2DE\5\2\2\2EF\5\20\t\2FG\7\5\2\2GO\3\2\2\2HI\7\f\2\2IJ\7"+
		"\20\2\2JK\7\4\2\2KL\5\20\t\2LM\7\5\2\2MO\3\2\2\2N8\3\2\2\2NA\3\2\2\2N"+
		"H\3\2\2\2O\r\3\2\2\2PQ\7\r\2\2QR\7\20\2\2RT\7\4\2\2SU\5\b\5\2TS\3\2\2"+
		"\2TU\3\2\2\2UZ\3\2\2\2VY\5\4\3\2WY\5\6\4\2XV\3\2\2\2XW\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\5\20\t\2^_\7\5\2\2_\17"+
		"\3\2\2\2`a\7\16\2\2ab\7\17\2\2b\21\3\2\2\2\13\27(\61\63<NTXZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}