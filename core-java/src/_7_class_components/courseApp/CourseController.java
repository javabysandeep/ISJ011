package _7_class_components.courseApp;

public class CourseController {
    CourseService courseService = new CourseService();

    public void addCourse() {
        courseService.addCourse();
    }

    public void editCourse() {
        courseService.editCourse();
    }

    public void deleteCourse() {
        courseService.deleteCourse();
    }

    public void getCourse() {
        courseService.getCourse();
    }
}
