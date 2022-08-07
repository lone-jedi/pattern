package com.yarkin.patterns.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Config
{
    private static Config configInstance;

    private final ConcurrentMap<String, Object> config;

    private Config()
    {
        config = new ConcurrentHashMap<>();
    }

    public static Config instance()
    {
        if (configInstance == null)
        {
            synchronized (Config.class)
            {
                if (configInstance == null)
                {
                    configInstance = new Config();
                }
            }
        }
        return configInstance;
    }

    public Object get(String property)
    {
        return config.get(property);
    }

    public void set(String key, Object value)
    {
        config.putIfAbsent(key, value);
    }

    public void replace(String key, Object value)
    {
        config.replace(key, value);
    }
}
