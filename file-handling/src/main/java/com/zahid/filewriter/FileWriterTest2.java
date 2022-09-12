package com.zahid.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest2 {

	public static void main(String[] args) throws IOException
	{
		String str = "Zahidul Islam Jewel";
		FileWriter t = new FileWriter("src/main/resources/test1.txt");
		t.write(str);
		System.out.println("Successful");
		t.close();
	}

}
