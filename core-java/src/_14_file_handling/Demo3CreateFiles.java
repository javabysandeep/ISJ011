package _14_file_handling;

import java.io.File;
import java.io.IOException;

public class Demo3CreateFiles {
    public static void main(String[] args) throws IOException {
        //create a new file
        for (int i = 1; i <= 100; i++) {
            File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\tempFolder\\" + i);
            file.createNewFile();
        }
        System.out.println("Files are created");
    }
}
