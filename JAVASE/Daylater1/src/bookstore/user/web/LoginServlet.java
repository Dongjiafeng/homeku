package bookstore.user.web;

import bookstore.user.Bean.User;
import bookstore.user.service.Exception.LoginException;
import bookstore.user.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User userf = new User();
        userf.setUsername(username);
        userf.setPassword(password);

        User login = null;
        try {
            login = userService.LoginUser(userf);
            request.getSession().setAttribute("user",login);
            response.sendRedirect(request.getContextPath()+"/main.jsp");
        } catch (LoginException e) {
            request.setAttribute("errorMsg",e.getMessage());
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
