package _8_oops.abstraction;

public class Demo15 {
    public static void main(String[] args) {
        //1. Runnable subclass - traditional way
        class RunnableImpl implements Runnable {
            @Override
            public void run() {
                System.out.println("running using Traditional way");
            }
        }
        Runnable runnable1 = new RunnableImpl();
        runnable1.run();

        //2. Runnable subclass - anonymous class way
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("running using anonymous way");
            }
        };
        runnable2.run();


        //3. Runnable subclass - Lambda Expression
        Runnable runnable3 = () -> {
                System.out.println("running using lambda expression way");
            };
        runnable3.run();
    }
}
