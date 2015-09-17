package agent;

import communication.*;
import planner.*;

public class GeneratorOfDecision extends IntelligentAgent {

    public Maestro(Blackboard blackboard) {
        super(blackboard);
        this.addCapability(new CapabilityToGenerateDecision(blackboard));
    }

}
