package com.sudreeshya.daily.pubsub;

public class PubSubDemo {
    public static void main(String[] args) {
        System.out.println("Publish Subscribe Day!!");

        Video twentySeven = new Video();
        twentySeven.setTitle("27");
        twentySeven.setDescription("New music video for my journey");
        twentySeven.setVideoBytes(new Object());

        Channel mgk = new Channel();
        mgk.setName("Machine Gun Kelly");

        Subscriber subscriber1 = new Subscriber(1L, "Jermy");
        Subscriber subscriber2 = new Subscriber(2L, "Dermy");
        Subscriber subscriber3 = new Subscriber(3L, "Eermy");

        mgk.subscribe(subscriber1);
        mgk.subscribe(subscriber2);
        mgk.subscribe(subscriber3);

        mgk.publish(twentySeven);
    }
}
