package com.yarkin.patterns.command;

public class LightOnCommand implements Command
{
    private final Light light = new Light();

    @Override
    public void execute()
    {
        light.turnOn();
    }

    @Override
    public void rollback()
    {
        light.turnOff();
    }
}
