package com.zahid.constructor1;

class ABE
{
	int a, b, c;
	
	ABE(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	ABE(int a, int b, int c)
	{
		// this.a = a;
		// this.b = b;
		this(a, b);
		this.c = c;
	}
	
	void show()
	{
		System.out.println(+a);
		System.out.println(+b);
	}
	
	void display()
	{
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(+c);
	}
}

public class ThisConstructor {

	public static void main(String[] args) {

		ABE obj1 = new ABE(4, 9);
		obj1.show();
		System.out.println();
		
		ABE obj2 = new ABE(4, 9, 2);
		obj2.display();
	}

}
