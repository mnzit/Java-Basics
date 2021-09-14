package com.sudreeshya.daily.pubsub;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subscriber {

    private Long id;
    private String email;
    private String name;

    public Subscriber(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void notify(String notificationDescription){
        System.out.println(notificationDescription);
    }
}
