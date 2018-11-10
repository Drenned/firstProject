package servlets;

import Utils.RedisUtils;
import model.Model;
import redis.clients.jedis.Jedis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserListServlet
    extends HttpServlet
{
    @Override protected void doGet( HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse )
    throws ServletException, IOException
    {
        Model model = Model.getInstance();
        Jedis jedis = RedisUtils.getJedisInstance();
        assert jedis != null;
        Set<String> userNamesKeys= jedis.keys("userName*");
        List<String> userNames = userNamesKeys.parallelStream().map(userName->{
            String[] array =userName.split(":");
           return array[array.length-1];

        }).collect(Collectors.toList());
        httpServletRequest.setAttribute( "usernames", userNames );
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html; charset=UTF-8");


        httpServletRequest.getRequestDispatcher("views/userList.jsp").forward(httpServletRequest, httpServletResponse);

    }
}
