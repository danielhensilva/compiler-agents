package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeGerarContratempo implements Capacidade {

    private List<Objetivo> objetivos;

    public CapacidadeDeGerarContratempo() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeGerarContratempo();
        this.objetivos.add(o1);
    }

    public List<Objetivo> obterObjetivos() {
        return this.objetivos;
    }

    public List<Crenca> calcularCrencas(Blackboard blackboard) {
        List<Crenca> crencas = new List<Crenca>();

        CrencaColecaoDeFragmentos c1 = new CrencaColecaoDeFragmentos();
        if (c1.aplicavel(blackboard))
            crencas.add(c1);

        CrencaEventoRegistrado c2 = new CrencaEventoRegistrado();
        if (c2.aplicavel(blackboard))
            crencas.add(c2);

        return crencas;
    }

}
