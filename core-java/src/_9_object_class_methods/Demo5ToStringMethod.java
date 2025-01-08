package _9_object_class_methods;

import lombok.*;

public class Demo5ToStringMethod {
    public static void main(String[] args) {

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        @Setter
        @ToString
        class Student{
            private int id;
            private String name;

          /*  @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }*/
        }

        Student student = new Student(1,"sachin");
        System.out.println(student);
        System.out.println(student.toString());
        System.out.println(student.getClass().getName()+"@"+Integer.toHexString(student.hashCode()));
    }
}
