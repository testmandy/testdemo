package test;

import java.io.File;

public class WordHelper {
    public static void main(String[] args) {
        File tempFile = new File("C:\\Users\\user\\Desktop\\test\\111.txt");
        System.out.println(tempFile.isDirectory());
        System.out.println(tempFile.getAbsolutePath());
        System.out.println(tempFile.getName());
    }

}
