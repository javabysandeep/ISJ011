package _15_multithreading;

public class Demo19StartMethod {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("thread1"), "thread1");
        thread1.setDaemon(true);
        thread1.start();
        thread1.start();

        System.out.println("is thread1 daemon : " + thread1.isDaemon());
        System.out.println("rest of the main method");

    }
}
