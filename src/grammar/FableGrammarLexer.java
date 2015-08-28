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
		T__0=1, T__1=2, T__2=3, Knowledge=4, Scene=5, Remember=6, Understand=7, 
		Associations=8, Requirements=9, Description=10, Identifier=11, String=12, 
		Whitespace=13, BlockComment=14, LineComment=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Knowledge", "Scene", "Remember", "Understand", 
		"Associations", "Requirements", "Description", "Identifier", "String", 
		"Literal", "Digit", "Whitespace", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FABULA'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Knowledge", "Scene", "Remember", "Understand", 
		"Associations", "Requirements", "Description", "Identifier", "String", 
		"Whitespace", "BlockComment", "LineComment"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00e9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5\7\5E\n\5"+
		"\f\5\16\5H\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\6\t~\n\t\r\t\16\t\177\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\6\n\u0090\n\n\r\n\16\n\u0091\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a5"+
		"\n\f\f\f\16\f\u00a8\13\f\3\r\3\r\3\r\3\r\7\r\u00ae\n\r\f\r\16\r\u00b1"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00c1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00cb"+
		"\n\20\r\20\16\20\u00cc\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00d5\n\21\f"+
		"\21\16\21\u00d8\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"\u00e3\n\22\f\22\16\22\u00e6\13\22\3\22\3\22\3\u00d6\2\23\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\17!\20#\21"+
		"\3\2\5\3\2$$\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00f4\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5,\3\2\2\2\7.\3\2\2\2\t\60\3\2"+
		"\2\2\13L\3\2\2\2\rY\3\2\2\2\17d\3\2\2\2\21p\3\2\2\2\23\u0083\3\2\2\2\25"+
		"\u0095\3\2\2\2\27\u00a1\3\2\2\2\31\u00a9\3\2\2\2\33\u00c0\3\2\2\2\35\u00c2"+
		"\3\2\2\2\37\u00ca\3\2\2\2!\u00d0\3\2\2\2#\u00de\3\2\2\2%&\7H\2\2&\'\7"+
		"C\2\2\'(\7D\2\2()\7W\2\2)*\7N\2\2*+\7C\2\2+\4\3\2\2\2,-\7*\2\2-\6\3\2"+
		"\2\2./\7+\2\2/\b\3\2\2\2\60\61\7E\2\2\61\62\7Q\2\2\62\63\7P\2\2\63\64"+
		"\7J\2\2\64\65\7G\2\2\65\66\7E\2\2\66\67\7K\2\2\678\7O\2\289\7G\2\29:\7"+
		"P\2\2:;\7V\2\2;<\7Q\2\2<=\3\2\2\2=>\5\27\f\2>@\7*\2\2?A\5\23\n\2@?\3\2"+
		"\2\2@A\3\2\2\2AF\3\2\2\2BE\5\r\7\2CE\5\17\b\2DB\3\2\2\2DC\3\2\2\2EH\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\25\13\2JK\7+\2\2K\n"+
		"\3\2\2\2LM\7E\2\2MN\7G\2\2NO\7P\2\2OP\7C\2\2PQ\3\2\2\2QR\5\27\f\2RT\7"+
		"*\2\2SU\5\21\t\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\25\13\2WX\7+\2\2X\f"+
		"\3\2\2\2YZ\7N\2\2Z[\7G\2\2[\\\7O\2\2\\]\7D\2\2]^\7T\2\2^_\7C\2\2_`\7T"+
		"\2\2`a\3\2\2\2ab\5\31\r\2bc\5\27\f\2c\16\3\2\2\2de\7G\2\2ef\7P\2\2fg\7"+
		"V\2\2gh\7G\2\2hi\7P\2\2ij\7F\2\2jk\7G\2\2kl\7T\2\2lm\3\2\2\2mn\5\31\r"+
		"\2no\5\27\f\2o\20\3\2\2\2pq\7C\2\2qr\7U\2\2rs\7U\2\2st\7Q\2\2tu\7E\2\2"+
		"uv\7K\2\2vw\7C\2\2wx\7E\2\2xy\7C\2\2yz\7Q\2\2z{\3\2\2\2{}\7*\2\2|~\5\27"+
		"\f\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\7+\2\2\u0082\22\3\2\2\2\u0083\u0084\7T\2\2\u0084"+
		"\u0085\7G\2\2\u0085\u0086\7S\2\2\u0086\u0087\7W\2\2\u0087\u0088\7K\2\2"+
		"\u0088\u0089\7U\2\2\u0089\u008a\7K\2\2\u008a\u008b\7V\2\2\u008b\u008c"+
		"\7Q\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7*\2\2\u008e\u0090\5\27\f\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7+\2\2\u0094\24\3\2\2\2\u0095\u0096"+
		"\7F\2\2\u0096\u0097\7G\2\2\u0097\u0098\7U\2\2\u0098\u0099\7E\2\2\u0099"+
		"\u009a\7T\2\2\u009a\u009b\7K\2\2\u009b\u009c\7E\2\2\u009c\u009d\7C\2\2"+
		"\u009d\u009e\7Q\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\5\31\r\2\u00a0\26"+
		"\3\2\2\2\u00a1\u00a6\5\33\16\2\u00a2\u00a5\5\33\16\2\u00a3\u00a5\5\35"+
		"\17\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\30\3\2\2\2\u00a8\u00a6\3\2\2"+
		"\2\u00a9\u00af\7$\2\2\u00aa\u00ae\n\2\2\2\u00ab\u00ac\7^\2\2\u00ac\u00ae"+
		"\7$\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b3\7$\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6"+
		"\7\"\2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\7\60\2\2\u00b8\u00b9\7\"\2\2"+
		"\u00b9\u00c1\7\\\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd"+
		"\7\60\2\2\u00bd\u00be\7\60\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c1\7|\2\2"+
		"\u00c0\u00b4\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c1\34\3\2\2\2\u00c2\u00c3"+
		"\7\62\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7\60\2\2\u00c5\u00c6\7\60\2"+
		"\2\u00c6\u00c7\7\"\2\2\u00c7\u00c8\7;\2\2\u00c8\36\3\2\2\2\u00c9\u00cb"+
		"\t\3\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\20\2\2\u00cf \3\2\2\2"+
		"\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7,\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5"+
		"\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\7,\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\21\2\2"+
		"\u00dd\"\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e4"+
		"\3\2\2\2\u00e1\u00e3\n\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\b\22\2\2\u00e8$\3\2\2\2\21\2@DFT\177\u0091\u00a4\u00a6"+
		"\u00ad\u00af\u00c0\u00cc\u00d6\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}