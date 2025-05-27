package web.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Extract and trim parameters
        String username = trim(req.getParameter("username"));
        String password = trim(req.getParameter("passwd"));
        String dob = trim(req.getParameter("dob"));

        // Authenticate
        boolean isAuthenticated = LoginService.isValid(username, password, dob);
        String loginStatus = isAuthenticated ? "success" : "fail";

        // Build response
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>" + loginStatus + "</title></head>");
        out.println("<body>");
        out.println("<h2>Login status: " + loginStatus + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }

    private String trim(String input) {
        return input == null ? "" : input.trim();
    }
}

