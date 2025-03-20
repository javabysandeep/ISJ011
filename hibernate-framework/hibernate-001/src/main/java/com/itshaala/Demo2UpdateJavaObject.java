package com.itshaala;

import com.itshaala.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo2UpdateJavaObject {
    public static void main(String[] args) {
        Movie movie = Movie.builder()
                .id(1)
                .title("Chhava")
                .genre("action")
                .director("Vicky Kaushal")
                .rating(5)
                .year(2024)
                .build();

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(movie);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("movie object updated successfully");

    }
}
