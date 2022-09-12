package com.zahid.collection;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// import lombok.Cleanup;
/**
 * ArrayListDemo
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(9);
        numList.add(2);
        numList.add(3);
        numList.add(5);
        System.out.println(numList);
        System.out.println(numList.size());
        System.out.println(numList.isEmpty());
        System.out.println(numList.get(0));
        // System.out.println(numList.get(5));

        // try {     
        //     System.out.println(numList.get(5));
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        
        numList.addAll(Arrays.asList(7, 8, 1, 6, 0));
        System.out.println(numList);
        int[] primeNumbers = {11, 13, 17, 19};
        List<Integer> primeList = Arrays.stream(primeNumbers).boxed().collect(Collectors.toList());
        numList.addAll(primeList);
        System.out.println(numList);
        System.out.println(numList.size());

    }
}