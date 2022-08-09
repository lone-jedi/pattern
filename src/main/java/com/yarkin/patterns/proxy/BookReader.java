package com.yarkin.patterns.proxy;

import java.util.Arrays;

public class BookReader implements Reader
{
    private final String content;
    private int wordsCount;

    public BookReader(String content)
    {
        this.content = content;
        // ... some huge time cost calculations
        System.out.println("... making calculations");
        this.wordsCount = getWordsCount();
    }

    @Override
    public int getNumberOfWords()
    {
        return wordsCount;
    }

    private int getWordsCount()
    {
        return content.split(" ").length;
    }
}
