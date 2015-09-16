package planner;

public abstract class Goal {

	private PlanSet planSet;

	public Goal() {
		this.planSet = new List<>();
	}

	protected void addPlan(Plan plan) {
		this.planSet.add(plan);
	}

	public PlanSet getPlanSet() {
		return this.planSet;
	}

	private abstract boolean currentState(BeliefSet beliefSet);

	private abstract boolean targetState(BeliefSet beliefSet);

}
