package com.zahid.second;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0, 11, 13, 17, 19, -3, 29, 23};
        int maxima1 = Integer.MIN_VALUE+1;
        int maxima2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxima1 && arr[i]>maxima2)
            {
                maxima2 = maxima1;
                maxima1 = arr[i];
            }
            else if(arr[i]<maxima1 && arr[i]>maxima2)
            {
                maxima2 = arr[i];
            }
        }


        System.out.printf("Largest = %d\n", maxima1);
        System.out.printf("Second Largest = %d\n", maxima2);
    }
}
