package com.zahid.trycatch;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		
//		int[] a = {4, 9, 2, 3, 5};
//		
//		try
//		{
//			System.out.println(a[5]);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your favourtie number? ");
		try
		{
			int n = scan.nextInt();
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
