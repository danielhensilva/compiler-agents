package dominio;

import utilitarios.*;

public class Conhecimento {

    private String identificador;

    private List<Desafio> desafios;

    private String descricao;

    public Conhecimento(String identificador, String descricao) {
        this.identificador = identificador;
        this.desafios = new List<>();
        this.descricao = descricao;
    }

    public void adicionarRequisito(String requisito) {
    }

}