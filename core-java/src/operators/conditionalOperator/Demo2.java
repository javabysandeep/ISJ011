package operators.conditionalOperator;

public class Demo2 {
    public static void main(String[] args) {
        int year = 2025;
        System.out.println(
                year % 400 == 0 || year % 4 == 0 && year % 100 != 0
                        ? "its a leap year"
                        : "its not a leap year");
    }
}
