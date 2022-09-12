package com.zahid.interfaceimpl.misc;

interface P
{
	int a=200; // by default constant
	void display(); // by default abstract
}

interface Q
{
	void show(); // by default abstract
}

class ABC implements P, Q 
{
	public void display()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Hi, there");
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.display();
		obj.show();
		System.out.println(obj.a);
	}

}
