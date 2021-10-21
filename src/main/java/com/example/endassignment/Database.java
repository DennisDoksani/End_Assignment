package com.example.endassignment;


import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<User> users;

    public Database()
    {
        users = new ArrayList<>();
    }

    public List<User> getUsers()
    {
        return users;
    }
}
