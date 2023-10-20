package org.example.problem3;

public interface News {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void publishNews(String news);

}
