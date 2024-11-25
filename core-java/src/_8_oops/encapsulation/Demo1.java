package _8_oops.encapsulation;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student(1, "Kunal", 19);
        //student.age = -23; //private
        student.setAge(-23);
        System.out.println(student.getAge());


    }
}
