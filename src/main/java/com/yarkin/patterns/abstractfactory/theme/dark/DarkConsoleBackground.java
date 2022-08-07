package com.yarkin.patterns.abstractfactory.theme.dark;

import com.yarkin.patterns.abstractfactory.ColorCode;
import com.yarkin.patterns.abstractfactory.ConsoleBackground;

public class DarkConsoleBackground implements ConsoleBackground
{
    @Override
    public void update()
    {
        System.out.print(ColorCode.ANSI_BLACK_BACKGROUND);
    }
}
