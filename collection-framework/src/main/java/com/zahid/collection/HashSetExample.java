package com.zahid.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        // Set<String> cities = new TreeSet<>(); // sorted lexicographically by default

        cities.add("Dhaka");
        cities.add("Istanbul");
        cities.add("Prague");
        cities.add("Helsinki");
        cities.add("Delhi");
        cities.add("Hongkong");
        cities.add("Manilla");
        cities.add("Kolkata");
        cities.add("Dhaka");

        System.out.println(cities);
        System.out.println(cities.size());
    }
}
