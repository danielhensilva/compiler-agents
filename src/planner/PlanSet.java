package planner;

import utils.*;

public class PlanSet extends List<Plan> {

    public PlanSet filter(BeliefSet beliefSet) {
        PlanSet plans = new PlanSet();

        if (beliefSet == null)
            return plans;

        for (Plan plan : plans)
            if (plan.isApplicable(beliefSet))
                plans.add(plan);

        return plans;
    }

}
