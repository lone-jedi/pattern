package com.yarkin.patterns.bridge.resource;

import com.yarkin.patterns.bridge.Resource;

public class ArtistResource implements Resource
{
    private final Artist artist;

    public ArtistResource(Artist artist)
    {
        this.artist = artist;
    }

    @Override
    public String title() {
        return artist.getAge() + ", " + artist.getFirstName() + artist.getLastName();
    }

    @Override
    public String image() {
        return artist.getPhoto();
    }

    @Override
    public String content() {
        return artist.getBio();
    }
}
