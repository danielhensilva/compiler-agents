package dominio;

import utilitarios.*;

public class Conhecimento {

    private String identificador;

    private List<Desafio> desafios;

    private List<Conhecimento> requisitos;

    private String descricao;

    public Conhecimento(String identificador, String descricao) {
        this.identificador = identificador;
        this.desafios = new List<>();
        this.requisitos = new List<>();
        this.descricao = descricao;
    }

    public void adicionarDesafio(Desafio desafio) {
        this.desafios.add(desafio);
    }

    public void adicionarRequisito(Conhecimento conhecimento) {
        this.requisitos.add(conhecimento);
    }

    public String getIdentificador() {
        return this.identificador;
    }

}
