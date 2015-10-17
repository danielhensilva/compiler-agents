import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import agente.*;
import comunicacao.*;
import gramatica.*;
import planejamento.*;

public class Main {

    public static void main(String[] args) {
        try {

            Fabula fabula = parse("../src/fabula.ggf");
            Blackboard blackboard = criarBlackboard(fabula);
            AgenteInteligente[] agentes = criarAgentes();

            ativarAgentes(agentes);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static Fabula parse(String filePath) throws java.io.IOException {
        FableGrammarLexer lexer = new FableGrammarLexer(new ANTLRFileStream(filePath));
        FableGrammarParser parser = new FableGrammarParser(new CommonTokenStream(lexer));
        ParseTree parseTree = parser.fabula();
        FableEvaluator evaluator = new FableEvaluator();
        return (Fabula)evaluator.visit(parseTree);
    }

    private static Blackboard criarBlackboard(Fabula fabula) {
        Blackboard blackboard = Blackboard.obterInstancia();
        blackboard.atribuirFabula(fabula);
        return blackboard;
    }

    private static AgenteInteligente[] criarAgentes() {
        AgenteInteligente[] agentes = new AgenteInteligente[3];
        agentes[0] = new Maestro();
        agentes[1] = new GeradorDeObjetivo();
        agentes[2] = new GeradorDeContratempo();
        // agentes[3] = new GeradorDeCatastrofe();
        // agentes[4] = new GeradorDeDecisao();
        return agentes;
    }

    @SuppressWarnings("unchecked")
    private static void ativarAgentes(AgenteInteligente[] agentes) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(agentes.length);
        CompletionService service = new ExecutorCompletionService(executor);

        for (Runnable agente : agentes)
            service.submit(agente, true);

        // File f = new File("roteiro.txt");
        // while (!f.exists() && !f.isDirectory());

        // for (AgenteInteligente agente : agentes)
            // agente.parar();

        for (int i = 0; i < agentes.length; i++)
            service.take();

        executor.shutdown();
    }
}
