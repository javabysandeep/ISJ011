package _14_file_handling.fileClassDemos;

import java.io.File;
import java.io.FilenameFilter;

public class Demo9FileNamesInFolderFiltering {
    public static void main(String[] args) {
        File file = new File("C:\\Work\\ISJ011\\core-java\\src\\_13_exception_handling");
        FilenameFilter fileNameFilter = (dir, name) -> name.startsWith("_15_multithreading.Demo1");
        String[] fileNameArray = file.list(fileNameFilter);
        for (String fileName : fileNameArray) {
            System.out.println(fileName);
        }
    }
}
