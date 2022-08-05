package com.yarkin.patterns.strategy;

import com.yarkin.patterns.strategy.action.Displayable;
import com.yarkin.patterns.strategy.action.Flyable;
import com.yarkin.patterns.strategy.action.Quackable;

public class Duck implements Quackable, Displayable, Flyable
{
    private Quackable quackable;
    private Displayable displayable;
    private Flyable flyable;

    public Duck(Quackable quackable, Displayable displayable, Flyable flyable)
    {
        this.quackable = quackable;
        this.displayable = displayable;
        this.flyable = flyable;
    }

    @Override
    public void display()
    {
        displayable.display();
    }

    @Override
    public void fly()
    {
        flyable.fly();
    }

    @Override
    public void quack()
    {
        quackable.quack();
    }

    public void doAction()
    {
        quack();
        display();
        fly();
    }
}
