package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class CrencaColecaoDeConhecimentosPendentes implements Crenca {

    private List<Conhecimento> conhecimentos;

    public boolean aplicavel(Blackboard blackboard) {
        this.conhecimentos = blackboard.obterConhecimentosNecessarios();

        if (this.conhecimentos == null)
            return false;

        if (this.conhecimentos.size() == 0)
            return false;

        return true;
    }

    public List<Conhecimento> obterConhecimentos() {
        return this.conhecimentos;
    }

}
