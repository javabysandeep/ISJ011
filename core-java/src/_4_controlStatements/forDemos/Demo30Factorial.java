package _4_controlStatements.forDemos;

public class Demo30Factorial {
    public static void main(String[] args) {
        int number = 6;
        //6! = 1 * 2 * 3 * 4 * 5 * 6 --> 720
        //6! = 6 *  5 * 4 * 3 * 2  * 1 --> 720
        //3! = 1 * 2 * 3 --> 6
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
//            factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("Factorial Of given number is "+factorial);

    }
}
