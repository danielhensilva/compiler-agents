package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeChamarObjetivo implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    public void executar(Blackboard blackboard) {
        new AcaoParaAtribuirEventoObjetivo().executar(blackboard);
    }

}
