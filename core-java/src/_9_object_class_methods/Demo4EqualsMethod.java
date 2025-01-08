package _9_object_class_methods;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

public class Demo4EqualsMethod {
    public static void main(String[] args) {

        @AllArgsConstructor
        @NoArgsConstructor
        @Getter
        @Setter
        class Student {
            int id;
            String name;

            @Override
            public boolean equals(Object object) {
                if (object == null || getClass() != object.getClass()) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                Student student = (Student) object;
                return id == student.id;
            }

            @Override
            public int hashCode() {
                return Objects.hash(id);
            }
        }

        Student student1 = new Student(1, "Kunal");
        Student student2 = new Student(1, "Kunal");

        System.out.println(student1.equals(student2));//true
        System.out.println(student1.equals(null));//false
        System.out.println(student1.equals(new ArrayList()));//false
        System.out.println(student1.equals(student1));//true
    }
}
