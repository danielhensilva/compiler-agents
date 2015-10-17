package planejamento;

import comunicacao.*;
import gramatica.*;
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

    public boolean estadoAtual(List<Crenca> crencas) {
        CrencaRoteiroPronto roteiroPronto = crencas.getByType(CrencaRoteiroPronto.class);
        if (roteiroPronto != null)
            return false;

        CrencaColecaoDeFragmentos colecaoDeFragmentos = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (colecaoDeFragmentos != null)
            if (!colecaoDeFragmentos.vazio() && !colecaoDeFragmentos.ultimo(TipoDeFragmento.Decisao))
                return false;

        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado != null)
            return false;

        return true;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);

        if (eventoRegistrado == null)
            return false;

        if (eventoRegistrado.obterTipo() != TipoDeEvento.Objetivo)
            return false;

        return true;
    }

}
