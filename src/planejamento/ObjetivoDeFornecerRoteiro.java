package planejamento;

import utilitarios.*;

public class ObjetivoDeFornecerRoteiro implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeFornecerRoteiro() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeFornecerRoteiro();
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
