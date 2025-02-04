package _14_file_handling.fileClassDemos;

import java.io.File;
import java.io.IOException;

public class Demo2CreateFolder {
    public static void main(String[] args) throws IOException {
        //create a new folder
        File folder = new File("C:\\Users\\sande\\OneDrive\\Desktop\\tempFolder");
        boolean isFolderCreated = folder.mkdir();
        System.out.println("Folder created " + isFolderCreated);
    }
}
