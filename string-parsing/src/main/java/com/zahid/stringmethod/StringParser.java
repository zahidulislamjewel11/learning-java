package com.zahid.stringmethod;

public class StringParser {

	public static void main(String[] args) {
		
		String s = "102";
		System.out.println(s+8);
		System.out.println(Integer.parseInt(s)+8);
		System.out.println(Integer.toString(4)+9);
		
		String t = "age: 47";
//		t = t.replaceAll("\\d+", "");
		t = t.replaceAll("\\D+", "");
		System.out.println(t);
		System.out.println(Integer.parseInt(t)+3);
		
	}
}
