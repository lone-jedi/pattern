package com.yarkin.patterns.strategy.action.fly;

import com.yarkin.patterns.strategy.action.Flyable;

public class ClassicFly implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("*classic fly*");
    }
}
