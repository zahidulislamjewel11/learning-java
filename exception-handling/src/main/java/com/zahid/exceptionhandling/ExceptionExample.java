package com.zahid.exceptionhandling;

import java.util.ArrayList;

public class ExceptionExample {

	public static void main(String[] args) {
		String[] pets = {"dog", "cat", "bird"};
		System.out.println(pets[0]);
//		System.out.println(pets[3]);
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.get(0);
		
//		ArrayList<String> list = null;
		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("fog");
		System.out.println(list.get(0));
	}

}
