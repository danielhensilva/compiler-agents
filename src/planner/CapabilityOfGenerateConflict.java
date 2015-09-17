package planner;

public class CapabilityOfGenerateConflict extends Capability {

	public CapabilityOfGenerateConflict(Blackboard blackboard) {
		super(blackboard);
		this.addGoal(new GoalToGenerateConflict());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Blackboard blackboard = this.getBlackboard();
		// TODO ???
	}

}
