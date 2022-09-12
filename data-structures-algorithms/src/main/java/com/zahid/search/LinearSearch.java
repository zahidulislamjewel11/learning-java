package com.zahid.search;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key to search> ");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i])
            {
                System.out.printf("Key found at index %s\n", i);
                System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}
