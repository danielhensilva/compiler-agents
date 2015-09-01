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
		T__9=10, T__10=11, T__11=12, String=13, Identifier=14, Comment=15, Whitespace=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "String", "Identifier", "Comment", "Whitespace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\7\16\u0080\n\16\f\16\16\16\u0083\13\16\3\16\3\16"+
		"\3\17\3\17\7\17\u0089\n\17\f\17\16\17\u008c\13\17\3\20\3\20\3\20\3\20"+
		"\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3\20\3\20\3\20\3\20\7\20\u009b"+
		"\n\20\f\20\16\20\u009e\13\20\3\20\3\20\5\20\u00a2\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\u009c\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\7\3\2$$\5\2C\\aac|\6\2\62;"+
		"C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u00ae\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5.\3\2\2\2\7\60\3\2"+
		"\2\2\t\62\3\2\2\2\13:\3\2\2\2\rC\3\2\2\2\17M\3\2\2\2\21T\3\2\2\2\23Y\3"+
		"\2\2\2\25`\3\2\2\2\27d\3\2\2\2\31q\3\2\2\2\33{\3\2\2\2\35\u0086\3\2\2"+
		"\2\37\u00a1\3\2\2\2!\u00a5\3\2\2\2#$\7C\2\2$%\7U\2\2%&\7U\2\2&\'\7Q\2"+
		"\2\'(\7E\2\2()\7K\2\2)*\7C\2\2*+\7E\2\2+,\7C\2\2,-\7Q\2\2-\4\3\2\2\2."+
		"/\7*\2\2/\6\3\2\2\2\60\61\7+\2\2\61\b\3\2\2\2\62\63\7N\2\2\63\64\7G\2"+
		"\2\64\65\7O\2\2\65\66\7D\2\2\66\67\7T\2\2\678\7C\2\289\7T\2\29\n\3\2\2"+
		"\2:;\7G\2\2;<\7P\2\2<=\7V\2\2=>\7G\2\2>?\7P\2\2?@\7F\2\2@A\7G\2\2AB\7"+
		"T\2\2B\f\3\2\2\2CD\7T\2\2DE\7G\2\2EF\7S\2\2FG\7W\2\2GH\7K\2\2HI\7U\2\2"+
		"IJ\7K\2\2JK\7V\2\2KL\7Q\2\2L\16\3\2\2\2MN\7H\2\2NO\7C\2\2OP\7D\2\2PQ\7"+
		"W\2\2QR\7N\2\2RS\7C\2\2S\20\3\2\2\2TU\7E\2\2UV\7G\2\2VW\7P\2\2WX\7C\2"+
		"\2X\22\3\2\2\2YZ\7K\2\2Z[\7P\2\2[\\\7K\2\2\\]\7E\2\2]^\7K\2\2^_\7Q\2\2"+
		"_\24\3\2\2\2`a\7H\2\2ab\7K\2\2bc\7O\2\2c\26\3\2\2\2de\7E\2\2ef\7Q\2\2"+
		"fg\7P\2\2gh\7J\2\2hi\7G\2\2ij\7E\2\2jk\7K\2\2kl\7O\2\2lm\7G\2\2mn\7P\2"+
		"\2no\7V\2\2op\7Q\2\2p\30\3\2\2\2qr\7F\2\2rs\7G\2\2st\7U\2\2tu\7E\2\2u"+
		"v\7T\2\2vw\7K\2\2wx\7E\2\2xy\7C\2\2yz\7Q\2\2z\32\3\2\2\2{\u0081\7$\2\2"+
		"|\u0080\n\2\2\2}~\7^\2\2~\u0080\7$\2\2\177|\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0085\7$\2\2\u0085\34\3\2\2\2\u0086\u008a"+
		"\t\3\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\36\3\2\2\2\u008c\u008a\3\2\2"+
		"\2\u008d\u008e\7\61\2\2\u008e\u008f\7\61\2\2\u008f\u0093\3\2\2\2\u0090"+
		"\u0092\n\5\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u00a2\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\7\61\2\2\u0097\u0098\7,\2\2\u0098\u009c\3\2\2\2\u0099\u009b\13"+
		"\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7,"+
		"\2\2\u00a0\u00a2\7\61\2\2\u00a1\u008d\3\2\2\2\u00a1\u0096\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\b\20\2\2\u00a4 \3\2\2\2\u00a5\u00a6\t\6\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\21\2\2\u00a8\"\3\2\2\2\t\2\177\u0081"+
		"\u008a\u0093\u009c\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}