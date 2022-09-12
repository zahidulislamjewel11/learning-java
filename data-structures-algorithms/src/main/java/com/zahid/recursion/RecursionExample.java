package com.zahid.recursion;

public class RecursionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sayHi();
		sayHi(5);
	}
	
//	public static void sayHi()
//	{
//		System.out.println("Hi");
//		sayHi();
//	}
	
	public static void sayHi(int n)
	{
		if(n==0)
		{
			System.out.println("Done");
		}
		else
		{
//			System.out.println("Hi");
			sayHi(n-1);
			System.out.println("Hi");

		}
	}
}
