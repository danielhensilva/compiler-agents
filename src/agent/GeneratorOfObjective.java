package agent;

import communication.*;
import planner.*;

public class GeneratorOfObjective extends IntelligentAgent {

    public Maestro(Blackboard blackboard) {
        super(blackboard);
        this.addCapability(new CapabilityToGenerateObjective(blackboard));
    }

}
