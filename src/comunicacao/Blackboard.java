package comunicacao;

import gramatica.*;
import utilitarios.*;

public class Blackboard {

    private List<Fragmento> fragmentos;

    private Evento evento;

    private Fabula fabula;

    private String linguagemDaFabula;

    private List<Object> pilhaDeExecucao;

    private List<Conhecimento> conhecimentosNecessarios;

    private List<Conhecimento> conhecimentosAdquiridos;

    private static Blackboard instancia;

    private Blackboard() {
        this.fragmentos = new List<>();
        this.pilhaDeExecucao = new List<>();
        this.conhecimentosNecessarios = new List<>();
        this.conhecimentosAdquiridos = new List<>();
    }

    public synchronized static Blackboard obterInstancia() {
        if (instancia == null)
            instancia = new Blackboard();

        for (Fragmento f : instancia.fragmentos)
            System.out.println("+  +  +  +  +  Blackboard : Fragmento : " + f.obterTipo() + " : " + f.obterTexto());

        if (instancia.evento == null) {
            System.out.println("+  +  +  +  +  Blackboard : Evento : null");
        } else {
            System.out.println("+  +  +  +  +  Blackboard : Evento : " + instancia.evento.obterTipo().toString());
        }

        for (Object p : instancia.pilhaDeExecucao)
            System.out.println("+  +  +  +  +  Blackboard : PilhaDeExecucao : " + p.toString());

        for (Conhecimento c : instancia.conhecimentosNecessarios)
            System.out.println("+  +  +  +  +  Blackboard : conhecimentosNecessarios : " + c.obterIdentificador());

        for (Conhecimento c : instancia.conhecimentosAdquiridos)
            System.out.println("+  +  +  +  +  Blackboard : conhecimentosAdquiridos : " + c.obterIdentificador());

        return instancia;
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

    public List<Object> obterPilhaDeExecucao() {
        return this.pilhaDeExecucao;
    }

    public void adicionarConhecimentoNecessario(Conhecimento conhecimento) {
        this.conhecimentosNecessarios.add(conhecimento);
    }

    public void removerConhecimentoNecessario(Conhecimento conhecimento) {
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
