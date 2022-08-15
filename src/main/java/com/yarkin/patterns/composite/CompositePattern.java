package com.yarkin.patterns.composite;

import com.yarkin.patterns.Pattern;

import java.util.List;

public class CompositePattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Composite pattern ---");

        Item codding = new Project("codding", List.of(
                new Todo("make class structure"),
                new Project("create database", List.of(
                        new Todo("create tables"),
                        new Todo("create constraints"),
                        new Todo("fill tables of test data")
                ))
        ));

        Item project = new Project("Root of project", List.of(
                new Todo("analysis"),
                codding,
                new Todo("code review"),
                new Project("verifications", List.of(
                        new Todo("check on unit tests"),
                        new Todo("check on integration tests")
                ))
        ));

        project.print("");
        codding.check();
        project.print("");
    }
}
