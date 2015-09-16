package planner;

public class CapabilityOfTranslateKnowledge extends Capability {

	public CapabilityOfTranslateKnowledge(Environment environment) {
		super(environment);
		this.addGoal(new GoalToTranslateKnowledge());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
