package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeChamarContratempo implements Plano {

    private List<Acao> acoes;

    public PlanoDeChamarContratempo() {
        this.acoes = new List<>();
    }

    @Override
    public boolean aplicavel(List<Crenca> crencas) {
        return false;
    }

    @Override
    public void executar(Blackboard blackboard) {

    }

}
