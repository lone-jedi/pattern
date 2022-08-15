package com.yarkin.patterns.templatemethod.pojo;

import com.yarkin.patterns.templatemethod.Record;

public class Post extends Record
{
    private final String title;
    private final String text;

    public Post(String title, String text)
    {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    protected void beforeSave()
    {
        System.out.println("Save post started...");
        sql = "INSERT INTO post(title, text) VALUES ('" + title+ "', '" + text + "')";
    }

    @Override
    protected void afterSave()
    {
        System.out.println("Save post finished.");
    }

    @Override
    protected void afterSaveFailed()
    {
        System.out.println("Save post failed!");
    }
}
