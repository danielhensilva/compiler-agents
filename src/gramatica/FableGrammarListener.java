// Generated from FableGrammar.g4 by ANTLR 4.5.1
package gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FableGrammarParser}.
 */
public interface FableGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#associacoes}.
	 * @param ctx the parse tree
	 */
	void enterAssociacoes(FableGrammarParser.AssociacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#associacoes}.
	 * @param ctx the parse tree
	 */
	void exitAssociacoes(FableGrammarParser.AssociacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#lembranca}.
	 * @param ctx the parse tree
	 */
	void enterLembranca(FableGrammarParser.LembrancaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#lembranca}.
	 * @param ctx the parse tree
	 */
	void exitLembranca(FableGrammarParser.LembrancaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#entendimento}.
	 * @param ctx the parse tree
	 */
	void enterEntendimento(FableGrammarParser.EntendimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#entendimento}.
	 * @param ctx the parse tree
	 */
	void exitEntendimento(FableGrammarParser.EntendimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#requisitos}.
	 * @param ctx the parse tree
	 */
	void enterRequisitos(FableGrammarParser.RequisitosContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#requisitos}.
	 * @param ctx the parse tree
	 */
	void exitRequisitos(FableGrammarParser.RequisitosContext ctx);
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
	 * Enter a parse tree produced by the {@code cenaNormal}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 */
	void enterCenaNormal(FableGrammarParser.CenaNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cenaNormal}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 */
	void exitCenaNormal(FableGrammarParser.CenaNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cenaInicial}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 */
	void enterCenaInicial(FableGrammarParser.CenaInicialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cenaInicial}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 */
	void exitCenaInicial(FableGrammarParser.CenaInicialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cenaFinal}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 */
	void enterCenaFinal(FableGrammarParser.CenaFinalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cenaFinal}
	 * labeled alternative in {@link FableGrammarParser#cena}.
	 * @param ctx the parse tree
	 */
	void exitCenaFinal(FableGrammarParser.CenaFinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#conhecimento}.
	 * @param ctx the parse tree
	 */
	void enterConhecimento(FableGrammarParser.ConhecimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#conhecimento}.
	 * @param ctx the parse tree
	 */
	void exitConhecimento(FableGrammarParser.ConhecimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FableGrammarParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(FableGrammarParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FableGrammarParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(FableGrammarParser.DescricaoContext ctx);
}