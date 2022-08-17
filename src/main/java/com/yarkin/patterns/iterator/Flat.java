package com.yarkin.patterns.iterator;

public class Flat
{
    private final int number;

    public Flat(int number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "Flat{" +
                "number=" + number +
                '}';
    }
}
