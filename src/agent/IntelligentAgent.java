package agent;

import communication.*;
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

    public IntelligentAgent() {
    }

    public abstract List<Belief> sensor(Blackboard blackboard);

    public abstract List<Desire> deliberate(List<Belief> beliefs);

    public abstract List<Intention> plan(List<Desire> desires);

    public abstract void Execute();

    public abstract List<Percept> getNewExternalPercepts();

    public abstract void dropSucessfulAttitudes();

    public abstract void dropImpossibleAttitudes();

}
