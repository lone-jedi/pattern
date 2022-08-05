package com.yarkin.patterns.strategy.action.qauck;

import com.yarkin.patterns.strategy.action.Quackable;

public class ClassicQuack implements Quackable
{
    @Override
    public void quack()
    {
        System.out.println("*classic quack*");
    }
}
