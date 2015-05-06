package domain;

import utils.*;

public class ScriptTopicRelation {

	private Relation<ScriptTopic> relation;
	
	public ScriptTopicRelation(ScriptTopic dependent) {
		this.relation = new Relation<ScriptTopic>(dependent);
	}
	
	public void addDependency(ScriptTopic dependency) {
		this.relation.add(dependency);
	}
}