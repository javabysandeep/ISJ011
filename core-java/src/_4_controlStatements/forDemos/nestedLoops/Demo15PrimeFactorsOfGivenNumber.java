package _4_controlStatements.forDemos.nestedLoops;

public class Demo15PrimeFactorsOfGivenNumber {
    public static void main(String[] args) {
        int number = 65;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                //check if the given factor is prime or not
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("prime factor is " + i);
                }
            }
        }
    }
}
