package com.zahid.stringmethod;

public class StringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = "ForMyScholars";
		System.out.println(c);
		System.out.println(c.length());
		
		String obj = new String("Java");
		System.out.println(obj);
		System.out.println(obj.length());
		
		char charset[] = {'H','e','l','l','o'};
		System.out.println(charset);
		
		String obj2 = new String(charset);
		System.out.println(obj2);
		System.out.println(obj2.length());
		System.out.println();
		
		String name = "Zahidul Islam Jewel";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(0, 5));
	}
}
