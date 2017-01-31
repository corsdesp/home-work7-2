package com.epam.training.iterator;

import java.util.List;

public class IWantToPlayOneGameWithYou<T> {
    public void startGame(List<T> list) {
        GameIterator<T> iterator = new GameIterator<>(list);
        while (list.size() > 1) {
            iterator.next();
            iterator.remove();
        }
    }
}
