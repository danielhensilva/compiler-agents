package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class GeradorDeObjetivo implements AgenteInteligente {

    private Blackboard blackboard;

    private List<Capacidade> capacidades;

    public GeradorDeObjetivo(Blackboard blackboard) {
        this.blackboard = blackboard;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadeDeGerarObjetivo();
        this.capacidades.add(c1);
    }

    @Override
    public void run() {

    }

}
