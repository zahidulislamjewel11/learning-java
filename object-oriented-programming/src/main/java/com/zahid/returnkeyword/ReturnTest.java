package com.zahid.returnkeyword;

import java.util.Scanner;

public class ReturnTest {

	public static void main(String[] args) {
//		String name;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Enter your name> ");
//		name = scan.nextLine();
//		System.out.println(caps(name));
		
		int[] awesomeArray = arrayFromInt(4, 9, 2);
//		System.out.println(awesomeArray);
		for(int i=0;i<awesomeArray.length;i++)
		{
			System.out.print(awesomeArray[i]+" ");
		}
	}
	public static String caps(String s)
	{
		return s.toUpperCase();
	}
	public static int[] arrayFromInt(int a,int b,int c)
	{
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		
		return array;
	}

}
