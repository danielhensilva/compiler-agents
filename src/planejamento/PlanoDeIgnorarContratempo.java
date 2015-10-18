package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeIgnorarContratempo implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
        return false;
    }

    public void executar(Blackboard blackboard) {
        blackboard.atribuirEvento(null);
    }

}
