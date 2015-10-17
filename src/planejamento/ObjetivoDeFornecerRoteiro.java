package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class ObjetivoDeFornecerRoteiro implements Objetivo {

    private List<Plano> planos;

    public ObjetivoDeFornecerRoteiro() {
        this.planos = new List<>();

        Plano p1 = new PlanoDeFornecerRoteiro();
        this.planos.add(p1);
    }

    public List<Plano> obterPlanos() {
        return this.planos;
    }

    public boolean estadoAtual(List<Crenca> crencas) {
        CrencaColecaoDeFragmentos crenca = crencas.getByType(CrencaColecaoDeFragmentos.class);

        if (crenca == null)
            return false;

        if (crenca.contem(TipoDeFragmento.Conclusao))
            return true;

        return false;
    }

    public boolean estadoFuturo(List<Crenca> crencas) {
        CrencaEventoRegistrado crenca = crencas.getByType(CrencaEventoRegistrado.class);

        if (crenca == null)
            return true;

        if (crenca.obterEvento() == null)
            return true;

        return false;
    }

}
