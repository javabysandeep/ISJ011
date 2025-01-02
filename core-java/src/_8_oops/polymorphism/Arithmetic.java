package _8_oops.polymorphism;

public class Arithmetic {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static float add(float number1, float number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static double add(double number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println("addition of two integers numbers " + Arithmetic.add(100, 200));
        System.out.println("addition of three integers numbers " + Arithmetic.add(100, 200, 300));
        System.out.println("addition of two float numbers " + Arithmetic.add(100.10f, 200.10f));
    }
}
