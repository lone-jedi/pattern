package com.yarkin.patterns.composite;

import java.util.List;

public class Project implements Item
{
    private String name;
    private boolean checked;
    private List<Item> items;

    public Project(String name, List<Item> items)
    {
        this.name = name;
        this.items = items;
        this.checked = false;
    }


    @Override
    public void check()
    {
        checked = true;
        items.stream()
            .forEach(Item::check);
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
        items.stream()
            .forEach(item -> {
                item.print(tabs + "\t");
            });
    }
}
