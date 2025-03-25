package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Batsman batsman = (Batsman) context.getBean("batsman");
        System.out.println(batsman);
    }
}
