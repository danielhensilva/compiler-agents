package planner;

import utils.*;

public abstract class Plan {

	private List<Action> actions;

	public abstract boolean isApplicable(BeliefSet beliefSet);

	public List<Action> getActions() {
		return this.actions;
	}

	protected void setActions(List<Action> actions) {
		this.actions = actions;
	}

}
