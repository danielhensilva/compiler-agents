import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import agente.*;
import communication.*;
import domain.*;
import grammar.*;
import planner.*;
import utils.*;

public class Main {

    public static void main(String[] args) {
        Fable fable = parse("../src/input.fg");
        
    }

    private static Fable parse(String filePath) {
        try {
            FableGrammarLexer lexer = new FableGrammarLexer(new ANTLRFileStream(filePath));
            FableGrammarParser parser = new FableGrammarParser(new CommonTokenStream(lexer));

            // parser.setBuildParseTree(true);
            // parser.removeErrorListeners();

            ParseTree parseTree = parser.fable();
            FableEvaluator evaluator = new FableEvaluator();
            Fable fable = (Fable)evaluator.visit(parseTree);

            return fable;
        }
        catch (Exception exception) {
            System.out.println("Exception : " + exception);
            return null;
        }
    }

    private static List<IntelligentAgent> createIntelligentAgents() {
        List<IntelligentAgent> agents = new List<>();



        return agents;
    }

}
