package com.zahid.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(); // always sorted

        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        numbers.add(0);

        System.out.println(numbers);
    }
}
