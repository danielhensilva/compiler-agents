package planner;

public class CapabilityOfDeliverScript extends Capability {

	public CapabilityOfDeliverScript(Environment environment) {
		super(environment);
		this.addGoal(new GoalToDeliverScript());
		this.addGoal(new GoalToCleanEnvironment());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
