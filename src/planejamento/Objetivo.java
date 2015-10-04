package planejamento;

import utilitarios.*;

public interface Objetivo {

    boolean estadoAtual(List<Crenca> crencas);

    boolean estadoFuturo(List<Crenca> crencas);

}
