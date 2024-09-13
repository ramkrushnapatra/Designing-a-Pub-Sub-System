package org.example;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Topic {
    private String topicName;
    private Set<Subscriber>subscribers= new CopyOnWriteArraySet<>();

    public Topic(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void publishMessage(Message message){
        for(Subscriber subscriber:subscribers){
            subscriber.message(message);
        }
    }
}
