package _7_class_components.constructors;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.id + "\t" + student.name); //0 null

        Student student2 = new Student(101,"Ankit");
        System.out.println(student2.id + "\t" + student2.name); //2 Ankit
    }
}
