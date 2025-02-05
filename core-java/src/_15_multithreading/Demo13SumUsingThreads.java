package _15_multithreading;

public class Demo13SumUsingThreads {
    static long sum1;
    static long sum2;

    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> {
            for (long i = 1; i <= 500000000; i++) {
                sum1 += i;
            }
        }, "first");
        Thread second = new Thread(() -> {
            for (long i = 500000001; i <= 1000000000; i++) {
                sum2 += i;
            }
        }, "second");
        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Sum is " + (sum1+sum2));
    }
}
