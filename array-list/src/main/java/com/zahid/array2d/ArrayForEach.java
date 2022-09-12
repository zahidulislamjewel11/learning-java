package com.zahid.array2d;
public class ArrayForEach {
    public static void main(String[] args) {
        int arr[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};

/*        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }*/

        for (int[] x:arr) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.print("\n");
        }
    }
}
