package _6_class_object.expenseManager;

public class App {
    public static void main(String[] args) {
        //to trigger the application
        Expense expense = new Expense();
        new Expense();//garbage, unreferenced object, unused object
        //garbage collector will free the unused objects
        //Expense --> class type or derived data type
        // expense --> reference variable which holds the reference or address of an object
        // = --> assignment operator which assigns RHS value to LHS variable
        // new Expense(); ---> object
        // new  --> keyword
        // Expense() --> constructor
        System.out.println("by default object values ");
        System.out.println("Expense{" +
                "id=" + expense.id +
                ", amount=" + expense.amount +
                ", title='" + expense.title + '\'' +
                ", description='" + expense.description + '\'' +
                ", date='" + expense.date + '\'' +
                ", time='" + expense.time + '\'' +
                ", category='" + expense.category + '\'' +
                '}');

        expense.id = 1;
        expense.title = "Coffee";
        expense.description = "coffee at macdee";
        expense.date = "06-11-2024";
        expense.time = "12 PM";
        expense.category = "food";
        expense.amount = 200;

        System.out.println("after setting object values ");
        System.out.println("Expense{" +
                "id=" + expense.id +
                ", amount=" + expense.amount +
                ", title='" + expense.title + '\'' +
                ", description='" + expense.description + '\'' +
                ", date='" + expense.date + '\'' +
                ", time='" + expense.time + '\'' +
                ", category='" + expense.category + '\'' +
                '}');

    }
}
