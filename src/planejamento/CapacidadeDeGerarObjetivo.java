package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeGerarObjetivo implements Capacidade {

    private List<Objetivo> objetivos;

    public CapacidadeDeGerarObjetivo() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeGerarObjetivo();
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

        CrencaColecaoDeConhecimentosPendentes c2 = new CrencaColecaoDeConhecimentosPendentes();
        if (c2.aplicavel(blackboard))
            crencas.add(c2);

        CrencaEventoRegistrado c3 = new CrencaEventoRegistrado();
        if (c3.aplicavel(blackboard))
            crencas.add(c3);

        return crencas;
    }

}
