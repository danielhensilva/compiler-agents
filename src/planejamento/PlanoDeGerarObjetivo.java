package planejamento;

import comunicacao.*;
import comunicacao.*;
import utilitarios.*;

public class PlanoDeGerarObjetivo implements Plano {

    private List<Acao> acoes;

    public PlanoDeGerarObjetivo() {
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
