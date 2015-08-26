// Generated from FableGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FableGrammarParser}.
 */
public interface FableGrammarListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link FableGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(FableGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(FableGrammarParser.QuestionContext ctx);
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
	 * Enter a parse tree produced by {@link FableGrammarParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(FableGrammarParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(FableGrammarParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#association}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(FableGrammarParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#association}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(FableGrammarParser.AssociationContext ctx);
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
	 * Enter a parse tree produced by {@link FableGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(FableGrammarParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(FableGrammarParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(FableGrammarParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(FableGrammarParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(FableGrammarParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(FableGrammarParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(FableGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(FableGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(FableGrammarParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(FableGrammarParser.IdentContext ctx);
}