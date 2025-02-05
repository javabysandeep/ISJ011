package _15_multithreading;

public class Demo16Yield {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("someone disturbed while sleeping");
            }
            System.out.println("t1 run method : " + Thread.currentThread().getName());

        }, "t1");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("someone disturbed while sleeping");
            }
            System.out.println("t2 run method : " + Thread.currentThread().getName());
        }, "t2");

        t1.start();
        t2.start();

        Thread.yield();

        System.out.println("rest of the main method");

    }
}
