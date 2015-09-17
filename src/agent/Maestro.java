package agent;

import communication.*;
import planner.*;

public class Maestro extends IntelligentAgent {

    public Maestro(Blackboard blackboard) {
        super(blackboard);
        this.addCapability(new CapabilityToDeliverScript(blackboard));
        this.addCapability(new CapabilityToCallNarrativeFragment(blackboard));
    }

}
