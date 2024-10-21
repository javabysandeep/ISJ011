package _4_controlStatements.forDemos.nestedLoops;

public class Demo13PerfectRange {
    public static void main(String[] args) {
        //perfect number : sum of factors = given number
        for (int number = 1; number <= 10000; number++) {
            int sumOfDigits = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfDigits = sumOfDigits + i;
                }
            }
            if (sumOfDigits == number) {
                System.out.println(number);
            }
        }
        // 6, 28, 496, 8128

    }
}
