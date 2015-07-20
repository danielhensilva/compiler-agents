package domain.sequence;

public class Sequence {

	private Reaction reaction;

	public Reaction getReaction() {
		return this.reaction;
	}

	public void setReaction(Reaction reaction) {
		this.reaction = reaction;
	}


	private Dilemma dilemma;

	public Dilemma getDilemma() {
		return this.dilemma;
	}

	public void setDilemma(Dilemma dilemma) {
		this.dilemma = dilemma;
	}


	private Decision decision;

	public Decision getDecision() {
		return this.decision;
	}

	public void setDecision(Decision decision) {
		this.decision = decision;
	}

}
