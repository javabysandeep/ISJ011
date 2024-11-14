package _7_class_components.courseApp;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        courseController.addCourse();
        courseController.editCourse();
        courseController.deleteCourse();
        courseController.getCourse();

    }
}
