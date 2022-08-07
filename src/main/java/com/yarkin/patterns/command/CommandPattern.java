package com.yarkin.patterns.command;

import com.yarkin.patterns.Pattern;

public class CommandPattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Command Pattern ---");

        Invoker invoker = new Invoker(
                new LightOnCommand(),
                new LightOffCommand()
        );

        invoker.turnLightOn();
        invoker.turnLightOff();
    }
}
