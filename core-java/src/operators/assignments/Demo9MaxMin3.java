package operators.assignments;

public class Demo9MaxMin3 {
    public static void main(String[] args) {
        int number1 = 13;
        int number2 = 12;
        int number3 = 122;
        int maxOfThree = (number1 > number2 && number1 > number3)
                ? number1
                : (
                (number2 > number1 && number2 > number3)
                        ? number2
                        : number3
        );
        System.out.println("max of three is " + maxOfThree);

    }
}
