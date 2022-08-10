package com.yarkin.patterns.bridge.resource;

public class Book
{
    private final String name;
    private final int year;
    private final String description;
    private final String picture;

    public Book(String name, int year, String description, String picture)
    {
        this.name = name;
        this.year = year;
        this.description = description;
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }
}
