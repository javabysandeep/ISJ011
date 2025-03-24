package util;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        return sessionFactory != null ? sessionFactory
                : new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }
}
