package planner;

public class CapabilityOfCallNarrativeFragment extends Capability {

	public CapabilityOfTranslateKnowledge(Environment environment) {
		super(environment);
		this.addGoal(new GoalToCallForObjetives());
		this.addGoal(new GoalToCallForConflicts());
		this.addGoal(new GoalToCallForCatastrophe());
		this.addGoal(new GoalToCallForDecision());
	}

	@Override
	public BeliefSet generateBeliefSet() {
		Environment environment = this.getEnvironment();
		// TODO ???
	}

}
