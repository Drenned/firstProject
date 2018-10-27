package servlets;

import entities.User;
import model.Model;

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

    @Override protected void doPost( HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse )
    throws ServletException, IOException
    {
        httpServletRequest.setCharacterEncoding("UTF-8");
        String userName = httpServletRequest.getParameter( "name" );
        String password = httpServletRequest.getParameter( "pass" );
        User user = new User( userName, password );
        Model model = Model.getInstance();
        model.addUser( user );

        httpServletRequest.setAttribute("userName", userName);
        doGet(httpServletRequest,httpServletResponse);
    }
}
