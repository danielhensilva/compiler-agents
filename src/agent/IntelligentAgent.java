package agent;

import communication.*;
import domain.*;
import grammar.*;
import planner.*;
import utils.*;

public abstract class IntelligentAgent {

    /*
    Procedural Reasoning System (Georgeff and Lansky ~86)
    ---------------
    initialize-state();
    repeat
        options := option-generator(event-queue);
        selected-options := deliberate(options);
        update-intentions(selected-options);
        execute();
        get-new-external-events();
        drop-successful-attitudes();
        drop-impossible-attitudes();
    end repeat
    */

    private List<Belief> beliefs;

    private List<Desire> desires;

    private List<Intention> intentions;

    public IntelligentAgent() {
        this.beliefs = new List<>();
        this.desires = new List<>();
        this.intentions = new List<>();
    }

    public abstract void initializeState(List<Intention> intentions);

    public abstract List<Belief> sensorate(Blackboard blackboard);

    public abstract List<Desire> deliberate(List<Belief> beliefs);

    public abstract List<Intention> plan(List<Desire> desires);

    public abstract void execute(List<Intention> intentions);

/*
    public abstract List<Percept> getNewExternalEvents();

    public abstract void dropSucessfulAttitudes();

    public abstract void dropImpossibleAttitudes();
*/

}
