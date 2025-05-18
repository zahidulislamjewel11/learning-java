package com.zahid.runnable;

public class Driver {

	public static void main(String[] args) {
		ABC obj1 = new ABC();
		DEF obj2 = new DEF();
		
		Thread s = new Thread(obj1);
		Thread t = new Thread(obj2);
		s.start();
		t.start();
	}
}
