package com.zahid.outputstream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    public static void main(String[] args) {
        String destFile = "src/main/resources/output.txt";
        String data="The quick brow fox jumps over the lazy dog";

        try {
            FileOutputStream fos = new FileOutputStream(destFile);
            fos.write(data.getBytes());
            fos.flush();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
