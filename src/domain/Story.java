package domain;

import utils.*;

public class Story {

	private PairList<Scene, Sequence> steps;

	public Story() {
		this.steps = new PairList<Scene, Sequence>();
	}

	public void createStep() {
		Scene scene = new Scene();
		Sequence sequence = new Sequence();
		Pair<Scene, Sequence> steps = new Pair<>(scene, sequence);
		this.steps.add(scene, sequence);
	}

	public PairList<Scene, Sequence> getCurrentStep() {
		return this.steps.getLast();
	}

	public void push(Object object) {
		PairList<Scene, Sequence> step = this.getCurrentStep();

		Scene scene = step.getLeft();
		Sequence sequence = step.getRight();

		if (object instanceOf Objective)
			scene.setObjective((Objective) object);

		else if (object instanceOf Conflict)
			scene.setConflict((Conflict) object);

		else if (object instanceOf Catastrophe)
			scene.setCatastrophe((Catastrophe) object)

		else if (object instanceOf Reaction)
			sequence.setReaction((Reaction) object);

		else if (object instanceOf Dilemma)
			sequence.setDilemma((Dilemma) object);

		else if (object instanceOf Decision)
			sequence.setDecision((Decision) object);

		else
			throw new Exception("Unexpected story item.");
	}
}
