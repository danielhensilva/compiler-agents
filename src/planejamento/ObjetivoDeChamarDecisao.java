package planejamento;

import utilitarios.*;

public class ObjetivoDeChamarDecisao implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeChamarDecisao() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeChamarDecisao();
        this.planos.add(p1);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean compativelComEstadoAtual(List<Crenca> crencas) {
        for (Crenca c : crencas)
            // Roteiro não está pronto
            // Último fragmento é contratempo ou catastrofe
            // Não tem evento
            return true;
        return false;
    }

    public boolean estaEmEstadoFuturo(List<Crenca> crencas) {
        return false;
    }

}
