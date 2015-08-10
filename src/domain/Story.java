package domain;

import utils.*;
import domain.*;
import domain.scene.*;
import domain.sequence.*;

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

	public Pair<Scene, Sequence> getCurrentStep() {
		return this.steps.getLast();
	}

	public void push(Object object) {
		Pair<Scene, Sequence> step = this.getCurrentStep();

		Scene scene = step.getLeft();
		Sequence sequence = step.getRight();

		if (object instanceof Objective)
			scene.setObjective((Objective) object);

		else if (object instanceof Conflict)
			scene.setConflict((Conflict) object);

		else if (object instanceof Catastrophe)
			scene.setCatastrophe((Catastrophe) object);

		else if (object instanceof Reaction)
			sequence.setReaction((Reaction) object);

		else if (object instanceof Dilemma)
			sequence.setDilemma((Dilemma) object);

		else if (object instanceof Decision)
			sequence.setDecision((Decision) object);

		else
			throw new RuntimeException("Unexpected story item.");
	}
}
