// Generated from FableGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FableGrammarParser}.
 */
public interface FableGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#fable}.
	 * @param ctx the parse tree
	 */
	void enterFable(FableGrammarParser.FableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#fable}.
	 * @param ctx the parse tree
	 */
	void exitFable(FableGrammarParser.FableContext ctx);
}