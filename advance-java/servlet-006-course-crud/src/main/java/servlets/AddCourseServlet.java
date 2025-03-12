package servlets;

import controller.CourseController;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import model.Course;

import java.io.IOException;

@WebServlet("/addCourse")
public class AddCourseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        CourseController controller = new CourseController();

        String courseName = req.getParameter("name");
        ;
        int price = Integer.parseInt(req.getParameter("price"));
        String duration = req.getParameter("duration");

        Course course = Course.builder()
                .name(courseName)
                .price(price)
                .duration(duration)
                .build();
        controller.addCourse(course);

        res.getWriter().println("Course added successfully");
    }
}
