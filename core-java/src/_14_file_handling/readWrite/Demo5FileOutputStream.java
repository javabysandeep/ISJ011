package _14_file_handling.readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5FileOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write('A');
        fileOutputStream.close();
        System.out.println("File write operation");
    }
}
