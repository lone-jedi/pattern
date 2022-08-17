package com.yarkin.patterns.iterator;

import java.util.Comparator;
import java.util.List;

public class Floor implements Comparable<Floor>
{
    private final int level;
    private final List<Flat> flats;

    public Floor(int level, List<Flat> flats)
    {
        this.level = level;
        this.flats = flats;
    }

    public List<Flat> getFlats()
    {
        return flats;
    }

    public int getLevel()
    {
        return level;
    }

    @Override
    public String toString()
    {
        return "Floor{" +
                "level=" + level +
                '}';
    }

    @Override
    public int compareTo(Floor floor)
    {
        if (this.getLevel() == floor.getLevel())
        {
            return 0;
        }

        return this.getLevel() > floor.getLevel() ? 1 : -1;
    }
}
