package com.zahid.mainmethod;

public class MainTest {

	public static void main(String[] args) {
		System.out.println(args);
//		greet();
		greet("Zahid");
	}
	
	public static void greet(String name)
	{
		System.out.println("Hello "+ name +", welcome to Java");
	}
}
