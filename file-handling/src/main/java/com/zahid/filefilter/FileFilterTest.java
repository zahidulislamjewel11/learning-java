package com.zahid.filefilter;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileFilterTest {
    public static void main(String[] args) throws IOException {
        File home = new File("/home/zahid/Downloads");

        FileFilter jpgFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String fileName = pathname.getName();
                if(fileName.endsWith(".jpg"))
                {
                    return true;
                }
                return false;
            }
        };

        File[] listPictures = home.listFiles(jpgFilter);
        for(File file:listPictures)
        {
            // System.out.println(file.getPath());
            System.out.println(file.getName());
        }
    }
}
