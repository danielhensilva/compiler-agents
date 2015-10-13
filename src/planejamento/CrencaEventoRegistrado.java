package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CrencaEventoRegistrado implements Crenca {

    private Evento evento;

    public boolean aplicavel(Blackboard blackboard) {
        this.evento = blackboard.obterEvento();

        if (this.evento == null)
            return false;

        return true;
    }

    public Evento obterEvento() {
        return this.evento;
    }

    public TipoDeEvento obterTipo() {
        return this.evento.obterTipo();
    }

}
