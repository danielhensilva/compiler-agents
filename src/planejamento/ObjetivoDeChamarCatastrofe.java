package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarCatastrofe implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarCatastrofe() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarCatastrofe();
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
