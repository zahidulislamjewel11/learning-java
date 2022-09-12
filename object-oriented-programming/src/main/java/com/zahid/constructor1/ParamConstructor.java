package com.zahid.constructor1;

class ABCD
{
	int i;
	ABCD(int x)
	{
		i = x;
	}
	void display()
	{
		System.out.println(+i);
	}
}

public class ParamConstructor {

	public static void main(String[] args) {
		
		ABCD obj = new ABCD(4);
		obj.display();
	}

}
