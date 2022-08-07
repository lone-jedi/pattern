package com.yarkin.patterns.abstractfactory.theme.white;

import com.yarkin.patterns.abstractfactory.ColorCode;
import com.yarkin.patterns.abstractfactory.ConsoleBackground;

public class WhiteConsoleBackground implements ConsoleBackground
{
    @Override
    public void update()
    {
        System.out.print(ColorCode.ANSI_WHITE_BACKGROUND);
    }
}
