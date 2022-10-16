package com.zahid.ifelif;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		num = sc.nextInt();

		if(num % 2 == 0) {
			System.out.println(num+" is even");
		}
		else if(num % 2==1) {
			System.out.println(num+" is odd");
		}
		else {
			System.out.println("Not a integer");
		}
		sc.close();
	}
}
