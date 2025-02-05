package _15_multithreading;

public class Demo5 {
    public static void main(String[] args) {
        class Worker extends Thread {
            @Override
            public void run() {
                System.out.println("run method : "+Thread.currentThread().getName());
            }
        }
        Worker worker = new Worker();
        worker.setName("worker");
        worker.start();
        System.out.println(10/0);
        System.out.println("main method : "+Thread.currentThread().getName());
    }
}
