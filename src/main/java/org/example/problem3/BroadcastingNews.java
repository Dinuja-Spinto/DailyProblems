package org.example.problem3;

public class BroadcastingNews {
    public static void main(String[] args) {
        NewsChannel newsBroadcaster = new NewsChannel("BBC News");

        Person dinuja = new Person("Dinuja");
        Person snow = new Person("Snow");

        newsBroadcaster.registerSubscriber(dinuja);
        newsBroadcaster.registerSubscriber(snow);

        newsBroadcaster.publishNews("Israel attack Gaza on the ground.");

        newsBroadcaster.removeSubscriber(snow);
        System.out.println();
        newsBroadcaster.publishNews("Egypt Won't Open Its Border With Gaza.");

    }
}
