package org.example;

public class SinglyLinkedList implements MyList{

    private Node head;
    private int size;
    private class Node{
        Object data;
        Node next;

        public Node(Object data){
            this.data = data;
            next = null;
        }
    }
    public SinglyLinkedList(){
        head = null;
        size = 0;
    }

    @Override
    public void add(Object obj) {
        Node newNode = new Node(obj);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(Object obj) {
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data.equals(obj)){
                if(prev == null){
                    head = temp.next;
                }else{
                    prev.next = temp.next;
                }
                size--;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
        }else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index >= size){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean insert(int index, Object obj) {
        if(index < 0 || index > size){
            return false;
        }
        Node newNode = new Node(obj);
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean search(Object obj) {
        Node temp = head;
        while(temp != null){
            if(temp.data.equals(obj)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((Comparable) get(i)).compareTo(get(j)) > 0) {
                    Object temp = get(i);
                    Node tempNode = head;
                    for(int k = 0; k < i; k++){
                        tempNode = tempNode.next;
                    }
                    tempNode.data = get(j);
                    Node tempNode2 = head;
                    for(int k = 0; k < j; k++){
                        tempNode2 = tempNode2.next;
                    }
                    tempNode2.data = temp;
                }
            }
        }
    }


}
