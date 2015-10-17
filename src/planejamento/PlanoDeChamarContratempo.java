package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeChamarContratempo implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    public void executar(Blackboard blackboard) {
        blackboard.atribuirEvento(new Evento(TipoDeEvento.Contratempo));
    }

}
