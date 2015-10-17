package planejamento;

import comunicacao.*;
import utilitarios.*;
import java.io.PrintWriter;

public class PlanoDeFornecerRoteiro implements Plano {

    public boolean aplicavel(List<Crenca> crencas) {
        return true;
    }

    public void executar(Blackboard blackboard) {
        blackboard.atribuirEvento(null);

        try {
            PrintWriter writer = new PrintWriter("roteiro.txt");
            for (Fragmento f : blackboard.obterFragmentos())
                writer.println(f.obterTexto());

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
