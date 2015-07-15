package domain;

import utils.*;

public class Story {

	private PairList<Scene, Sequence> steps;

	public Story() {
		this.steps = new PairList<Scene, Sequence>();
	}

}
