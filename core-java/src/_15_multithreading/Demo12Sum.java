package _15_multithreading;

public class Demo12Sum {
    public static void main(String[] args) {
        long start = 1;
        long end = 10000000000L;
        long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        long endTime = System.currentTimeMillis();
        System.out.println("time taken "+(endTime-startTime));
    }
}
