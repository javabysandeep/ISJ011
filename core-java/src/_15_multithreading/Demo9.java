package _15_multithreading;

public class Demo9 {
    public static void main(String[] args) {

        Runnable worker = () -> System.out.println("run method of worker : " + Thread.currentThread().getName());
        //worker.start();//CTE - start method is present in Thread class
        Thread thread = new Thread(worker, "worker");
        thread.start();
        System.out.println("main method : " + Thread.currentThread().getName());
    }
}
