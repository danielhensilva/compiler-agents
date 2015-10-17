package planejamento;

import comunicacao.*;
import gramatica.*;
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

    public boolean estadoAtual(List<Crenca> crencas) {
        CrencaRoteiroPronto roteiroPronto = crencas.getByType(CrencaRoteiroPronto.class);
        if (roteiroPronto != null)
            return false;

        CrencaColecaoDeFragmentos colecaoDeFragmentos = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (colecaoDeFragmentos == null)
            return false;

        if (!colecaoDeFragmentos.ultimo(TipoDeFragmento.Objetivo) && !colecaoDeFragmentos.ultimo(TipoDeFragmento.Introducao))
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

        if (eventoRegistrado.obterTipo() != TipoDeEvento.Contratempo)
            return false;

        return true;
    }

}
