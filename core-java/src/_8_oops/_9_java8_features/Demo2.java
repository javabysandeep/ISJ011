package _8_oops._9_java8_features;

import _8_oops.inheritance.sll.Test;

import java.util.Collection;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        class Test {
            public static void m1() {
                System.out.println("Test class static m1 method");
            }

            public void m2() {
                System.out.println("Test class instance m2 method");
            }

            Test() {
                System.out.println("Test class constructor");
            }
        }
       //1. traditional way
        /* class Worker implements Runnable {
            @Override
            public void run() {
                System.out.println("run method");
            }
        }
        Runnable runnable = new Worker();*/

        //2. anonymous class
       /* Runnable runnable =  new Runnable(){
            @Override
            public void run() {
                System.out.println("run method");
            }
        };*/

        //3. Lambda expression
        processWorkers(() -> System.out.println("run method"));

        //4. method Reference
        processWorkers(Test::m1);
    }

    public static void processWorkers(Runnable runnable) {
        runnable.run();
    }

}

