package _14_file_handling.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1Serialization {
    public static void main(String[] args) throws IOException {
        //serialization
        Student student = new Student(1, "Kishor", "admin", "admin");
        File file = new File("student_data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Student object saved successfully.");
    }
}
