package planejamento;

import comunicacao.*;
import utilitarios.*;

public class ObjetivoDeGerarDecisao implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarDecisao() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarDecisao();
        this.planos.add(p1);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean estadoAtual(List<Crenca> crencas) {
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null)
            return false;

        if (eventoRegistrado.obterTipo() != TipoDeEvento.Decisao)
            return false;

        return true;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null)
            return true;

        return false;
    }

}
