package servlets;

import controller.CourseController;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import model.Course;

import java.io.IOException;

@WebServlet("/deleteCourse")
public class DeleteCourseByIdServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        CourseController controller = new CourseController();
        int id = Integer.parseInt(req.getParameter("id"));
        controller.deleteCourseById(id);
        res.getWriter().println("Course deleted successfully");
    }
}
