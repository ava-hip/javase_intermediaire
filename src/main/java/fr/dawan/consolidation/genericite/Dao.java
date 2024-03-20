package fr.dawan.consolidation.genericite;

import java.util.List;

public interface Dao<T extends BaseDb & Comparable<T>> {
    List<T> getAll();
    void insert(T elm);

    //update, delete ...
}