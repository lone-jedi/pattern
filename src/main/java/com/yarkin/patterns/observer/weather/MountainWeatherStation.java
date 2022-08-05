package com.yarkin.patterns.observer.weather;

import com.yarkin.patterns.observer.Observable;
import com.yarkin.patterns.observer.ObservableStrategy;
import com.yarkin.patterns.observer.Observer;

public class MountainWeatherStation implements WeatherStation, Observable
{
    private final ObservableStrategy observableStrategy;
    private double temperature;

    public MountainWeatherStation(ObservableStrategy observableStrategy)
    {
        this.observableStrategy = observableStrategy;
    }

    @Override
    public void add(Observer observer)
    {
        observableStrategy.add(observer);
    }

    @Override
    public void remove(Observer observer)
    {
        observableStrategy.remove(observer);
    }

    @Override
    public void update()
    {
        observableStrategy.update();
    }

    @Override
    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
        update();
    }
}
