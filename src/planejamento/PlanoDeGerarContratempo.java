package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeGerarContratempo implements Plano {

    private List<Acao> acoes;

    public PlanoDeGerarContratempo() {
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
