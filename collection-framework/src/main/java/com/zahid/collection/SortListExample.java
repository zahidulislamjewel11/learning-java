package com.zahid.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListExample {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(9);
        numList.add(2);
        numList.add(3);
        numList.add(5);
        numList.add(7);
        numList.add(8);
        numList.add(1);
        numList.add(6);
        numList.add(0);

        System.out.println(numList);

        Collections.sort(numList);
        System.out.println(numList);
        
        Collections.shuffle(numList);
        System.out.println(numList);
        
        // Integer[] numbers = (Integer[]) numList.toArray(); // java.lang.ClassCastException
        // Integer[] numbers = numList.toArray(new Integer[0]); // okay
        Integer[] numbers = numList.stream().toArray(i -> new Integer[i]); // better

        Arrays.sort(numbers); // Arrays.sort() can only sort primitive/ref list
        System.out.println(Arrays.toString(numbers));
    }
}
