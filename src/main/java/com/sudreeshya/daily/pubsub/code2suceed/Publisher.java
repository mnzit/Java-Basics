package com.sudreeshya.daily.pubsub.code2suceed;

public interface Publisher {
    void publish(Message message, PubSubService pubSubService);
}
