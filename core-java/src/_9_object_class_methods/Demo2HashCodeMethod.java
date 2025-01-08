package _9_object_class_methods;

public class Demo2HashCodeMethod {
    public static void main(String[] args) {
        class Student{}
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = student2;

        System.out.println("student 1  hashcode : "+student1.hashCode());
        System.out.println("student 2  hashcode : "+student2.hashCode());
        System.out.println("student 3  hashcode : "+student3.hashCode());

    }
}
