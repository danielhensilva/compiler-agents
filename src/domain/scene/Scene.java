package domain.scene;

public class Scene {

	private Objective objective;

	public Objective getObjective() {
		return this.objective;
	}

	public void setObjective(Objective objective) {
		this.objective = objective;
	}


	private Conflict conflict;

	public Conflict getConflict() {
		return this.conflict;
	}

	public void setConflict(Conflict conflict) {
		this.conflict = conflict;
	}


	private Catastrophe catastrophe;

	public Catastrophe getCatastrophe() {
		return this.catastrophe;
	}

	public void setCatastrophe(Catastrophe catastrophe) {
		this.catastrophe = catastrophe;
	}

}
