package com.zahid.finalkeyword;

public class Final {
	
	final int MAX = 5;
	final int MIN = 0;
	static final double PI = 3.14159;
	
	final public void sayHi() 
	{
		System.out.println("Hi, there");
	}

	final public static void main(String[] args) {
		Final f = new Final();
		System.out.println(f.MAX);
		System.out.println(f.MIN);
		System.out.println(Final.PI);
		f.sayHi();
	}
}

//# # final variables cannot be changed
//# # final method cannot be overridden
//# # final class cannot be inherited(extended)
