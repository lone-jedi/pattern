package com.yarkin.patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class Building implements Iterable<Flat>
{
    private final List<Floor> floors;
    private List<Floor> sortedFloors;

    public Building(List<Floor> floors)
    {
        this.floors =  floors.stream()
            .sorted()
            .toList();
    }

    @Override
    public Iterator iterator() {
        return new BuildingIterator();
    }

    private class BuildingIterator implements Iterator<Flat>
    {
        private int floor;
        private int indexOfFlat;

        public BuildingIterator()
        {
            floor = 0;
            indexOfFlat = 0;
        }

        @Override
        public boolean hasNext()
        {
            return indexOfFlat + 1 < floors.get(floor).getFlats().size()
                    || floor + 1 < floors.size();
        }

        @Override
        public Flat next() {
            Flat flat = floors.get(floor).getFlats().get(indexOfFlat);
            if (indexOfFlat + 1 == floors.get(floor).getFlats().size())
            {
                floor++;
                indexOfFlat = 0;
            }
            else
            {
                indexOfFlat++;
            }

            return flat;
        }
    }
}
