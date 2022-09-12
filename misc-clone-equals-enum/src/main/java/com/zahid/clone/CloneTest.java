package com.zahid.clone;

import com.zahid.clone.person.Person;

public class CloneTest {
    public static void main(String[] args) {
        Person p1 = new Person("James", "Gosling");

        System.out.println(p1.getFullName());
    
        Person p2 = p1;
        
        System.out.println("# p1 vs p2");
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        p1.changeName("Guido", "Rossum");
        System.out.println();
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        Person p3 = new Person("Dennis", "Ritchie");
        System.out.println();

        try {
            Person p4 = (Person) p3.clone();

            System.out.println("# p3 vs p4");
            System.out.println(p3);
            System.out.println(p4);

            System.out.println(p3.hashCode());
            System.out.println(p4.hashCode());

            System.out.println(p3 == p4);
            System.out.println(p3.equals(p4));

            p3.changeName("Bjarne", "Stroustrup");
            System.out.println();

            System.out.println(p3);
            System.out.println(p4);

            System.out.println(p3.hashCode());
            System.out.println(p4.hashCode());

            System.out.println(p3 == p4);
            System.out.println(p3.equals(p4));

            
        } catch (CloneNotSupportedException e) {

            System.out.println(e.getMessage());
        }

    }
}
