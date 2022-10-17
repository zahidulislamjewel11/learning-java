package com.zahid.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");
        myList.add("Object 4");
        myList.add("Object 5");

        System.out.println(myList);

        myList.remove(2);

        System.out.println(myList);

        // Object obj = myList.get(1);
        Object obj = (String) myList.get(1);

        System.out.println(obj);

        int size = myList.size();

        System.out.println(size);

        // iterating a list - using iterator

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            // System.out.println(it.next());

            Object next = it.next();
            System.out.println(next);
        }
        System.out.println();

        // iterating using for each loop
        for(Object element:myList){
            System.out.println(element);
        }
        System.out.println();

        // iterating using for loop
        for(int i=0; i < myList.size(); i++) {
            Object next = myList.get(i);
            System.out.println(next);
        }
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);

        // generic list
        List<String> newList = new ArrayList<>();
        newList.add("Alex");
        newList.add("Lee");
        newList.add("Cooper");

        String myString = newList.get(0);
        System.out.println(myString);
        System.out.println();

        Iterator<String> iter = newList.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            System.out.println(next);
        }
        System.out.println();

        // iterating using for each loop
        for(String ele:newList){
            System.out.println(ele);
        }
        System.out.println();
    }
}
