package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeGerarDecisao implements Capacidade {

    private List<Objetivo> objetivos;

    public CapacidadeDeGerarDecisao() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeGerarDecisao();
        this.objetivos.add(o1);
    }

    public List<Objetivo> obterObjetivos() {
        return this.objetivos;
    }

    public List<Crenca> calcularCrencas(Blackboard blackboard) {
        return new List<Crenca>();
    }

}
