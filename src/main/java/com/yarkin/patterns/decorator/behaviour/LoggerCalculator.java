package com.yarkin.patterns.decorator.behaviour;

import com.yarkin.patterns.decorator.Calculator;
import com.yarkin.patterns.decorator.Decorator;

public class LoggerCalculator extends Decorator
{
    public LoggerCalculator(Calculator calculator)
    {
        super(calculator);
    }

    @Override
    public double sum(double a, double b)
    {
        System.out.println("Sum start...");
        double sum = calculator.sum(a, b);
        System.out.println("Result of sum: " + sum);
        return sum;
    }

    @Override
    public double subtract(double a, double b)
    {
        System.out.println("Subtract start...");
        double subtract = calculator.subtract(a, b);
        System.out.println("Result of subtract: " + subtract);
        return subtract;
    }

    @Override
    public double multiply(double a, double b)
    {
        System.out.println("Multiply start...");
        double multiply = calculator.multiply(a, b);
        System.out.println("Result of multiply: " + multiply);
        return multiply;
    }

    @Override
    public double divide(double a, double b)
    {
        System.out.println("Divide start...");
        double divide = calculator.divide(a, b);
        System.out.println("Result of divide: " + divide);
        return divide;
    }
}
