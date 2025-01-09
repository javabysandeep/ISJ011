package _10_final_keyword;

import lombok.*;

public class Demo3 {
    public static void main(String[] args) {
        @AllArgsConstructor
        @Getter
        @Setter
        @ToString
        class Student {
            private int id;
            private String name;
        }

        final Student student = new Student(1, "sachin");
        //student = new Student(2,"kishor");//CTE
        student.id = 101;
        student.name = "abc";
        System.out.println(student);

    }
}
