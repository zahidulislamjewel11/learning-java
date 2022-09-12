package com.zahid.multipleinheritance;

class ABC
{
	void show()
	{
		System.out.println("Hello");
	}
}

interface DEF
{
	int a=100;
	void display();
}

class XYZ extends ABC implements DEF
{
	public void display()
	{
		System.out.println("Hi, there..");
	}
}


public class InheritanceTest {

	public static void main(String[] args) {
		
		XYZ obj = new XYZ();
		obj.show();
		obj.display();
		System.out.println(DEF.a);
	}
}
