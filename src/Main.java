import domain.*;
import ui.Form;

public class Main {

    public static void main(String[] args) {
        new Form();
    }

    private Topic CreateSource() {
        Topic t1 = new Topic("T1", "Explicação 1", "O que deve ser apropriado?");
        Topic t2 = new Topic("T2", "Explicação 2", "O que deve ser apropriado?");
        Topic t3 = new Topic("T3", "Explicação 3", "O que deve ser apropriado?");
        Topic t4 = new Topic("T4", "Explicação 4", "O que deve ser apropriado?");

        Path p1p2 = new Path("Resposta A", t2);
        Path p1p3 = new Path("Resposta B", t3);
        Path p2p3 = new Path("Resposta Y", t3);
        Path p2p4 = new Path("Resposta W", t4);

        t1.add(p1p2);
        t1.add(p1p3);
        t2.add(p2p3);
        t2.add(p2p4);

        return t1;
    }
}
