package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarObjetivo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarObjetivo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarObjetivo();
        this.planos.add(p1);
    }

    @Override
    public boolean estadoAtual(List<Crenca> crencas) {
        return false;
    }

    @Override
    public boolean estadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
