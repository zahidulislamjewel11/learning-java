package com.zahid.array1d;

import java.util.ArrayList;

public class ArrayExample3 {

	public static void main(String[] args) {
		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		
		for(int i = 0; i < fruits.length; i++)
		{
			System.out.println(fruits[i]);
		}
		System.out.println();
		
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Banana");
		
		for(int i=0; i<fruitList.size(); i++)
		{
			System.out.println(fruitList.get(i));
		}
		System.out.println(fruitList.size());
		System.out.println(fruitList);
		System.out.println(fruitList.contains("Apple"));
		System.out.println(fruitList.contains("Orange"));
		fruitList.remove("Banana");
		System.out.println(fruitList);
		fruitList.clear();
		System.out.println(fruitList);
	}

}
