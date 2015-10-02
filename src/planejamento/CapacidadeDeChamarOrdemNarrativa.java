package planner;

public class CapabilityOfCallNarrativeFragment extends Capability {

	public CapabilityOfTranslateKnowledge(Blackboard blackboard) {
		super(blackboard);
		this.addGoal(new GoalToCallForObjetive());
		this.addGoal(new GoalToCallForConflict());
		this.addGoal(new GoalToCallForCatastrophe());
		this.addGoal(new GoalToCallForDecision());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Blackboard blackboard = this.getBlackboard();
		// TODO ???
	}

}
