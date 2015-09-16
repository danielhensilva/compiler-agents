package planner;

public class CapabilityOfTranslateScenes extends Capability {

	public CapabilityOfTranslateScenes(Environment environment) {
		super(environment);
		this.addGoal(new GoalToTranslateScenes());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
