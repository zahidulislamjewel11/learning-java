package com.zahid.simpleinheritance;


class Super
{
	int i, j;
	void set(int x,int y)
	{
		i=x;
		j=y;
	}
}

class Base extends Super
{
	int total;
	void sum()
	{
		total = i+j;
	}
}



public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj = new Base();
		obj.set(4, 9);
		obj.sum();
		System.out.println(obj.total);

	}

}
