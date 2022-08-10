package com.yarkin.patterns.bridge;

import com.yarkin.patterns.Pattern;
import com.yarkin.patterns.bridge.resource.Artist;
import com.yarkin.patterns.bridge.resource.ArtistResource;
import com.yarkin.patterns.bridge.resource.Book;
import com.yarkin.patterns.bridge.resource.BookResource;
import com.yarkin.patterns.bridge.view.LongView;
import com.yarkin.patterns.bridge.view.SmallView;

import java.util.List;

public class BridgePattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Bridge pattern ---");

        View bookLongView = new LongView(
                new BookResource(
                        new Book("The war and peace", 1873, "bio", "book.pic")));
        View artistLongView = new LongView(
                new ArtistResource(
                        new Artist("Stephen", "King",  "bio", 60,"artist.pic")));
        View artistShortView = new SmallView(
                new ArtistResource(
                        new Artist("James", "Bond",  "spy", 45,"artist.pic")));

        List.of(bookLongView, artistLongView, artistShortView).stream()
            .forEach(View::show);
    }
}
