package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PageRedirect extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        response.setCharacterEncoding("GBK");

        //要重定向的新位置
        String site = new String("http://www.w3cschool.cn");

        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location",site);
    }
}
