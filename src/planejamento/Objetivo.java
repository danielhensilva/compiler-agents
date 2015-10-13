package planejamento;

import utilitarios.*;

public interface Objetivo {

    List<Plano> obterPlanos();

    boolean estadoAtual(List<Crenca> crencas);

    boolean estadoFuturo(List<Crenca> crencas);

}
