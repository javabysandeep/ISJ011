package _14_file_handling.readWrite;

import java.io.*;

public class Demo3BufferedInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ011\\core-java\\src\\_13_exception_handling\\InvalidAgeException.java");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int value = bufferedInputStream.read();
        while (value != -1) {
            System.out.print((char) value);
            value = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
