package com.zahid.nullptrexception;

import java.util.ArrayList;
import java.util.List;

import com.zahid.nullptrexception.person.Person;

/**
 * Main
 */
public class NullPointerExceptionTest2 {
    public static void main(String[] args) {
        
        Person p1 = new Person("Zahid", 28);
        Person p2 = new Person("Jewel", 29);
        Person p3 = new Person("Tonmoy", 24);

        List<Person> personList = new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        System.out.println(personList);
        for(Person person: personList) {
            System.out.println(person);
        }

        Person p4 = new Person("Robi", 25);

        testNullPointerException(p1);
        testNullPointerException(p2);
        testNullPointerException(p3);
        testNullPointerException(p4);

    }

    private static void testNullPointerException(Person p) throws NullPointerException {

        p = null;

        if(p == null) {
            throw new NullPointerException("Person reference does not point to any object.");
        } 
    }
    
}