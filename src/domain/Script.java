package domain;

import utils.*;

public class Script {
	
	private List<ScriptTopic> topics;
	
	private List<ScriptTopicRelation> relations;
	
	public Script() {
		this.topics = new List<ScriptTopic>();
		this.relations = new List<ScriptTopicRelation>();
	}	
	
	public void add(ScriptTopic topic) {
		this.topics.add(topic);
	}
	
	public void add(ScriptTopicRelation relation) {
		this.relations.add(relation);
	}
}