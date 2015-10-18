package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarCatastrofe implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    private boolean atendido(Blackboard blackboard, Conhecimento requisito) {
        for (Conhecimento adquirido : blackboard.obterConhecimentosAdquiridos())
            if (adquirido.equals(requisito))
                return true;

        return false;
    }

    private void adicionarNaPilhaDeExecucao(Blackboard blackboard, Object object) {
        for (Object item : blackboard.obterPilhaDeExecucao())
            if (item.equals(object))
                return;

        blackboard.adicionarNaPilhaDeExecucao(object);
    }

    private Conhecimento primeiroRequisitoNaoAtendido(Blackboard blackboard) {
        Conhecimento conhecimento = blackboard.obterConhecimentosNecessarios().getLastItem();
        this.adicionarNaPilhaDeExecucao(blackboard, conhecimento);

        if (!conhecimento.contemRequisitos())
            return conhecimento;

        for (Conhecimento requisito : conhecimento.obterRequisitos())
            if (!this.atendido(blackboard, requisito)) {
                blackboard.adicionarConhecimentoNecessario(requisito);
                return this.primeiroRequisitoNaoAtendido(blackboard);
            }

        return conhecimento;
    }

    private void adicionarFragmento(Blackboard blackboard, Desafio desafio) {
        String texto = desafio.obterTexto();
        TipoDeFragmento tipo = TipoDeFragmento.Catastrofe;
        Fragmento fragmento = new Fragmento(texto, tipo);
        blackboard.adicionarFragmento(fragmento);
    }

    private void adicionarFragmento(Blackboard blackboard, Conhecimento conhecimento) {
        String texto = conhecimento.obterDescricao();
        TipoDeFragmento tipo = TipoDeFragmento.Catastrofe;
        Fragmento fragmento = new Fragmento(texto, tipo);
        blackboard.adicionarFragmento(fragmento);
        blackboard.adicionarConhecimentoAdquirido(conhecimento);
        blackboard.removerConhecimentoNecessario(conhecimento);
    }

    public void executar(Blackboard blackboard) {
        Conhecimento conhecimentoAtual = this.primeiroRequisitoNaoAtendido(blackboard);
        List<Desafio> desafios = conhecimentoAtual.obterDesafios(TipoDeDesafio.Catastrofe);

        if (desafios == null || desafios.isEmpty()) {
            this.adicionarFragmento(blackboard, conhecimentoAtual);
            blackboard.removerDaPilhaDeExecucao();
            blackboard.atribuirEvento(null);
            return;
        }

        int index = (int)(Math.random() * desafios.size());
        Desafio desafio = desafios.get(index);
        this.adicionarFragmento(blackboard, desafio);
        this.adicionarNaPilhaDeExecucao(blackboard, desafio.obterCena());
        blackboard.atribuirEvento(null);
    }

}
