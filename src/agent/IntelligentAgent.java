package agent;

import communication.*;
import domain.*;
import grammar.*;
import planner.*;
import utils.*;

public abstract class IntelligentAgent {

    private List<Capability> capabilities;

    public IntelligentAgent() {
        this.capabilities = new List<>();
    }

    protected void addCapability(Capability capability) {
        this.capability = capability;
    }

    public void run() {
        for (Capability capability : capabilities) {
            Plan plan = capability.getAnyPlan();
        }
    }



}
