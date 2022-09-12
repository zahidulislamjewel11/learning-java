package com.zahid.filewriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest3 {
    public static void main(String[] args) {
        FileWriter writer;
        String text = "One upon a time in the wild west there were three bounty hunters named Aex, Lee, Cooper.";

        try {
            writer = new FileWriter("src/main/resources/output.txt");
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
