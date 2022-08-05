package com.yarkin.patterns.observer.client;

import com.yarkin.patterns.observer.weather.MountainWeatherStation;

public class DeskDisplay extends Display
{
    public DeskDisplay(MountainWeatherStation weatherStation)
    {
        super(weatherStation);
    }

    @Override
    public void update()
    {
        display();
    }

    @Override
    public void display()
    {
        double temperature = weatherStation.getTemperature();
        System.out.println("Desk display:\n\ttemperature - " + temperature);
    }
}
