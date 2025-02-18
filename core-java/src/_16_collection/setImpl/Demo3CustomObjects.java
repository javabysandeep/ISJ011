package _16_collection.setImpl;

import java.util.HashSet;
import java.util.Set;

public class Demo3CustomObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ashish", 100000);
        Employee employee2 = new Employee(10, "Ganesh", 1200);
        Employee employee3 = new Employee(2, "Kunal", 1000);
        Employee employee4 = new Employee(12, "Shreyas", 10000);
        Employee employee5 = new Employee(3, "Sanika", 99999);
        Employee employee6 = new Employee(3, "Sanika", 99999);
        Employee employee7 = new Employee(3, "Sanika", 99999);

        Set<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        employeeHashSet.add(employee7);

        for (Employee emp : employeeHashSet) {
            System.out.println(emp);
        }
    }
}
