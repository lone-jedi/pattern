package com.yarkin.patterns.templatemethod;

import com.yarkin.patterns.Pattern;
import com.yarkin.patterns.templatemethod.pojo.Book;
import com.yarkin.patterns.templatemethod.pojo.Post;
import com.yarkin.patterns.templatemethod.pojo.User;

import java.util.List;

public class TemplateMethodPattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Template method ---");

        List<Record> records = List.of(
            new User("username"),
            new Book("name of book", 1854),
            new Post("I love Java", "Description here...")
        );

        records.stream()
            .forEach(Record::save);
    }
}
