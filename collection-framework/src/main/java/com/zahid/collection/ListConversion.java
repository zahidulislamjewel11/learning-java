package com.zahid.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.common.primitives.Ints;

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
        List<Integer> numList1 = Arrays.asList(4, 9, 2, 3, 5);
        System.out.println(numList1);

        // List<Integer> numList2 = Arrays.asList(nums); // does not work
        // System.out.println(numList2);

        List<Integer> numList3 = new ArrayList<>();
        for(int num: nums) {
            numList3.add(num);
        }
        System.out.println(numList3);

        // more sophisticated way using stream and collectors
        List<Integer> newNumberList1 = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println(newNumberList1);

        List<Integer> newNumberList2 = IntStream.of(nums).boxed().collect(Collectors.toList());
        System.out.println(newNumberList2);

        List<Integer> newNumberList3 = Ints.asList(nums);
        System.out.println(newNumberList3);
    }
}
