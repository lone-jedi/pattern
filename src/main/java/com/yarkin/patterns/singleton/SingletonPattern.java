package com.yarkin.patterns.singleton;

import com.yarkin.patterns.Pattern;

public class SingletonPattern implements Pattern
{
    @Override
    public void run()
    {
        Config config = Config.instance();
        config.set("test", 15);

        Config config1 = Config.instance();
        Config config2 = Config.instance();

        System.out.println(config.get("test"));
        System.out.println(config1.get("test"));
        System.out.println(config2.get("test"));
    }
}
