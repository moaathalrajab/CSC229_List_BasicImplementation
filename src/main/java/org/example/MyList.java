package org.example;

public interface MyList {

    public void add(Object obj);
    public void remove(Object obj);
    public void remove(int index);
    public Object get(int index);
    public int size();
    public void clear();
    public boolean  insert(int index, Object obj);
    boolean search(Object obj);
    public void sort();
    public void print();
}
