package _4_controlStatements.forDemos;

public class Demo17 {
    public static void main(String[] args) {
        //print the sum of numbers in range
        int start = 1;
        int end = 100;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }

        System.out.println("Sum is " + sum);

    }
}
