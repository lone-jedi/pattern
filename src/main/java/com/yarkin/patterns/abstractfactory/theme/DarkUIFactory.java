package com.yarkin.patterns.abstractfactory.theme;

import com.yarkin.patterns.abstractfactory.ConsoleBackground;
import com.yarkin.patterns.abstractfactory.ConsoleText;
import com.yarkin.patterns.abstractfactory.UIFactory;
import com.yarkin.patterns.abstractfactory.theme.dark.DarkConsoleBackground;
import com.yarkin.patterns.abstractfactory.theme.dark.WhiteConsoleText;

public class DarkUIFactory implements UIFactory
{
    @Override
    public ConsoleText getText()
    {
        return new WhiteConsoleText();
    }

    @Override
    public ConsoleBackground getBackground()
    {
        return new DarkConsoleBackground();
    }
}
