package _16_collection.sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3CustomObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ashish", 100000);
        Employee employee2 = new Employee(10, "Ganesh", 1200);
        Employee employee3 = new Employee(2, "Kunal", 1000);
        Employee employee4 = new Employee(12, "Shreyas", 10000);
        Employee employee5 = new Employee(3, "Sanika", 99999);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee5);

        Collections.sort(employeeList);

        employeeList.forEach(System.out::println);


    }
}
