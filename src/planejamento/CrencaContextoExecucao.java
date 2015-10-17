package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class CrencaContextoExecucao implements Crenca {

    private Cena cena;

    private Conhecimento conhecimento;

    public boolean aplicavel(Blackboard blackboard) {
        List<Object> pilhaDeExecucao = blackboard.obterilhaDeExecucao();

        if (pilhaDeExecucao == null)
            return false;

        if (pilhaDeExecucao.isEmpty())
            return false;

        Object elemento = pilhaDeExecucao.getLastItem();

        if (elemento instanceof Cena)
            this.cena = (Cena)elemento;

        if (elemento instanceof Conhecimento)
            this.conhecimento = (Conhecimento)elemento;

        return true;
    }

    public Cena obterCena() {
        return this.cena;
    }

    public Conhecimento obterConhecimento() {
        return this.conhecimento;
    }

    public boolean contemCena() {
        return this.obterCena() != null;
    }

    public boolean contemConhecimento() {
        return this.obterConhecimento() != null;
    }

}
