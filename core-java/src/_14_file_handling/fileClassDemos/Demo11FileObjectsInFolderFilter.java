package _14_file_handling.fileClassDemos;

import java.io.File;
import java.io.FileFilter;

public class Demo11FileObjectsInFolderFilter {
    public static void main(String[] args) {
        File file = new File("C:\\Work\\ISJ011\\core-java\\src\\_13_exception_handling");
        FileFilter fileFilter = f -> f.length() > 500;
        File[] files = file.listFiles(fileFilter);
        for (File temp : files) {
            System.out.println(temp.getName() + "\t" + temp.length());
        }
    }
}
