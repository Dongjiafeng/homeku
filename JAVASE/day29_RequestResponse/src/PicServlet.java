import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "PicServlet" ,urlPatterns = "/pic")
public class PicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FileInputStream fis  = new FileInputStream("C:\\Users\\lanou3g\\Documents\\GitHub\\homeku\\JAVASE\\day29_RequestResponse\\web\\img\\timg.jpg");
        byte[] pis  = new byte[1024*1024*10];
        int length = fis.read(pis);

        fis.close();
        response.getOutputStream().write(pis,0,length);
    }
}
