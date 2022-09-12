package com.zahid.stringbuffer;

public class StringBufferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch = "Hello West";
		ch.concat(" World");
		System.out.println(ch);
		System.out.println();
		
		String ch_new = new String();
		ch_new = ch.concat(" World");
		System.out.println(ch_new);
		System.out.println();
		
		String c = new String("Object Oriented");
		c.concat(" Programming");
		System.out.println(c);
		System.out.println(c.concat(" Programming"));
		System.out.println();
		
		StringBuffer s = new StringBuffer("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
	}

}
