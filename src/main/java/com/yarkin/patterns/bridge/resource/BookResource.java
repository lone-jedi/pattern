package com.yarkin.patterns.bridge.resource;

import com.yarkin.patterns.bridge.Resource;

public class BookResource implements Resource
{
    private final Book book;

    public BookResource(Book book)
    {
        this.book = book;
    }

    @Override
    public String title()
    {
        return book.getName() + "(" + book.getYear() + " year)";
    }

    @Override
    public String image()
    {
        return book.getPicture();
    }

    @Override
    public String content()
    {
        return book.getDescription();
    }
}
