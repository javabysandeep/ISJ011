package service;

import dao.CourseDao;
import model.Course;

import java.util.List;

public class CourseService {
    private CourseDao courseDao = new CourseDao();
    public List<Course> getAllCourses(){
        return courseDao.getAllCourses();
    }
}
