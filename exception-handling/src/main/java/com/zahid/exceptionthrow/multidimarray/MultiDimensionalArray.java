package com.zahid.exceptionthrow.multidimarray;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        int numRows = arr.length;
        int numCols = arr[0].length;

        for(int row=0;row<numRows;row++)
        {
            for(int col=0;col<numCols;col++)
            {
                arr[row][col] = row*numCols+col+1;
            }
        }

        for(int row=0;row<numRows;row++)
        {
            for(int col=0;col<numCols;col++)
            {
                System.out.printf("%3d", arr[row][col]);
            }
            System.out.println();
        }


    }
}
