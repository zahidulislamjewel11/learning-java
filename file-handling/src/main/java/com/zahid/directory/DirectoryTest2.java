package com.zahid.directory;
import java.io.File;
import java.io.IOException;

public class DirectoryTest2 {
    public static void main(String[] args) throws IOException {
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);

        File dir = new File("src/main/resources/newdir");
        dir.mkdir();

        String dirPath = dir.getPath();
        System.out.println("Directory Path: " + dirPath);

        //let's create a newfile
        String fileName = "newfile.txt";
        File file = new File(dirPath + File.separator + fileName);
        file.createNewFile();

        String filePath = file.getPath();
        System.out.println("File Path: " + filePath);

        // file.deleteOnExit();
        // dir.deleteOnExit();
    }
}
