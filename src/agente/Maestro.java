package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class Maestro implements AgenteInteligente {

    private Blackboard blackboard;

    private List<Capacidade> capacidades;

    public Maestro(Blackboard blackboard) {
        this.blackboard = blackboard;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadeDeConduzirOrdemNarrativa();
        this.capacidades.add(c1);

        Capacidade c2 = new CapacidadeDeFornecerEsqueletoDoRoteiro();
        this.capacidades.add(c2);
    }

    @Override
    public void run() {

    }

}
