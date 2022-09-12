package com.zahid.filereader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest3 {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("src/main/resources/input.html");
            int c;
            while ((c=reader.read())!=-1) {
                // System.out.print(c+" ");
                char ch = (char)c;
                System.out.print(ch);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (reader!=null) {
                    reader.close();
                }
            }
            catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
