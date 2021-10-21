package com.example.endassignment;

import java.time.LocalDate;
public abstract class User {
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected String title;
    protected int seats;
    protected double price;
    protected String username;
    protected String password;

    public User(LocalDate startDate, LocalDate endDate, String title, int seats, double price, String username, String password)
    {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.seats = seats;
        this.price = price;
        this.password = password;
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }
}
