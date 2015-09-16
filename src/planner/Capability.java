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

}
