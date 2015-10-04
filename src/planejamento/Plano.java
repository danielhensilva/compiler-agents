package planejamento;

import utilitarios.*;

public interface Plano {

    boolean aplicavel(List<Crenca> crencas);

    void executar(Blackboard blackboard);

}
