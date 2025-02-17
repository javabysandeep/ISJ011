package _16_collection.sorting;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    //employee1.compareTo(employee2)
    @Override
    public int compareTo(Employee employee) {
        //return this.id - employee.id;
       // return (int)(this.salary - employee.salary);
        return this.name.compareTo(employee.name);
    }
}