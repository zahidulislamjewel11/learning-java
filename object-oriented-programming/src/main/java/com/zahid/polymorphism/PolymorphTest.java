package com.zahid.polymorphism;

// method overloading

class Poly
{
	void add()
	{
		System.out.println("no parameters");
	}
	void add(int x)
	{
		System.out.println("parameterized "+x);
	}
	void add(int x, int y)
	{
		System.out.println("two parameters "+x+" and "+y);
	}
}

public class PolymorphTest {

	public static void main(String[] args) {
		Poly obj = new Poly();
		obj.add();
		obj.add(4);
		obj.add(4, 9);

	}

}
