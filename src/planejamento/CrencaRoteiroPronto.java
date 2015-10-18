package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class CrencaRoteiroPronto implements Crenca {

    public boolean aplicavel(Blackboard blackboard) {
        List<Fragmento> fragmentos = blackboard.obterFragmentos();
        if (fragmentos == null || fragmentos.isEmpty())
            return false;

        if (fragmentos.getLastItem().obterTipo() != TipoDeFragmento.Conclusao)
            return false;

        return true;
    }

}
