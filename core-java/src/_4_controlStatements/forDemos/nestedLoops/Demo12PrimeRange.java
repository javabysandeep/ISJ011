package _4_controlStatements.forDemos.nestedLoops;

public class Demo12PrimeRange {
    public static void main(String[] args) {
        //print all prime numbers from 1 to 10000
        //prime : no factors other than 1 and number itself
        for (int number = 1; number <= 10000; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }

    }
}
