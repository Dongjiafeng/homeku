package homework.web;

import homework.Dao.UserDao;
import homework.users.User;
import net.sf.json.JSONArray;
import org.apache.commons.beanutils.BeanUtils;
import service.Exception.LoginException;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ShowServlet",urlPatterns = "/show")
public class ShowServlet extends HttpServlet {
    private UserDao userDao = new UserDao();
    private UserService userService = new UserService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        Map<String, String[]> parameterMap =
//                request.getParameterMap();
//        User user = new User();
//        try {
//            BeanUtils.populate(user,parameterMap);
//
//            User u = userDao.queryAll(user.getUsername());
//
//
//            if(user.getUsername().equals(u.getUsername())){
//                if(user.getPassword().equals(u.getPassword())){
//
////                    getServletContext().setAttribute("user",user);
////                    String username = request.getParameter("username");
////                    HttpSession session = request.getSession();
////                    session.setAttribute("username", username);
////                    request.getRequestDispatcher("/homepage.jsp")
////                            .forward(request,response);
//                    request.getSession().setAttribute("user",user);
//                    request.getRequestDispatcher("/homepage.jsp")
//                            .forward(request,response);
//
//                    return;
//
//                }else {
//                    System.out.println("密码错误");
//                }
//            }else {
//                System.out.println("无用户名");
//            }
//
//            response.sendRedirect("/index.jsp");
//
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User  userf = new User();
        userf.setUsername(username);
        userf.setPassword(password);
        try {
            User login = userService.login(userf);
            request.getSession().setAttribute("user",login);
            response.sendRedirect(request.getContextPath()+"/homepage.jsp");


        } catch (LoginException e) {
            request.setAttribute("errorMsg",e.getMessage());
           request.getRequestDispatcher("/index.jsp").forward(request,response);
        }


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
