package _7_class_components;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();//---> id = 0, name = null, email= null, CollegeName = MIT
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.email);

        //how to call instance methods
        System.out.println(student.getId());


    }
}
