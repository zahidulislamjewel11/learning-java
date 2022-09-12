package com.zahid.exceptionfinally;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
//		int a=5;
//		int b=0;
//		try
//		{
//			int c=a/b;
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		finally
//		{
//			System.out.println("finally in finally block");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string> ");
		try
		{
			System.out.println(scan.next());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			scan.close();
			System.out.println("Scanner closed");
		}
	}
}
