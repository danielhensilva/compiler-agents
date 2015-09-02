package planner;

import communication.*;
import domain.*;
import grammar.*;
import planner.*;
import utils.*;

public abstract class Intention {

    public abstract Boolean isApplicable(List<Belief> beliefs);

    public abstract void execute(Blackboard blacboard);

}
