import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import agente.*;
import comunicacao.*;
import dominio.*;
import gramatica.*;
import planejamento.*;
import utilitarios.*;

public class Main {

    public static void main(String[] args) {
        Fabula fabula = parse("../src/fabula.ggf");

    }

    private static Fabula parse(String filePath) {
        try {
            FableGrammarLexer lexer = new FableGrammarLexer(new ANTLRFileStream(filePath));
            FableGrammarParser parser = new FableGrammarParser(new CommonTokenStream(lexer));

            // parser.setBuildParseTree(true);
            // parser.removeErrorListeners();

            ParseTree parseTree = parser.fabula();
            FableEvaluator evaluator = new FableEvaluator();
            Fabula fabula = (Fabula)evaluator.visit(parseTree);

            return fabula;
        }
        catch (Exception exception) {
            System.out.println("Exception : " + exception);
            return null;
        }
    }

    private static List<AgenteInteligente> criarAgentes() {
        List<AgenteInteligente> agentes = new List<>();



        return agentes;
    }

}
