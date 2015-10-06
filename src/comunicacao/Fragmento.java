package comunicacao;

import utilitarios.*;

public class Fragmento {

    private String texto;

    private TipoDeFragmento tipo;

    public Fragmento(String texto, TipoDeFragmento tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public String obterTexto() {
        return this.texto;
    }

    public TipoDeFragmento obterTipo() {
        return this.tipo;
    }

}
