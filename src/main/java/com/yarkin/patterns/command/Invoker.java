package com.yarkin.patterns.command;

public class Invoker
{
    private final Command lightOn;
    private final Command lightOff;

    public Invoker(Command lightOn, Command lightOff)
    {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
    }

    public void turnLightOn()
    {
        lightOn.execute();
    }

    public void turnLightOff()
    {
        lightOff.execute();
    }
}
