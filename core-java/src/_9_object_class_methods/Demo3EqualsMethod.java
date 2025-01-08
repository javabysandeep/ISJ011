package _9_object_class_methods;

public class Demo3EqualsMethod {
    public static void main(String[] args) {
        System.out.println(10 == 20);//false
        System.out.println(10 == 10);//true
        int a = 100;
        int b = 100;
        System.out.println(a == b);//true

        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        Student student1 = new Student(1,"Kunal");
        Student student2 = new Student(1,"Kunal");
        Student student3 = student2;

        //reference check
        System.out.println(student1 == student2); //false
        System.out.println(student2 == student3); //true

        System.out.println("Equals method");
        System.out.println(student1.equals(student2));//false
        System.out.println(student2.equals(student3));//true

    }
}
