package _15_multithreading;

public class Demo1 {
    public static void main(String[] args) {
        long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 1000000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Time taken is " + (endTime - startTime));

    }
}
