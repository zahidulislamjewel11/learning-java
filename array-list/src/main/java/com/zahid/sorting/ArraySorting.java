package com.zahid.sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.common.primitives.Ints;

public class ArraySorting {
    private static final int List = 0;

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};

        Arrays.sort(arr);
        // for(int x:arr) {
        //     System.out.printf("%d ", x);
        // }
        // System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] primes = {97, 23, 47, 2, 49, 71, 29, 73};
        // List<Integer> primeList = Arrays.stream(primes).boxed().collect(Collectors.toList());
        List<Integer> primeList = IntStream.of(primes).boxed().collect(Collectors.toList());
        System.out.println(primeList);
        Collections.sort(primeList);
        System.out.println(primeList);
        System.out.println();

        int[] nums = {1, 2, 1, 3, 2, 1, 3, 3, 4, 1, 5, 1, 2, 3, 2, 1};
        List<Integer> numList = Ints.asList(nums);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);
        System.out.println();
    }
}
