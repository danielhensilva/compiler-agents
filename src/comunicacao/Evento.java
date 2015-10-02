package comunicacao;

public class Evento {

    private TipoDeEvento tipo;

    public Evento(TipoDeEvento tipo) {
        this.tipo = tipo;
    }

    public TipoDeEvento obterTipo() {
    	return this.tipo;
    }

}
