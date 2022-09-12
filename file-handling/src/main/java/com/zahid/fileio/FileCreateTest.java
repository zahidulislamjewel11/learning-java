package com.zahid.fileio;
import java.io.File;
import java.io.IOException;

public class FileCreateTest {
    public static void main(String[] args) {
        File file = new File("src/main/resources/newfile.txt");
        if(file.exists())
        {
            System.out.println("File already exists");
        }
        else
        {
            System.out.println("File does not exist. Let's create one");
            try
            {
                file.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
