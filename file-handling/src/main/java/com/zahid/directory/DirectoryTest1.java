package com.zahid.directory;
import java.io.File;
import java.io.IOException;

public class DirectoryTest1 {
    public static void main(String[] args) throws IOException {
        File desktop = new File("/home/zahid/Desktop");
        File[] listDesktop = desktop.listFiles();

        for(File file:listDesktop)
        {
            System.out.println("PATH: " + file.getPath());
            System.out.println("FILE: " + file.getName());
            // System.out.println(file.getFreeSpace());
            // System.out.println(file.getAbsolutePath());
            // System.out.println(file.getCanonicalFile());
            // System.out.println(file.getCanonicalPath());
            // System.out.println(file.getParent());
            // System.out.println(file.getParentFile());
            System.out.println();
        }

        System.out.println("FileCount = " + listDesktop.length);
    }
}
