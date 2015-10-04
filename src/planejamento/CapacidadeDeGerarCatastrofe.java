package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeGerarCatastrofe implements Capacidade {

    private List<Objetivo> objetivos;

	public CapacidadeDeGerarCatastrofe() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeGerarCatastrofe();
        this.objetivos.add(o1);
    }

    public List<Objetivo> obterObjetivos() {
        return this.objetivos;
    }

    public List<Crenca> calcularCrencas(Blackboard blackboard) {
        return new List<Crenca>();
    }
}
