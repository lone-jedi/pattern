package com.yarkin.patterns.bridge;

public abstract class View
{
    protected final Resource resource;

    public View(Resource resource)
    {
        this.resource = resource;
    }

    abstract public void show();
}
