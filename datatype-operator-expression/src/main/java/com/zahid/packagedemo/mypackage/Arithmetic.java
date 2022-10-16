package com.zahid.packagedemo.mypackage;

public class Arithmetic {
	public float pi = 3.14159f;
	public float exp = 2.71828f;
	
	public void add(float x, float y)
	{
		System.out.println(x+y);
	}
	public void sub(float x, float y)
	{
		System.out.println(x-y);
	}
	public void mul(float x, float y)
	{
		System.out.println(x*y);
	}
	public void div(float x, float y)
	{
		if(y != 0)
		{
			System.out.println(x/y);
		}
		else
		{
			System.out.println("Cannot divide by zero");
		}
	}
}
