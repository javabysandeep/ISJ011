package service;

import dao.CourseDao;
import model.Course;

import java.util.List;

public class CourseService {
    private CourseDao courseDao = new CourseDao();
    public void addCourse(Course course){
        courseDao.addCourse(course);
    }

    public void editCourse(Course course) {
        courseDao.editCourse(course);
    }

    public void deleteCourseById(int id) {
        courseDao.deleteCourseById(id);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
