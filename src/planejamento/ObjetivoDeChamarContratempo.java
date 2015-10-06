package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarContratempo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarContratempo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarContratempo();
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
