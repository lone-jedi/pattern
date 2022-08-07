package com.yarkin.patterns.abstractfactory.theme.dark;

import com.yarkin.patterns.abstractfactory.ColorCode;
import com.yarkin.patterns.abstractfactory.ConsoleText;

public class WhiteConsoleText implements ConsoleText
{
    @Override
    public void write(String text)
    {
        System.out.println(ColorCode.ANSI_WHITE + text);
    }
}
