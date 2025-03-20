package com.itshaala;

import com.itshaala.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo4GetJavaObject {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Movie movie = session.get(Movie.class, 2);
        System.out.println(movie);
        session.close();
        sf.close();
    }
}
