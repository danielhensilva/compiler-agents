package planner;

import utils.*;

public class GoalSet extends List<Goal> {

	public GoalSet filter(BeliefSet beliefSet) {
		GoalSet goals = new GoalSet();

		if (beliefSet == null)
			return goals;

		for (Goal goal : goals)
			if (goal.currentState(beliefSet))
				if (!goal.targetState(beliefSet))
					goals.add(goal);

		return goals;
	}

}
