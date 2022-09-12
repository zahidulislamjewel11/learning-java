package com.zahid.fileio;
import java.io.File;

public class FileDeleteTest {
    public static void main(String[] args) {
        File file = new File("src/main/resources/newfile.txt");
        file.delete();

        File file2 = new File("src/main/resources/test.txt");
        file2.deleteOnExit();
    }
}
