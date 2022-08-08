package com.yarkin.patterns.adapter;

public class ProcessorAdapter implements XmlProcessor
{
    private JsonProcessor jsonProcessor;

    public ProcessorAdapter(JsonProcessor jsonProcessor)
    {
        this.jsonProcessor = jsonProcessor;
    }

    @Override
    public void processXmlData(String data)
    {
        data = "{" + data + "}";
        // converting xml data to json format ...

        jsonProcessor.processJsonData(data);
    }
}
