package planner;

public class CapabilityOfGenerateCatastrophe extends Capability {

	public CapabilityOfGenerateCatastrophe(Blackboard blackboard) {
		super(blackboard);
		this.addGoal(new GoalToGenerateCatastrophe());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Blackboard blackboard = this.getBlackboard();
		// TODO ???
	}

}
