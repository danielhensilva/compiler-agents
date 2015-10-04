package planejamento;

import utilitarios.*;

public class PlanoDeIgnorarContratempo implements Plano {

    private List<Acao> acoes;

    public PlanoDeIgnorarContratempo() {
        this.acoes = new List<>();
    }

    @Override
    public boolean aplicavel(List<Crenca> crencas) {

    }

    @Override
    public boolean executar(Blackboard blackboard) {

    }

}
