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
        for (Crenca c : crencas)
            // Roteiro não está pronto
            // Último fragmento é objetivo
            // Não tem evento
            return true;
        return false;
    }

    public boolean estaEmEstadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
