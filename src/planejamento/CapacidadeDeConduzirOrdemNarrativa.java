package planejamento;

import comunicacao.*;
import utilitarios.*;

public class CapacidadeDeChamarOrdemNarrativa implements Capacidade {

    private List<Objetivo> objetivos;

	public CapacidadeDeChamarOrdemNarrativa() {
        this.objetivos = new List<>();

        Objetivo o1 = new ObjetivoDeChamarObjetivo();
        this.objetivos.add(o1)

        Objetivo o2 = new ObjetivoDeChamarDecisao();
        this.objetivos.add(o2)

        Objetivo o3 = new ObjetivoDeChamarCatastrofe();
        this.objetivos.add(o3)

        Objetivo o4 = new ObjetivoDeChamarContratempo();
        this.objetivos.add(o4)
	}

}
