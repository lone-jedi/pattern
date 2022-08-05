package com.yarkin.patterns.strategy;

import com.yarkin.patterns.Pattern;
import com.yarkin.patterns.strategy.action.display.ClassicDisplay;
import com.yarkin.patterns.strategy.action.display.NoDisplay;
import com.yarkin.patterns.strategy.action.fly.ClassicFly;
import com.yarkin.patterns.strategy.action.fly.FastFly;
import com.yarkin.patterns.strategy.action.qauck.ClassicQuack;
import com.yarkin.patterns.strategy.action.qauck.NoQuack;

import java.util.List;

public class StrategyPattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Strategy pattern ---");

        Duck commonDuck = new Duck(
                new ClassicQuack(),
                new ClassicDisplay(),
                new ClassicFly()
        );

        Duck rocketDuck = new Duck(
                new NoQuack(),
                new NoDisplay(),
                new FastFly()
        );

        List.of(commonDuck, rocketDuck).stream()
                .forEach(Duck::doAction);
    }
}
