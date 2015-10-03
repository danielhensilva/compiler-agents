package utilitarios;

public class PairList<T1, T2> {

	private List<Pair<T1, T2>> pairs;

	public PairList() {
		this.pairs = new List<Pair<T1, T2>>();
	}

	public synchronized void add(Pair<T1, T2> pair) {
		this.pairs.add(pair);
	}

	public synchronized void add(T1 left, T2 right) {
		Pair<T1, T2> pair = new Pair<T1, T2>(left, right);
		this.add(pair);
	}

	public Pair<T1, T2> getLast() {
		return this.pairs.getLastItem();
	}
}
