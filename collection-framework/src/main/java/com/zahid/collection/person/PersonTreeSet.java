package com.zahid.collection.person;

import java.util.Set;
import java.util.TreeSet;

public class PersonTreeSet {
    public static void main(String[] args) {
        Person p1 = new Person("Zahid", 29);
        Person p2 = new Person("Jewel", 26);
        Person p3 = new Person("Tonmoy", 30);
        Person p4 = new Person("Hasan", 24);
        Person p5 = new Person("Robi", 21);

        Set<Person> personSet = new TreeSet<>(); // implemented by red-black-tree
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        personSet.add(p5);

        System.out.println(personSet);
    }
}
