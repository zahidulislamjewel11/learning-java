package com.zahid.interfaceimpl.misc;

// interface is basically an outline for a class
interface Greet {
	public static final String name = "";
	void greet();
}

class Welcome implements Greet {

	@Override
	public void greet() {
		System.out.println("Hello there, welcome");
	}
	
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		Welcome wc = new Welcome();
		wc.greet();
	}

}
