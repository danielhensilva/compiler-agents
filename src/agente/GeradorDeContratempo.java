package agente;

import comunicacao.*;
import planejamento.*;
import utilitarios.*;

public class GeradorDeContratempo implements AgenteInteligente {

    private boolean ativado;

    private List<Capacidade> capacidades;

    public GeradorDeContratempo() {
        this.ativado = true;
        this.capacidades = new List<>();

        Capacidade c1 = new CapacidadeDeGerarContratempo();
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
            this.print(capacidade);

            List<Crenca> crencas = capacidade.calcularCrencas(blackboard);
            this.print(crencas);

            List<Objetivo> objetivos = capacidade.obterObjetivos();
            this.print(objetivos);

            for (Objetivo objetivo : objetivos) {

                if (objetivo.estadoAtual(crencas) && !objetivo.estadoFuturo(crencas)) {
                    this.print(objetivo, "aplicavel");

                    List<Plano> planos = objetivo.obterPlanos();

                    for (Plano plano : planos) {
                        if (plano.aplicavel(crencas)) {
                            this.print(plano, "aplicavel");
                            plano.executar(blackboard);
                        }
                    }
                }
            }
        }
    }

    public void run() {
        while (this.ativado) {
            try {
                    this.executar();
                    Thread.sleep(410);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private <Q> void print(List<Q> objs) {
        for (Q o : objs)
            this.print(o);
    }

    private void print(Object obj) {
        System.out.println(this.getClass().getSimpleName() + " : " + obj.getClass().getSimpleName());
    }

    private void print(Object obj, String message) {
        System.out.println(this.getClass().getSimpleName() + " : " + obj.getClass().getSimpleName() + " : " + message);
    }
}
