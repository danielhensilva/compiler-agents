package planejamento;

import utilitarios.*;

public class ObjetivoDeGerarDecisao implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarDecisao() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarDecisao();
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
