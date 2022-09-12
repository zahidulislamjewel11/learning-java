package com.zahid.methodoverriding;

class ABC {
	void def() { // overridden method
		System.out.println("In class ABC");
	}
}

class DEF extends ABC {
	void def() { // overriding method
		System.out.println("In class DEF");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		ABC obj1 = new ABC();
		DEF obj2 = new DEF();
		ABC obj3 = new DEF();
		obj1.def();
		obj2.def();
		obj3.def();
	}

}
