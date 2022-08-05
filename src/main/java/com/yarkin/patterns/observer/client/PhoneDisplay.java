package com.yarkin.patterns.observer.client;

import com.yarkin.patterns.observer.weather.MountainWeatherStation;

public class PhoneDisplay extends Display
{
    public PhoneDisplay(MountainWeatherStation weatherStation)
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
        System.out.println("Phone display:\n\ttemperature - " + temperature);
    }
}
