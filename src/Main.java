
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import agente.*;
import comunicacao.*;
import dominio.*;
import gramatica.*;
import planejamento.*;

public class Main {

    public static void main(String[] args) {
        try {

            Fabula fabula = parse("../src/fabula.ggf");
            Blackboard blackboard = criarBlackboard(fabula);
            AgenteInteligente[] agentes = criarAgentes(blackboard);

            // ativarAgentes(agentes);

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
        Blackboard blackboard = new Blackboard();
        blackboard.atribuirFabula(fabula);
        return blackboard;
    }

    private static AgenteInteligente[] criarAgentes(Blackboard blackboard) {
        AgenteInteligente[] agentes = new AgenteInteligente[5];
        agentes[0] = new Maestro(blackboard);
        agentes[1] = new GeradorDeDecisao(blackboard);
        agentes[2] = new GeradorDeObjetivo(blackboard);
        agentes[3] = new GeradorDeCatastrofe(blackboard);
        agentes[4] = new GeradorDeContratempo(blackboard);
        return agentes;
    }

    @SuppressWarnings("unchecked")
    private static void ativarAgentes(AgenteInteligente[] agentes) throws InterruptedException  {
        ExecutorService executor = Executors.newFixedThreadPool(agentes.length);
        CompletionService service = new ExecutorCompletionService(executor);

        for (Runnable agente : agentes)
            service.submit(agente, true);

            /*
            File f = new File("roteiro.txt");
            if(f.exists() && !f.isDirectory()) {
                // do something
            }
            */

        for (int i = 0; i < agentes.length; i++)
            service.take();

        executor.shutdown();
    }
}
