import java.io.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import grammar.*;

public class Main {

    public static void main(String[] args) {

        // http://www.antlr.org/api/Java/index.html
        // http://docs.oracle.com/javase/8/docs/

        try {
            String file = "../src/input.fg";
            FableGrammarLexer lexer = new FableGrammarLexer(new ANTLRFileStream(file));
            FableGrammarParser parser = new FableGrammarParser(new CommonTokenStream(lexer));

            parser.setBuildParseTree(true);

            ParseTree tree = parser.fabula();
            new FableEvaluator().visit(tree);

        }
        catch (Exception exception) {
            System.out.print("Exception : " + exception.toString());
        }
    }

}
