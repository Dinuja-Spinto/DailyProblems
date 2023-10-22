package org.example.problem3.observerPatternDemo;

import org.example.problem3.observerPatternDemo.News.BBC;
import org.example.problem3.observerPatternDemo.News.LATimes;
import org.example.problem3.observerPatternDemo.News.NewsBroadcaster;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        BBC bbcNews = new BBC("BBC News",10);
        LATimes laTimes = new LATimes("LA Times", 5);

        Person personA = new Person.PersonBuilder("Gary", "Smith").setMiddleName("snow").setAddress("New York").build();
        Person personB = new Person.PersonBuilder("James", "Smith").setdOfBirth(new Date(2023,10,11)).build();
        Person personC = new Person.PersonBuilder("Mary", "Smith").setAddress("Los Angeles").build();
        Person personD = new Person.PersonBuilder("Jane", "Smith").setEmail("Jane@mail.com").build();

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
