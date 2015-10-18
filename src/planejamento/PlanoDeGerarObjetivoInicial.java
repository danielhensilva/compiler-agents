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

    private Cena obterCenaInicial(Blackboard blackboard) {
        Fabula fabula = blackboard.obterFabula();

        for (Cena cena : fabula.obterCenas())
            if (cena.obterTipo() == TipoDeCena.Inicial)
                return cena;

        return null;
    }

    private void adicionarFragmento(Blackboard blackboard, Cena cena) {
        String texto = cena.obterDescricao();
        TipoDeFragmento tipo = TipoDeFragmento.Introducao;
        Fragmento fragmento = new Fragmento(texto, tipo);
        blackboard.adicionarFragmento(fragmento);
        blackboard.adicionarNaPilhaDeExecucao(cena);
    }

    private void adicionarObjetivos(Blackboard blackboard, Cena cena) {
        for (Conhecimento conhecimento : cena.obterAssociacoes())
            blackboard.adicionarConhecimentoNecessario(conhecimento);
    }

    public void executar(Blackboard blackboard) {
        Cena cena = this.obterCenaInicial(blackboard);

        this.adicionarFragmento(blackboard, cena);
        this.adicionarObjetivos(blackboard, cena);

        blackboard.atribuirEvento(null);
    }

}
