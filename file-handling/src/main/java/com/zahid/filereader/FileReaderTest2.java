package com.zahid.filereader;

import java.io.FileReader;

public class FileReaderTest2 {

	public static void main(String[] args) throws Exception
	{
		FileReader f = new FileReader("src/main/resources/test.txt");
		int i;
		while((i=f.read())!=-1)
		{
			// System.out.print(i+" ");
			System.out.print((char)i);
		}
		f.close();
	}
}
