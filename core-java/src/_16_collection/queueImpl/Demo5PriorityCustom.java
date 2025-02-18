package _16_collection.queueImpl;


import java.util.*;

public class Demo5PriorityCustom {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ashish", 100000);
        Employee employee2 = new Employee(10, "Ganesh", 1200);
        Employee employee3 = new Employee(2, "Kunal", 1000);
        Employee employee4 = new Employee(12, "Shreyas", 10000);
        Employee employee5 = new Employee(3, "Sanika", 99999);
        Employee employee6 = new Employee(3, "Sanika", 99999);

        ///Comparator<Employee> comparator = (e1, e2) -> e1.id - e2.id;
        Comparator<Employee> comparator = (e1, e2) -> (int) (e2.salary - e1.salary);
        Queue<Employee> employeeQueue = new PriorityQueue<>(comparator);
        employeeQueue.add(employee1);
        employeeQueue.add(employee2);
        employeeQueue.add(employee3);
        employeeQueue.add(employee4);
        employeeQueue.add(employee5);
        employeeQueue.add(employee6);

        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
        System.out.println(employeeQueue.poll());
    }
}
