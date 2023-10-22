package org.example.problem3.observerPatternDemo;

public interface Subscriber {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void sendMessage(Observer observer, String message);
}
