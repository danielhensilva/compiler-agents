package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class GeradorDeCatastrofe implements AgenteInteligente {

    private boolean ativado;

    private Blackboard blackboard;

    private List<Capacidade> capacidades;

    public GeradorDeCatastrofe(Blackboard blackboard) {
        this.ativado = true;
        this.blackboard = blackboard;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadeDeGerarCatastrofe();
        this.capacidades.add(c1);
    }

    public void interromper() {
        this.ativado = false;
    }

    public void run() {
        while (this.ativado) {
            this.executarCapacidades(this.capacidades);
        }
    }

    private void executarCapacidades(List<Capacidade> capacidades) {
        for (Capacidade capacidade : capacidades) {
            List<Crenca> crencas = capacidade.calcularCrencas(this.blackboard);
            this.executarCapacidade(crencas, capacidade);
        }
    }

    private void executarCapacidade(List<Crenca> crencas, Capacidade capacidade) {
        List<Objetivo> objetivos = capacidade.obterObjetivos();
        this.executarObjetivos(crencas, objetivos);
    }

    private void executarObjetivos(List<Crenca> crencas, List<Objetivo> objetivos) {
        for (Objetivo objetivo : objetivos)
            this.executarObjetivo(crencas, objetivo);
    }

    private void executarObjetivo(List<Crenca> crencas, Objetivo objetivo) {
        if (objetivo.compativelComEstadoAtual(crencas))
            if (!objetivo.estaEmEstadoFuturo(crencas)) {
                List<Plano> planos = objetivo.obterPlanos();
                this.executarPlanos(crencas, planos);
            }
    }

    private void executarPlanos(List<Crenca> crencas, List<Plano> planos) {
        for (Plano plano : planos)
            this.executarPlano(crencas, plano);
    }

    private void executarPlano(List<Crenca> crencas, Plano plano) {
        if (plano.aplicavel(crencas))
            plano.executar(this.blackboard);
    }

}
