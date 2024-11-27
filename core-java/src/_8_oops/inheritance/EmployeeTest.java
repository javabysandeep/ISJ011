package _8_oops.inheritance;

public class EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.id = 101;
        fte.name = "shubham";
        fte.address = "mumbai";
        fte.salary = 120;

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.id = 102;
        contractEmployee.name = "shubham";
        contractEmployee.address = "mumbai";
        contractEmployee.invoiceAmount = 1200;
    }

}
