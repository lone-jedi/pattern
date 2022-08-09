package com.yarkin.patterns.proxy;

import com.yarkin.patterns.Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProxyPattern implements Pattern
{
    @Override
    public void run()
    {
        System.out.println("--- Proxy ---");

        String content = "Утрехт – город в центральной части Нидерландов, который в течение многих веков оставался религиозным центром. В нем есть средневековый Старый город, каналы, христианские памятники и престижный университет. Со знаменитой колокольни Домторен, построенной в XIV веке, открывается вид на город. Напротив нее, на центральной площади Домплейн, возвышается готический собор Святого Мартина. В музее бывшего монастыря Святой Екатерины представлены произведения религиозного искусства и другие реликвии.";

        List<Reader> simpleReaders = generateReaders(10000, "simple", content);
        List<Reader> lazyReaders = generateReaders(10000, "lazy", content);

        System.out.println(
            simpleReaders.get(433).getNumberOfWords()
        );

        System.out.println(
            lazyReaders.get(433).getNumberOfWords()
        );

    }

    private List<Reader> generateReaders(int count, String type, String content)
    {
        List<Reader> readers = new ArrayList<>();

        switch (type.toUpperCase(Locale.ROOT))
        {
            case "SIMPLE":
                for (int i = 0; i < count; i++)
                {
                    readers.add(new BookReader(content));
                }
                break;
            case "LAZY":
                for (int i = 0; i < count; i++)
                {
                    readers.add(new LazyBookReaderProxy(content));
                }
                break;
        }

        return readers;
    }
}
