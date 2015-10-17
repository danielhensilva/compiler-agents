package gramatica;

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

    public List<Desafio> obterDesafios() {
        return this.desafios;
    }

    public List<Desafio> obterDesafios(TipoDeDesafio tipo) {
        List<Desafio> filtrados = new List<>();

        for (Desafio desafio : this.desafios)
            if (desafio.obterTipo() == tipo)
                filtrados.add(desafio);

        return filtrados;
    }

    public void adicionarRequisito(Conhecimento conhecimento) {
        this.requisitos.add(conhecimento);
    }

    public List<Conhecimento> obterRequisitos() {
        return this.requisitos;
    }

    public boolean contemRequisitos() {
        if (this.requisitos == null)
            return false;

        if (this.requisitos.size() == 0)
            return false;

        return true;
    }

    public String obterIdentificador() {
        return this.identificador;
    }

    @Override
    public String toString() {
        return "Conhecimento : " + this.identificador;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;

        if (other.getClass() != Conhecimento.class)
            return false;

        String otherIdent = ((Conhecimento)other).obterIdentificador();
        String thisIdent = this.obterIdentificador();

        if (otherIdent.equals(thisIdent))
            return true;

        return false;
    }

}
