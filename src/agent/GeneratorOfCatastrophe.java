package agent;

import communication.*;
import planner.*;

public class GeneratorOfCatastrophe extends IntelligentAgent {

    public Maestro(Blackboard blackboard) {
        super(blackboard);
        this.addCapability(new CapabilityToGenerateCatastrophe(blackboard));
    }

}
