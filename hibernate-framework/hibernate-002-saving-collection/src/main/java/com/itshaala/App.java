package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Course course = Course.builder()
                .name("FullStack Java ")
                .price(100)
                .description("Complete hands on classroom session")
                .modes(List.of("Offline"))
                .build();
        session.save(course);
        tx.commit();
        session.close();
        sf.close();
        System.out.println("Course added successfully");
    }
}
