package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class GeradorDeDecisao implements AgenteInteligente {

    private Blackboard blackboard;

    private List<Capacidade> capacidades;

    public GeradorDeDecisao(Blackboard blackboard) {
        this.blackboard = blackboard;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadeDeGerarDecisao();
        this.capacidades.add(c1);
    }

    @Override
    public void run() {

    }

}
