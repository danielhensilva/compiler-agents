package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarConclusaoDeObjetivos implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {

        // Não tem fragmento
        CrencaColecaoDeFragmentos crencaFragmentos  = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (crencaFragmentos == null || crencaFragmentos.vazio())
            return false;

        // Tem conhecimento necessario pendente
        CrencaColecaoDeConhecimentosPendentes crencaConhecimentos = crencas.getByType(CrencaColecaoDeConhecimentosPendentes.class);
        if (crencaConhecimentos != null && !crencaConhecimentos.vazio())
            return false;

        // Tem evento do tipo objetivo
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null || eventoRegistrado.obterTipo() != TipoDeEvento.Objetivo)
            return false;

        return true;
    }

    public void executar(Blackboard blackboard) {
        Fabula fabula = blackboard.obterFabula();

        Cena cenaFinal = null;

        for (Cena cena : fabula.obterCenas())
            if (cena.obterTipo() == TipoDeCena.Final) {
                cenaFinal = cena;
                break;
            }

        Fragmento fragmento = new Fragmento(cenaFinal.obterDescricao(), TipoDeFragmento.Conclusao);
        blackboard.adicionarFragmento(fragmento);

        blackboard.atribuirEvento(null);
    }

}
