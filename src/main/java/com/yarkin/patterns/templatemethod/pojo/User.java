package com.yarkin.patterns.templatemethod.pojo;

import com.yarkin.patterns.templatemethod.Record;

public class User extends Record
{
    private final String username;

    public User(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }

    @Override
    protected void beforeSave()
    {
        System.out.println("Save user started...");
        sql = "INSERT INTO user(username) VALUES ('" + username + "')";
    }

    @Override
    protected void afterSave()
    {
        System.out.println("Save user finished.");
    }

    @Override
    protected void afterSaveFailed()
    {
        System.out.println("Save user failed!");
    }
}

