package com.itshaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        FullTimeEmployee employee = new FullTimeEmployee();
        employee.setName("Prathmesh");
        employee.setAddress("Warje");
        employee.setSalary(20000);

        session.save(employee);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("employee added successfully");

    }
}
