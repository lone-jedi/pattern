package com.yarkin.patterns.strategy.action.display;

import com.yarkin.patterns.strategy.action.Displayable;

public class ClassicDisplay implements Displayable
{
    @Override
    public void display()
    {
        System.out.println("*classic display*");
    }
}
