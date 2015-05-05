package domain;

import utils.*;

public class ScriptTopicRelationship {

	private Relation<ScriptTopic> relation;
	
	public ScriptTopicRelationship(ScriptTopic dependent) {
		this.relation = new Relation<ScriptTopic>(dependent);
	}
	
}