package _16_collection.setImpl;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Employee employee = (Employee) object;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /*@Override
    public int compareTo(Employee o) {
       // return this.id - o.id;
       return (int) (this.salary - o.salary);
        //return this.name.compareTo(o.name);
    }*/
}