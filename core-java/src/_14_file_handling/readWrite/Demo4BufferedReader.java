package _14_file_handling.readWrite;

import java.io.*;

public class Demo4BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ011\\core-java\\src\\_13_exception_handling\\InvalidAgeException.java");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int value = bufferedReader.read();
        while (value != -1) {
            System.out.print((char) value);
            value = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
