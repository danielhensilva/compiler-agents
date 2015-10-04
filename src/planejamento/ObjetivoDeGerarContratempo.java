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
