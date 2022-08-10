package com.yarkin.patterns.bridge.view;

import com.yarkin.patterns.bridge.Resource;
import com.yarkin.patterns.bridge.View;

import java.util.Locale;

public class SmallView extends View
{
    public SmallView(Resource resource)
    {
        super(resource);
    }

    @Override
    public void show()
    {
        String result = "small view\n"
                + resource.title().toLowerCase(Locale.ROOT) + "\n"
                + "<small>" + resource.image() + "</small>" + "\n"
                + resource.content().toLowerCase(Locale.ROOT);

        System.out.println(result);
    }
}
