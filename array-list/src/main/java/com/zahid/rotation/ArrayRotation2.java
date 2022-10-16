package com.zahid.rotation;
public class ArrayRotation2 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void leftRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        int lastIndex = 0;
        
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
            lastIndex = i;
        }
        arr[lastIndex+1] = temp;
    }

    public static void rightRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n-1];
        int firstIndex = n-1;
        for (int i = n-1; i >0; i--) {
            arr[i] = arr[i-1];
            firstIndex = i;
        }
        arr[firstIndex-1] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        printArray(arr);
        
        System.out.println("Left Rotation:");
        leftRotate(arr);
        printArray(arr);
        
        System.out.println("Right Rotation:");
        rightRotate(arr);
        printArray(arr);
    }
}
