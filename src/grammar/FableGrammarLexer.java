// Generated from FableGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FableGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"WS"
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


	public FableGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FableGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u00a2\n\23\r\23"+
		"\16\23\u00a3\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\3\5\2\13\f\17\17\""+
		"\"\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\t8\3\2"+
		"\2\2\13:\3\2\2\2\rC\3\2\2\2\17H\3\2\2\2\21R\3\2\2\2\23]\3\2\2\2\25g\3"+
		"\2\2\2\27p\3\2\2\2\31|\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b"+
		"\3\2\2\2!\u0092\3\2\2\2#\u0099\3\2\2\2%\u00a1\3\2\2\2\'(\7E\2\2()\7Q\2"+
		"\2)*\7P\2\2*+\7J\2\2+,\7G\2\2,-\7E\2\2-.\7K\2\2./\7O\2\2/\60\7G\2\2\60"+
		"\61\7P\2\2\61\62\7V\2\2\62\63\7Q\2\2\63\4\3\2\2\2\64\65\7*\2\2\65\6\3"+
		"\2\2\2\66\67\7+\2\2\67\b\3\2\2\289\7.\2\29\n\3\2\2\2:;\7R\2\2;<\7G\2\2"+
		"<=\7T\2\2=>\7I\2\2>?\7W\2\2?@\7P\2\2@A\7V\2\2AB\7C\2\2B\f\3\2\2\2CD\7"+
		"E\2\2DE\7G\2\2EF\7P\2\2FG\7C\2\2G\16\3\2\2\2HI\7T\2\2IJ\7G\2\2JK\7S\2"+
		"\2KL\7W\2\2LM\7K\2\2MN\7U\2\2NO\7K\2\2OP\7V\2\2PQ\7Q\2\2Q\20\3\2\2\2R"+
		"S\7C\2\2ST\7U\2\2TU\7U\2\2UV\7Q\2\2VW\7E\2\2WX\7K\2\2XY\7C\2\2YZ\7E\2"+
		"\2Z[\7C\2\2[\\\7Q\2\2\\\22\3\2\2\2]^\7F\2\2^_\7G\2\2_`\7U\2\2`a\7E\2\2"+
		"ab\7T\2\2bc\7K\2\2cd\7E\2\2de\7C\2\2ef\7Q\2\2f\24\3\2\2\2gh\7T\2\2hi\7"+
		"G\2\2ij\7U\2\2jk\7R\2\2kl\7Q\2\2lm\7U\2\2mn\7V\2\2no\7C\2\2o\26\3\2\2"+
		"\2pq\7C\2\2qr\7N\2\2rs\7V\2\2st\7G\2\2tu\7T\2\2uv\7P\2\2vw\7C\2\2wx\7"+
		"V\2\2xy\7K\2\2yz\7X\2\2z{\7C\2\2{\30\3\2\2\2|}\7F\2\2}~\7G\2\2~\177\7"+
		"U\2\2\177\u0080\7E\2\2\u0080\u0081\7Q\2\2\u0081\u0082\7P\2\2\u0082\u0083"+
		"\7J\2\2\u0083\u0084\7G\2\2\u0084\u0085\7E\2\2\u0085\u0086\7G\2\2\u0086"+
		"\32\3\2\2\2\u0087\u0088\7$\2\2\u0088\34\3\2\2\2\u0089\u008a\7^\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008c\7C\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7\60\2"+
		"\2\u008e\u008f\7\60\2\2\u008f\u0090\7\"\2\2\u0090\u0091\7\\\2\2\u0091"+
		" \3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7\60\2\2"+
		"\u0095\u0096\7\60\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7|\2\2\u0098\"\3"+
		"\2\2\2\u0099\u009a\7\62\2\2\u009a\u009b\7\"\2\2\u009b\u009c\7\60\2\2\u009c"+
		"\u009d\7\60\2\2\u009d\u009e\7\"\2\2\u009e\u009f\7;\2\2\u009f$\3\2\2\2"+
		"\u00a0\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\23\2\2"+
		"\u00a6&\3\2\2\2\4\2\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}