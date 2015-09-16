package planner;

public class CapabilityOfGenerateCatastrophe extends Capability {

	public CapabilityOfGenerateCatastrophe(Environment environment) {
		super(environment);
		this.addGoal(new GoalToGenerateCatastrophe());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
