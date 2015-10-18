package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class PlanoDeGerarObjetivoIntermediario implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {

        // Tem fragmento
        CrencaColecaoDeFragmentos crencaFragmentos  = crencas.getByType(CrencaColecaoDeFragmentos.class);
        if (crencaFragmentos == null || crencaFragmentos.vazio())
            return false;

        // Tem evento do tipo objetivo
        CrencaEventoRegistrado eventoRegistrado = crencas.getByType(CrencaEventoRegistrado.class);
        if (eventoRegistrado == null || eventoRegistrado.obterTipo() != TipoDeEvento.Objetivo)
            return false;

        return true;
    }

    private void adicionarFragmento(Blackboard blackboard) {
        String texto = "";
        TipoDeFragmento tipo = TipoDeFragmento.Objetivo;
        Fragmento fragmento = new Fragmento(texto, tipo);
        blackboard.adicionarFragmento(fragmento);
    }

    private void adicionarFragmento(Blackboard blackboard, Cena cena) {
        String texto = cena.obterDescricao();
        TipoDeFragmento tipo = TipoDeFragmento.Objetivo;
        Fragmento fragmento = new Fragmento(texto, tipo);
        blackboard.adicionarFragmento(fragmento);
    }

    private void adicionarObjetivos(Blackboard blackboard, Cena cena) {
        for (Conhecimento conhecimento : cena.obterAssociacoes()) {
            boolean encontrado = false;
            for (Conhecimento requerido : blackboard.obterConhecimentosNecessarios()) {
                if (requerido.equals(conhecimento)) {
                    encontrado = true;
                    break;
                }
            }
            for (Conhecimento adquirido : blackboard.obterConhecimentosAdquiridos()) {
                if (adquirido.equals(conhecimento)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado)
                blackboard.adicionarConhecimentoNecessario(conhecimento);
        }
    }

    public void executar(Blackboard blackboard) {
        Object obj = blackboard.obterDaPilhaDeExecucao();

        // Caso de conhecimento não precisa fazer nada
        if (obj instanceof Conhecimento) {
            this.adicionarFragmento(blackboard);
            blackboard.atribuirEvento(null);
            return;
        }

        Cena cena = (Cena)obj;
        this.adicionarFragmento(blackboard);
        this.adicionarObjetivos(blackboard, cena);

        blackboard.atribuirEvento(null);
    }

}
