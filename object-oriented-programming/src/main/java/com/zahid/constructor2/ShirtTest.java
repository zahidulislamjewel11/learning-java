package com.zahid.constructor2;

public class ShirtTest {

	public static void main(String[] args) {
//		Shirt s = new Shirt();
//		s.putOn();
//		s.takeOff();
//		s.setColor("Red");
//		s.setSize('M');
//		System.out.println(s.getColor()+" "+s.getSize());
		
		Shirt s2 = new Shirt("White", 'L');
		s2.putOn();
		s2.takeOff();
		System.out.println(s2.getColor()+" "+s2.getSize());
	}

}
