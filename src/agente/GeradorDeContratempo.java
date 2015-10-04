package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class GeradorDeContratempo implements AgenteInteligente {

    private Blackboard blackboard;

    private List<Capacidade> capacidades;

    public GeradorDeConflito(Blackboard blackboard) {
        this.blackboard = blackboard;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadadeDeGerarContratempo();
        this.capacidades.add(c1);
    }

    @Override
    public void run() {

    }

}
