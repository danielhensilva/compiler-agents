package domain;

public class Script {
	
	
	
}

class ScriptTopic {
	
	private int id;

	private int parentId;
	
	private String title;
	
	private String body;
	
	public ScriptTopic(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
	
	public ScriptTopic(int id, int parentId, String title, String body) {
		this.id = id;
		this.parentId = parentId;
		this.title = title;
		this.body = body;
	}
	
}