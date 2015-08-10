package planner;

import domain.*;

public abstract class Intention {

    private String name;

    private Desire target;

    public Intention(String name, Desire target) {
        this.name = name;
        this.target = target;
    }

    public abstract Boolean isApplicable(Belief[] beliefs);

public abstract Action[] getSteps();

}
