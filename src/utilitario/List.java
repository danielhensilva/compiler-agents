package utilitarios;

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

    @SuppressWarnings("unchecked")
	public T get(int index) {
		return (T)this.array.get(index);
	}

    public void remove(T element) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(element)) {
                this.array.remove(i);
                return;
            }
        }
    }

    public void removeFirst() {
        this.array.remove(0);
    }

    public void removeLast() {
        this.array.remove(this.array.size() - 1);
    }

	public T getFirstItem() {
		if (this.isEmpty())
			return null;

		return this.array.get(0);
	}

	public T getLastItem() {
		if (this.isEmpty())
			return null;

		return this.array.get(this.array.size() - 1);
	}

    public <Q> Q getByType(Class<Q> target) {
        for (T item : this.array)
            if (target.isAssignableFrom(item.getClass()))
                return target.cast(item);

        return null;
    }

    public int size() {
        return this.array.size();
    }

    public boolean isEmpty() {
        if (this.array == null)
            return true;

        return this.array.isEmpty();
    }

    public String[] toStringArray() {
        return this.array.toArray(new String[this.array.size()]);
    }

}
