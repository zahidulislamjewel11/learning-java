package com.zahid.staticvariable;

class ABC
{
	int a = 10;
	static int b = 5;
	void show()
	{
		a = a + 10;
		b = b + 10;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class StaticTest {

	public static void main(String[] args) {
		System.out.println("initially \nb = " + ABC.b);
		System.out.println();

		ABC obj1 = new ABC();
		obj1.show();
		System.out.println();

		ABC obj2 = new ABC();
		obj2.show();
		System.out.println();

		ABC obj3 = new ABC();
		obj3.show();
	}

}
