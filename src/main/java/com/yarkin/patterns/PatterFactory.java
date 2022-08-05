package com.yarkin.patterns;

import com.yarkin.patterns.observer.ObserverPattern;
import com.yarkin.patterns.strategy.StrategyPattern;

import java.util.Locale;

public class PatterFactory
{
    public static Pattern get(String patternName)
    {
        switch (patternName.toUpperCase(Locale.ROOT))
        {
            case "STRATEGY":
                return new StrategyPattern();
            case "OBSERVER":
                return new ObserverPattern();
        }

        throw new IllegalArgumentException("Patten " + patternName + " does not exist");
    }
}
