package com.yarkin.patterns.decorator;

public abstract class Decorator implements Calculator
{
    protected final Calculator calculator;

    public Decorator(Calculator calculator)
    {
        this.calculator = calculator;
    }

    @Override
    public double sum(double a, double b)
    {
        return calculator.sum(a, b);
    }

    @Override
    public double subtract(double a, double b)
    {
        return calculator.subtract(a, b);
    }

    @Override
    public double multiply(double a, double b)
    {
        return calculator.multiply(a, b);
    }

    @Override
    public double divide(double a, double b)
    {
        return calculator.divide(a, b);
    }
}
