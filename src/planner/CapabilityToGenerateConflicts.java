package planner;

public class CapabilityOfGenerateConflicts extends Capability {

	public CapabilityOfGenerateConflicts(Environment environment) {
		super(environment);
		this.addGoal(new GoalToGenerateConflicts());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
