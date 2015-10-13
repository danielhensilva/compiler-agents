package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarContratempo implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
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
