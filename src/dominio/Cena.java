package dominio;

import utilitarios.*;

public class Cena {

    private String identificador;

    private List<Conhecimento> associacoes;

    private String descricao;

    private TipoDeCena tipoDeCena;

    public Cena(String identificador, String descricao, TipoDeCena tipoDeCena) {
        this.identificador = identificador;
        this.associacoes = new List<>();
        this.descricao = descricao;
        this.tipoDeCena = tipoDeCena;
    }

    public void addAssociacao(Conhecimento associacao) {
        this.associacoes.add(associacao);
    }

    public String getIdentificador() {
        return this.identificador;
    }

}
