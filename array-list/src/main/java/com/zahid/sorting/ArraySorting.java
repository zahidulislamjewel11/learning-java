package com.zahid.sorting;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};

        Arrays.sort(arr);
        for(int x:arr)
            System.out.printf("%d ", x);
    }
}
