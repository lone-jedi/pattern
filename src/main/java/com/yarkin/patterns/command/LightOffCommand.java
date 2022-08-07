package com.yarkin.patterns.command;

public class LightOffCommand implements Command
{
    private final Light light = new Light();

    @Override
    public void execute()
    {
        light.turnOff();
    }

    @Override
    public void rollback()
    {
        light.turnOn();
    }
}
