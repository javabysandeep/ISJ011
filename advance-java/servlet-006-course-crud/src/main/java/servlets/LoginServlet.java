package servlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("admin".equals(username) && "admin".equals(password)) {
            //welcome page
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/welcome.html");
            rd.forward(req, res);
        } else {
            //login page
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("<h3 style=color:red>Invalid Credentials</h3>");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
            rd.include(req, res);
        }
    }
}
