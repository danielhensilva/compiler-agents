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
        return new List<Crenca>();
    }

}
