package _15_multithreading;

public class Demo10 {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("run method : "+Thread.currentThread().getName()),"worker");
        thread.start();
        System.out.println("main method : " + Thread.currentThread().getName());
    }
}
