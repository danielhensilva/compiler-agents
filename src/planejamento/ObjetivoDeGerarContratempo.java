package planejamento;

import utilitarios.*;

public class ObjetivoDeGerarContratempo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarContratempo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarContratempo();
        this.planos.add(p1);

        Plano p2 = new PlanoDeIgnorarContratempo();
        this.planos.add(p2);
    }

    @Override
    public boolean estadoAtual(List<Crenca> crencas) {

    }

    @Override
    public boolean estadoFuturo(List<Crenca> crencas) {

    }

}
