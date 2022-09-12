package com.zahid.directory;
import java.io.File;

public class DirectoryTest3 {
    public static void main(String[] args) {
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);

        String newFile = workingDir + File.separator + "helloworld.txt";
        File file = new File(newFile);
        System.out.println(file.getName());

        // file.deleteOnExit();
    }
}
