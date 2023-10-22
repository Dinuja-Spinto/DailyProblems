package org.example.problem3.observerPatternDemo.News;

import org.example.problem3.observerPatternDemo.Observer;
import org.example.problem3.observerPatternDemo.Subscriber;

import java.util.ArrayList;

public class News implements Observer {
    private String channelName;
    private int broadCastIntervalSize;
    protected ArrayList<Subscriber> subscribers;

    public News(String channelName, int intervalSize) {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
        this.broadCastIntervalSize = intervalSize;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public int getBroadCastIntervalSize() {
        return broadCastIntervalSize;
    }

    public void setBroadCastIntervalSize(int broadCastIntervalSize) {
        this.broadCastIntervalSize = broadCastIntervalSize;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public String getName() {
        return this.channelName;
    }

    public void broadcastMessage() {
        for (Subscriber subscriber : subscribers){
            subscriber.sendMessage(this, MessageGenerator.generateMessage(15));
        }
    }
}
