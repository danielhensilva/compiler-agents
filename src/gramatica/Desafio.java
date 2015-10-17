package gramatica;

public class Desafio {

    private String texto;

    private Cena cena;

    private TipoDeDesafio tipo;

    public Desafio(String texto, Cena cena, TipoDeDesafio tipo) {
        this.texto = texto;
        this.cena = cena;
        this.tipo = tipo;
    }

    public String obterTexto() {
        return this.texto;
    }

    public Cena obterCena() {
        return this.cena;
    }

    public TipoDeDesafio obterTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return "Desafio : (" + this.cena.toString() + ")";
    }

}
