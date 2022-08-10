package com.yarkin.patterns.bridge.resource;

public class Artist
{
    private final String firstName;
    private final String lastName;
    private final String bio;
    private final int age;
    private final String photo;

    public Artist(String firstName, String lastName, String bio, int age, String photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.age = age;
        this.photo = photo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }

    public int getAge() {
        return age;
    }

    public String getPhoto() {
        return photo;
    }
}
