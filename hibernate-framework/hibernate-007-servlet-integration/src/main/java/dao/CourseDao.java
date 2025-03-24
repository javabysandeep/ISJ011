package dao;

import model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.DatabaseUtil;
import util.HibernateUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
        session.close();
        System.out.println("Course added successfully");
    }

    public void editCourse(Course course) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(course);
        transaction.commit();
        session.close();
        System.out.println("Course updated successfully");
    }

    public void deleteCourseById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Course course = (Course) session.get(Course.class, id);
        session.delete(course);
        transaction.commit();
        session.close();
        System.out.println("Course deleted successfully");
    }

    public List<Course> getAllCourses() {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.openSession();
       List<Course> courseList = (List<Course>) session.createQuery("from Course").list();
        return courseList;
    }
}
