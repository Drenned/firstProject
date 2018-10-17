package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUserServlet
    extends HttpServlet
{
    @Override protected void doGet( HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse )
    throws ServletException, IOException
    {
        RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher( "views/addUser.jsp" );
        requestDispatcher.forward( httpServletRequest,httpServletResponse );
    }
}
