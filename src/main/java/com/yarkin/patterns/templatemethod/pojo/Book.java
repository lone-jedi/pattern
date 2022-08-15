package com.yarkin.patterns.templatemethod.pojo;

import com.yarkin.patterns.templatemethod.Record;

public class Book extends Record
{
    private final String name;
    private final int year;

    public Book(String name, int year)
    {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    protected void beforeSave()
    {
        System.out.println("Save book started...");
        sql = "INSERT INTO book(name, year) VALUES ('" + name + "', '" + year + "')";
    }

    @Override
    protected void afterSave()
    {
        System.out.println("Save book finished.");
    }

    @Override
    protected void afterSaveFailed()
    {
        System.out.println("Save book failed!");
    }
}
