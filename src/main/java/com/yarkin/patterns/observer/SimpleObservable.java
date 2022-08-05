package com.yarkin.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservable implements ObservableStrategy
{
    private List<Observer> observers;

    public SimpleObservable()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void update()
    {
        observers.stream()
            .forEach(Observer::update);
    }
}
