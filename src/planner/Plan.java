package planner;

import utils.*;

public abstract class Plan {

	private List<Action> actions;

	public Plan() {
		actions = new List<>();
	}

	protected void addAction(Action action) {
		this.actions.add(action);
	}

	public List<Action> getActions() {
		return this.actions;
	}

	public abstract boolean isApplicable(BeliefSet beliefSet);

	public void execute() {
		if (this.actions == null)
			return;

		for (Action action : this.actions)
			action.execute();
	}

}
