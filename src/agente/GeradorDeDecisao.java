package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class GeradorDeDecisao implements AgenteInteligente {

    private boolean ativado;

    private List<Capacidade> capacidades;

    public GeradorDeDecisao() {
        this.ativado = true;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadeDeGerarDecisao();
        this.capacidades.add(c1);
    }

    public void parar() {
        this.ativado = false;
    }

    public void iniciar() {
        this.ativado = true;
    }

    public void executar() {
        Blackboard blackboard = Blackboard.obterInstancia();

        for (Capacidade capacidade : capacidades) {

            List<Crenca> crencas = capacidade.calcularCrencas(blackboard);
            List<Objetivo> objetivos = capacidade.obterObjetivos();

            for (Objetivo objetivo : objetivos) {

                if (objetivo.estadoAtual(crencas) && !objetivo.estadoFuturo(crencas)) {

                    List<Plano> planos = objetivo.obterPlanos();

                    for (Plano plano : planos) {
                        if (plano.aplicavel(crencas))
                            plano.executar(blackboard);
                    }
                }
            }
        }
    }

    public void run() {
        while (this.ativado)
            this.executar();
    }
}
