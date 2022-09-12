package com.zahid.methodoverloading.addition;

class ABC
{
	int add(int a)
	{
		return a;
	}
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a, float b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}
}

public class AdditionTest {

	public static void main(String[] args) {
		
		ABC obj = new ABC();
		System.out.println(obj.add(4));
		System.out.println(obj.add(4, 9));
		System.out.println(obj.add(4.1, 9.2));
	}
}
