package com.zahid.equals;

import com.zahid.equals.person.Person;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Zahidul", "Islam");
        Person p2 = p1;
        Person p3 = new Person(p1);
        Person p4 = (Person) p1.clone();

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1 == p4);
        System.out.println();

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
    }
}
