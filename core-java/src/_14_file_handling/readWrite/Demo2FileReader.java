package _14_file_handling.readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo2FileReader {
    public static void main(String[] args) throws IOException {
        //reading from a file - bytes
        File file = new File("C:\\Work\\ISJ011\\core-java\\src\\_13_exception_handling\\InvalidAgeException.java");
        FileReader fileReader = new FileReader(file);
        int value = fileReader.read();
        while (value != -1) {
            System.out.print((char) value);
            value = fileReader.read();
        }
        fileReader.close();
    }
}
