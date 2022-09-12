package com.zahid.filereader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest1 {
    public static void main(String[] args) throws IOException {
        String str = "Hello World! Welcome to C++ Programming\n";
        // FileWriter fw = new FileWriter("test.txt"); // by default points to root directory
        FileWriter fw = new FileWriter("src/main/resources/test.txt"); // by default points to root directory
        fw.write(str);
        System.out.println("Successfully written to file");
        fw.close();

        FileReader fr = new FileReader("test.txt");
        int i;
        while ((i=fr.read())!=-1)
        {
            System.out.print(i);
            System.out.print((char)i);
        }
        fr.close();
    }
}
