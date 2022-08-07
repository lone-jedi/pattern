package com.yarkin.patterns.abstractfactory.theme;

import com.yarkin.patterns.abstractfactory.ConsoleBackground;
import com.yarkin.patterns.abstractfactory.ConsoleText;
import com.yarkin.patterns.abstractfactory.UIFactory;
import com.yarkin.patterns.abstractfactory.theme.white.DarkConsoleText;
import com.yarkin.patterns.abstractfactory.theme.white.WhiteConsoleBackground;

public class WhiteUIFactory implements UIFactory
{
    @Override
    public ConsoleText getText()
    {
        return new DarkConsoleText();
    }

    @Override
    public ConsoleBackground getBackground()
    {
        return new WhiteConsoleBackground();
    }
}
