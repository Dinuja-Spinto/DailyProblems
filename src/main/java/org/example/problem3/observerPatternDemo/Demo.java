package org.example.problem3.observerPatternDemo;

import org.example.problem3.observerPatternDemo.News.BBC;
import org.example.problem3.observerPatternDemo.News.LATimes;
import org.example.problem3.observerPatternDemo.News.NewsBroadcaster;

public class Demo {
    public static void main(String[] args) {

        BBC bbcNews = new BBC("BBC News",10);
        LATimes laTimes = new LATimes("LA Times", 5);

        Person personA = new Person("Gary", "Smith");
        Person personB = new Person("James", "Smith");
        Person personC = new Person("Mary", "Smith");
        Person personD = new Person("Jane", "Smith");

        bbcNews.addSubscriber(personA);
        laTimes.addSubscriber(personC);

        bbcNews.addSubscriber(personB);
        laTimes.addSubscriber(personD);

        NewsBroadcaster bbcBroadcaster = new NewsBroadcaster(bbcNews);
        Thread bbcBroadcasterThread = new Thread(bbcBroadcaster);
        bbcBroadcasterThread.start();

        NewsBroadcaster laTimesBroadcaster = new NewsBroadcaster(laTimes);
        Thread laTimesBroadcasterThread = new Thread(laTimesBroadcaster);
        laTimesBroadcasterThread.start();
    }
}
