package planejamento;

import utilitarios.*;

public interface Objetivo {

    List<Plano> obterPlanos();

    boolean compativelComEstadoAtual(List<Crenca> crencas);

    boolean estaEmEstadoFuturo(List<Crenca> crencas);

}
