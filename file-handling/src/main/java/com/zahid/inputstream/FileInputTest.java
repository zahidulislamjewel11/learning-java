package com.zahid.inputstream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest {
    public static void main(String[] args) {
        FileInputStream in = null;
        try
        {
            in = new FileInputStream("input.txt");
            int c;
            while((c=in.read())!=-1)
            {
//                System.out.print(c+", ");
                System.out.print((char)c);
            }
        }
        catch (IOException e)
        {
            System.out.println("Could not read the file");
        }
        finally
        {
            if(in!=null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e1)
                {
                    System.out.println("Couldn't close input stream");
                }
            }
        }
    }
}
