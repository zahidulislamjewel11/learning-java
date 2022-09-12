package com.zahid.foreachloop;

import java.util.ArrayList;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		String[] cars = {"Toyota", "Tesla", "Lamborgini"};
		for(int i=0;i<cars.length;i++)
		{
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		for(String car:cars)
		{
			System.out.print(car+" ");
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
			System.out.print(num+" ");
		}
	}
}
