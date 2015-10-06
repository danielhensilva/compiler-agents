package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeChamarCatastrofe implements Plano {

    public PlanoDeChamarCatastrofe() {

    }

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    public void executar(Blackboard blackboard) {
        blackboard.atribuirEvento(new Evento(TipoDeEvento.Catastrofe));
    }

}
