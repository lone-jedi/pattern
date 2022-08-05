package com.yarkin.patterns.observer.client;

import com.yarkin.patterns.observer.Observer;
import com.yarkin.patterns.observer.weather.MountainWeatherStation;
import com.yarkin.patterns.observer.weather.WeatherStation;

public abstract class Display implements Observer, Displayable
{
    protected final MountainWeatherStation weatherStation;

    public Display(MountainWeatherStation weatherStation)
    {
        this.weatherStation = weatherStation;
    }

    @Override
    public void subscribe()
    {
        weatherStation.add(this);
    }

    @Override
    public void unsubscribe()
    {
        weatherStation.remove(this);
    }
}
