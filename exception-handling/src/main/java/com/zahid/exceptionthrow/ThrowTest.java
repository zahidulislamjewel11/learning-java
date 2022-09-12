package com.zahid.exceptionthrow;

public class ThrowTest {
	public static void main(String[] args) 
	{
		int a=10, b=20, c=10;
		try
		{
			int d = a*b;
			if(d>100)
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
//			System.out.println("Result out of range");
			System.out.println(e);
		}
		int f = b/a;
		System.out.println(+f);
	}

}
