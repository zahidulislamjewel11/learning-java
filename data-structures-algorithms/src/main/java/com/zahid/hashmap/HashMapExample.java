package com.zahid.hashmap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		dict.put("a", 4);
		dict.put("b", 9);
		dict.put("c", 2);
		
		System.out.println(dict);
		System.out.println(dict.get("a"));
		System.out.println(dict.get("b"));
		System.out.println(dict.get("c"));
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("Jewel81", "test123");
		fun.put("dhrubotara73", "test@123");
		fun.put("netninja", "p@ssword123");
		
		System.out.println(fun);
		System.out.println(fun.get("Jewel81"));
		
		fun.remove("netninja");
		System.out.println(fun);
		System.out.println(fun.containsKey("dhrubotara73"));
		System.out.println(fun.containsKey("netninja"));
		
		System.out.println(fun.containsValue("test@123"));
		System.out.println(fun.containsValue("test1234"));
		
		System.out.println(fun.size());
		
		fun.replace("Jewel81", "testing3210");
		System.out.println(fun);
		
		System.out.println(fun.keySet());
		System.out.println(fun.values());
	}

}
