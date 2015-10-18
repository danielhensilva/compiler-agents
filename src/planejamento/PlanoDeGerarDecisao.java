package planejamento;

import gramatica.*;
import comunicacao.*;
import utilitarios.*;

public class PlanoDeGerarDecisao implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    private boolean existeFragmento(Blackboard blackboard, String texto) {
        for (Fragmento f : blackboard.obterFragmentos())
            if (f.obterTexto().equals(texto))
                return true;
        return false;
    }

    private boolean associadoConhecimentoNaoAtendido(Blackboard blackboard, Cena cena) {
        for (Conhecimento associacao : cena.obterAssociacoes()) {
            boolean encontrado = false;
            for (Conhecimento atendido : blackboard.obterConhecimentosAdquiridos())
                if (atendido.equals(associacao)) {
                    encontrado = true;
                    break;
                }
            if (!encontrado)
                return true;
        }
        return false;
    }

    private void adicionarFragmento(Blackboard blackboard, Cena cena) {
        String texto = "";

        if (cena != null)
            texto = cena.obterDescricao();

        if (this.existeFragmento(blackboard, texto))
            texto = "";

        TipoDeFragmento tipo = TipoDeFragmento.Decisao;
        Fragmento fragmento = new Fragmento(texto, tipo);
        blackboard.adicionarFragmento(fragmento);
    }

    private void adicionarFragmento(Blackboard blackboard, Conhecimento conhecimento) {
        String texto = conhecimento.obterDescricao();
        TipoDeFragmento tipo = TipoDeFragmento.Decisao;
        Fragmento fragmento = new Fragmento(texto, tipo);
        blackboard.adicionarFragmento(fragmento);
        blackboard.adicionarConhecimentoAdquirido(conhecimento);
        blackboard.removerConhecimentoNecessario(conhecimento);
    }

    public void executar(Blackboard blackboard) {
        Cena cena = (Cena)blackboard.obterDaPilhaDeExecucao();
        this.adicionarFragmento(blackboard, cena);

        if (!associadoConhecimentoNaoAtendido(blackboard, cena)) {
            this.adicionarFragmento(blackboard, cena);
            blackboard.removerDaPilhaDeExecucao();

            Conhecimento conhecimento = (Conhecimento)blackboard.obterDaPilhaDeExecucao();

            if (conhecimento != null) {
                this.adicionarFragmento(blackboard, conhecimento);
                blackboard.removerDaPilhaDeExecucao();
            }
        }

        blackboard.atribuirEvento(null);
    }

}
