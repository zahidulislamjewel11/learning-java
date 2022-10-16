package com.zahid.array2d;

public class ArrayMatrix {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr = {
				{4, 9, 2},
				{3, 5, 7},
				{8, 1, 6},
		};
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] A = new int[2][2];
		A[0][0] = 4;
		A[0][1] = 9;
		A[1][0] = 2;
		A[1][1] = 3;
		
		for(int i = 0; i < A.length; i++)
		{
			for(int j = 0; j < A[i].length; j++)
			{
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
