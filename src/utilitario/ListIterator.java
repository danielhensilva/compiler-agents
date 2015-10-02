package utils;

import java.util.*;

public class ListIterator<T> implements Iterator<T> {

    private Iterator<T> iterator;

    public ListIterator(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    public T next() {
        return this.iterator.next();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}