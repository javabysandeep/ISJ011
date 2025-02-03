package _14_file_handling;

import java.io.File;

public class Demo8FileNamesInFolder {
    public static void main(String[] args) {
        File file = new File("C:\\Work\\ISJ011\\core-java\\src\\_13_exception_handling");
        String[] fileNameArray = file.list();
        for (String fileName : fileNameArray) {
            System.out.println(fileName);
        }
    }
}
