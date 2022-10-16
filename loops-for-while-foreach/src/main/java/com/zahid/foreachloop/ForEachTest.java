package com.zahid.foreachloop;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachTest {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();

		String[] cars = {"Toyota", "Tesla", "Lamborgini"};
		for(int i=0; i < cars.length; i++)
		{
			System.out.print(cars[i] + " ");
		}
		System.out.println();

		for(String car:cars)
		{
			System.out.print(car + " ");
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(9);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		System.out.println();
		for(int num:numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println();

		numbers.forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		int[] scores = {4,9,2,3,5,7,8,1,6,0};
		Arrays.stream(scores).forEach(score -> System.out.print(score + " "));
		System.out.println();
	}
}
