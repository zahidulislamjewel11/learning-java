package com.zahid.constructor1;

class ABC
{
	int a;
	ABC()
	{
		a = 10;
		System.out.println("Default Constructor");
	}
	void display()
	{
		System.out.println(a);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.display();

	}

}
