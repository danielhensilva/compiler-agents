package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarDecisao implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarDecisao() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarDecisao();
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