package planejamento;

import utilitarios.*;

public class ObjetivoDeGerarDecisao implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarDecisao() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarDecisao();
        this.planos.add(p1);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean estadoAtual(List<Crenca> crencas) {
        for (Crenca c : crencas)
            // Evento decisão
            return true;
        return false;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
