package agente;

import comunicacao.*;
import planejamento.*;

public class GeradorDeDecisao implements AgenteInteligente {

    private Blackboard blackboard;

    private List<Capacidade> capacidades;

    public GeradorDeDecisao(Blackboard blackboard) {
        this.blackboard = blackboard;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadadeDeGerarDecisao();
        this.capacidades.add(c1);
    }

    @Override
    public void run() {

    }

}
