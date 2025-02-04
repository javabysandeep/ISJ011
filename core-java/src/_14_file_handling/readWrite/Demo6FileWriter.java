package _14_file_handling.readWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("- welcome to file handling");
        fileWriter.close();
        System.out.println("File write operation");
    }
}
