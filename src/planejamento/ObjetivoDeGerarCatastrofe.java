package planejamento;

import utilitarios.*;

public class ObjetivoDeGerarCatastrofe implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarCatastrofe() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarCatastrofe();
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
