package com.zahid.exceptionhandling;
// package exception_handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10, b=20, c=10;
		try
		{
			int d = b/(a-c);
		}
		catch(ArithmeticException e)
		{
//			System.out.println("Division by zero error");
			System.out.println(e);
		}
		int f = b/a;
		System.out.println(+f);
	}

}
