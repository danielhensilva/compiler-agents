package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarObjetivo implements Objetivo {

    private List<Plano> planos;

    public Objetivo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarObjetivo();
        this.planos.add(p1);
    }

    @Override
    public boolean estadoAtual(List<Crenca> crencas) {

    }

    @Override
    public boolean estadoFuturo(List<Crenca> crencas) {

    }

}
