package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeIgnorarContratempo implements Plano {

    private List<Acao> acoes;

    public PlanoDeIgnorarContratempo() {
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
