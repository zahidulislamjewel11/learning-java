package com.zahid.thread;

public class Driver {

	public static void main(String[] args) {
		ABC obj1 = new ABC();
		DEF obj2= new DEF();
		
		obj1.start();
		obj2.start();
	}
}
