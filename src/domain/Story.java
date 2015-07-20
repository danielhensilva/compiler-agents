package domain;

import utils.*;

public class Story {

	private PairList<Scene, Sequence> steps;

	public Story() {
		this.steps = new PairList<Scene, Sequence>();
	}

	public PairList<Scene, Sequence> getCurrentStep() {
		return this.steps.getLast();
	}

	public void createStep() {
		Scene scene = new Scene();
		Sequence sequence = new Sequence();
		Pair<Scene, Sequence> steps = new Pair<>(scene, sequence);
		this.steps.add(scene, sequence);
	}
}
