package planejamento;

import gramatica.*;
import comunicacao.*;

public class AcaoParaAtribuirEventoContratempo implements Acao {

    public void executar(Blackboard blackboard) {
        Evento evento = new Evento(TipoDeEvento.Contratempo);
        blackboard.atribuirEvento(evento);
    }

}
