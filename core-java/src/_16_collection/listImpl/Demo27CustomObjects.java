package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Demo27CustomObjects {
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

        //print employees whose salary is greater than 10k
        for (Employee employee : employeeList) {
            if (employee.getSalary() > 10000) {
                System.out.println(employee);
            }
        }
        Consumer<Employee> consumer = (employee -> {
            if (employee.getSalary() > 10000) {
                System.out.println(employee);
            }
        });
        employeeList.forEach(consumer);

        System.out.println("Stream use");
        employeeList.stream().filter(employee -> employee.getSalary() > 10000).collect(Collectors.toList()).forEach(System.out::println);

    }
}
