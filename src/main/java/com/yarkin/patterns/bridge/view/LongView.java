package com.yarkin.patterns.bridge.view;

import com.yarkin.patterns.bridge.Resource;
import com.yarkin.patterns.bridge.View;

import java.util.Locale;

public class LongView extends View
{
    public LongView(Resource resource)
    {
        super(resource);
    }

    @Override
    public void show()
    {
        String result = "LONG VIEW\n"
                + resource.title().toUpperCase(Locale.ROOT) + "\n"
                + "<long>" + resource.image() + "</long>" + "\n"
                + resource.content().toUpperCase(Locale.ROOT);

        System.out.println(result);
    }
}
