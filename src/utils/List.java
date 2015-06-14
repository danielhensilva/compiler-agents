package utils;

import java.util.ArrayList;

public class List<T> {
	
	private ArrayList<T> array;
	
	public List() {
		this.array = new ArrayList<T>();
	}
	
	public synchronized List<T> add(T element) {
		this.array.add(element);
		return this;
	}

	public T[] get() {
		return (T[])this.array.toArray();
	}
	
}