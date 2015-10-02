// Generated from FableGrammar.g4 by ANTLR 4.5.1
package gramatica;
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
	 * Visit a parse tree produced by {@link FableGrammarParser#associacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociacoes(FableGrammarParser.AssociacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#lembranca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLembranca(FableGrammarParser.LembrancaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#entendimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntendimento(FableGrammarParser.EntendimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#requisitos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequisitos(FableGrammarParser.RequisitosContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#fabula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFabula(FableGrammarParser.FabulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cenaNormal}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenaNormal(FableGrammarParser.CenaNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cenaInicial}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenaInicial(FableGrammarParser.CenaInicialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cenaFinal}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenaFinal(FableGrammarParser.CenaFinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#conhecimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConhecimento(FableGrammarParser.ConhecimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FableGrammarParser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(FableGrammarParser.DescricaoContext ctx);
}