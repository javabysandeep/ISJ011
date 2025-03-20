package com.itshaala;

import com.itshaala.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class Demo1SaveJavaObject {
    public static void main(String[] args) {
        Movie movie = Movie.builder()
                .title("Chhava")
                .genre("action")
                .director("Santosh Juvekar")
                .rating(5)
                .year(2025)
                .build();
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(movie);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Movie object saved successfully");
    }
}
