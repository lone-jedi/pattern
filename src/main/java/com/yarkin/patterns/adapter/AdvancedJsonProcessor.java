package com.yarkin.patterns.adapter;

public class AdvancedJsonProcessor implements JsonProcessor
{
    @Override
    public void processJsonData(String data)
    {
        System.out.println(data);
    }
}
