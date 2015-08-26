// Generated from FableGrammar.g4 by ANTLR 4.5.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FableGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FableGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#knowledge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnowledge(FableGrammarParser.KnowledgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(FableGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScene(FableGrammarParser.SceneContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(FableGrammarParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation(FableGrammarParser.AssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(FableGrammarParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(FableGrammarParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(FableGrammarParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(FableGrammarParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(FableGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(FableGrammarParser.IdentContext ctx);
}