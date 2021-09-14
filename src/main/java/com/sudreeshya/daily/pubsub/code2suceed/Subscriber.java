package com.sudreeshya.daily.pubsub.code2suceed;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Subscriber {

    private List<Message> subscriberMsg = new ArrayList<>();

    public abstract void subscribe(String topic, PubSubService pubSubService);
    public abstract void unsubscribe(String topic, PubSubService pubSubService);
}
