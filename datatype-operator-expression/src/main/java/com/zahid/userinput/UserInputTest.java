package com.zahid.userinput;

import java.util.Scanner;

public class UserInputTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean okay=true;
		
		do
		{
			System.out.println("Enter a line> ");
			String line = scan.nextLine();
			System.out.println("You've entered: "+line);
			if("quit".equals(line))
			{
				okay=false;
			}
			
		} while(okay);
		
		scan.close();
	}

}
