package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeConduzirOrdemNarrativa implements Capacidade {

    private List<Objetivo> objetivos;

	public CapacidadeDeConduzirOrdemNarrativa() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeChamarObjetivo();
        this.objetivos.add(o1);

        Objetivo o2 = new ObjetivoDeChamarContratempo();
        this.objetivos.add(o2);

        Objetivo o3 = new ObjetivoDeChamarCatastrofe();
        this.objetivos.add(o3);

        Objetivo o4 = new ObjetivoDeChamarDecisao();
        this.objetivos.add(o4);
	}

    public List<Objetivo> obterObjetivos() {
        return this.objetivos;
    }

    public List<Crenca> calcularCrencas(Blackboard blackboard) {
        List<Crenca> crencas = new List<>();

        CrencaRoteiroPronto c1 = new CrencaRoteiroPronto();
        if (c1.aplicavel(blackboard))
            crencas.add(c1);

        CrencaColecaoDeFragmentos c2 = new CrencaColecaoDeFragmentos();
        if (c2.aplicavel(blackboard))
            crencas.add(c2);

        CrencaEventoRegistrado c3 = new CrencaEventoRegistrado();
        if (c3.aplicavel(blackboard))
            crencas.add(c3);

        return crencas;
    }

}
