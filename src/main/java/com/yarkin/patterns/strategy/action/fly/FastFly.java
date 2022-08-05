package com.yarkin.patterns.strategy.action.fly;

import com.yarkin.patterns.strategy.action.Flyable;

public class FastFly implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("*fly really fast*");
    }
}
