package _15_multithreading;

public class Demo11EvenOdd {
    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            for (int i = 2; i <= 20; i = i + 2) {
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }, "even");
        Thread odd = new Thread(() -> {
            for (int i = 1; i <= 20; i = i + 2) {
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }, "odd");
        even.start();
        odd.start();
    }
}
