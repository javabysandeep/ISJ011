package _14_file_handling.fileClassDemos;

import java.io.File;
import java.io.IOException;

public class Demo1CreateFile {
    public static void main(String[] args) throws IOException {
        //create a new file
        File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\abc.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("file created " + isFileCreated);
    }
}
