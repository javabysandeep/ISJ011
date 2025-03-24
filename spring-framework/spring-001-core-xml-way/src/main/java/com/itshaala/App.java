package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");
        Product product1 = context.getBean("product", Product.class);
        Product product2 = context.getBean("product", Product.class);
        System.out.println(product1 + " " + product1.hashCode());
        System.out.println(product2 + " " + product2.hashCode());
    }
}
