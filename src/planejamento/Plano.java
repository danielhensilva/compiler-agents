package planner;

import utils.*;

public abstract class Plan {

	private List<Action> actions;

	public Plan() {
		actions = new List<>();
	}

	protected void addAction(Action action) {
		this.actions.add(action);
	}

	public List<Action> getActions() {
		return this.actions;
	}

	public abstract boolean isApplicable(BeliefSet beliefSet);

	public void execute(Blackboard blackboard) {
		if (this.actions == null)
			return;

		for (Action action : this.actions)
			action.execute(blackboard);
	}

}


public Objetivo[] obterObjetivosFactíveis(Crenças[] c) {
	ArrayList<Objetivo> resultados = new ArrayList<>();

	if (this.objetivos != null)
		for (Objetivo o : this.objetivos)
			if (o.estadoAtual(c))
				resultados.add(o);

	return resultados.toArray();
}
