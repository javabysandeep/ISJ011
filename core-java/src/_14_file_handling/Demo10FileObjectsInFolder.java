package _14_file_handling;

import java.io.File;

public class Demo10FileObjectsInFolder {
    public static void main(String[] args) {
        File file = new File("C:\\Work\\ISJ011\\core-java\\src\\_13_exception_handling");
        File[] files = file.listFiles();
        for (File temp : files) {
            System.out.println(temp.getName() + "\t" + temp.length());
        }
    }
}
