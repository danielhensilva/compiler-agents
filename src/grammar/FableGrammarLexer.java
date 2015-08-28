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
		T__17=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00ab\n\24\r\24\16\24\u00ac\3\24\3"+
		"\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25\3\2\3\5\2\13\f\17\17\"\"\u00b0\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\60\3\2\2\2\7\62\3\2\2\2\t\64\3\2\2"+
		"\2\13A\3\2\2\2\rC\3\2\2\2\17L\3\2\2\2\21Q\3\2\2\2\23[\3\2\2\2\25f\3\2"+
		"\2\2\27p\3\2\2\2\31y\3\2\2\2\33\u0085\3\2\2\2\35\u0090\3\2\2\2\37\u0092"+
		"\3\2\2\2!\u0094\3\2\2\2#\u009b\3\2\2\2%\u00a2\3\2\2\2\'\u00aa\3\2\2\2"+
		")*\7H\2\2*+\7C\2\2+,\7D\2\2,-\7W\2\2-.\7N\2\2./\7C\2\2/\4\3\2\2\2\60\61"+
		"\7*\2\2\61\6\3\2\2\2\62\63\7+\2\2\63\b\3\2\2\2\64\65\7E\2\2\65\66\7Q\2"+
		"\2\66\67\7P\2\2\678\7J\2\289\7G\2\29:\7E\2\2:;\7K\2\2;<\7O\2\2<=\7G\2"+
		"\2=>\7P\2\2>?\7V\2\2?@\7Q\2\2@\n\3\2\2\2AB\7.\2\2B\f\3\2\2\2CD\7R\2\2"+
		"DE\7G\2\2EF\7T\2\2FG\7I\2\2GH\7W\2\2HI\7P\2\2IJ\7V\2\2JK\7C\2\2K\16\3"+
		"\2\2\2LM\7E\2\2MN\7G\2\2NO\7P\2\2OP\7C\2\2P\20\3\2\2\2QR\7T\2\2RS\7G\2"+
		"\2ST\7S\2\2TU\7W\2\2UV\7K\2\2VW\7U\2\2WX\7K\2\2XY\7V\2\2YZ\7Q\2\2Z\22"+
		"\3\2\2\2[\\\7C\2\2\\]\7U\2\2]^\7U\2\2^_\7Q\2\2_`\7E\2\2`a\7K\2\2ab\7C"+
		"\2\2bc\7E\2\2cd\7C\2\2de\7Q\2\2e\24\3\2\2\2fg\7F\2\2gh\7G\2\2hi\7U\2\2"+
		"ij\7E\2\2jk\7T\2\2kl\7K\2\2lm\7E\2\2mn\7C\2\2no\7Q\2\2o\26\3\2\2\2pq\7"+
		"T\2\2qr\7G\2\2rs\7U\2\2st\7R\2\2tu\7Q\2\2uv\7U\2\2vw\7V\2\2wx\7C\2\2x"+
		"\30\3\2\2\2yz\7C\2\2z{\7N\2\2{|\7V\2\2|}\7G\2\2}~\7T\2\2~\177\7P\2\2\177"+
		"\u0080\7C\2\2\u0080\u0081\7V\2\2\u0081\u0082\7K\2\2\u0082\u0083\7X\2\2"+
		"\u0083\u0084\7C\2\2\u0084\32\3\2\2\2\u0085\u0086\7F\2\2\u0086\u0087\7"+
		"G\2\2\u0087\u0088\7U\2\2\u0088\u0089\7E\2\2\u0089\u008a\7Q\2\2\u008a\u008b"+
		"\7P\2\2\u008b\u008c\7J\2\2\u008c\u008d\7G\2\2\u008d\u008e\7E\2\2\u008e"+
		"\u008f\7G\2\2\u008f\34\3\2\2\2\u0090\u0091\7$\2\2\u0091\36\3\2\2\2\u0092"+
		"\u0093\7^\2\2\u0093 \3\2\2\2\u0094\u0095\7C\2\2\u0095\u0096\7\"\2\2\u0096"+
		"\u0097\7\60\2\2\u0097\u0098\7\60\2\2\u0098\u0099\7\"\2\2\u0099\u009a\7"+
		"\\\2\2\u009a\"\3\2\2\2\u009b\u009c\7c\2\2\u009c\u009d\7\"\2\2\u009d\u009e"+
		"\7\60\2\2\u009e\u009f\7\60\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7|\2\2"+
		"\u00a1$\3\2\2\2\u00a2\u00a3\7\62\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7"+
		"\60\2\2\u00a5\u00a6\7\60\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7;\2\2\u00a8"+
		"&\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\b\24\2\2\u00af(\3\2\2\2\4\2\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}