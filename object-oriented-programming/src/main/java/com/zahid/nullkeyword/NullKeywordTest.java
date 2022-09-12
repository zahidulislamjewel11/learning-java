package com.zahid.nullkeyword;

import java.util.ArrayList;

public class NullKeywordTest {

	public static void main(String[] args) {
		String s = "Hi, there";
		int x = 4;
		float f = 7.1f;
		System.out.println(s);
		System.out.println(x);
		System.out.println(f);
		
		String p = null;
		ArrayList q = null;

		if(p==null)
		{
			System.out.println("p is null");
		}
		
		if(p.equals(null)) //NullPointerException
		{
			System.out.println("p equals to null");
		}
		if(q.isEmpty()) //NullPointerException, null object cannot use methods
		{
			System.out.println("q is empty");
		}
	}

}
