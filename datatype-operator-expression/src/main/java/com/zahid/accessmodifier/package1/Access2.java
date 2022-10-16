package com.zahid.accessmodifier.package1;

public class Access2 {

	public static void main(String[] args) {

		Access1 a1 = new Access1();
		System.out.println(a1.hours);
		System.out.println(a1.minutes);
		System.out.println(a1.getHours());
	}

}
