package com.yarkin.patterns.abstractfactory.theme.white;

import com.yarkin.patterns.abstractfactory.ColorCode;
import com.yarkin.patterns.abstractfactory.ConsoleText;

public class DarkConsoleText implements ConsoleText
{
    @Override
    public void write(String text)
    {
        System.out.println(ColorCode.ANSI_BLACK + text);
    }
}
