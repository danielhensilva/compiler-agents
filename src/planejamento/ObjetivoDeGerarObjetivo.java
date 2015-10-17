package planejamento;

import comunicacao.*;
import utilitarios.*;

public class ObjetivoDeGerarObjetivo implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeGerarObjetivo() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeGerarConclusaoDeObjetivos();
        this.planos.add(p1);

        Plano p2 = new PlanoDeGerarObjetivoIntermediario();
        this.planos.add(p2);

        Plano p3 = new PlanoDeGerarObjetivoInicial();
        this.planos.add(p3);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean estadoAtual(List<Crenca> crencas) {
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null)
            return false;

        if (eventoRegistrado.obterTipo() != TipoDeEvento.Objetivo)
            return false;

        return true;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        CrencaColecaoDeFragmentos fragmentos = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (fragmentos == null)
            return false;

        if (fragmentos.vazio())
            return false;

        if (fragmentos.ultimo(TipoDeFragmento.Introducao))
            return true;

        if (fragmentos.ultimo(TipoDeFragmento.Objetivo))
            return true;

        if (fragmentos.ultimo(TipoDeFragmento.Conclusao))
            return true;

        return false;
    }

}
