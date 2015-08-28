package agent;

import communication.*;
import planner.*;
import utils.*;

public abstract class IntelligentAgent implements ObserverAgent {

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

    protected List<Belief> beliefs;

    protected List<Desire> desires;

    protected List<Intention> intentions;

    public IntelligentAgent() {
        this.beliefs = new List<>();
        this.desires = new List<>();
        this.intentions = new List<>();
    }

    public abstract List<Belief> sensor(Blackboard blackboard);

    public abstract List<Desire> deliberate(List<Belief> beliefs);

    public abstract List<Intention> plan(List<Desire> desires);

    public void Execute() {

    }

    public List<Percept> getNewExternalPercepts() {
        return null;
    }

    public void dropSucessfulAttitudes() {

    }

    public void dropImpossibleAttitudes() {

    }

    public abstract void notify(EventType eventType);

}
