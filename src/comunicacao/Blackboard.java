package comunicacao;

import utilitarios.*;

public class Blackboard {

    private List<Fragmento> fragmentos;

    private List<Evento> eventos;

    private Fabula fabula;

    public Blackboard() {
        this.fragmentos = new List<>();
        this.eventos = new List<>();
    }

    public void adicionarFragmento(Fragmento fragmento) {
        this.fragmentos.add(fragmento);
    }

    public void atribuirFabula(Fabula fabula) {
        this.fabula = fabula;
    }

    public void cadastrarEvento(TipoDeEvento tipo) {
        Evento evento = new Evento(tipo);
        this.eventos.add(evento);
    }

    public Evento consumirEvento(TipoDeEvento tipo) {
        for (Evento evento : this.eventos)
            if (tipo == evento.obterTipo()) {
                this.eventos.remove(evento);
                return evento;
            }
        return null;
    }

}
