package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeChamarObjetivo implements Plano {

    private List<Acao> acoes;

    public PlanoDeChamarObjetivo() {
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
