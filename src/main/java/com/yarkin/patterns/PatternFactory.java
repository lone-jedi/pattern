package com.yarkin.patterns;

import com.yarkin.patterns.abstractfactory.AbstractFactoryPattern;
import com.yarkin.patterns.adapter.AdapterPattern;
import com.yarkin.patterns.bridge.BridgePattern;
import com.yarkin.patterns.command.CommandPattern;
import com.yarkin.patterns.composite.CompositePattern;
import com.yarkin.patterns.decorator.DecoratorPattern;
import com.yarkin.patterns.observer.ObserverPattern;
import com.yarkin.patterns.proxy.ProxyPattern;
import com.yarkin.patterns.singleton.SingletonPattern;
import com.yarkin.patterns.strategy.StrategyPattern;
import com.yarkin.patterns.templatemethod.TemplateMethodPattern;

import java.util.List;
import java.util.Locale;
import java.util.Random;

public class PatternFactory
{
    private static final List<String> PATTERNS = List.of(
            "STRATEGY",
            "OBSERVER",
            "DECORATOR",
            "ABSTRACT FACTORY",
            "SINGLETON",
            "COMMAND"
    );

    public static Pattern get(String patternName)
    {
        switch (patternName.toUpperCase(Locale.ROOT))
        {
            case "STRATEGY":
                return new StrategyPattern();
            case "OBSERVER":
                return new ObserverPattern();
            case "DECORATOR":
                return new DecoratorPattern();
            case "ABSTRACT FACTORY":
                return new AbstractFactoryPattern();
            case "SINGLETON":
                return new SingletonPattern();
            case "COMMAND":
                return new CommandPattern();
            case "ADAPTER":
                return new AdapterPattern();
            case "PROXY":
                return new ProxyPattern();
            case "BRIDGE":
                return new BridgePattern();
            case "TEMPLATE METHOD":
                return new TemplateMethodPattern();
            case "COMPOSITE":
                return new CompositePattern();
        }

        throw new IllegalArgumentException("Patten " + patternName + " does not exist");
    }

    public static Pattern getRandom()
    {
        Random random = new Random();
        int index = random.nextInt(PATTERNS.size());
        return get(PATTERNS.get(index));
    }
}
