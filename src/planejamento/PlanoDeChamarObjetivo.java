package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeChamarObjetivo implements Plano {

    public PlanoDeChamarObjetivo() {

    }

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    public void executar(Blackboard blackboard) {
        blackboard.atribuirEvento(null);
    }

}
