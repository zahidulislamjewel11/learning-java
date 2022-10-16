package com.zahid.array2d;
public class ArrayForEach {
    public static void main(String[] args) {
        int arr[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};

       for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println();

        for (int[] x:arr) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.print("\n");
        }
        System.out.println();

        System.out.println("# Jagged Array (Adjacency List)");
        int[][] matrix = {
            {2,3,5,7},
            {11,13,17,19},
            {23,29},
            {31,37,39},
            {41,43,47}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] row: matrix) {
            for (int element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
