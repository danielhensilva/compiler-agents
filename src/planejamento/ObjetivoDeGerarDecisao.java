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

    public boolean compativelComEstadoAtual(List<Crenca> crencas) {
        return false;
    }

    public boolean estaEmEstadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
