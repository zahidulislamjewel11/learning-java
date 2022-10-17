package com.zahid.genericlist;
public class ContainerTest {
    public static void main(String[] args) {
        Container<Integer> container = new Container<Integer>();
        container.addItem(4);
        container.addItem(9);
        container.addItem(2);

        container.printAll();

        System.out.println();
        System.out.println(container.getItem(0));
        System.out.println(container.getItem(5));
        // System.out.println(container.getItem(10)); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10

        Container<String> str = new Container<String>();
        str.addItem("Alex");
        str.addItem("Lee");
        str.addItem("Cooper");
        str.printAll();
        System.out.println();

    }
}
