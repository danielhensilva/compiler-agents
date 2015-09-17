package planner;

public class CapabilityOfGenerateDecision extends Capability {

	public CapabilityOfGenerateDecision(Blackboard blackboard) {
		super(blackboard);
		this.addGoal(new GoalToGenerateDecision());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Blackboard blackboard = this.getBlackboard();
		// TODO ???
	}

}
