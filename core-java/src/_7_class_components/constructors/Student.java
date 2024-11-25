package _7_class_components.constructors;

public class Student {
    int id;
    String name;

    public Student() {
        System.out.println("zero param constructor");
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //copy constructor
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
    }

    public static void main(String[] args) {
        int id = 101;
        String name = "Chetan";
//        Student student1 = new Student(101,"Chetan");
        Student student1 = new Student(id, name);
        Student student2 = new Student(student1);
        Student student3 = new Student(student2);
    }
}
