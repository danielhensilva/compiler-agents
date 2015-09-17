package agent;

import communication.*;
import planner.*;

public class GeneratorOfConflict extends IntelligentAgent {

    public Maestro(Blackboard blackboard) {
        super(blackboard);
        this.addCapability(new CapabilityToGenerateConflict(blackboard));
    }

}
