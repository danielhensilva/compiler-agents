package dominio;

import utilitarios.*;

public class Fabula {

    private String identificador;

    private List<Cena> cenas;

    private List<Conhecimento> conhecimentos;

    public Fabula(String identificador) {
        this.identificador = identificador;
        this.cenas = new List<>();
        this.conhecimentos = new List<>();
    }

    public void adicionarCena(Cena cena) {
        this.cenas.add(cena);
    }

    public void adicionarConhecimento(Conhecimento conhecimento) {
        this.conhecimentos.add(conhecimento);
    }

}
