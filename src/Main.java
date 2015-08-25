import java.io.*;

import domain.*;
import grammar.*;

public class Main {

    public static void main(String[] args) {

        // http://www.antlr.org/api/Java/index.html
        // http://docs.oracle.com/javase/8/docs/

        // String expression = "(10 + 3) * 3";
        // ExpressionsLexer lexer = new ExpressionsLexer(new ANTLRInputStream(expression));
        // ExpressionsParser parser = new ExpressionsParser(new CommonTokenStream(lexer));
        //
        // System.out.printf("%s = %s\n", expression, answer);
        try {
            String input = readFableInput();
            ExpressionsLexer lexer = new ExpressionsLexer(new ANTLRInputStream(expression));
            ExpressionsParser parser = new ExpressionsParser(new CommonTokenStream(lexer));
            Integer answer = new ProgramEvaluator().visit(parser.start());
        }
        catch (Exception exception) {
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
