package com.zahid.stringbuffer;

public class StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("forMyScholars");
		System.out.println(s);
		char c = s.charAt(3);
		System.out.println(c);
		s.setCharAt(3, 'N');
		System.out.println(s);
		System.out.println(s.length());
		s.delete(2,7);
		System.out.println(s);
		s.deleteCharAt(2);
		System.out.println(s);
		s.append("hey");
		System.out.println(s);
		s.insert(2, "r");
		System.out.println(s);
	}
}
