import java.io.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import domain.*;
import grammar.*;

public class Main {

    public static void main(String[] args) {

        // http://www.antlr.org/api/Java/index.html
        // http://docs.oracle.com/javase/8/docs/

        try {
            String input = readFableInput();
            FableGrammarLexer lexer = new FableGrammarLexer(new ANTLRInputStream(input));
            FableGrammarParser parser = new FableGrammarParser(new CommonTokenStream(lexer));

            Integer answer = new FableEvaluator().visit(parser.start());
        }
        catch (Exception exception) {
            System.out.printf("Exception : " + exception.toString());
        }
    }

    private static String readFableInput() throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader("../src/grammar/FableInput.txt");

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            StringBuilder builder = new StringBuilder();
            String line = bufferedReader.readLine();

            while (line != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }

            String everything = builder.toString();
            return everything;
        }
        finally {
            fileReader.close();
        }
    }

}
