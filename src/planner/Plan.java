package planner;

import utils.*;

public abstract class Plan {

	private Goal goal;

	private List<Action> actions;

	public Plan() {
	}

	public abstract boolean isApplicable();

	public Goal getGoal() {
		return this.goal;
	}

	public List<Action> getActions() {
		return this.actions;
	}

}
