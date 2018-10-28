package servlets;

import model.Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserListServlet
    extends HttpServlet
{
    @Override protected void doGet( HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse )
    throws ServletException, IOException
    {
        Model model = Model.getInstance();
        List<String> userNames = model.getUserList();
        httpServletRequest.setAttribute( "usernames", userNames );
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html; charset=UTF-8");


        httpServletRequest.getRequestDispatcher("views/userList.jsp").forward(httpServletRequest, httpServletResponse);

    }
}
