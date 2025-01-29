package _13_exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo17 {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            file.length();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }
}
