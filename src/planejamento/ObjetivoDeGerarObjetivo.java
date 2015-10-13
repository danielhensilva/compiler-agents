package planejamento;

import utilitarios.*;

public class ObjetivoDeGerarObjetivo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarObjetivo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarObjetivoInicial();
        this.planos.add(p1);

        Plano p2 = new PlanoDeGerarObjetivoIntermediario();
        this.planos.add(p2);

        Plano p3 = new PlanoDeGerarConclusaoDeObjetivos();
        this.planos.add(p3);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean estadoAtual(List<Crenca> crencas) {
        for (Crenca c : crencas)
            // Evento objetivo
            return true;
        return false;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
