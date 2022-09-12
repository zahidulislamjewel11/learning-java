package com.zahid.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        nameList.add("Zahid");
        nameList.add("Jewel");
        nameList.add("Robi");
        nameList.add("Tonmoy");
        nameList.add("Hasan");

        System.out.println(nameList.size());
        System.out.println(nameList.isEmpty());
        System.out.println(nameList);

        for(String name: nameList) {
            System.out.println(name);
        }
    }
}
