package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarCatastrofe implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarCatastrofe() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarCatastrofe();
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
