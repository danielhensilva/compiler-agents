package planejamento;

import comunicacao.*;
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
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null)
            return false;

        if (eventoRegistrado.obterTipo() != TipoDeEvento.Catastrofe)
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
