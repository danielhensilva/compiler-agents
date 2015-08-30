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
		T__9=10, T__10=11, T__11=12, String=13, Whitespace=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "String", "Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'CONHECIMENTO'", "'CENA'", "'LEMBRAR'", "'ENTENDER'", 
		"'ASSOCIACAO'", "'REQUISITO'", "'DESCRICAO'", "'a..z'", "'A..Z'", "'0..9'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "String", "Whitespace"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16y\n\16"+
		"\f\16\16\16|\13\16\3\16\3\16\3\17\6\17\u0081\n\17\r\17\16\17\u0082\3\17"+
		"\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\3\2\4\3\2$$\5\2\13\f\17\17\"\"\u0088\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t\60\3\2\2\2\13\65"+
		"\3\2\2\2\r=\3\2\2\2\17F\3\2\2\2\21Q\3\2\2\2\23[\3\2\2\2\25e\3\2\2\2\27"+
		"j\3\2\2\2\31o\3\2\2\2\33t\3\2\2\2\35\u0080\3\2\2\2\37 \7*\2\2 \4\3\2\2"+
		"\2!\"\7+\2\2\"\6\3\2\2\2#$\7E\2\2$%\7Q\2\2%&\7P\2\2&\'\7J\2\2\'(\7G\2"+
		"\2()\7E\2\2)*\7K\2\2*+\7O\2\2+,\7G\2\2,-\7P\2\2-.\7V\2\2./\7Q\2\2/\b\3"+
		"\2\2\2\60\61\7E\2\2\61\62\7G\2\2\62\63\7P\2\2\63\64\7C\2\2\64\n\3\2\2"+
		"\2\65\66\7N\2\2\66\67\7G\2\2\678\7O\2\289\7D\2\29:\7T\2\2:;\7C\2\2;<\7"+
		"T\2\2<\f\3\2\2\2=>\7G\2\2>?\7P\2\2?@\7V\2\2@A\7G\2\2AB\7P\2\2BC\7F\2\2"+
		"CD\7G\2\2DE\7T\2\2E\16\3\2\2\2FG\7C\2\2GH\7U\2\2HI\7U\2\2IJ\7Q\2\2JK\7"+
		"E\2\2KL\7K\2\2LM\7C\2\2MN\7E\2\2NO\7C\2\2OP\7Q\2\2P\20\3\2\2\2QR\7T\2"+
		"\2RS\7G\2\2ST\7S\2\2TU\7W\2\2UV\7K\2\2VW\7U\2\2WX\7K\2\2XY\7V\2\2YZ\7"+
		"Q\2\2Z\22\3\2\2\2[\\\7F\2\2\\]\7G\2\2]^\7U\2\2^_\7E\2\2_`\7T\2\2`a\7K"+
		"\2\2ab\7E\2\2bc\7C\2\2cd\7Q\2\2d\24\3\2\2\2ef\7c\2\2fg\7\60\2\2gh\7\60"+
		"\2\2hi\7|\2\2i\26\3\2\2\2jk\7C\2\2kl\7\60\2\2lm\7\60\2\2mn\7\\\2\2n\30"+
		"\3\2\2\2op\7\62\2\2pq\7\60\2\2qr\7\60\2\2rs\7;\2\2s\32\3\2\2\2tz\7$\2"+
		"\2uy\n\2\2\2vw\7^\2\2wy\7$\2\2xu\3\2\2\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~\34\3\2\2\2\177\u0081\t\3\2\2"+
		"\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\17\2\2\u0085\36\3\2\2\2\6\2"+
		"xz\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}