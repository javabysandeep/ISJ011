package operators.conditionalOperator;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(true ? "its true value" : "its false value");
        System.out.println(false ? "its true value" : "its false value");

        int number = 11;
        System.out.println(number % 2 == 0 ? "its an even number" : "its an odd number");
    }
}
