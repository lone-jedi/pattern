package com.yarkin.patterns.composite;

public class Todo implements Item
{
    private String name;

    private boolean checked;

    public Todo(String name)
    {
        this.name = name;
        this.checked = false;
    }

    @Override
    public void check()
    {
        checked = true;
    }

    @Override
    public boolean isChecked()
    {
        return checked;
    }

    @Override
    public void print(String tabs)
    {
        System.out.print(tabs);
        System.out.print(checked ? "[X]" : "[ ]");
        System.out.println(" " + name);
    }
}
