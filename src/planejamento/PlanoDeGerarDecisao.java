package planejamento;

import comunicacao.*;
import utilitarios.*;

public class PlanoDeGerarDecisao implements Plano {

    private List<Acao> acoes;

    public PlanoDeGerarDecisao() {
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
