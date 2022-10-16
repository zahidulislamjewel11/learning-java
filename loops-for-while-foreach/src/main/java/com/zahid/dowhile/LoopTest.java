package com.zahid.dowhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) throws InterruptedException {
		for(int x = 0; x < 10; x++)
		{
			System.out.print(x + " ");
			Thread.sleep(200);
		}
		System.out.println();
		
		int i = 0;
		while(i < 10)
		{
			System.out.print(i + " ");
			i++;
			Thread.sleep(200);
		}
		System.out.println();
		int k = 0;
		do
		{
			System.out.print(k + " ");
			Thread.sleep(200);
			k++;
		} while(k < 10);
		System.out.println();
		
		String sentence = "Once upon a time in America";
		Scanner scan = new Scanner(sentence);
		
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext()) 
		{
			words.add(scan.next());
		}
		System.out.println(words);
		scan.close();

		String line = "C, C++, Java,	Python, JS, PHP, C#, 	Bash	";
		line = line.trim(); // trimming of spaces
		String[] languages = line.split(",\\s+", 0); // comma followed by 0 or more regex
		System.out.println(Arrays.toString(languages));

	}

}
