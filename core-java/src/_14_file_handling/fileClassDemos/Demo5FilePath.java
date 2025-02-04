package _14_file_handling.fileClassDemos;

import java.io.File;

public class Demo5FilePath {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\abc.txt");
        System.out.println(file.getAbsolutePath());
    }
}
