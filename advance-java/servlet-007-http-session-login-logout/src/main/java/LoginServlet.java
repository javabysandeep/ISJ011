import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("admin".equals(username) && "admin".equals(password)) {
            //create new session
            HttpSession session = req.getSession(true);
            session.setAttribute("username", username);
            //forward welcome servlet
            RequestDispatcher dispatcher = req.getRequestDispatcher("welcome");
            dispatcher.forward(req, resp);
        } else {
            //redirect to login page
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
            resp.getWriter().println("<h1>Invalid username or password</h1>");
            dispatcher.include(req, resp);
        }
    }
}
