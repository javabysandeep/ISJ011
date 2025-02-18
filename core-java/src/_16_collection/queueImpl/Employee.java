package _16_collection.queueImpl;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Employee /*implements Comparable<Employee>*/ {
    int id;
    String name;
    double salary;
    /*@Override
    public int compareTo(Employee o) {
       // return this.id - o.id;
       return (int) (this.salary - o.salary);
        //return this.name.compareTo(o.name);
    }*/
}