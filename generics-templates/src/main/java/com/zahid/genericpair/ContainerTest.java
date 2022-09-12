package com.zahid.genericpair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ContainerTest {
    public static void main(String[] args) {
        //    EXAMPLE - 1
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hello");
        // myList.add(100); // not okay
        // myList.add(false); // not okay

        String  myval = (String) myList.get(0);
        //    String  myva2 = (String) myList.get(1); // IndexOutOfBoundsException
        System.out.println(myval);

        //    EXAMPLE - 2
        Container<Integer, String > container = new Container<>(12, "Hello");
        container.printItems();
        int myvar = container.getItem1(); // not okay
        //    String myvar1 = (String) container.getItem1(); // not okay
        int myvar2 = (Integer) container.getItem1(); // okay

        int myvar3 = container.getItem1();
        String myvar4 = container.getItem2();

        System.out.println(myvar);
        System.out.println(myvar2);
        System.out.println(myvar3);
        System.out.println(myvar4);
        System.out.println();
        container.printItems();

        Container<Double, Integer> container2 = new Container<>(12.5, 300);
        System.out.println(container2.toString());
        System.out.println();

        // EXAMPLE - 3
        Set<String> mySet1 = new HashSet<>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");

        Set<String> mySet2 = new HashSet<>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("fourth");

        Set<String> resultSet = union(mySet1, mySet2);
        System.out.println(resultSet);

        Iterator<String> iter = resultSet.iterator();

        while(iter.hasNext())
        {
            String var = iter.next();
            System.out.println(var);
            System.out.println(iter.next());
        }

        System.out.println();
        for (String s : resultSet) {
            System.out.println(s);
        }

    }


    public static <E> Set<E> union(Set<E> s1, Set<E> s2)
    {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);

        return result;
    }
}
