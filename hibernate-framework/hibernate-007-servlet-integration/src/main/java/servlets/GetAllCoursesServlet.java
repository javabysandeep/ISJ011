package servlets;

import controller.CourseController;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import model.Course;

import java.io.IOException;
import java.util.List;

@WebServlet("/getAllCourses")
public class GetAllCoursesServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        CourseController controller = new CourseController();
        List<Course> courseList = controller.getAllCourses();
        res.getWriter().println(courseList);
    }
}
