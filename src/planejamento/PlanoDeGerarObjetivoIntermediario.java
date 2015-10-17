package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarObjetivoIntermediario implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {

        // Tem fragmento
        CrencaColecaoDeFragmentos crencaFragmentos  = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (crencaFragmentos != null || crencaFragmentos.vazio())
            return false;

        // Tem evento do tipo objetivo
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null || eventoRegistrado.obterTipo() != TipoDeEvento.Objetivo)
            return false;

        return true;
    }

    public void executar(Blackboard blackboard) {
    }

}
