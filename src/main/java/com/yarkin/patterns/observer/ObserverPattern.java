package com.yarkin.patterns.observer;

import com.yarkin.patterns.Pattern;
import com.yarkin.patterns.observer.client.DeskDisplay;
import com.yarkin.patterns.observer.client.Display;
import com.yarkin.patterns.observer.client.PhoneDisplay;
import com.yarkin.patterns.observer.weather.MountainWeatherStation;

import java.util.List;

public class ObserverPattern implements Pattern
{

    @Override
    public void run()
    {
        System.out.println("--- OBSERVER ---");

        MountainWeatherStation weatherStation = new MountainWeatherStation(new SimpleObservable());

        List<Display> displays = List.of(
                new PhoneDisplay(weatherStation),
                new DeskDisplay(weatherStation)
        );

        displays.stream()
            .forEach(Display::subscribe);

        weatherStation.setTemperature(36.6);
        weatherStation.setTemperature(36.7);

        displays.get(0).unsubscribe();
        weatherStation.setTemperature(36.8);

        displays.get(0).subscribe();
        weatherStation.setTemperature(36.8);
    }
}
