package com.zahid.second;

public class SecondLargest {
    public static void main(String[] args) {
        // int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0, 11, 13, 17, 19, -3, 29, 23};
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0, 11, 13, 17, 19, -3, 29, 23, 29};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest && arr[i] > secondLargest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }

        System.out.printf("Largest = %d\n", largest);
        System.out.printf("Second Largest = %d\n", secondLargest);
    }
}
