package planejamento;

import utilitarios.*;

public class ObjetivoDeGerarObjetivo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarObjetivo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarObjetivo();
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
