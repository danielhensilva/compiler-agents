package planejamento;

import gramatica.*;
import comunicacao.*;

public class AcaoParaAtribuirEventoObjetivo implements Acao {

    public void executar(Blackboard blackboard) {
        Evento evento = new Evento(TipoDeEvento.Objetivo);
        blackboard.atribuirEvento(evento);
    }

}
