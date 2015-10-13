package planejamento;

import comunicacao.*;
import gramatica.*;
import utilitarios.*;

public class CrencaColecaoDeFragmentos implements Crenca {

    private List<Fragmento> fragmentos;

    public boolean aplicavel(Blackboard blackboard) {
        this.fragmentos = blackboard.obterFragmentos();

        if (this.fragmentos == null)
            return false;

        return true;
    }

    public List<Fragmento> obterFragmentos() {
        return this.fragmentos;
    }

    public boolean vazio() {
        return this.fragmentos.size() == 0;
    }

    public boolean contem(TipoDeFragmento tipo) {
        for (Fragmento fragmento : this.fragmentos)
            if (fragmento.obterTipo() == tipo)
                return true;

        return false;
    }

    public boolean ultimo(TipoDeFragmento tipo) {
        if (this.vazio())
            return false;

        if (this.fragmentos.getLastItem().obterTipo() != tipo)
            return false;

        return true;
    }

}
