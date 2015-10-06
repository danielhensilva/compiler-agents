package planejamento;

import comunicacao.*;
import dominio.*;
import utilitarios.*;

public class CrencaColecaoDeFragmentos implements Crenca {

    private List<Fragmento> fragmentos;

    public boolean aplicavel(Blackboard blackboard) {
        this.fragmentos = blackboard.obterFragmentos();

        if (this.fragmentos == null)
            return false;

        if (this.fragmentos.size() == 0)
            return false;

        return true;
    }

    public List<Fragmento> obterFragmentos() {
        return this.fragmentos;
    }

}
