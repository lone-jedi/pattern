package com.yarkin.patterns.decorator;

import com.yarkin.patterns.Pattern;
import com.yarkin.patterns.decorator.behaviour.LoggerCalculator;
import com.yarkin.patterns.decorator.behaviour.NewCalculator;

public class DecoratorPattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Decorator ---");

        Calculator simpleCalculator = new SimpleCalculator();
        System.out.println(simpleCalculator.divide(10, 5));
        System.out.println(simpleCalculator.divide(10, 0));

        Calculator newCalculator = new NewCalculator(new SimpleCalculator());
        System.out.println(newCalculator.divide(10, 5));

        try
        {
            System.out.println(newCalculator.divide(10, 0));
        }
        catch (Throwable throwable)
        {
            System.out.println(throwable.getMessage());
        }


        Calculator loggerCalculator = new LoggerCalculator(new SimpleCalculator());
        loggerCalculator.sum(6, 2);
        loggerCalculator.subtract(6, 2);
        loggerCalculator.multiply(6, 2);
        loggerCalculator.divide(6, 2);
        loggerCalculator.divide(6, 0);

        Calculator newLoggerCalculator = new LoggerCalculator(new NewCalculator(new SimpleCalculator()));
        System.out.println(newLoggerCalculator.divide(10, 5));
        System.out.println(newLoggerCalculator.divide(10, 0));
    }
}
