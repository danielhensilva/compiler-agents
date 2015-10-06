package planejamento;

import utilitarios.*;

public class ObjetivoDeFornecerRoteiro implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeFornecerRoteiro() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeFornecerRoteiro();
        this.planos.add(p1);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean compativelComEstadoAtual(List<Crenca> crencas) {
        for (Crenca c : crencas)
            // Cena final foi visitada
            return true;
        return false;
    }

    public boolean estaEmEstadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
