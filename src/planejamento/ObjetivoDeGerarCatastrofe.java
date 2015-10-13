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

    public boolean estadoAtual(List<Crenca> crencas) {
        for (Crenca c : crencas)
            // Evento de catástrofe
            return true;
        return false;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
