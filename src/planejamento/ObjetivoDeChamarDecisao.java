package planejamento;

import comunicacao.*;
import gramatica.*;
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

    public boolean estadoAtual(List<Crenca> crencas) {
        CrencaRoteiroPronto roteiroPronto = crencas.getByType(CrencaRoteiroPronto.class);
        if (roteiroPronto != null)
            return false;

        CrencaColecaoDeFragmentos colecaoDeFragmentos = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (colecaoDeFragmentos != null)
            if (!colecaoDeFragmentos.ultimo(TipoDeFragmento.Catastrofe) && !colecaoDeFragmentos.ultimo(TipoDeFragmento.Contratempo))
                return false;

        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado != null)
            return false;

        return true;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado.obterTipo() == TipoDeEvento.Decisao)
            return true;

        return false;
    }

}
