package planner;

import environment.*;

public abstract class Plan {

    private String name;

    private Goal target;

    public Plan(String name, Goal target) {
        this.name = name;
        this.target = target;
    }

    public abstract Boolean isApplicable(Percept[] percepts);

    public abstract Action[] getSteps();

}
