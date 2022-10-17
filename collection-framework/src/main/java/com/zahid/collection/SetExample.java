package com.zahid.collection;

import java.util.*;
import java.util.stream.Stream;

public class SetExample {
    public static void main(String[] args) {
        // Set set = new HashSet();
        // Set set2 = new TreeSet();

        Set<String> s = new HashSet<>();

        s.add("Apple");
        s.add("Blossom");

        System.out.println(s);

        boolean added = s.add("Spring");
        boolean added_again = s.add("Spring");

        System.out.println(added);
        System.out.println(added_again);
        System.out.println();

        Set<String> s2 = Set.of("Hello", "World", "Java", "Programming");
        System.out.println(s2);

        Iterator<String> iterator = s2.iterator();
        while (iterator.hasNext()) {
            // System.out.println(iterator.next());

            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println();

        // tree set
        Set<Integer> numbers = new TreeSet<>(); // always added in sorted order (bst)
        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        
        System.out.println(numbers);

        // iterating using iterator class
        System.out.println("Using Iterator class");
        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            // System.out.println(iter.next());

            Integer num = iter.next();
            System.out.println(num);
        }
        System.out.println();

        // iterating using forEach & lambda
        System.out.println("Using forEach loop");
        numbers.forEach( n -> System.out.println(n));
        System.out.println();

        // iterating using enhanced for loop
        System.out.println("Using Enchanced for loop");
        for(Integer num:numbers) {
            System.out.println(num);
        }
        System.out.println();

        // iterating stream api
        System.out.println("Using Stream API");
        Stream<Integer> stream = numbers.stream();
        stream.forEach(element -> System.out.println(element));
        System.out.println();

        // iterating using method reference
        System.out.println("Using method reference");
        numbers.forEach(System.out::println);
        System.out.println();

        // removing set elements
        boolean removed = numbers.remove(4);
        boolean removed_again = numbers.remove(4);
        System.out.println(removed);
        System.out.println(removed_again);

        numbers.forEach(System.out::println);
        System.out.println();

        // clearing full set
        System.out.println("After clearing");
//        numbers.clear();
//        numbers.forEach(System.out::println);
        System.out.println(numbers);
        System.out.println();

        // addAll method
        numbers.addAll(Set.of(1, 8, 6, 0, 7));
        System.out.println(numbers);

        // removeAll method
        numbers.removeAll(Set.of(1, 9, 2));
        System.out.println(numbers);

        // retailAll method
        numbers.retainAll(Set.of(3, 5, 2));
        System.out.println(numbers);

        // size of a set
        int size = numbers.size();
        System.out.println(size);

        // isEmpty
        boolean isEmpty = numbers.isEmpty();
        System.out.println(isEmpty);
        System.out.println();

        // contains method
        System.out.println(numbers.contains(4));
        System.out.println(numbers.contains(5));

        // convert set to a list
        List<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        System.out.println(list);
    }
}
