package web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends BaseServlet {
    public String Ligon(
            HttpServletRequest request
            ,HttpServletResponse response){
        System.out.println("login被调用了");
        //f:请求转发
        //r:重定向
        return "r:/index.jsp";

    }
    public String register(
            HttpServletRequest request
            ,HttpServletResponse response){
        System.out.println("注册被调用了");
        return "f:/login.jsp";
    }
}
