package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarObjetivo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarObjetivo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarObjetivo();
        this.planos.add(p1);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean compativelComEstadoAtual(List<Crenca> crencas) {
        for (Crenca c : crencas)
            // Roteiro não está pronto
            // Sem fragmentos ou último fragmento é decisão
            // Não tem evento
            return true;
        return false;
    }

    public boolean estaEmEstadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
