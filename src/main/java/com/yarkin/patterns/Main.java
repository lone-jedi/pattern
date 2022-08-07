package com.yarkin.patterns;

import java.util.Arrays;

public class Main
{
    /**
     * Entry point
     *
     * @param args
     *      -p "pattern name"
     *      List of supported pattern names:
     *      - strategy
     *      - observer
     *      - decorator
     *      - abstract factory
     *      - singleton
     *      - command
     */
    public static void main(String[] args)
    {
        if (args.length < 2)
        {
            throw new IllegalStateException("Missing required arguments");
        }

        int pattenNameIndex = Arrays.stream(args)
                .toList()
                .indexOf("-p") + 1;

        if (args.length <= pattenNameIndex)
        {
            throw new IllegalArgumentException("Missing argument of -p");
        }

        Pattern pattern = PatternFactory.get(args[pattenNameIndex]);
        // Pattern pattern = PatterFactory.getRandom();

        pattern.run();
    }
}
