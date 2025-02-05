package _15_multithreading;

public class Demo7 {
    public static void main(String[] args) {
        class Worker implements Runnable{
            @Override
            public void run() {
                System.out.println("run method of worker : "+Thread.currentThread().getName());
            }
        }
        Worker worker = new Worker();
        //worker.start();//CTE - start method is present in Thread class
        Thread thread = new Thread(worker,"worker");
        thread.start();
        System.out.println("main method : "+Thread.currentThread().getName());
    }
}
