package com.zahid.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListConversion {
    public static void main(String[] args) {

        // primitive list i.e. array
        int[] nums = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        // Integer[] nums = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        for(int num: nums) {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        // wrapper class
        // List<Integer> numList = Arrays.asList(4, 9, 2, 3, 5);
        // System.out.println(numList);

        // List<Integer> numList = Arrays.asList(nums); // does not work
        // System.out.println(numList);

        List<Integer> numList = new ArrayList<>();
        for(int num: nums) {
            numList.add(num);
        }
        System.out.println(numList);

        // more sophisticated way using stream and collectors
        List<Integer> newNumberList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println(newNumberList);
    }
}
