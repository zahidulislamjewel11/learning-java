package com.zahid.thiskeyword;

class ABC
{
	int i, j;
	void setData(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void display()
	{
		System.out.println(+i);
		System.out.println(+j);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.setData(4, 9);
		obj.display();
	}

}
