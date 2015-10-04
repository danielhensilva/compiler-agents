package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeFornecerEsqueletoDoRoteiro implements Capacidade {

    private List<Objetivo> objetivos;

	public CapacidadeDeFornecerEsqueletoDoRoteiro() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeFornecerRoteiro();
        this.objetivos.add(o1);
	}

}
