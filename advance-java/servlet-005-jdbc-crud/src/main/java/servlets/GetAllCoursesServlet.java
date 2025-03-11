package servlets;

import controller.CourseController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import model.Course;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/courses")
public class GetAllCoursesServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method");
        CourseController courseController = new CourseController();
        List<Course> courseList = courseController.getAllCourses();
        PrintWriter writer = res.getWriter();
        writer.println(courseList);
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
    }
}
