package planejamento;

import comunicacao.*;
import utilitarios.*;

public interface Capacidade {

    List<Objetivo> obterObjetivos();
    
    List<Crenca> calcularCrencas(Blackboard blackboard);

}
