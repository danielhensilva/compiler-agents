package agent;

import communication.*;
import domain.*;
import grammar.*;
import planner.*;
import utils.*;

public abstract class IntelligentAgent {

    private Blackboard blackboard;

    private List<Capability> capabilities;

    public IntelligentAgent(Blackboard blackboard) {
        this.blackboard = blackboard;
        this.capabilities = new List<>();
    }

    protected void addCapability(Capability capability) {
        this.capability = capability;
    }

    public Blackboard getBlackboard() {
        return this.blackboard;
    }

    public List<Capability> getCapabilities() {
        return this.capabilities;
    }

    public void run() {
        for (Capability capability : this.capabilities) {
            Plan plan = capability.getAnyPlan();
            if (plan == null)
                continue;

            plan.execute();
        }
    }

}
