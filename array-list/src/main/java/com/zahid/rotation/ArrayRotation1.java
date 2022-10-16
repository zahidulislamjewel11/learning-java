package com.zahid.rotation;
public class ArrayRotation1 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void leftRotate(int[] arr) {
        int n = arr.length;
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = arr[(i+1) % n];
        }
        System.out.println("Left Rotation:");
        printArray(t);
    }

    public static void rightRotate(int[] arr) {
        int n = arr.length;
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            t[(i+1) % n] = arr[i];
        }
        System.out.println("Right Rotation:");
        printArray(t);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        printArray(arr);
        leftRotate(arr);
        rightRotate(arr);
    }
}
