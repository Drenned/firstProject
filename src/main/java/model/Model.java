package model;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model
{
    private static Model INSTANCE;

    private List<User> USERLIST;


    public static Model getInstance()
    {
        if( INSTANCE==null )
        {
            synchronized( Model.class ){
                if( INSTANCE==null )
                {
                    INSTANCE= new Model();
                }
            }
        }
        return INSTANCE;
    }

    public Model( )
    {
        this.USERLIST = new ArrayList<>(  );
    }

    public void addUser(User user)
    {
        USERLIST.add( user );
    }

    public List<String> getUserList()
    {
        return USERLIST.stream().map( User::getUserName ).collect( Collectors.toList() );
    }


}
