package domain;

import utils.*;

public class Story {
	
	private PairList<Scene, SceneSequence> steps;
	
	public Story() {
		this.steps = new PairList<Scene, SceneSequence>();
	}
	
}