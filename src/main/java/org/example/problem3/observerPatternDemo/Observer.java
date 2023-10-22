package org.example.problem3.observerPatternDemo;

public interface Observer {
    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    String getName();
}
