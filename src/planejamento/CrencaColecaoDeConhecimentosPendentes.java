package planejamento;

import comunicacao.*;
import dominio.*;
import utilitarios.*;

public class CrencaColecaoDeConhecimentosPendentes implements Crenca {

    private List<Conhecimento> conhecimentos;

    public CrencaColecaoDeConhecimentosPendentes() {
        this.conhecimentos = new List<>();
    }

    public boolean aplicavel(Blackboard blackboard) {
        List<Conhecimento> necessarios = blackboard.obterConhecimentosNecessarios();
        List<Conhecimento> adquiridos = blackboard.obterConhecimentosAdquiridos();

        for (Conhecimento necessario : necessarios) {
            boolean encontrado = false;
            for (Conhecimento adquirido : adquiridos) {
                if (necessario.equals(adquirido)) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado)
                this.conhecimentos.add(necessario);
        }

        return conhecimentos.size() > 0;
    }

    public List<Conhecimento> obterConhecimentos() {
        return this.conhecimentos;
    }

}
