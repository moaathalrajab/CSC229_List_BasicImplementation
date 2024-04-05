package org.example;

public class MyArrayList implements  MyList{

    private Object[] list;
    private int size;
    private int capacity;

    public MyArrayList(){
        capacity = 10;
        list = new Object[capacity];
        size = 0;
    }

    public MyArrayList(int capacity){
        this.capacity = capacity;
        list = new Object[capacity];
        size = 0;
    }

    @Override
    public void add(Object obj) {
        if(size == capacity){
            capacity *= 2;
            Object[] temp = new Object[capacity];
            for(int i = 0; i < size; i++){
                temp[i] = list[i];
            }
            list = temp;
        }
        list[size] = obj;
        size++;
    }

    @Override
    public void remove(Object obj) {
        for(int i = 0; i < size; i++){
            if(list[i].equals(obj)){
                for(int j = i; j < size - 1; j++){
                    list[j] = list[j + 1];
                }
                size--;
                break;
            }
        }
    }

    @Override
    public void remove(int index) {
        for(int i = index; i < size - 1; i++){
            list[i] = list[i + 1];
        }
        size--;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean insert(int index, Object obj) {
        if(index < 0 || index >= size){
            return false;
        }
        if(size == capacity){
            capacity *= 2;
            Object[] temp = new Object[capacity];
            for(int i = 0; i < size; i++){
                temp[i] = list[i];
            }
            list = temp;
        }
        for(int i = size; i > index; i--){
            list[i] = list[i - 1];
        }
        list[index] = obj;
        size++;
        return true;
    }

    @Override
    public boolean search(Object obj) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((Comparable) list[i]).compareTo(list[j]) > 0) {
                    Object temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}
