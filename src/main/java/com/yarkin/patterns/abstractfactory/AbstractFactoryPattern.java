package com.yarkin.patterns.abstractfactory;

import com.yarkin.patterns.Pattern;
import com.yarkin.patterns.abstractfactory.theme.WhiteUIFactory;

public class AbstractFactoryPattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Abstract Factory ---");

        UIFactory uiFactory = new WhiteUIFactory();
        ConsoleBackground background = uiFactory.getBackground();
        ConsoleText text = uiFactory.getText();

        background.update();
        text.write("Hello, white theme");
    }
}
