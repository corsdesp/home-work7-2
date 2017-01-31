package com.epam.training.iterator;

import java.util.Iterator;
import java.util.List;

public class GameIterator<T> implements Iterator<T> {
    private List<T> list;
    private int number;
    private static final int WHO_REMOVE = 2;

    public GameIterator(List<T> list) {
        this.list = list;
        number = -1;
    }

    @Override
    public boolean hasNext() {
        return !isSizeZero();
    }

    @Override
    public T next() {
        if (hasNext()) {
            number = (number + WHO_REMOVE) % list.size();
            return list.get(number);
        }
        return null;
    }

    @Override
    public void remove() {
        if (!isSizeZero()) {
            list.remove(number);
            number--;
        }
    }

    private boolean isSizeZero() {
        return list.size() == 0;
    }
}
