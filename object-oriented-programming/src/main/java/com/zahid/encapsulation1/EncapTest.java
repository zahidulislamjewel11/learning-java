package com.zahid.encapsulation1;

class Encap
{
	int a;
	double b;
	
	public void setA(int x)
	{
		a = x;
	}
	public int getA()
	{
		return a;
	}
}

public class EncapTest {

	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.a = 4;
		obj.b = 9.2;
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}

}
