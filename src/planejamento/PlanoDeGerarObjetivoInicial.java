package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarObjetivoInicial implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {

        // Tem evento do tipo objetivo
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null || eventoRegistrado.obterTipo() != TipoDeEvento.Objetivo)
            return false;

        // Não tem nenhum fragmento disponível
        CrencaColecaoDeFragmentos crencaFragmentos  = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (crencaFragmentos == null || crencaFragmentos.vazio())
            return true;

        return false;
    }

    public void executar(Blackboard blackboard) {
        Fabula fabula = blackboard.obterFabula();

        Cena cenaInicial = null;

        for (Cena cena : fabula.obterCenas())
            if (cena.obterTipo() == TipoDeCena.Inicial) {
                cenaInicial = cena;
                break;
            }

        Fragmento fragmento = new Fragmento(cenaInicial.obterDescricao(), TipoDeFragmento.Introducao);
        blackboard.adicionarFragmento(fragmento);

        for (Conhecimento conhecimento : cenaInicial.obterAssociacoes())
            blackboard.adicionarConhecimentoNecessario(conhecimento);

        blackboard.adicionarNaPilhaDeExecucao(cenaInicial);
        blackboard.atribuirEvento(null);
    }

}
