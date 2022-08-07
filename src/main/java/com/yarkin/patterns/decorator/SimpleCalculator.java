package com.yarkin.patterns.decorator;

public class SimpleCalculator implements Calculator
{
    @Override
    public double sum(double a, double b)
    {
        return a + b;
    }

    @Override
    public double subtract(double a, double b)
    {
        return a - b;
    }

    @Override
    public double multiply(double a, double b)
    {
        return a * b;
    }

    @Override
    public double divide(double a, double b)
    {
        return a / b;
    }
}
