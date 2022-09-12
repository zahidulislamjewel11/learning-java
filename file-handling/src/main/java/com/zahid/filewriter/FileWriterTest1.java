package com.zahid.filewriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest1 {

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		File file_obj = new File("src/main/resources/1ststop.txt");
		Scanner scan = new Scanner(file_obj);
		// System.out.println(scan.nextLine());
		
		String file_content = "";
		
		while(scan.hasNextLine())
		{
			// System.out.println(scan.nextLine());
			file_content = file_content.concat(scan.nextLine()+"\n");
		}
		
		System.out.println(file_content);
		
		FileWriter writer = new FileWriter("src/main/resources/newfile.txt");
		writer.write(file_content);
		writer.close();
		scan.close();

	}

}
