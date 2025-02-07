package _15_multithreading;

public class Demo17Priority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("thread1"), "thread1");
        Thread thread2 = new Thread(() -> System.out.println("thread2"));
        thread2.setName("thread2");
        thread1.setPriority(10);
        thread1.start();
        thread2.start();
        System.out.println("main method " + Thread.currentThread().getName());
        System.out.println("main thread priority "+Thread.currentThread().getPriority());
    }
}
