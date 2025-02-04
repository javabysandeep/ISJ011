package _14_file_handling.fileClassDemos;

import java.io.File;

public class Demo4DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\abc.txt");
        boolean isFileDeleted = file.delete();
        System.out.println("File deleted " + isFileDeleted);
    }
}
