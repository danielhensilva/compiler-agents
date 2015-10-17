package planejamento;

import comunicacao.*;
import utilitarios.*;

public class ObjetivoDeGerarContratempo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarContratempo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarContratempo();
        this.planos.add(p1);

        //Plano p2 = new PlanoDeIgnorarContratempo();
        //this.planos.add(p2);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean estadoAtual(List<Crenca> crencas) {
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null)
            return false;

        if (eventoRegistrado.obterTipo() != TipoDeEvento.Contratempo)
            return false;

        return true;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        CrencaColecaoDeFragmentos fragmentos = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (fragmentos == null)
            return false;

        if (fragmentos.vazio())
            return false;

        if (fragmentos.ultimo(TipoDeFragmento.Contratempo))
            return true;

        return false;
    }
}
