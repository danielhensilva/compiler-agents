package planejamento;

import utilitarios.*;

public class PlanoDeChamarCatastrofe implements Plano {

    private List<Acao> acoes;

    public PlanoDeChamarCatastrofe() {
        this.acoes = new List<>();
    }

    @Override
    public boolean aplicavel(List<Crenca> crencas) {

    }

    @Override
    public boolean executar(Blackboard blackboard) {

    }

}
