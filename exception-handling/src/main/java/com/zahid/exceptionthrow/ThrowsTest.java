package com.zahid.exceptionthrow;

import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) throws ArithmeticException, IOException
	{
		int a=10, b=20, c=10;
		int d=b/(a-c);
		System.out.println(+d);
		int f=b/a;
		System.out.println(+f);
	}

}
