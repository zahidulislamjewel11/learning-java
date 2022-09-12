package com.zahid.dowhile;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) throws InterruptedException {
		for(int x=0;x<10;x++)
		{
			System.out.println(x);
			Thread.sleep(200);
		}
		System.out.println();
		
		int i=0;
		while(i<10)
		{
			System.out.println(i);
			i++;
			Thread.sleep(200);
		}
		System.out.println();
		int k=0;
		do
		{
			System.out.println(k);
			Thread.sleep(200);
			k++;
		} while(k<10);
		
		String sentence = "Once upon a time in America";
		Scanner scan = new Scanner(sentence);
		
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) 
		{
			words.add(scan.next());
		}
		System.out.println(words);

		scan.close();
	}

}
