package org.example.problem3.observerPatternDemo.News;

import org.example.problem3.observerPatternDemo.Subscriber;

public class BBC extends News{

    public BBC(String channelName, int intervalSize) {
        super(channelName, intervalSize);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        super.addSubscriber(subscriber);
    }

    @Override
    public void broadcastMessage() {
        for (Subscriber subscriber : subscribers){
            subscriber.sendMessage(this, MessageGenerator.generateMessage(5));
        }
    }
}
