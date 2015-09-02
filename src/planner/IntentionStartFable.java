package planner;

import communication.*;
import domain.*;
import grammar.*;
import planner.*;
import utils.*;

public class IntentionStartFable extends Intention {

    @Override
    public Boolean isApplicable(List<Belief> beliefs) {
        BeliefFragment belief = beliefs.getByType(BeliefFragment.class);

        if (belief == null)
            return false;

        if (belief.getCount() > 0)
            return false;

        return true;
    }

    @Override
    public void execute(Blackboard blackboard) {
        
    }

}
