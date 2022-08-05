package com.yarkin.patterns.strategy.action.qauck;

import com.yarkin.patterns.strategy.action.Quackable;

public class NoQuack implements Quackable
{
    @Override
    public void quack()
    {
        // nothing
    }
}
