package org.example.problem3.observerPatternDemo.News;

import org.example.problem3.observerPatternDemo.Subscriber;

public class LATimes extends News {

    public LATimes(String channelName, int intervalSize) {
        super(channelName, intervalSize);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        super.addSubscriber(subscriber);
    }

    @Override
    public void broadcastMessage() {
        super.broadcastMessage();
    }
}
