package _16_collection.setImpl;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo8TreeSetCustomObjectsCOmparator {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ashish", 100000);
        Employee employee2 = new Employee(10, "Ganesh", 1200);
        Employee employee3 = new Employee(2, "Kunal", 1000);
        Employee employee4 = new Employee(12, "Shreyas", 10000);
        Employee employee5 = new Employee(3, "Sanika", 99999);
        Employee employee6 = new Employee(3, "Sanika", 99999);

        Comparator<Employee> comparator = (e1, e2) -> e1.id - e2.id;
        Set<Employee> employeeList = new TreeSet<>(comparator);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        employeeList.forEach(System.out::println);
    }
}
