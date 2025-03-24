package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Product product = context.getBean("productReference", Product.class);
        System.out.println(product);
    }
}
