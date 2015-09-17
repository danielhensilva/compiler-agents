package planner;

import utils.*;

public abstract class Capability {

	private GoalSet goalSet;

	private Environment environment;

	public Capability(Environment environment) {
		this.goalSet = new GoalSet();
		this.environment = environment;
	}

	protected void addGoal(Goal goal) {
		this.goalSet.add(goal);
	}

	public GoalSet getGoalSet() {
		return this.goalSet;
	}

	public Environment getEnvironment() {
		return this.environment;
	}

	public abstract BeliefSet generateBeliefSet();

	public Goal getAnyGoal() {
		BeliefSet beliefSet = this.generateBeliefSet();
		if (beliefSet == null)
			return null;

		return this.getGoalSet()
			.filter(beliefSet)
			.getFirstItem();
	}

	public Plan getAnyPlan() {
		BeliefSet beliefSet = this.generateBeliefSet();
		if (beliefSet == null)
			return null;

		Goal goal = this.getAnyGoal();
		if (goal == null)
			return null;

		return goal.getPlanSet()
			.filter(beliefSet)
			.getFirstItem();
	}

}
