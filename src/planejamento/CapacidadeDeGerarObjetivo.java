package planner;

public class CapabilityOfGenerateObjective extends Capability {

	public CapabilityOfGenerateObjective(Blackboard blackboard) {
		super(blackboard);
		this.addGoal(new GoalToGenerateObjetive());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Blackboard blackboard = this.getBlackboard();
		// TODO ???
	}

}
