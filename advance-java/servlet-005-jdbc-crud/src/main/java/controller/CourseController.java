package controller;

import model.Course;
import service.CourseService;

import java.util.List;

public class CourseController {
    private CourseService courseService = new CourseService();

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
