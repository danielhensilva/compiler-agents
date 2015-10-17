package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarContratempo implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    private boolean foiAtendido(Blackboard blackboard, Conhecimento requisito) {
        for (Conhecimento adquirido : blackboard.obterConhecimentosAdquiridos())
            if (adquirido.equals(requisito))
                return true;

        return false;
    }

    private Conhecimento primeiroRequisitoNaoAtendido(Blackboard blackboard) {
        Conhecimento conhecimento = blackboard.obterConhecimentosNecessarios().getLastItem();
        blackboard.adicionarNaPilhaDeExecucao(conhecimento);

        if (!conhecimento.contemRequisitos())
            return conhecimento;

        for (Conhecimento requisito : conhecimento.obterRequisitos())
            if (!this.foiAtendido(blackboard, requisito)) {
                blackboard.adicionarConhecimentoNecessario(requisito);
                return this.primeiroRequisitoNaoAtendido(blackboard);
            }

        return conhecimento;
    }

    public void executar(Blackboard blackboard) {
        Conhecimento conhecimentoAtual = this.primeiroRequisitoNaoAtendido(blackboard);
        List<Desafio> desafios = conhecimentoAtual.obterDesafios(TipoDeDesafio.Contratempo);

        if (desafios != null && !desafios.isEmpty()) {
            int index = (int)(Math.random() * desafios.size());

            Desafio desafio = desafios.get(index);
            Fragmento fragmento = new Fragmento(desafio.obterTexto(), TipoDeFragmento.Contratempo);

            blackboard.adicionarFragmento(fragmento);
        }

        blackboard.atribuirEvento(null);
    }

}
