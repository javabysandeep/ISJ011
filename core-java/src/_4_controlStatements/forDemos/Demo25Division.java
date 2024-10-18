package _4_controlStatements.forDemos;

public class Demo25Division {
    public static void main(String[] args) {
        int numerator = 119;
        int denominator = 20;
        int quotient = 0;
        for (; numerator >= denominator; quotient++) {
            numerator = numerator - denominator;
        }
        System.out.println("Quotient is "+quotient);
        System.out.println("Remainder is "+numerator);
    }
}
