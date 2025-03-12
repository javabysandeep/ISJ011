package controller;

import model.Course;
import service.CourseService;

import java.util.List;

public class CourseController {
    private CourseService courseService = new CourseService();
    public void addCourse(Course course){
        courseService.addCourse(course);
    }

    public void editCourse(Course course) {
        courseService.editCourse(course);
    }

    public void deleteCourseById(int id) {
        courseService.deleteCourseById(id);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
