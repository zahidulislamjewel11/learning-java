package com.zahid.rotation;
public class ArrayRotation {

    public static void print_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void left_rotate(int[] arr) {
        int n = arr.length;
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = arr[(i+1) % n];
        }
        System.out.println("Left Rotation:");
        print_array(t);
    }


    public static void right_rotate(int[] arr) {
        int n = arr.length;
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            t[(i+1) % n] = arr[i];
        }
        System.out.println("Right Rotation:");
        print_array(t);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        print_array(arr);
        left_rotate(arr);
        right_rotate(arr);
    }
}
