// Generated from FableGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FableGrammarParser}.
 */
public interface FableGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#fabula}.
	 * @param ctx the parse tree
	 */
	void enterFabula(FableGrammarParser.FabulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#fabula}.
	 * @param ctx the parse tree
	 */
	void exitFabula(FableGrammarParser.FabulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#knowledge}.
	 * @param ctx the parse tree
	 */
	void enterKnowledge(FableGrammarParser.KnowledgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#knowledge}.
	 * @param ctx the parse tree
	 */
	void exitKnowledge(FableGrammarParser.KnowledgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterScene(FableGrammarParser.SceneContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitScene(FableGrammarParser.SceneContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#remember}.
	 * @param ctx the parse tree
	 */
	void enterRemember(FableGrammarParser.RememberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#remember}.
	 * @param ctx the parse tree
	 */
	void exitRemember(FableGrammarParser.RememberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#understand}.
	 * @param ctx the parse tree
	 */
	void enterUnderstand(FableGrammarParser.UnderstandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#understand}.
	 * @param ctx the parse tree
	 */
	void exitUnderstand(FableGrammarParser.UnderstandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#associations}.
	 * @param ctx the parse tree
	 */
	void enterAssociations(FableGrammarParser.AssociationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#associations}.
	 * @param ctx the parse tree
	 */
	void exitAssociations(FableGrammarParser.AssociationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#requirements}.
	 * @param ctx the parse tree
	 */
	void enterRequirements(FableGrammarParser.RequirementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#requirements}.
	 * @param ctx the parse tree
	 */
	void exitRequirements(FableGrammarParser.RequirementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(FableGrammarParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(FableGrammarParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FableGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FableGrammarParser.IdentifierContext ctx);
}