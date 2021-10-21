package com.example.endassignment;


public class User_Service {
    private final Database db = new Database();

    public User validateUser (String username, String password)
    {
        for(User user: db.getUsers())
        {
            if(user.username.equals(username) && user.getPassword().equals(password))
            {
                return user;
            }
        }
        return null;
    }
}
