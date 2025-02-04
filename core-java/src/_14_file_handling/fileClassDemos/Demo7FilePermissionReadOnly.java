package _14_file_handling.fileClassDemos;

import java.io.File;

public class Demo7FilePermissionReadOnly {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\sande\\OneDrive\\Desktop\\abc.txt");
        file.setWritable(false);
        System.out.println("file permission changed to read only");
    }
}
