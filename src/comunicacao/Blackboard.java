package comunicacao;

import dominio.*;
import utilitarios.*;

public class Blackboard {

    private List<Fragmento> fragmentos;

    private Evento evento;

    private Fabula fabula;

    private String linguagemDaFabula;

    private List<Object> pilhaDeExecucao;

    private List<Conhecimento> conhecimentosNecessarios;

    private List<Conhecimento> conhecimentosAdquiridos;

    public Blackboard() {
        this.fragmentos = new List<>();
        this.pilhaDeExecucao = new List<>();
        this.conhecimentosNecessarios = new List<>();
        this.conhecimentosAdquiridos = new List<>();
    }

    public void adicionarFragmento(Fragmento fragmento) {
        this.fragmentos.add(fragmento);
    }

    public List<Fragmento> obterFragmentos() {
        return this.fragmentos;
    }

    public void atribuirEvento(Evento evento) {
        this.evento = evento;
    }

    public Evento obterEvento() {
        return this.evento;
    }

    public void atribuirFabula(Fabula fabula) {
        this.fabula = fabula;
    }

    public Fabula obterFabula() {
        return this.fabula;
    }

    public void adicionarNaPilhaDeExecucao(Object elemento) {
        this.pilhaDeExecucao.add(elemento);
    }

    public void removerDaPilhaDeExecucao() {
        this.pilhaDeExecucao.removeLast();
    }

    public Object obterDaPilhaDeExecucao() {
        return this.pilhaDeExecucao.getLastItem();
    }

    public void adicionarConhecimentoNecessario(Conhecimento conhecimento) {
        this.conhecimentosNecessarios.add(conhecimento);
    }

    public void removerConhecimentoNecesario(Conhecimento conhecimento) {
        this.conhecimentosNecessarios.remove(conhecimento);
    }

    public List<Conhecimento> obterConhecimentosNecessarios() {
        return this.conhecimentosNecessarios;
    }

    public void adicionarConhecimentoAdquirido(Conhecimento conhecimento) {
        this.conhecimentosAdquiridos.add(conhecimento);
    }

    public List<Conhecimento> obterConhecimentosAdquiridos() {
        return this.conhecimentosAdquiridos;
    }
}
