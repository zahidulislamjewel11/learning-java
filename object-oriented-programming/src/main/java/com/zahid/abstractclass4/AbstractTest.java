package com.zahid.abstractclass4;

public class AbstractTest {

	public static void main(String[] args) {

		// Dog d = new Dog(); // abstract class cannot be instantiated
		Alex d = new Alex(); // extended class can be instantiated
		d.bark();
		System.out.println(d.breed);
		d.run();
	}

}
