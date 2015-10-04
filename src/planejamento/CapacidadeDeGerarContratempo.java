package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeGerarContratempo implements Capacidade {

    private List<Objetivo> objetivos;

    public CapacidadeDeGerarContratempo() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeGerarContratempo();
        this.objetivos.add(o1);
    }

}
