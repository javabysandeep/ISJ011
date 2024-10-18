package _4_controlStatements.forDemos;

public class Demo28FactorsSum {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
                System.out.println("Factor " + i);
            }
        }
        System.out.println("Sum of factors " + sum);
    }
}
