package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeChamarDecisao implements Plano {

    public PlanoDeChamarDecisao() {

    }

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    public void executar(Blackboard blackboard) {
        blackboard.atribuirEvento(new Evento(TipoDeEvento.Decisao));
    }

}
