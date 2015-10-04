package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class GeradorDeCatastrofe implements AgenteInteligente {

    private Blackboard blackboard;

    private List<Capacidade> capacidades;

    public GeradorDeCatastrofe(Blackboard blackboard) {
        this.blackboard = blackboard;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadeDeGerarCatastrofe();
        this.capacidades.add(c1);
    }

    @Override
    public void run() {

    }

}
