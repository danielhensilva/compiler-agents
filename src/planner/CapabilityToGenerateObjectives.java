package planner;

public class CapabilityOfGenerateObjectives extends Capability {

	public CapabilityOfGenerateObjectives(Environment environment) {
		super(environment);
		this.addGoal(new GoalToGenerateObjetives());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
