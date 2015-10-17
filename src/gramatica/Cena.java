package gramatica;

import utilitarios.*;

public class Cena {

    private String identificador;

    private List<Conhecimento> associacoes;

    private String descricao;

    private TipoDeCena tipo;

    public Cena(String identificador, String descricao, TipoDeCena tipo) {
        this.identificador = identificador;
        this.associacoes = new List<>();
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void adicionarAssociacao(Conhecimento associacao) {
        this.associacoes.add(associacao);
    }

    public List<Conhecimento> obterAssociacoes() {
        return this.associacoes;
    }

    public String obterDescricao() {
        return this.descricao;
    }

    public TipoDeCena obterTipo() {
        return this.tipo;
    }

    public String obterIdentificador() {
        return this.identificador;
    }

    @Override
    public String toString() {
        return "Cena : " + this.identificador;
    }
}
