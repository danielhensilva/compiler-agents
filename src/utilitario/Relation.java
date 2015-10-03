package utilitarios;

public class Relation<T> {
	
	private T dependent;
	
	private List<T> dependencies;
	
	public Relation(T dependent) {
		this.dependent = dependent;
		this.dependencies = new List<T>();
	}
	
	public Relation(T dependent, List<T> dependencies) {
		this.dependent = dependent;
		this.dependencies = dependencies;
	}
	
	public void add(T dependency) {
		this.dependencies.add(dependency);
	}
}