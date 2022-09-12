package com.zahid.filewriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest4 {

    public static void main(String[] args) throws FileNotFoundException {

        // writing string to file
        String str = "Hello there. How are you? What's going on?";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // now reading from the same file
        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String text = br.readLine();
            System.out.println(text);
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}