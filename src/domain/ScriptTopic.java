package domain;

public class ScriptTopic {
	
	private int id;
	
	private String title;
	
	private String body;
	
	private ScriptTopicRelationship relationship;
	
	public ScriptTopic(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
		this.relationship = new ScriptTopicRelationship(this);
	}
	
}