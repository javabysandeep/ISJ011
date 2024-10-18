package _4_controlStatements.forDemos;

public class Demo29PerfectNumber {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        //perfect number : sumOfFactors = given number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Factor " + i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of factors " + sum);

        System.out.println(sum == number ? "its a perfect number " : "not a perfect number");

        /*if (sum == number){
            System.out.println("its perfect number ");
        } else {
            System.out.println("its not perfect number");
        }*/
    }
}
