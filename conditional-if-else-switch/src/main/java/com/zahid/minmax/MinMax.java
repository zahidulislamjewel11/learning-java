package com.zahid.minmax;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        int maxima = Integer.MIN_VALUE;

/*        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxima)
            {
                maxima = arr[i];
            }
        }*/

        for (int j : arr) {
            if (j > maxima) {
                maxima = j;
            }
        }
        System.out.printf("Largest = %d\n", maxima);
    }
}
