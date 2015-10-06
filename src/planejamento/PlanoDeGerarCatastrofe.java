package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeGerarCatastrofe implements Plano {

    public PlanoDeGerarCatastrofe() {

    }

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    public void executar(Blackboard blackboard) {
        blackboard.atribuirEvento(null);

        
    }

}
