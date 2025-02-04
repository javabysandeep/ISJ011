package _14_file_handling.readWrite;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9PerformanceFOSBOS {
    public static void main(String[] args) throws IOException {
        //writeUsingFileOutputStream();
         writeUsingBufferedOutputStream();
    }

    private static void writeUsingFileOutputStream() throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            fileOutputStream.write('A');
        }
        long endTime = System.currentTimeMillis();
        fileOutputStream.close();
        System.out.println("File write operation complete " + (endTime - startTime));
    }

    private static void writeUsingBufferedOutputStream() throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            bufferedOutputStream.write('A');
        }
        long endTime = System.currentTimeMillis();
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("File write operation complete " + (endTime - startTime));
    }
}
