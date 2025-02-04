package _15_multithreading;

public class Demo2 {
    public static void main(String[] args) {
        //1. creating the subclass of a Runnable using Traditional way
        class Worker implements Runnable {
            @Override
            public void run() {
                System.out.println("run method - traditional");
            }
        }
        Runnable runnable1 = new Worker();
        runnable1.run();

        //2. creating the subclass of a Runnable using Anonymous class way
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method - anonymous");
            }
        };
        runnable2.run();

        //3. creating the subclass of a Runnable using Lambda expression way
        Runnable runnable3 = () -> System.out.println("run method - lambda expression");
        runnable3.run();
    }
}
