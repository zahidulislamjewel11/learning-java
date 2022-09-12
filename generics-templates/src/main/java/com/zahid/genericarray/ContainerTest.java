package com.zahid.genericarray;

import com.zahid.genericarray.container.Container;

public class ContainerTest {

    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>();

        integerContainer.addItem(4);
        integerContainer.addItem(9);
        integerContainer.addItem(2);
        integerContainer.addItem(3);
        integerContainer.addItem(5);
        integerContainer.addItem(7);
        integerContainer.addItem(8);
        integerContainer.addItem(1);
        integerContainer.addItem(6);
        integerContainer.addItem(0);
        // integerContainer.addItem(-1);

        integerContainer.removeItem(4);
        integerContainer.removeItem(9);

        integerContainer.printAllItems();

        System.out.println();
        System.out.println(integerContainer.getLength());

        Container<String> stringContainer = new Container<>();
        stringContainer.addItem("Zahid");
        stringContainer.addItem("Jewel");
        stringContainer.addItem("Tonmoy");
        stringContainer.addItem("Hasan");
        stringContainer.addItem("Robi");

        System.out.println(stringContainer.getLength());
        stringContainer.printAllItems();

        // Container<Object> objectContainer = stringContainer; // autoboxing error
        Container<String> objectContainer = stringContainer;
        System.out.println(objectContainer);
        System.out.println(objectContainer.hashCode());

    }
}