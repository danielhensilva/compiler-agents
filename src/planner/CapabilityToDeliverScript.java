package planner;

public class CapabilityOfDeliverScript extends Capability {

	public CapabilityOfDeliverScript(Blackboard blackboard) {
		super(blackboard);
		this.addGoal(new GoalToDeliverScript());
		this.addGoal(new GoalToCleanEnvironment());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Blackboard blackboard = this.getBlackboard();
		// TODO ???
	}

}
