package planner;

public class CapabilityOfGenerateDecision extends Capability {

	public CapabilityOfGenerateDecision(Environment environment) {
		super(environment);
		this.addGoal(new GoalToGenerateDecision());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
