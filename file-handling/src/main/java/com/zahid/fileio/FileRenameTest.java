package com.zahid.fileio;
import java.io.File;
import java.io.IOException;

public class FileRenameTest {
    public static void main(String[] args) throws IOException {
        File oldFile = new File("src/main/resources/old_hello.txt");
        if (!oldFile.exists()) {
            // oldFile.getParentFile().mkdirs();
            oldFile.createNewFile();
        }

        File newFile = new File("src/main/resources/new_hello.txt");
        boolean fileRenamed = oldFile.renameTo(newFile);

        if(fileRenamed)
        {
            System.out.println(oldFile+" renamed to "+newFile);
        }
        else
        {
            System.out.println("Renaming "+oldFile+" to "+newFile);
        }
    }
}
