package org.example.problem3.observerPatternDemo.News;

public class NewsBroadcaster implements Runnable{
    private News news;

    public NewsBroadcaster(News news){
        this.news = news;
    }
    @Override
    public void run() {
        try {
            while (true) {
                news.broadcastMessage();
                Thread.sleep(news.getBroadCastIntervalSize() * 1000L);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
