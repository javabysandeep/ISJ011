package operators.assignments;

public class Demo10MinOf3 {
    public static void main(String[] args) {
        int number1 = 13;
        int number2 = 12;
        int number3 = 122;
        int minOfThree = (number1 < number2 && number1 < number3)
                ? number1
                : (
                (number2 < number1 && number2 < number3)
                        ? number2
                        : number3
        );
        System.out.println("min of three is " + minOfThree);

    }
}
