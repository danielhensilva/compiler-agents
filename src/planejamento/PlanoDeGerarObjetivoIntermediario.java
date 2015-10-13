package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarObjetivoIntermediario implements Plano {

    public PlanoDeGerarObjetivoIntermediario() {

    }

    public boolean aplicavel(List<Crenca> crencas) {

        // Tem fragmento
        CrencaColecaoDeFragmentos crenca  = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (crenca != null || crenca.obterFragmentos().size() > 0)
            return false;

        return true;
    }

    public void executar(Blackboard blackboard) {
    }

}
