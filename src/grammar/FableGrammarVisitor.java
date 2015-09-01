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
	 * Visit a parse tree produced by {@link FableGrammarParser#associations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociations(FableGrammarParser.AssociationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#remember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemember(FableGrammarParser.RememberContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#understand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnderstand(FableGrammarParser.UnderstandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#requirements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirements(FableGrammarParser.RequirementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#fable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFable(FableGrammarParser.FableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalScene(FableGrammarParser.NormalSceneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code startScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartScene(FableGrammarParser.StartSceneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endScene}
	 * labeled alternative in {@link FableGrammarParser#scene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndScene(FableGrammarParser.EndSceneContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#knowledge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnowledge(FableGrammarParser.KnowledgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(FableGrammarParser.DescriptionContext ctx);
}