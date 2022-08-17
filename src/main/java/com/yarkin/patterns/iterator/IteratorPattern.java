package com.yarkin.patterns.iterator;

import com.yarkin.patterns.Pattern;

import java.util.List;

public class IteratorPattern implements Pattern
{
    @Override
    public void run()
    {
        Building building = new Building(
            List.of(
               new Floor(1, List.of(
                   new Flat(1),
                   new Flat(2),
                   new Flat(3)
               )),
               new Floor(2, List.of(
                   new Flat(4),
                   new Flat(5),
                   new Flat(6)
               )),
               new Floor(4, List.of(
                   new Flat(8),
                   new Flat(9)
               )),
                new Floor(3, List.of(
                    new Flat(6),
                    new Flat(7)
                ))
            )
        );

        building.forEach(System.out::println);
    }
}
