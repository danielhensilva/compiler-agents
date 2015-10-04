package planejamento;

import utilitarios.*;

public class ObjetivoDeGerarCatastrofe implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarCatastrofe() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarCatastrofe();
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
