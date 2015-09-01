// Generated from FableGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FableGrammarParser}.
 */
public interface FableGrammarListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link FableGrammarParser#fable}.
	 * @param ctx the parse tree
	 */
	void enterFable(FableGrammarParser.FableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#fable}.
	 * @param ctx the parse tree
	 */
	void exitFable(FableGrammarParser.FableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterNormalScene(FableGrammarParser.NormalSceneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitNormalScene(FableGrammarParser.NormalSceneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code startScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterStartScene(FableGrammarParser.StartSceneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code startScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitStartScene(FableGrammarParser.StartSceneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void enterEndScene(FableGrammarParser.EndSceneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 */
	void exitEndScene(FableGrammarParser.EndSceneContext ctx);
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
	 * Enter a parse tree produced by {@link FableGrammarParser#requirements}.
	 * @param ctx the parse tree
	 */
	void enterRequirements(FableGrammarParser.RequirementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#requirements}.
	 * @param ctx the parse tree
	 */
	void exitRequirements(FableGrammarParser.RequirementsContext ctx);
}