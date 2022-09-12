package com.zahid.finalkeyword;

class ABC
{
//	final int a=10; // instance variable
//	final int a; // instance variable
//	int a;
//	static int a=10; // class variable
//	final static int a=10; // class variable
	final static int a; // class variable
	static
	{
		a = 13;
	}

	/*
	ABC()
	{
		a = 15;
	}
	 */

	/*
	void show()
	{
		final int b=20; // local variable
		int c=b+10;
		System.out.println(+b);
		System.out.println(+c);
		System.out.println(+a);
	}
	 */
	
	/*
	void display(final int d)
	{
		a = d;
		System.out.println(+a);
	}
	 */
	
	void display()
	{
		System.out.println(+a);
	}
}

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj = new ABC();
//		obj.show();
//		obj.display(9);
		obj.display();
	}

}
