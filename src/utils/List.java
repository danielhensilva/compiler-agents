package utils;

import java.util.*;

public class List<T> implements Iterable<T> {

	private ArrayList<T> array;

	public List() {
		this.array = new ArrayList<T>();
	}

	public synchronized List<T> add(T element) {
		this.array.add(element);
		return this;
	}

    public Iterator<T> iterator() {
        Iterator<T> iterator = this.array.iterator();
        return new ListIterator<T>(iterator);
    }

    @SuppressWarnings("unchecked")
	public T[] get() {
		return (T[])this.array.toArray();
	}

    public void remove(T element) {
        for (T e : this.array)
            if (e.equals(element))
                this.array.remove(e);
    }

	public T getFirstItem() {
		if (this.array.isEmpty())
			return null;

		return this.array.get(0);
	}

	public T getLastItem() {
		if (this.array.isEmpty())
			return null;

		return this.array.get(this.array.size() - 1);
	}

    public String[] toStringArray() {
        return this.array.toArray(new String[this.array.size()]);
    }

}
