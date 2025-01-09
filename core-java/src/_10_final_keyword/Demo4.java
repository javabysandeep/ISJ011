package _10_final_keyword;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Demo4 {
    public static void main(String[] args) {
        @AllArgsConstructor
        @Getter
        @Setter
        @ToString
        final class Student {
            private final int id;
            private final String name;
        }

        final Student student = new Student(1, "sachin");
        //student = new Student(2,"kishor");//CTE
        //student.id = 101;//CTE
        //student.name = "abc";//CTE
        System.out.println(student);

    }
}
