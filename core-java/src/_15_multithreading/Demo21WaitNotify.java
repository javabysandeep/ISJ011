package _15_multithreading;

import lombok.SneakyThrows;

public class Demo21WaitNotify {

    public static void main(String[] args) {
        //producer - consumer

        class Product {
            synchronized public void produce() {
                try {
                    Thread.sleep(5000);
                    System.out.println("products are produced...");
                    wait();
                } catch (InterruptedException e) {
                    new InterruptedException();
                }
            }

           synchronized public void consume() {
                System.out.println("products are consumed...");
                notify();
            }

        }
        Product product = new Product();

        Thread producer = new Thread(() -> {
            while (true) {
                product.produce();
            }

        }, "producer");

        Thread consumer = new Thread(() -> {
             while (true) {
            product.consume();
            }
        }, "consumer");

        producer.start();

        consumer.start();

    }

}
