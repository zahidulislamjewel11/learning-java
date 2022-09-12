package com.zahid.isprime;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number> ");
//		num = scan.nextInt();
//		isPrime(num);
		
		for(int i=2;i<=100;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		boolean is_prime = true;
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				is_prime=false;
				break;
			}
		}
		
//		if(is_prime==true)
//		{
//			System.out.println(num+ " is a prime number");
//		}
//		else if(is_prime==false)
//		{
//			System.out.println(num+" is not a prime number");
//		}
		
		return is_prime;
	}
}
