package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarContratempo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarContratempo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarContratempo();
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
