package com.zahid.switchcase;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a weekday> ");
		day = scan.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
		}
	}

}
