package _14_file_handling.serialization;

import java.io.*;

public class Demo2DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //de-serialization
        File file = new File("student_data.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
        objectInputStream.close();
        fileInputStream.close();
    }
}
