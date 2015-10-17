package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class CrencaRoteiroPronto implements Crenca {

    public boolean aplicavel(Blackboard blackboard) {
        List<Conhecimento> adquiridos = blackboard.obterConhecimentosAdquiridos();
        if (adquiridos.size() == 0)
            return false;

        List<Conhecimento> necessarios = blackboard.obterConhecimentosNecessarios();
        if (necessarios.size() > 0)
            return false;

        return true;
    }

}
