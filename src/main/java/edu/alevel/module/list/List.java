package edu.alevel.module.list;

public interface List<E> {
    void add (E value);
    void add(int index, E value);
    boolean remove();
    boolean remove(int index);
    boolean update(int index);
    int length();
    int get(int index);
    void sort();
    void reverse();
}
