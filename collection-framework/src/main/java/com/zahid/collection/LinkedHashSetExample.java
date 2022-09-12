package com.zahid.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>(); // keeps insertion order
        names.add("Alex");
        names.add("Lee");
        names.add("Cooper");
        names.add("John");
        names.add("Doe");
        names.add("Jane");
        names.add("David");
        names.add("Attenborough");

        System.out.println(names);
    }
}
