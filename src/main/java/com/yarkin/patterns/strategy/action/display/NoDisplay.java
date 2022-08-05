package com.yarkin.patterns.strategy.action.display;

import com.yarkin.patterns.strategy.action.Displayable;

public class NoDisplay implements Displayable
{
    @Override
    public void display()
    {
        // nothing
    }
}
