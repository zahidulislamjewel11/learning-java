package com.zahid.array1d;
public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        String row;
        System.out.println("i\tarr[i]");
        for(int i = 0; i < arr.length; i++)
        {
            row = String.format("%d"+"\t\t%d", i, arr[i]);
            System.out.println(row);
        }

    }
}
