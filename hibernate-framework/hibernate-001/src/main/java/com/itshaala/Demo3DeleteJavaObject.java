package com.itshaala;

import com.itshaala.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo3DeleteJavaObject {
    public static void main(String[] args) {
        Movie movie = Movie.builder()
                .id(1)
                .build();

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(movie);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("movie object deleted successfully");
    }
}
