package org.example.problem3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsChannel implements News{
    private List<Subscriber> subscribers = new ArrayList<>();

    private String broadcastName;
    private String news;

    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    String formattedDate = dateFormat.format(currentDate);

    public NewsChannel(String broadcastName) {
        this.broadcastName = broadcastName;
        this.subscribers = new ArrayList<>();
    }

    public String getBroadcastName() {
        return broadcastName;
    }

    public void setBroadcastName(String broadcastName) {
        this.broadcastName = broadcastName;
    }

    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishNews(String news) {
        this.news = news;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.broadcastName + " : " + this.formattedDate + " : " + news);
        }
    }

}
