package planejamento;

import comunicacao.*;
import dominio.*;
import utilitarios.*;

public class PlanoDeGerarObjetivoInicial implements Plano {

    public PlanoDeGerarObjetivoInicial() {

    }

    public boolean aplicavel(List<Crenca> crencas) {

        // Tem fragmento
        CrencaColecaoDeFragmentos crenca  = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (crenca != null || crenca.obterFragmentos().size() > 0)
            return false;

        return true;
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
