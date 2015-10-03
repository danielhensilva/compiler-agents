package grammar;

import org.antlr.v4.runtime.tree.*;
import utilitarios.*;
import dominio.*;

public class FableEvaluator extends FableGrammarBaseVisitor<Object> {

    private List<Cena> cenasDeclaradas;

    private List<Conhecimento> conhecimentosDeclarados;

    public FableEvaluator() {
        this.cenasDeclaradas = new List<>();
        this.conhecimentosDeclarados = new List<>();
    }

    private Cena obterCenaDeclarada(String identificador) {
        for (Cena cena : this.cenasDeclaradas)
            if (cena.identificador.equals(identificador))
                return cena;

        throw new Exception("Cena " + identificador + " não está declarada.");
    }

    private Conhecimento obterConhecimentoDeclarado(String identificador) {
        for (Conhecimento conhecimento : this.conhecimentosDeclarados)
            if (conhecimento.equals(identificador))
                return conhecimento;

        throw new Exception("Conhecimento " + identificador + " não está declarado.")
    }

    @Override // => String
    public Object visitDescricao(FableGrammarParser.DescricaoContext ctx) {
        return ctx.String().toString().replace("\"", "");
    }

    @Override // => List<Conhecimento>
    public Object visitRequisitos(FableGrammarParser.RequisitosContext ctx) {
        List<Conhecimento> requisitos = new List<>();

        if (ctx.Identificador() == null)
            return identificadores;

        for (TerminalNode node : ctx.Identificador()) {
            String identificador = node.toString();
            Conhecimento requisito = this.obterConhecimentoDeclarado(identificador);
            identificadores.add(requisito);
        }

        return requisitos;
    }

    @Override // => Desafio
    public Object visitLembranca(FableGrammarParser.LembrancaContext ctx) {
        String texto = ctx.String().toString().replace("\"", "");
        String identificador = ctx.Identificador().toString();
        Cena cena = this.obterCenaDeclarada(identificador);
        return new Desafio(texto, cena, TipoDeDesafio.Contratempo);
    }

    @Override // => Desafio
    public Object visitEntendimento(FableGrammarParser.EntendimentoContext ctx) {
        String texto = ctx.String().toString().replace("\"", "");
        String identificador = ctx.Identificador().toString();
        Cena cena = this.obterCenaDeclarada(identificador);
        return new Desafio(texto, cena, TipoDeDesafio.Catastrofe);
    }

    @SuppressWarnings("unchecked")
    private void parseRequisitos(Conhecimento conhecimento, FableGrammarParser.RequisitosContext ctx) {
        if (ctx == null)
            return;

        List<Conhecimento> requisitos = (List<Conhecimento>)this.visit(ctx);
        if (requisitos == null)
            return;

        for (Conhecimento requisito : requisitos)
            conhecimento.addRequisito(requisito);
    }

    @SuppressWarnings("unchecked")
    private void parseLembranca(Conhecimento conhecimento, FableGrammarParser.LembrancaContext ctx) {
        if (ctx == null)
            return;

        Desafio desafio = (Desafio)this.visit(ctx);
        if (desafio == null)
            return;

        conhecimento.addDesafio(desafio);
    }

    @SuppressWarnings("unchecked")
    private void parseEntendimento(Conhecimento conhecimento, FableGrammarParser.EntendimentoContext ctx) {
        if (ctx == null)
            return;

        Desafio desafio = (Desafio)this.visit(ctx);
        if (desafio == null)
            return;

        conhecimento.addDesafio(desafio);
    }

    @Override // => Conhecimento
    @SuppressWarnings("unchecked")
    public Object visitConhecimento(FableGrammarParser.ConhecimentoContext ctx) {
        String identificador = ctx.Identificador().toString();
        String descricao = (String)this.visit(ctx.descricao());

        Conhecimento conhecimento = new Conhecimento(identificador, descricao);
        this.parseLembranca(conhecimento, ctx.lembranca());
        this.parseRequisitos(conhecimento, ctx.requisitos());
        this.parseEntendimento(conhecimento, ctx.entendimento());

        this.conhecimentosDeclarados.add(conhecimento);
        return conhecimento;
    }

    @Override // => List<Conhecimento>
    public Object visitAssociacoes(FableGrammarParser.AssociacoesContext ctx) {
        List<Conhecimento> associacoes = new List<>();

        for (TerminalNode node : ctx.Identificador()) {
            String identificador = node.toString();
            Conhecimento conhecimento = this.obterConhecimentoDeclarado(identificador);
            associacoes.add(conhecimento);
        }

        return associacoes;
    }

    @SuppressWarnings("unchecked");
    private void parseAssociacoes(Cena cena, FableGrammarParser.AssociacoesContext ctx) {
        if (ctx == null)
            return;

        List<Conhecimento> associacoes = (List<Conhecimento>)this.visit(ctx);
        if (associacoes == null)
            return;

        for (Conhecimento associacao : associacoes)
            cena.addAssociacao(associacao);
    }

	@Override
    @SuppressWarnings("unchecked") // => Cena
    public Object visitCenaIntermediaria(FableGrammarParser.CenIntermediariaContext ctx) {
        String identificador = ctx.Identificador().toString();
        String descricao = (String)this.visit(ctx.descricao());

        Cena cena = new Cena(identificador, descricao, TipoDeCena.Intermediaria);

        this.cenasDeclaradas.add(cena);
        return cena;
    }

    @Override
    @SuppressWarnings("unchecked") // => Cena
    public Object visitCenaInicial(FableGrammarParser.CenaInicialContext ctx) {
        String identificador = ctx.Identificador().toString();
        String descricao = (String)this.visit(ctx.descricao());

        Cena cena = new Cena(identificador, descricao, TipoDeCena.Inicial);
        this.parseAssociacoes(cena, ctx.associacoes());

        this.cenasDeclaradas.add(cena);
        return cena;
    }

    @Override
    @SuppressWarnings("unchecked") // => Cena
    public Object visitCenaFinal(FableGrammarParser.CenaFinalContext ctx) {
        String identificador = ctx.Identificador().toString();
        String descricao = (String)this.visit(ctx.descricao());

        Cena cena = new Cena(identificador, descricao, TipoDeCena.Final);
        this.parseAssociacoes(cena, ctx.associacoes());

        this.cenasDeclaradas.add(cena);
        return cena;
    }

    @Override
    @SuppressWarnings("unchecked") // => Fabula
    public Object visitFabula(FableGrammarParser.FabulaContext ctx) {
        String identificador = ctx.Identificador().toString();

        Fabula fabula = new Fabula(identificador);

        int count = ctx.getChildCount();
        for (int i = 0; i < count; i++) {
            System.out.println(ctx.getChild(i).class + " | " + ctx.getChild(i).toString());
        }

        return fabula;
    }

}
