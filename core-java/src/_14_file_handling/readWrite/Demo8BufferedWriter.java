package _14_file_handling.readWrite;

import java.io.*;

public class Demo8BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(" - once again append");

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("File write operation");
    }
}
