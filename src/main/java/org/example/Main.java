package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyList lst = new MyArrayList();

        lst.add(5);
        lst.add(10);
        lst.add(15);
        lst.add(20);
        lst.insert(2, 2345);

        lst.print();
        System.out.println("============  ");
        System.out.println("Size: " + lst.size());
    }
}