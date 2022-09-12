package com.zahid.superkeyword;

class ABC
{
	int a=100;
	ABC(int a)
	{
		this.a = a;
	}
	
	void show()
	{
		System.out.println("Parent Class(Super Class)");
	}
}

class DEF extends ABC
{
	int a=200;
	DEF(int d, int e)
	{
		super(d);
		a = e;
	}
	void show()
	{
//		a = 11;
//		super.a = 20;
//		System.out.println("Child class value of a: "+a);
//		System.out.println("Parent class value of a: "+super.a);
		System.out.println(+a);
		System.out.println(+super.a);
	}
	void message()
	{
		show();
		super.show();
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DEF obj = new DEF();
		DEF obj = new DEF(4, 9);
		obj.show();
		System.out.println();
		obj.message();
		
	}

}
