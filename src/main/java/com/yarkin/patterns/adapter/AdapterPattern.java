package com.yarkin.patterns.adapter;

import com.yarkin.patterns.Pattern;

public class AdapterPattern implements Pattern
{
    @Override
    public void run()
    {
        XmlProcessor xmlProcessor = new ProcessorAdapter(
                new AdvancedJsonProcessor());

        xmlProcessor.processXmlData("test data");
    }
}
