package com.yarkin.patterns.proxy;

public class LazyBookReaderProxy implements Reader
{
    private final String content;
    private BookReader bookReader;

    public LazyBookReaderProxy(String content)
    {
        this.content = content;
    }

    @Override
    public int getNumberOfWords()
    {
        if (bookReader == null)
        {
            bookReader = new BookReader(content);
        }
        return bookReader.getNumberOfWords();
    }
}
