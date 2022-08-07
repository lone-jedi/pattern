package com.yarkin.patterns.decorator.behaviour;

import com.yarkin.patterns.decorator.Calculator;
import com.yarkin.patterns.decorator.Decorator;
import com.yarkin.patterns.decorator.SimpleCalculator;

public class NewCalculator extends Decorator
{
    public NewCalculator(Calculator calculator)
    {
        super(calculator);
    }

    @Override
    public double divide(double a, double b)
    {
        if (b == 0)
        {
            throw new IllegalStateException("Error! b cannot be equals to zero");
        }
        return calculator.divide(a, b);
    }
}
