package com.zahid.collection.person;

import java.util.PriorityQueue;
import java.util.Queue;

public class PersonPriorityQueue {
    public static void main(String[] args) {
        Queue<Person> personQueue = new PriorityQueue<>();
        personQueue.offer(new Person("Zahid", 19));
        personQueue.offer(new Person("Jewel", 29));
        personQueue.offer(new Person("Robi", 31));
        personQueue.offer(new Person("Tonmoy", 25));
        personQueue.offer(new Person("Hasan", 32));

        System.out.println(personQueue);

        for(Person person: personQueue) {
            System.out.println(person);
        }
    }
}
